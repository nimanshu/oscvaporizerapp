package com.deloitte.vaporizer.jcs.controller;

import com.deloitte.vaporizer.jcs.bean.VapFieldMapping;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;

import javax.servlet.*;
import javax.servlet.http.*;

import com.deloitte.vaporizer.jcs.dao.VapFieldMappingDAO;
import com.deloitte.vaporizer.jcs.bean.VapObjMapping;
import com.deloitte.vaporizer.jcs.dao.VapObjMappingDAO;
import com.deloitte.vaporizer.jcs.bean.VapProject;
import com.deloitte.vaporizer.jcs.dao.VapProjectDAO;

public class ProjectServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get request recieved");
        System.out.println("id parameter = "+ request.getParameter("id"));
        if(request.getParameter("id")!= null && Integer.valueOf(request.getParameter("id"))!= 0)
        {
            HttpSession session = request.getSession(true);
            String projId = request.getParameter("id");
            VapObjMappingDAO vObjMapDAO = new VapObjMappingDAO();
            ArrayList<VapObjMapping> vObjMapList = null;// = new ArrayList<VapObjMapping>();
            try 
            {
                vObjMapList = vObjMapDAO.getProjRelatedObjectMappings(Integer.valueOf(request.getParameter("id")));
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
            System.out.println("projId = "+projId);
            session.setAttribute("projId", projId);
            request.setAttribute("vObjMapList", vObjMapList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ObjectMapping.jsp");
            dispatcher.forward(request, response);
        }
        
        else if(request.getParameter("objMapId")!= null && Integer.valueOf(request.getParameter("objMapId"))!= 0) 
        {
          /*  HttpSession session = request.getSession(true);
            String objMapId = request.getParameter("objMapId");
            System.out.println("objMapId = "+objMapId);
            session.setAttribute("objMapId", objMapId);
            VapFieldMappingDAO vFieldMapDAO = new VapFieldMappingDAO();
            ArrayList<VapFieldMapping> vFieldMapList = null;
            try
            {
                vFieldMapList = vFieldMapDAO.getObjMapRelatedFieldMappings(objMapId);
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("vFieldMapList = "+vFieldMapList);
            request.setAttribute("vFieldMapList", vFieldMapList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("FieldMapping.jsp");
            dispatcher.forward(request, response);*/

            ProjectServlet.goToFieldMappingPage(String.valueOf(request.getParameter("objMapId")), request, response);
            
        }
        
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* System.out.println(request.getParameter("PROJECT_NAME"));
        System.out.println(request.getParameter("SIEBEL_USER_NAME"));
        System.out.println(request.getParameter("SIEBEL_PASSWORD"));
        System.out.println(request.getParameter("SIEBEL_TOKEN"));
        System.out.println(request.getParameter("SIEBEL_REPO_NAME"));
        System.out.println(request.getParameter("TG_SC_USERNAME"));
        System.out.println(request.getParameter("TG_SC_PWD"));
        System.out.println(request.getParameter("TG_SC_HOSTNAME"));*/
       
        
        if(request.getParameter("goHome")!= null)
        {
            response.sendRedirect("AllProjects.jsp");
        }
        
        else if(request.getParameter("newProj")!= null)
        {
            response.sendRedirect("CreateProject.jsp");
        }
        else if(request.getParameter("newObjMap")!= null)
        {
            //System.out.println("request.getAttribute(projId)"+ request.getAttribute("projId"));
            //System.out.println("request.getParameter(projId)"+ request.getParameter("projId"));
            String projId = (String)request.getAttribute("id");
            //request.setAttribute("projId", projId); 
            HttpSession session = request.getSession(true);
            System.out.println("session.getAttribute(projId)"+ session.getAttribute("projId"));
            System.out.println("session.getParameter(projId)"+ session.getAttribute("projId"));
            response.sendRedirect("CreateObjMapping.jsp");
        }
        
        else if(request.getParameter("newFieldMap")!=null)
        {
            HttpSession session = request.getSession(true);
            System.out.println("going to create field mapping page");
            System.out.println(session.getAttribute("objMapId"));
            response.sendRedirect("CreateFieldMapping.jsp");
        }
        
        else if(request.getParameter("createObjMapping") != null)
        {
            HttpSession session = request.getSession(true);
            VapObjMapping vObjMap = new VapObjMapping();
            vObjMap.setCreated(new Date());
            vObjMap.setCreatedBy("NIPAREKH");
            vObjMap.setExtractionQuery(request.getParameter("EXTRACTION_QUERY"));
            vObjMap.setLstUpdated(new Date());
            vObjMap.setLstUpdatedBy("NIPAREKH");
            vObjMap.setOscObject(request.getParameter("OSC_OBJECT"));
            vObjMap.setProjectId(String.valueOf(session.getAttribute("projId")));
            vObjMap.setSequence(Integer.valueOf(request.getParameter("SEQUENCE_NUM")));
            vObjMap.setSiebelObject(request.getParameter("SIEBEL_OBJECT"));
            vObjMap.setSiebelPrimBaseTable(request.getParameter("SIEBEL_PRIM_BASE_TABLE"));
            VapObjMappingDAO vObjMapDAO = new VapObjMappingDAO();
            try 
            {
                vObjMapDAO.createObjectMapping(vObjMap);
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Obj Mapping record saveed - done");
            response.sendRedirect("ObjectMapping.jsp");

        }
        
        else if(request.getParameter("createFieldMapping")!= null)
        {
            HttpSession session = request.getSession(true);
            VapFieldMapping vFieldMap = new VapFieldMapping();
            vFieldMap.setCreated(new Date());
            vFieldMap.setCreatedBy("NIPAREKH");
            vFieldMap.setLstUpdated(new Date());
            vFieldMap.setLstUpdatedBy("NIPAREKH");
            vFieldMap.setObjMapId(Integer.valueOf(String.valueOf(session.getAttribute("objMapId"))));
            vFieldMap.setOscObjName(request.getParameter("OSC_OBJECT_NAME"));
            vFieldMap.setOscFieldName(request.getParameter("OSC_OBJECT_FIELD_NAME"));
            vFieldMap.setSiebBaseTableName(request.getParameter("SIEBEL_BASE_TABLE_NAME"));
            vFieldMap.setSiebColumnName(request.getParameter("SIEBEL_BASE_TABLE_COLUMN_NAME"));
            VapFieldMappingDAO vFieldMapDAO = new VapFieldMappingDAO();
            try 
            {
                vFieldMapDAO.createFieldMapping(vFieldMap);
                System.out.println("Field Mapping record saveed - done");
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
            String objMapId = String.valueOf(session.getAttribute("objMapId"));
            ProjectServlet.goToFieldMappingPage(objMapId, request, response);
            /*System.out.println("objMapId = "+objMapId);
            session.setAttribute("objMapId", objMapId);
            ArrayList<VapFieldMapping> vFieldMapList = null;
            try
            {
                vFieldMapList = vFieldMapDAO.getObjMapRelatedFieldMappings(objMapId);    
            }
            catch(SQLException e)
            {
                e.printStackTrace();    
            }
            System.out.println("vFieldMapList = "+vFieldMapList);
            request.setAttribute("vFieldMapList", vFieldMapList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("FieldMapping.jsp");
            dispatcher.forward(request, response);*/
            //response.sendRedirect("FieldMapping.jsp");
            
        }
        else
        {
            VapProject vproj = new VapProject();
            vproj.setCreated(new Date());
            vproj.setCreatedBy("NIPAREKH");
            vproj.setLastUpdated(new Date());
            vproj.setLastUpdatedBy("NIPAREKH");
            vproj.setParentProjectId("");
            vproj.setProjectName(request.getParameter("PROJECT_NAME"));
            vproj.setSiebelPassword(request.getParameter("SIEBEL_PASSWORD"));
            vproj.setSiebelRepositoryName(request.getParameter("SIEBEL_REPO_NAME"));
            vproj.setSiebelToken(request.getParameter("SIEBEL_TOKEN"));
            vproj.setSiebelUserName(request.getParameter("SIEBEL_USER_NAME"));
            vproj.setTgScHostName(request.getParameter("TG_SC_HOSTNAME"));
            vproj.setTgScPassword(request.getParameter("TG_SC_PWD"));
            vproj.setTgScUserName(request.getParameter("TG_SC_USERNAME"));
            
            //VapProject object is ready to be inserted into DB now

            VapProjectDAO vprojDao = new VapProjectDAO();
            try 
            {
                vprojDao.createProject(vproj);
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
            
            System.out.println("done");
            //request.getRequestDispatcher("/WEB-INF/ShowAllEmployees.jsp").forward(request, response);
            response.sendRedirect("AllProjects.jsp");
        }    
    }
    
    public static void goToFieldMappingPage(String objMapId, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        System.out.println("objMapId = "+objMapId);
        session.setAttribute("objMapId", objMapId);
        VapFieldMappingDAO vFieldMapDAO = new VapFieldMappingDAO();
        ArrayList<VapFieldMapping> vFieldMapList = null;
        try
        {
            vFieldMapList = vFieldMapDAO.getObjMapRelatedFieldMappings(objMapId);    
        }
        catch(SQLException e)
        {
            e.printStackTrace();    
        }
        System.out.println("vFieldMapList = "+vFieldMapList);
        request.setAttribute("vFieldMapList", vFieldMapList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FieldMapping.jsp");
        dispatcher.forward(request, response);
    }
}
