package com.deloitte.vaporizer.jcs.dao;

import com.deloitte.vaporizer.jcs.bean.VapObjMapping;
import com.deloitte.vaporizer.jcs.util.GetJNDIConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Date;

public class VapObjMappingDAO 
{
    private Connection con = null;
    private Statement stmt = null;
    public VapObjMappingDAO()
    {
        con = GetJNDIConnectionUtil.getConnection();
    }
    
    public ArrayList<VapObjMapping> getAllObjectMappings() throws SQLException {
       if(con != null)
       {
           ArrayList<VapObjMapping> objMapList = new ArrayList<VapObjMapping>();
           String getAllObjMappingSql = "SELECT ID, SEQUENCE_NUM, OSC_OBJECT, SIEBEL_OBJECT, SIEBEL_PRIM_BASE_TABLE, PROJECT_ID, EXTRACTION_QUERY, CREATED, CREATED_BY, LST_UPDATED, LST_UPDATED_BY FROM VAP_OBJ_MAPPING";
           stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(getAllObjMappingSql);
           while(rs.next())
           {
               
               VapObjMapping objMap = new VapObjMapping();
               objMap.setCreated(rs.getDate("CREATED"));
               objMap.setCreatedBy(rs.getString("CREATED_BY"));
               objMap.setExtractionQuery(rs.getString("EXTRACTION_QUERY"));
               objMap.setId(rs.getInt("ID"));
               objMap.setLstUpdated(rs.getDate("LST_UPDATED"));
               objMap.setLstUpdatedBy(rs.getString("LST_UPDATED_BY"));
               objMap.setOscObject(rs.getString("OSC_OBJECT"));
               objMap.setProjectId(rs.getString("PROJECT_ID"));
               objMap.setSequence(rs.getInt("SEQUENCE_NUM"));
               objMap.setSiebelObject(rs.getString("SIEBEL_OBJECT"));
               objMap.setSiebelPrimBaseTable(rs.getString("SIEBEL_PRIM_BASE_TABLE"));
               objMapList.add(objMap);
           }
           return objMapList;
       }
       else
       return null;     
    }
    
    public ArrayList<VapObjMapping> getProjRelatedObjectMappings(int projId) throws SQLException 
    {
       if(con != null)
       {
           ArrayList<VapObjMapping> objMapList = new ArrayList<VapObjMapping>();
           //String getAllObjMappingSql = "SELECT ID, SEQUENCE_NUM, OSC_OBJECT, SIEBEL_OBJECT, SIEBEL_PRIM_BASE_TABLE, PROJECT_ID, EXTRACTION_QUERY, CREATED, CREATED_BY, LST_UPDATED, LST_UPDATED_BY FROM VAP_OBJ_MAPPING";
           String getAllObjMappingSql = "SELECT ID, SEQUENCE_NUM, OSC_OBJECT, SIEBEL_OBJECT, SIEBEL_PRIM_BASE_TABLE, PROJECT_ID, EXTRACTION_QUERY, CREATED, CREATED_BY, LST_UPDATED, LST_UPDATED_BY FROM VAP_OBJ_MAPPING WHERE PROJECT_ID = "+projId+"";
           stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(getAllObjMappingSql);
           while(rs.next())
           {
               
               VapObjMapping objMap = new VapObjMapping();
               objMap.setCreated(rs.getDate("CREATED"));
               objMap.setCreatedBy(rs.getString("CREATED_BY"));
               objMap.setExtractionQuery(rs.getString("EXTRACTION_QUERY"));
               objMap.setId(rs.getInt("ID"));
               objMap.setLstUpdated(rs.getDate("LST_UPDATED"));
               objMap.setLstUpdatedBy(rs.getString("LST_UPDATED_BY"));
               objMap.setOscObject(rs.getString("OSC_OBJECT"));
               objMap.setProjectId(rs.getString("PROJECT_ID"));
               objMap.setSequence(rs.getInt("SEQUENCE_NUM"));
               objMap.setSiebelObject(rs.getString("SIEBEL_OBJECT"));
               objMap.setSiebelPrimBaseTable(rs.getString("SIEBEL_PRIM_BASE_TABLE"));
               objMapList.add(objMap);
           }
           return objMapList;
       }
       else
       return null;     
    }
    
    
    
