package com.ge.predix.solsvc.dataseed.asset;

import java.beans.PropertyDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.http.Header;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import com.ge.predix.solsvc.bootstrap.ams.common.AssetRestConfig;
import com.ge.predix.solsvc.bootstrap.ams.dto.Asset;
import com.ge.predix.solsvc.bootstrap.ams.dto.Classification;
import com.ge.predix.solsvc.bootstrap.ams.dto.Meter;
import com.ge.predix.solsvc.bootstrap.ams.factories.AssetFactory;
import com.ge.predix.solsvc.bootstrap.ams.factories.ClassificationFactory;
import com.ge.predix.solsvc.bootstrap.ams.factories.GroupFactory;
import com.ge.predix.solsvc.bootstrap.ams.factories.MeterFactory;
import com.ge.predix.solsvc.dataseed.config.AppConfig;
import com.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;

/**
 * This class is an incomplete work-in-progress, the intent will be to read data from Predix Asset and
 * put it in to a spreadsheet.
 * 
 * @author predix
 */
@Component
@SuppressWarnings("nls")
public class AssetDataHarvest
{
	private static Logger log = LoggerFactory.getLogger(AssetDataInitialization.class);

    @Autowired
    private ClassificationFactory       classificationFactory;

    @Autowired
    private AssetFactory                assetFactory;

    @Autowired
    private GroupFactory                groupFactory;

    @Autowired
    private MeterFactory                meterFactory;

    @Autowired
    private AppConfig                   appConfig;

    @Autowired
    private CxfAwareRestClient          restClient;
    
	@Autowired
	private AssetRestConfig assetRestConfig;


    private static PropertyDescriptor[] classificationProps = PropertyUtils
                                                                    .getPropertyDescriptors(Classification.class);
    private static PropertyDescriptor[] meterProps          = PropertyUtils.getPropertyDescriptors(Meter.class);
    private static PropertyDescriptor[] groupProps          = PropertyUtils.getPropertyDescriptors(Meter.class);
    private static PropertyDescriptor[] assetProps          = PropertyUtils.getPropertyDescriptors(Asset.class);

    /**
     * 
     */
    @PostConstruct
    public void intilizeAssetData()
    {
        log.debug("*******************Seed data Initialization complete*********************");
    }

    /**
     * @param authorization
     *            -
     * @param appId
     *            -
     */

