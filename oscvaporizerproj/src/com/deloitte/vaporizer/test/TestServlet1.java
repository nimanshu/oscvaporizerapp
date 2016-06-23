package com.deloitte.vaporizer.test;

import com.deloitte.vaporizer.jcs.util.ExcelGenerator;
import com.deloitte.vaporizer.siebel.bean.SeibelDataBO;
import com.deloitte.vaporizer.siebel.dao.AccountsDAO;

import com.deloitte.vaporizer.siebel.util.SiebelDBConnectionManager;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;
import com.deloitte.vaporizer.siebel.util.SiebelDBConnectionManager;
import com.deloitte.vaporizer.jcs.util.ExcelGenerator;

import java.sql.Connection;

public class TestServlet1 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>TestServlet1</title></head>");
        out.println("<body>");
        String path = getServletContext().getRealPath("Download");
        out.println("<p>path = "+path+"</p>");
        /*Connection con = SiebelDBConnectionManager.getSiebelConnection();
        if(con != null) {
            out.println("<p>connection with Siebel sucessful");
        }
        else
        {
            out.println("<p>connection with Siebel FAILED");
        }*/
        /*AccountsDAO accDao = new AccountsDAO();
        SeibelDataBO siebDataBo;
        try {
            siebDataBo = accDao.getSiebelAccounts();
            for(String s: siebDataBo.getObjSeibelData().keySet()) {
                out.println("String = "+s);
            }*/
        
        SeibelDataBO siebObj = ExcelGenerator.work();
        ExcelGenerator.writeXLSXFile(siebObj, path);
        
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
//        }
//        catch (SQLException e) {
//            e.printStackTrace();;
//        }
    }
}
