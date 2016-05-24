package com.deloitte.vaporizer.siebel.dao;

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

public class AccountsDAO 
    {
        public ArrayList<SiebelAccount> getSiebelAccounts() throws SQLException 
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
              
              int curColCount = 1;
              
              
              Map<Integer, List<String>> map1 = new HashMap<Integer, List<String>>();
              Map<Integer, String> map2 = new HashMap<Integer, String>();
                
                for(curColCount = 1; curColCount<colCount; curColCount++)
                {
                    List<String> arlst = new ArrayList<String>();
                    map1.put(curColCount, arlst);
                    map2.put(curColCount, rsmd.getColumnLabel(curColCount));
                }
                
                
                while(rs.next())
                {
                    for(curColCount = 1; curColCount<colCount; curColCount++)
                    {
                        System.out.println("rownum = "+rs.getRow() + "col = "+curColCount+ " data = " +rs.getString(curColCount));
                        List<String> stringList = map1.get(curColCount);
                        stringList.add(rs.getString(curColCount));
                    }   
                    
//                    SiebelAccount acc = new SiebelAccount();
//                    String accountName = mySet.getString(1);
//                    String accountStatus = mySet.getString(2);
//                    String accountType = mySet.getString(3);
//                    String accountStreetAddress1 = mySet.getString(4);
//                    String accountStreetAddress2 = mySet.getString(5);
//                    String accountStreetAddress3 = mySet.getString(6);
//                    String city = mySet.getString(7);
//                    String state = mySet.getString(8);
//                    String zipCode = mySet.getString(9);
//                    
//                    acc.setAccountName(accountName);
//                    acc.setAccountStatus(accountStatus);
//                    acc.setAccountStreetAddress1(accountStreetAddress1);
//                    acc.setAccountStreetAddress2(accountStreetAddress2);
//                    acc.setAccountStreetAddress3(accountStreetAddress3);
//                    acc.setAccountType(accountType);
//                    acc.setCity(city);
//                    acc.setState(state);
//                    acc.setZipCode(zipCode);
//                    accList.add(acc);
                    
                }
                
            SiebelAccountDynamic siebBean = new SiebelAccountDynamic(map1,map2);
            
                
                
                SiebelDBConnectionManager.closeConnection(con);
                return accList;
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
