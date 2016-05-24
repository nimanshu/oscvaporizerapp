package com.deloitte.vaporizer.jcs.controller;

import com.deloitte.vaporizer.siebel.bean.SiebelObjects;

import com.deloitte.vaporizer.siebel.util.SiebelDBConnectionManager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

public class GetSiebelObjectsList extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        String siebObjName = "";
        try {
            System.out.println("get request recieved");
            System.out.println("siebObjName parameter = "+ request.getParameter("siebObjName"));
            siebObjName = request.getParameter("siebObjName");
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>GetSiebelObjectsList</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException,
                                                            IOException
                                                            {
        String siebObjName = "";
        try {
            System.out.println("Post request recieved");
            System.out.println("siebObjName parameter = "+ request.getParameter("siebObjName"));
            siebObjName = request.getParameter("siebObjName");
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        
        Gson gson = new Gson(); 
        JsonObject myObj = new JsonObject();
        JsonArray lstSiebObjs = new JsonArray();
         
        String query="SELECT BUSCOMP.NAME AS OBJECT_NAME, BASETABLE.NAME AS BASETABLE_NAME FROM SIEBEL.S_BUSCOMP BUSCOMP "
                                                        + "INNER JOIN SIEBEL.S_REPOSITORY REP ON REP.ROW_ID = BUSCOMP.REPOSITORY_ID AND REP.NAME = 'Siebel Repository' "
                                                        + "INNER JOIN SIEBEL.S_TABLE BASETABLE ON BASETABLE.NAME = BUSCOMP.TABLE_NAME AND BASETABLE.REPOSITORY_ID = REP.ROW_ID "
                                                        + "WHERE BUSCOMP.NAME LIKE '"+siebObjName+"%'";
        
        Connection con = SiebelDBConnectionManager.getSiebelConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                SiebelObjects siebObj = new SiebelObjects(rs.getString("OBJECT_NAME"),rs.getString("BASETABLE_NAME"));
                lstSiebObjs.add(gson.toJsonTree(siebObj));
            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
                }
        
        myObj.add("data", lstSiebObjs);
        
        out.println(myObj.toString());
        out.close();
    }
}
