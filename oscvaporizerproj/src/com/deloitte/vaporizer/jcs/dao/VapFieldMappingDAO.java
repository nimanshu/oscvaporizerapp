package com.deloitte.vaporizer.jcs.dao;

import com.deloitte.vaporizer.jcs.bean.VapFieldMapping;
import com.deloitte.vaporizer.jcs.util.GetJNDIConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Date;

public class VapFieldMappingDAO 
{
    private Connection con = null;
    private Statement stmt = null;
    public VapFieldMappingDAO() 
    {
        con = GetJNDIConnectionUtil.getConnection();    
    }
    
    public ArrayList<VapFieldMapping> getObjMapRelatedFieldMappings(String objMapId) throws SQLException {
        if(con != null)
        {
            System.out.println("con != null ");
            ArrayList<VapFieldMapping> fieldMapList = new ArrayList<VapFieldMapping>();
            String getObjMapRelatedFieldMappingsSql = "SELECT ID,SIEBEL_BASE_TABLE_NAME,SIEBEL_BASE_TABLE_COLUMN_NAME,OSC_OBJECT_NAME,OSC_OBJECT_FIELD_NAME,CREATED,CREATED_BY,LST_UPDATED,LST_UPDATED_BY,OBJ_MAPPING_ID FROM VAP_FIELD_MAPPING WHERE OBJ_MAPPING_ID = '"+objMapId+"'";
            System.out.println(getObjMapRelatedFieldMappingsSql);
            stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery(getObjMapRelatedFieldMappingsSql);
            //System.out.println(rs1.next());
            while(rs1.next())
            {
                System.out.println("inside rs.next");
                VapFieldMapping fieldMap = new VapFieldMapping();
                fieldMap.setCreated(rs1.getDate("CREATED"));
                fieldMap.setCreatedBy(rs1.getString("CREATED_BY"));
                fieldMap.setId(rs1.getInt("ID"));
                fieldMap.setLstUpdated(rs1.getDate("LST_UPDATED"));
                fieldMap.setLstUpdatedBy(rs1.getString("LST_UPDATED_BY"));
                fieldMap.setObjMapId(rs1.getInt("OBJ_MAPPING_ID"));
                fieldMap.setOscFieldName(rs1.getString("OSC_OBJECT_FIELD_NAME"));
                fieldMap.setOscObjName(rs1.getString("OSC_OBJECT_NAME"));
                fieldMap.setSiebBaseTableName(rs1.getString("SIEBEL_BASE_TABLE_NAME"));
                fieldMap.setSiebColumnName(rs1.getString("SIEBEL_BASE_TABLE_COLUMN_NAME"));
                
                
                fieldMapList.add(fieldMap);
            }
            System.out.println("fieldMapList = "+fieldMapList);
            stmt.close();
            System.out.println("fieldMapList = "+fieldMapList);
            return fieldMapList;
        }
        else 
        {
            System.out.println("con == null ");    
            return null; 
        }    
        
    }
    
    public void createFieldMapping(VapFieldMapping fm) throws SQLException
    {
        int objMapId = fm.getObjMapId();
        String siebBaseTable = fm.getSiebBaseTableName();
        String siebBaseColumn = fm.getSiebColumnName();
        String oscObjName = fm.getOscObjName();
        String oscFieldName = fm.getOscFieldName();
        Date created = new java.sql.Date(fm.getCreated().getTime());
        String createdBy = fm.getCreatedBy();
        Date lstUpdated = new java.sql.Date(fm.getLstUpdated().getTime());
        String lstUpdatedBy = fm.getLstUpdatedBy();
        
        String createFieldMapSql = "INSERT INTO VAP_FIELD_MAPPING \n" + 
                   "(ID,OBJ_MAPPING_ID,SIEBEL_BASE_TABLE_NAME,SIEBEL_BASE_TABLE_COLUMN_NAME,OSC_OBJECT_NAME,OSC_OBJECT_FIELD_NAME,CREATED,CREATED_BY,LST_UPDATED,LST_UPDATED_BY)\n" + 
                   "VALUES (VAP_FIELD_MAPPING_SEQ.NEXTVAL,'"+objMapId+"', '"+siebBaseTable+"','"+siebBaseColumn+"','"+oscObjName+"','"+oscFieldName+"',TO_DATE('"+created+"','YYYY-MM-DD'),'"+createdBy+"',TO_DATE('"+lstUpdated+"','YYYY-MM-DD'),'"+lstUpdatedBy+"')";    
        
        System.out.println(createFieldMapSql);
        
        if(con != null)
        {
            stmt = con.createStatement();
            stmt.execute(createFieldMapSql);
            stmt.close();
        }
    }
}
