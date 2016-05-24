package com.deloitte.vaporizer.jcs.controller;

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
import com.deloitte.vaporizer.jcs.bean.OscObjects;
import com.deloitte.vaporizer.jcs.dao.GetOscObjectsInJcsDb;

public class GetOscObjectsList extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        Gson gson = new Gson(); 
        JsonObject myObj = new JsonObject();
        JsonArray lstSiebObjs = new JsonArray();
        
        GetOscObjectsInJcsDb oscObjectsDao = new GetOscObjectsInJcsDb();
        ArrayList<OscObjects> list;

        try {
            list = oscObjectsDao.getAllOscOjects();
            
            for(OscObjects singleObj:list)
            {
                lstSiebObjs.add(gson.toJsonTree(singleObj));
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
