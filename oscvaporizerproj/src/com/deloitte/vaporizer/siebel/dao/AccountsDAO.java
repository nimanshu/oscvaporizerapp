package com.deloitte.vaporizer.siebel.dao;

import com.deloitte.vaporizer.siebel.bean.SeibelDataBO;
import com.deloitte.vaporizer.siebel.bean.SiebelAccount;
import com.deloitte.vaporizer.siebel.bean.SiebelAccountDynamic;
import com.deloitte.vaporizer.siebel.util.SiebelDBConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.deloitte.vaporizer.jcs.util.ExcelGenerator;

import java.io.IOException;

public class AccountsDAO 
    {
        //public ArrayList<SiebelAccount> getSiebelAccounts() throws SQLException 
        public SeibelDataBO getSiebelAccounts() throws SQLException 
        {
            Connection con = SiebelDBConnectionManager.getSiebelConnection();
            ArrayList<SiebelAccount> accList = null;
              if (con != null)
              {
                    String query="SELECT\n" + 
                    " A.NAME, A.CUST_STAT_CD, A.ACCNT_TYPE_CD,B.ADDR, B.ADDR_LINE_2,B.ADDR_LINE_3, B.CITY, B.STATE, B.ZIPCODE\n" + 
                    "FROM\n" + 
                    "SIEBEL.S_ORG_EXT A,\n" + 
                    "SIEBEL.S_ADDR_PER B\n" + 
                    "WHERE\n" + 
                    "A.PR_ADDR_ID = B.ROW_ID AND\n" + 
                    "A.ROW_ID = '1-JPT4'";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(query);
                    accList = (ArrayList<SiebelAccount>)new ArrayList<SiebelAccount>();
                
              
              ResultSetMetaData rsmd = rs.getMetaData();
              int colCount = rsmd.getColumnCount();
              System.out.println("colCount = "+colCount);
              int curColCount = 1;
              
              
              //Map<Integer, List<String>> map1 = new HashMap<Integer, List<String>>();
              //Map<Integer, String> map2 = new HashMap<Integer, String>();
              HashMap<String, ArrayList<String>> map1 = new HashMap<String, ArrayList<String>>();
                
                for(curColCount = 1; curColCount<=colCount; curColCount++)
                {
                    System.out.println("rsmd.getColumnLabel(curColCount) = "+rsmd.getColumnLabel(curColCount));
                    ArrayList<String> arlst = new ArrayList<String>();
                    map1.put(rsmd.getColumnLabel(curColCount), arlst);
                    //map2.put(curColCount, rsmd.getColumnLabel(curColCount));
                }
                
                
                while(rs.next())
                {
                    for(curColCount = 1; curColCount<=colCount; curColCount++)
                    {
                        System.out.println("rownum = "+rs.getRow() + "col = "+curColCount+ " data = " +rs.getString(curColCount));
                        ArrayList<String> stringList = map1.get(rsmd.getColumnLabel(curColCount));
                        stringList.add(rs.getString(curColCount));
                    }   
                 
            SeibelDataBO siebBean = new SeibelDataBO();
            siebBean.setObjSeibelData(map1);
                
                
                SiebelDBConnectionManager.closeConnection(con);
                
              /*  ExcelGenerator exGen = new ExcelGenerator();

                try {
                    exGen.writeXLSXFile(siebBean,"");
                } 
                
                catch (IOException e) {
                    e.printStackTrace();
                }
                //return accList;*/
                return siebBean;
              }
              }
              else
              {
                     System.out.println("Failed to make connection!");
              }
              return null;
        }
        
        public static void main(String [] args) throws SQLException {
            AccountsDAO accDAO = new AccountsDAO();
            accDAO.getSiebelAccounts();
        }
    }
