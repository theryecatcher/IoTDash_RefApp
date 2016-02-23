package com.ge.predix.solsvc.dataseed.asset;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.http.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.bootstrap.ams.dto.Group;
import com.ge.predix.solsvc.bootstrap.ams.factories.GroupFactory;

/**
 * 
 * @author predix
 */
@Component
@SuppressWarnings("nls")
public class GroupDataInitialization extends BaseDataHandler
{
    private static final Logger log = LoggerFactory.getLogger(GroupDataInitialization.class);

    /**
     * 
     */
    private static final int            GROUP_URI                      = 0;
    private static final int            GROUP_NAME                     = 1;
    private static final int            GROUP_DESC                     = 2;
    private static final int 			GROUP_LEVEL				  	   = 3;
    private static final int 			GROUP_PARENT				   = 4;
    private static final int			GROUP_CREATEDATE			   = 5;

    @Autowired
    private GroupFactory                groupFactory;




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
     */

    public void seedData(Map<String,String[][]> content,List<Header> headers)
    {
        
        String[][] groups = content.get("Group");
        Group group = null;
        for (String[] row : groups)
        {
            if ( row[GROUP_NAME] != null )
            {               
               group = new Group();
               group.setCreatedate(row[GROUP_CREATEDATE]);
               group.setDescription(row[GROUP_DESC]);
               group.setLevel(row[GROUP_LEVEL]);
               group.setName(row[GROUP_NAME]);
               group.setParent(row[GROUP_PARENT]);
               group.setUri(row[GROUP_URI]);
               
               this.groupFactory.createGroup(group, headers);
            }
        }
    }


}
