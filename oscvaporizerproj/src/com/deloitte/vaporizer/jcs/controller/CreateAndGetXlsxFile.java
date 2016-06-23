package com.deloitte.vaporizer.jcs.controller;

import com.deloitte.vaporizer.jcs.util.ExcelGenerator;
import com.deloitte.vaporizer.siebel.bean.SeibelDataBO;

import com.deloitte.vaporizer.siebel.dao.AccountsDAO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndGetXlsxFile extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        
        
        String path = getServletContext().getRealPath("Download");
        //String path = "C:\\Users\\niparekh\\Desktop";
        //File file = new File(path);
        //String fullPathToYourWebappRoot = file.getCanonicalPath();
        
        System.out.println(path);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>CreateAndGetXlsxFile</title></head>");
        out.println("<body>");
        out.println("path = "+path);
        
        AccountsDAO accDao = new AccountsDAO();
        SeibelDataBO siebDataBo;
        try {
            siebDataBo = accDao.getSiebelAccounts();
            for(String s: siebDataBo.getObjSeibelData().keySet()) {
                out.println("String = "+s);
            }
            
            ExcelGenerator.writeXLSXFile(siebDataBo,path);
            out.println("ExcelGenerationComplete");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        
        
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
    
    public static void writeXLSXFile(SeibelDataBO objBo,String path) throws IOException {

            String excelFileName = path+"\\VaporizerTest.xlsx";//name of excel file
            System.out.println("excelFileName = "+excelFileName);

            String sheetName = "Sheet1";//name of sheet     

            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet = wb.createSheet(sheetName);

            //iterating the Seibel Data Object

            HashMap<String,ArrayList<String>> objDataMap = objBo.getObjSeibelData();
            Set<String> objColumnName = objDataMap.keySet();

            Object[] array = objColumnName.toArray();
            Arrays.sort(array);

            XSSFRow colRow = sheet.createRow(0);

            for(int i=0;i<array.length;i++)
            {
                    XSSFCell rowcell = colRow.createCell(i);
                    rowcell.setCellValue((String)array[i]);
            }

            // Fetching Data from the Object

            String[][] rowData = null;
            int k = 0, m =1;

            for(int i=0;i<array.length;i++)
            {

                    System.out.println("Column name : "+array[i]);
                    ArrayList datalist = objDataMap.get(array[i]);

                    for(int j=0;j<datalist.size();j++)
                    {
                            XSSFRow row = null;
                            if(sheet.getRow(m)==null)
                            {
                                    row = sheet.createRow(m);
                            }
                            else
                            {
                                    row = sheet.getRow(m);
                            }
                            XSSFCell cell = row.createCell(k);
                            cell.setCellValue((String)datalist.get(j));
                            m++;
                    }

                    k++;

                    if(m>datalist.size())
                    {
                            m=1;
                    }
            }       

            FileOutputStream fileOut = new FileOutputStream(excelFileName);

            //write this workbook to an Outputstream.
            wb.write(fileOut);
            //fileOut.flush();
            fileOut.close();
    }
}