    public int createObjectMapping(VapObjMapping objMap) throws SQLException {
        
        int id = objMap.getId();
        int sequence = objMap.getSequence();
        String oscObject = objMap.getOscObject();
        String siebelObject = objMap.getSiebelObject();
        String siebelPrimBaseTable = objMap.getSiebelPrimBaseTable();
        String projectId = objMap.getProjectId();
        String extractionQuery = objMap.getExtractionQuery();
        Date created = new java.sql.Date(objMap.getCreated().getTime());
        String createdBy = objMap.getCreatedBy();
        Date lstUpdated = new java.sql.Date(objMap.getLstUpdated().getTime());
        String lstUpdatedBy = objMap.getLstUpdatedBy();
                
                
        String objMapNextValSql = "SELECT VAP_OBJ_MAPPING_SEQ.NEXTVAL from dual";
        int objMapNextVal=0;  
        if(con != null)
        {
            stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery(objMapNextValSql);
            if(rs1.next()) {
                objMapNextVal = rs1.getInt(1);    
            }
            stmt.close();
        }  
                
        String createObjMapSql = "INSERT INTO VAP_OBJ_MAPPING \n" + 
                   "(ID,SEQUENCE_NUM,OSC_OBJECT,SIEBEL_OBJECT,SIEBEL_PRIM_BASE_TABLE,PROJECT_ID,EXTRACTION_QUERY,CREATED,CREATED_BY,LST_UPDATED,LST_UPDATED_BY)\n" + 
                   "VALUES ('"+objMapNextVal+"', '"+sequence+"','"+oscObject+"','"+siebelObject+"','"+siebelPrimBaseTable+"','"+projectId+"','"+extractionQuery+"',TO_DATE('"+created+"','YYYY-MM-DD'),'"+createdBy+"',TO_DATE('"+lstUpdated+"','YYYY-MM-DD'),'"+lstUpdatedBy+"')";
        
        System.out.println(createObjMapSql);
        
        if(con != null)
        {
            stmt = con.createStatement();
            stmt.execute(createObjMapSql);
            stmt.close();
        }
        
        return objMapNextVal;
    }
    
    public int searchObjMappinginExistingProject(int existingProjId, String siebObjName, String oscObjName) throws SQLException {
        int exisProjObjMappingId=0;
        String searchObjMappingInExistingProject = "SELECT ID ,\n" + 
        "EXISTING_PROJECT_ID ,\n" + 
        "SIEBEL_PRNT_TABLE_NAME_CM ,\n" + 
        "SIEBEL_CHILD_TABLE_NAME_CM ,\n" + 
        "JOIN_COND_CM ,\n" + 
        "INCLUDE_FLG_CM ,\n" + 
        "SERIAL_NUM_CM ,\n" + 
        "SIEBEL_OBJ_NAME ,\n" + 
        "OSC_OBJ_NAME ,\n" + 
        "VAP_PREDEF_OBJ_MAPPING_TYPE ,\n" + 
        "CREATED ,\n" + 
        "CREATED_BY ,\n" + 
        "LST_UPDATED ,\n" + 
        "LST_UPDATED_BY  FROM VAP_PREDEF_OBJ_MAPPING WHERE SIEBEL_OBJ_NAME = '"+siebObjName+"' AND OSC_OBJ_NAME = '"+oscObjName+"' AND EXISTING_PROJECT_ID='"+existingProjId+"'";
            
        if(con != null)
        {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(searchObjMappingInExistingProject);
            while(rs.next())
            {
                exisProjObjMappingId = rs.getInt(1);
                System.out.println("exisProjObjMappingId = "+exisProjObjMappingId);
            }
            return exisProjObjMappingId;
        }
        
        return 0;
    }
}
