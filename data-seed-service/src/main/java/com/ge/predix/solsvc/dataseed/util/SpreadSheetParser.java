package com.ge.predix.solsvc.dataseed.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFCellUtil;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author tturner
 */
@SuppressWarnings("nls")
public class SpreadSheetParser
{
    /**
     * 
     */
    public SpreadSheetParser()
    {
    }

    /**
     * @param inputFile -
     * @param inputWorksheets -
     * @return -
     * @throws IOException -
     */
    public Map<String, String[][]> parseInputFile(String inputFile, List<String> inputWorksheets)
    {
    	try {
	    	File excel = new File(inputFile);
	        FileInputStream fis = new FileInputStream(excel);
	        return parseInputFile(fis, inputWorksheets);
    	}catch(Exception ex){
    		ex.printStackTrace();
    		return null;
    	}
    }
    /**
     * @param inputFile -
     * @param inputWorksheets -
     * @return -
     * @throws IOException -
     */
    public Map<String, String[][]> parseInputFile(InputStream fis, List<String> inputWorksheets)
    {

        try
        {
            HSSFWorkbook wb = new HSSFWorkbook(fis);

            Map<String, String[][]> map = new HashMap<String, String[][]>();
            // SpreadsheetColumnComparator mergeComparator = new SpreadsheetColumnComparator(1);

            for (String worksheet : inputWorksheets)
            {
                String[][] data = getWorksheetRowsAsStrings(worksheet, wb, true);
                if ( data != null )
                {
                    data = removeBlankRows(data);
                    // if ( isInteger(data[0][0])) {
                    // // sort on column 1, algorithm number, port name
                    // Arrays.sort(data, mergeComparator);
                    // }
                    map.put(worksheet, data);
                }
            }

            return map;
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    
	/**
	 * @param fileName -
	 * @return -
	 */
	public HSSFWorkbook createFile(String fileName) {

		try {
            FileOutputStream fos = new FileOutputStream(fileName);
			HSSFWorkbook wb = new HSSFWorkbook();
			wb.write(fos);
			return wb;
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

    /**
     * write back some data to the spreadsheet
     * 
     * @param inputFile -
     * @param worksheet -
     * @param cellsToUpdate -
     * @throws IOException -
     */
    public void updateInputFile(String inputFile, String worksheet, List<InnerCell> cellsToUpdate)
            throws IOException
    {
        File excel = new File(inputFile);
        FileInputStream fis = new FileInputStream(excel);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet ws = wb.getSheet(worksheet);
        int lastRowNum = ws.getLastRowNum() + 1;
        int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
        for (int rowNum = 1; rowNum < lastRowNum && rowNum < physicalNumberOfRows; rowNum++)
        {
            HSSFRow row = ws.getRow(rowNum);
            if ( row != null )
            {
                for (int colNum = 0; colNum < row.getLastCellNum() - 1; colNum++)
                {
                    boolean columnFound = false;
                    HSSFCell potentialCellKey = row.getCell(colNum);
                    if ( potentialCellKey != null )
                    {
                        for (InnerCell cellToUpdateKey : cellsToUpdate)
                        {
                            String stringCellValue = cellToString(potentialCellKey);
                            if ( cellToUpdateKey.keyColumn == potentialCellKey.getColumnIndex()
                                    && cellToUpdateKey.key.equals(stringCellValue) )
                            {
                                // start looping over columns from the beginning
                                for (int k = 0; k < row.getLastCellNum() - 1; k++)
                                {
                                    HSSFCell potentialCellToUpdate = row.getCell(k);
                                    if ( k == cellToUpdateKey.column )
                                    {
                                        if ( potentialCellToUpdate == null )
                                        {
                                            potentialCellToUpdate = HSSFCellUtil.createCell(row, k,
                                                    cellToUpdateKey.value);
                                        }
                                        else
                                        {
                                            if ( isInteger(cellToUpdateKey.value) )
                                                potentialCellToUpdate.setCellValue(Integer
                                                        .parseInt(cellToUpdateKey.value));
                                            else
                                                potentialCellToUpdate.setCellValue(cellToUpdateKey.value);
                                        }
                                        columnFound = true;
                                        break;
                                    }
                                    if ( columnFound ) break;
                                }
                            }
                            if ( columnFound ) break;
                        }
                    }
                    if ( columnFound ) break;
                }
            }
        }
        FileOutputStream fos = new FileOutputStream(excel);
        wb.write(fos);
    }

    /**
     * @param str -
     * @return -
     */
    public static boolean isInteger(String str)
    {
        return str.matches("^-?[0-9]+(\\.[0-9]+)?$");
    }

    private String[][] getWorksheetRowsAsStrings(String worksheetName, HSSFWorkbook wb, boolean skipFirstRow)
    {

        HSSFSheet ws = wb.getSheet(worksheetName);

        int rowNum = ws.getLastRowNum() + 1;
        if ( ws.getRow(0) == null ) return null;
        int colNum = ws.getRow(0).getLastCellNum();
        String[][] data = new String[rowNum][colNum];

        int start = 0;
        if ( skipFirstRow )
        {
            start = 1;
        }

        for (int i = start; i < rowNum; i++)
        {
            HSSFRow row = ws.getRow(i);
            if ( row != null )
            {
                for (int j = 0; j < colNum; j++)
                {
                    HSSFCell cell = row.getCell(j);
                    String value = cellToString(cell);
                    if ( value != null )
                        data[i][j] = value.trim().replaceAll("[^\\x0A\\x0D\\x20-\\x7E]", "");
                }
            }
        }

        
        return data;
    }

    /**
     * @param cell
     * @return
     */

    private String cellToString(HSSFCell cell)
    {

        if ( cell == null )
        {
            return null;
        }
        int cellType = cell.getCellType();
        if ( cellType == Cell.CELL_TYPE_FORMULA )
        {
            int formulaResultType = cell.getCachedFormulaResultType();
            if ( formulaResultType == Cell.CELL_TYPE_BOOLEAN )
            {
                return cell.getBooleanCellValue() + "";
            }
            else if ( formulaResultType == Cell.CELL_TYPE_NUMERIC )
            {
                return cell.getNumericCellValue() + "";
            }
            else if ( formulaResultType == Cell.CELL_TYPE_STRING )
            {
                return cell.getStringCellValue();
            }
        }
        else if ( cellType == Cell.CELL_TYPE_BLANK )
        {
            return null;
        }
        else if ( cellType == Cell.CELL_TYPE_BOOLEAN )
        {
            return cell.getBooleanCellValue() + ""; //$NON-NLS-1$
        }
        else if ( cellType == Cell.CELL_TYPE_NUMERIC )
        {
            return cell.getNumericCellValue() + ""; //$NON-NLS-1$
        }
        else if ( cellType == Cell.CELL_TYPE_STRING )
        {
            return cell.getStringCellValue();
        }
        return null;
    }

    /**
     * remove null rows from the data set (rows, whose cells are all null or the empty string (after trim))
     * 
     * @param dataSet
     * @return
     */
    private String[][] removeBlankRows(String[][] dataSet)
    {
        int numNonNullRows = numNonNullRow(dataSet);

        String[][] retVals = new String[numNonNullRows][dataSet[0].length];

        int nextRow = 0;
        for (String[] row : dataSet)
        {
            if ( !rowIsNull(row) )
            {
                retVals[nextRow++] = row;
            }
        }

        return retVals;
    }

    /**
     * get the count of non-null rows in the data set
     * 
     * @param dataSet
     * @return
     */
    private int numNonNullRow(String[][] dataSet)
    {
        int ret = 0;

        for (String[] row : dataSet)
        {
            if ( !rowIsNull(row) )
            {
                ret++;
            }
        }

        return ret;
    }

    /**
     * does the row contain all null or empty strings (after trim)
     * 
     * @param row
     * @return
     */
    private boolean rowIsNull(String[] row)
    {
        boolean allNull = true;
        for (String cell : row)
        {
            if ( cell != null && cell.trim().length() != 0 )
            {
                allNull = false;
                break;
            }
        }

        return allNull;
    }

    /**
     * An object to describe what to update
     * 
     * @author tturner
     */
    public class InnerCell
    {
        /**
         * the column number of the column acting as a key
         */
        int    keyColumn;
        /**
         * the column value of the column acting as a key
         */
        String key;
        /**
         * the column to update
         */
        int    column;
        /**
         * the value to update
         */
        String value;
    }
    /*public static void main(String[] args){
    	SpreadSheetParser parser = new SpreadSheetParser();
    	List<String> workSheets = new ArrayList<String>();
		workSheets.add("Asset");
		workSheets.add("Fields");
    	Map<String,String[][]> doc = parser.parseInputFile("/predix/PredixApps/ReferenceApp/dataseed-service/src/main/resources/AssetData.xls", workSheets);
    	log.debug(doc);
    }*/
}