    public void harvestData(String authorization, String appId)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("poi-test.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("POI Worksheet");

            // index from 0,0... cell A1 is cell(0,0)
            @SuppressWarnings("unused")
            HSSFRow row1 = worksheet.createRow((short) 0);

            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        FileOutputStream fos = null;
        try
        {
            String fileName = "src/main/resources/" + appId + "/AssetDataExport.xls";
            fos = new FileOutputStream(fileName);
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet worksheet = wb.createSheet("Classification");
            HSSFRow row = worksheet.createRow(0);
            addAttribute(row, classificationProps, 0);

            addClassifications(worksheet, 1);

            worksheet = wb.createSheet("Meter");
            row = worksheet.createRow(0);
            addAttribute(row, meterProps, 0);

            worksheet = wb.createSheet("Group");
            row = worksheet.createRow(0);
            addAttribute(row, groupProps, 0);

            worksheet = wb.createSheet("Asset");
            row = worksheet.createRow(0);
            addAttribute(row, assetProps, 0);

            wb.write(fos);
            fos.flush();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            try
            {
                if ( fos != null ) fos.close();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * @param worksheet
     */
    @SuppressWarnings("unused")
    private void addClassifications(HSSFSheet worksheet, int rowOffset)
    {
        int cellOffset = 0;
        String userName = "rmd_user_1";
        String password = "rmd_user_1";
        boolean encodePassword = false;
        List<Header> headers = this.restClient.getOauthHttpHeaders();
        List<Classification> classifications = this.classificationFactory.getAllClassifications(headers);
        int rowOffset2 = rowOffset;
        for (Classification classification : classifications)
        {
            HSSFRow row = worksheet.createRow(rowOffset2++);
            //addAttributeValue(row, classificationProps, 0, classification);
        }
    }

    /**
     * @param row
     * @param props
     */
    private void addAttribute(HSSFRow row, PropertyDescriptor[] props, Integer offset)
    {
        try
        {
            Integer offset2 = offset;
            for (int i = 0; i < props.length; i++)
            {
                PropertyDescriptor propertyDescriptor = props[i];
                if ( propertyDescriptor.getName().toLowerCase().endsWith("uri") )
                {
                    row.createCell(offset2++).setCellValue(propertyDescriptor.getName());
                }
            }

            for (int i = 0; i < props.length; i++)
            {
                PropertyDescriptor propertyDescriptor = props[i];
                if ( propertyDescriptor.getPropertyType().toString().equals("class java.lang.Class")
                        || propertyDescriptor.getPropertyType().toString().startsWith("class java.lang.reflect")
                        || propertyDescriptor.getName().toLowerCase().endsWith("uri") )
                {
                    // do nothing
                }
                else if ( propertyDescriptor.getPropertyType().isPrimitive()
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.String")
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.Boolean") )
                    row.createCell(offset2++).setCellValue(propertyDescriptor.getName());
            }

            for (int i = 0; i < props.length; i++)
            {
                PropertyDescriptor propertyDescriptor = props[i];
                if ( propertyDescriptor.getPropertyType().toString().equals("class java.lang.Class") ||
                        propertyDescriptor.getPropertyType().toString().equals("class java.lang.Object")
                        || propertyDescriptor.getPropertyType().toString().startsWith("class java.lang.reflect")
                        || propertyDescriptor.getName().toLowerCase().endsWith("uri") )
                {
                    // do nothing
                }
                else if ( propertyDescriptor.getPropertyType().isPrimitive()
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.String")
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.Boolean") )
                {
                    // do nothing
                }
                else
                {
                    PropertyDescriptor[] moreProps = null;
                    if ( propertyDescriptor.getPropertyType().getName().endsWith("Map")) {
                        Method method=propertyDescriptor.getReadMethod();
                        Type hashMapTypes = method.getGenericReturnType();
                        Type[] types = ((ParameterizedTypeImpl) hashMapTypes).getActualTypeArguments();
                        Type type = types[1];
                        Class<?> clazz = getClass(type);
                        if ( clazz.getCanonicalName().equals("java.lang.Object"))
                            break;
                        moreProps = PropertyUtils.getPropertyDescriptors(clazz);
                    }
                    else 
                        moreProps = PropertyUtils.getPropertyDescriptors(propertyDescriptor.getPropertyType());
                    row.createCell(offset2++).setCellValue("<" + propertyDescriptor.getName() + ">");
                    addAttribute(row, moreProps, offset + 1);
                }
            }
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    private static final String TYPE_NAME_PREFIX = "class ";
    /**
     * @param type -
     * @return -
     */
    public static String getClassName(Type type) {
        if (type==null) {
            return "";
        }
        String className = type.toString();
        if (className.startsWith(TYPE_NAME_PREFIX)) {
            className = className.substring(TYPE_NAME_PREFIX.length());
        }
        return className;
    }
    /**
     * @param type -
     * @return -
     * @throws ClassNotFoundException -
     */
    public static Class<?> getClass(Type type) 
            throws ClassNotFoundException {
    String className = getClassName(type);
    if (className==null || className.isEmpty()) {
        return null;
    }
    return Class.forName(className);
}

    /**
     * @param row
     * @param props
     * @param classification
     */
    @SuppressWarnings("unused")
    private void addAttributeValue(HSSFRow row, PropertyDescriptor[] props, int offset, Object bean)
    {
        try
        {
            int offset2 = offset;
            for (int i = 0; i < props.length; i++)
            {
                PropertyDescriptor propertyDescriptor = props[i];
                if ( propertyDescriptor.getName().toLowerCase().endsWith("uri") )
                {
                    Object value = PropertyUtils.getProperty(bean, propertyDescriptor.getName());
                    row.createCell(offset2++).setCellValue((String)value);
                }
            }

            for (int i = 0; i < props.length; i++)
            {
                PropertyDescriptor propertyDescriptor = props[i];
                if ( propertyDescriptor.getPropertyType().toString().equals("class java.lang.Class")
                        || propertyDescriptor.getPropertyType().toString().startsWith("class java.lang.reflect")
                        || propertyDescriptor.getName().toLowerCase().endsWith("uri") )
                {
                    // do nothing
                }
                else if ( propertyDescriptor.getPropertyType().isPrimitive()
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.String")
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.Boolean") )
                {
                    Object value = null;
                    if ( bean instanceof HashMap )
                        value = ((HashMap<?, ?>) bean).get(propertyDescriptor.getName());
                    else
                        value = PropertyUtils.getProperty(bean, propertyDescriptor.getName());
                    if ( value instanceof String) 
                        row.createCell(offset2++).setCellValue((String)value);
                    else if ( value instanceof Boolean) 
                        row.createCell(offset2++).setCellValue((Boolean)value);
                }
            }

            for (int i = 0; i < props.length; i++)
            {
                PropertyDescriptor propertyDescriptor = props[i];
                if ( propertyDescriptor.getPropertyType().toString().equals("class java.lang.Class")
                        || propertyDescriptor.getPropertyType().toString().startsWith("class java.lang.reflect")
                        || propertyDescriptor.getName().toLowerCase().endsWith("uri") )
                {
                    // do nothing
                }
                else if ( propertyDescriptor.getPropertyType().isPrimitive()
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.String")
                        || propertyDescriptor.getPropertyType().toString().equals("class java.lang.Boolean") )
                {
                    // do nothing
                }
                else
                {
                    PropertyDescriptor[] moreProps = PropertyUtils
                            .getPropertyDescriptors(propertyDescriptor.getClass());
                    row.createCell(offset2++).setCellValue("<" + propertyDescriptor.getName() + ">");
                    Object nextBean = PropertyUtils.getProperty(bean, propertyDescriptor.getName());
                    addAttributeValue(row, moreProps, offset2 + 1, nextBean);
                }
            }
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e)
        {
            throw new RuntimeException(e);
        }
        catch (NoSuchMethodException e)
        {
            throw new RuntimeException(e);
        }
    }


}
