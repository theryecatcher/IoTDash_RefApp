package com.ge.predix.solsvc.dataseed.asset;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

import javax.annotation.PostConstruct;

import org.apache.http.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.bootstrap.ams.dto.Attribute;
import com.ge.predix.solsvc.bootstrap.ams.dto.Classification;
import com.ge.predix.solsvc.bootstrap.ams.factories.ClassificationFactory;

/**
 * 
 * @author predix
 */
@Component
@SuppressWarnings(
{
        "nls", "unused"
})
public class ClassificationDataInitialization extends BaseDataHandler
{
    private static final Logger log = LoggerFactory.getLogger(ClassificationDataInitialization.class);

    /**
     * 
     */
    private static final int      CLASS_URI                    = 0;
    private static final int      CLASS_NAME                   = 1;
    private static final int      CLASS_DESC                   = 2;
    private static final int      CLASS_PARENT                 = 3;
    private static final int      CLASS_OBSOLETE               = 4;
    private static final int      CLASS_ATTRIBUTE_UOM          = 5;
    private static final int      CLASS_ATTRIBUTE_NAME         = 6;
    private static final int      CLASS_ATTRIBUTE_VALUE        = 7;
    private static final int      CLASS_ATTRIBUTE_CARDINALITY  = 8;
    private static final int      CLASS_ATTRIBUTE_TYPE         = 9;
    private static final int      CLASS_ATTRIBUTE_REQUIRED     = 10;
    private static final int      CLASS_ATTRIBUTE_UNIQUE_FLAG  = 11;
    private static final int      CLASS_ATTRIBUTE_DISPLAY_FLAG = 12;
    private static final int      CLASS_ATTRIBUTE_ENTROPY      = 13;
    private static final int      CLASS_ATTRIBUTE_ENUMERTION   = 14;

    @Autowired
    private ClassificationFactory classFactory;

    /**
     * 
     */
    @PostConstruct
    public void intilizeMeterData()
    {
        log.debug("*******************Seed data Initialization complete*********************");
    }

    /**
     * @param content -
     * @param headers -
     *            -
     * @throws DataFormatException -
     */

    public void seedData(Map<String, String[][]> content, List<Header> headers)
            throws DataFormatException
    {
        String[][] classifications = content.get("Classification");
        Classification classification = null;
        Attribute attribute = null;
        LinkedHashMap<String, Attribute> attributeMap = null;
        for (String[] row : classifications)
        {
            if ( classification == null
                    || (row[CLASS_URI] != null && !row[CLASS_URI].isEmpty() && !classification.getUri().equals(
                            row[CLASS_URI])) )
            {
                // if the classURI is changed then make call to create the
                // existing asset
                if ( classification != null && !classification.getUri().equals(row[CLASS_URI]) )
                {
                    this.classFactory.createClassification(classification, headers);
                }
                classification = new Classification();
                classification.setUri(row[CLASS_URI]);
                classification.setName(row[CLASS_NAME]);
                classification.setDescription(row[CLASS_DESC]);
                classification.setParent(row[CLASS_PARENT]);
                classification.setObsolete(Boolean.parseBoolean(row[CLASS_OBSOLETE]));

                /************* ATTRIBUTE ***************************/
                attributeMap = new LinkedHashMap<String, Attribute>();
                attribute = putAttributeInMap(attribute, attributeMap, row);
                if ( !attributeMap.isEmpty() ) classification.setAttributes(attributeMap);

            }
            else
            {
                attribute = putAttributeInMap(attribute, attributeMap, row);
            }

        }
        // if classification is not null and the last row is reached
        if ( classification != null )
        {
            this.classFactory.createClassification(classification, headers);
        }
    }

    private Attribute putAttributeInMap(Attribute previousAttrib, LinkedHashMap<String, Attribute> attributeMap,
            String[] row)
            throws DataFormatException
    {
        if ( row[CLASS_ATTRIBUTE_NAME] == null || row[CLASS_ATTRIBUTE_NAME].isEmpty() )
        {
            if ( row[CLASS_ATTRIBUTE_VALUE] != null && !row[CLASS_ATTRIBUTE_VALUE].isEmpty() )
            {
                if ( previousAttrib == null || previousAttrib.getValue() == null || previousAttrib.getValue().isEmpty() )
                {
                    throw new DataFormatException("Attribute value found without attribute in spreadsheet");
                }
                List<Object> valueList = previousAttrib.getValue();
                valueList.add(row[CLASS_ATTRIBUTE_VALUE]);
            }
            if ( row[CLASS_ATTRIBUTE_ENUMERTION] != null && !row[CLASS_ATTRIBUTE_ENUMERTION].isEmpty() )
            {
                if ( previousAttrib == null || previousAttrib.getEnumeration() == null
                        || previousAttrib.getEnumeration().isEmpty() )
                {
                    throw new DataFormatException("Attribute enum found without attribute in spreadsheet");
                }
                List<Object> enumList = previousAttrib.getEnumeration();
                enumList.add(row[CLASS_ATTRIBUTE_ENUMERTION]);
            }
            return previousAttrib;
        }
        Attribute attribute = new Attribute();
        List<Object> valueList = new ArrayList<Object>();
        if ( row[CLASS_ATTRIBUTE_VALUE] != null && !row[CLASS_ATTRIBUTE_VALUE].isEmpty() )
        {
            valueList.add(row[CLASS_ATTRIBUTE_VALUE]);
        }
        attribute.setValue(valueList);
        List<Object> enumList = new ArrayList<Object>();
        if ( row[CLASS_ATTRIBUTE_ENUMERTION] != null && !row[CLASS_ATTRIBUTE_ENUMERTION].isEmpty() )
        {
            enumList.add(row[CLASS_ATTRIBUTE_ENUMERTION]);
        }
        attribute.setEnumeration(enumList);
        attribute.setUom(row[CLASS_ATTRIBUTE_UOM]);
        attribute.setType(row[CLASS_ATTRIBUTE_TYPE]);
        attributeMap.put(row[CLASS_ATTRIBUTE_NAME], attribute);
        return attribute;
    }

}
