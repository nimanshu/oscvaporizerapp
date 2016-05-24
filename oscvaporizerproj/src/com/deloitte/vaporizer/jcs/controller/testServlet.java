package com.deloitte.vaporizer.jcs.controller;

import com.deloitte.vaporizer.jcs.util.TestJNDIName;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class testServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>testServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();*/
        try 
        {
            doProcess(request, response);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>testServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println("</body></html>");
        out.close();*/
       try 
       {
           doProcess(request, response);
       } 
       catch (Exception e) 
       {
           e.printStackTrace();
       }
    }
    
    private void doProcess(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
    {
            
            try 
            {
                String str = TestJNDIName.testConnection();
                //List<String[]> str = http.getStrRowDataArray();
                request.setAttribute("str", str);
                response.setContentType(CONTENT_TYPE);
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head><title>testServlet</title></head>");
                out.println("<body>");
                out.println("<p>"+str+"</p>");
                out.println("</body></html>");
                out.close();
            }
            
            catch(Throwable t) 
            {
                t.printStackTrace();
                throw new ServletException();
            }

           // RequestDispatcher dispatcher = request.getRequestDispatcher("incident1.jsp");
            //dispatcher.forward(request, response);

        }
}
