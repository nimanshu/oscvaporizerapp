package com.deloitte.vaporizer.jcs.dao;

import com.deloitte.vaporizer.jcs.bean.OscObjects;
import com.deloitte.vaporizer.jcs.bean.VapProject;
import com.deloitte.vaporizer.jcs.util.GetJNDIConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetOscObjectsInJcsDb 
{
    private Connection con = null;
    private Statement stmt = null;
    public GetOscObjectsInJcsDb()
    {
        con = GetJNDIConnectionUtil.getConnection();
    }
    
    public ArrayList<OscObjects> getAllOscOjects() throws SQLException {
        
        ArrayList<OscObjects> lstVapOscObjects = new ArrayList<OscObjects>();
        String getAllOscOjectsSql = "SELECT OSC_OBJECT_NAME AS OSC_OBJECT_NAME FROM OSC_OBJECTS";
        stmt = con.createStatement();
        if(stmt != null)
        {
            ResultSet rs = stmt.executeQuery(getAllOscOjectsSql);
            while(rs.next())
            {
                OscObjects vOscObj = new OscObjects();
                vOscObj.setOscObjectName(rs.getString("OSC_OBJECT_NAME"));
                lstVapOscObjects.add(vOscObj);
                //rs.next();
            }
            stmt.close();
            return lstVapOscObjects;
        }
        return null;    
    }
}
