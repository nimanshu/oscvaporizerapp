package com.deloitte.vaporizer.jcs.dao;

import com.deloitte.vaporizer.jcs.bean.VapProject;
import com.deloitte.vaporizer.jcs.util.GetJNDIConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VapProjectDAO 
{
    private Connection con = null;
    private Statement stmt = null;
    public VapProjectDAO()
    {
        con = GetJNDIConnectionUtil.getConnection();
    }
    
    public ArrayList<VapProject> getAllProjects() throws SQLException {
        
        ArrayList<VapProject> lstVapProject = new ArrayList<VapProject>();
        String getAllProjectSql = "SELECT PROJECT_ID,PROJECT_NAME,SIEBEL_USER_NAME,SIEBEL_PASSWORD,SIEBEL_TOKEN,SIEBEL_REPO_NAME,PARENT_PROJ_ID,TG_SC_USERNAME,TG_SC_PWD,TG_SC_HOSTNAME,CREATED,CREATED_BY,LST_UPDATED,LST_UPDATED_BY FROM VAP_PROJECT";
        stmt = con.createStatement();
        if(stmt != null)
        {
            ResultSet rs = stmt.executeQuery(getAllProjectSql);
            while(rs.next())
            {
                VapProject vproj = new VapProject();
                vproj.setProjectId(rs.getInt("PROJECT_ID"));
                vproj.setCreated(rs.getDate("CREATED"));
                vproj.setCreatedBy(rs.getString("CREATED_BY"));
                vproj.setLastUpdated(rs.getDate("LST_UPDATED"));
                vproj.setLastUpdatedBy(rs.getString("LST_UPDATED_BY"));
                vproj.setParentProjectId("");
                vproj.setProjectName(rs.getString("PROJECT_NAME"));
                vproj.setSiebelPassword(rs.getString("SIEBEL_PASSWORD"));
                vproj.setSiebelRepositoryName(rs.getString("SIEBEL_REPO_NAME"));
                vproj.setSiebelToken(rs.getString("SIEBEL_TOKEN"));
                vproj.setSiebelUserName(rs.getString("SIEBEL_USER_NAME"));
                vproj.setTgScHostName(rs.getString("TG_SC_HOSTNAME"));
                vproj.setTgScPassword(rs.getString("TG_SC_PWD"));
                vproj.setTgScUserName(rs.getString("TG_SC_USERNAME"));
                lstVapProject.add(vproj);
            }
            stmt.close();
            return lstVapProject;
        }
        return null;    
    }
    
    public void createProject(VapProject proj) throws SQLException {
        String projectName = proj.getProjectName();
        String siebelUserName = proj.getSiebelUserName();
        String siebelPassword = proj.getSiebelPassword();
        String siebelToken = proj.getSiebelToken();
        String siebelRepositoryName = proj.getSiebelRepositoryName();
        String parentProjectId = proj.getParentProjectId();
        String tgScUserName = proj.getTgScUserName();
        String tgScPassword = proj.getTgScPassword();
        String tgScHostName = proj.getTgScHostName();
        Date created = new java.sql.Date(proj.getCreated().getTime());
        String createdBy = proj.getCreatedBy();
        Date lastUpdated = new java.sql.Date(proj.getLastUpdated().getTime());
        String lastUpdatedBy = proj.getLastUpdatedBy();
        
           String createProjectSql = "INSERT INTO VAP_PROJECT \n" + 
           "(PROJECT_ID,PROJECT_NAME,SIEBEL_USER_NAME,SIEBEL_PASSWORD,SIEBEL_TOKEN,SIEBEL_REPO_NAME,PARENT_PROJ_ID,TG_SC_USERNAME,TG_SC_PWD,TG_SC_HOSTNAME,CREATED,CREATED_BY,LST_UPDATED,LST_UPDATED_BY)\n" + 
           "VALUES (VAP_PROJECT_SEQ.NEXTVAL, '"+projectName+"','"+siebelUserName+"','"+siebelPassword+"','"+siebelToken+"','"+siebelRepositoryName+"','"+parentProjectId+"','"+tgScUserName+"','"+tgScPassword+"','"+tgScHostName+"',TO_DATE('"+created+"','YYYY-MM-DD'),'"+createdBy+"',TO_DATE('"+lastUpdated+"','YYYY-MM-DD'),'"+lastUpdatedBy+"')"; 
        
        System.out.println(createProjectSql);
        stmt = con.createStatement();
        if(stmt != null) 
        {
            stmt.execute(createProjectSql);    
        }
        
        stmt.close();
    }
}
