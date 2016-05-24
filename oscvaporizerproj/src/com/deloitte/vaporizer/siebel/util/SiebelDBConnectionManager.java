package com.deloitte.vaporizer.siebel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SiebelDBConnectionManager 
{
    public static Connection getSiebelConnection() {
      //See your driver documentation for the proper format of this string :
        String DB_CONN_STRING = "jdbc:oracle:thin:@167.219.18.231:443/SBLDB";
        //String DB_CONN_STRING = "jdbc:oracle:thin:@167.219.18.231:443/SIEBEL";
      //Provided by your driver documentation. In this case, a MySql driver is used : 
      String DRIVER_CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
      String USER_NAME = "snetuser1";
      String PASSWORD = "snetuser1";
      
      
      Connection result = null;
      try {
        Class.forName(DRIVER_CLASS_NAME);
      }
      catch (Exception ex){
        log("Check classpath. Cannot load db driver: " + DRIVER_CLASS_NAME);
      }

      try {
        result = DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
      }
      catch (SQLException e){
        log( "Driver loaded, but cannot connect to db: " + DB_CONN_STRING);
      }
      return result;
    }
    
    public static void closeConnection(Connection con) throws SQLException {
        con.close();
        System.out.println("connection closed");
    }

    private static void log(Object aObject){
      System.out.println(aObject);
    }
    
        public static void main(String [] args) throws SQLException {
            System.out.println("hello");
            String schema = "SIEBEL";
            Connection con = SiebelDBConnectionManager.getSiebelConnection();
              if (con != null)
              {
                     String query="SELECT BUSCOMP.NAME, " +
                                " CASE  WHEN BASETABLE.NAME = 'S_PARTY' AND BUSCOMP.NAME = 'Account' THEN 'S_ORG_EXT'" +
                                " WHEN BASETABLE.NAME = 'S_PARTY' AND BUSCOMP.NAME = 'Contact' THEN 'S_CONTACT' WHEN BASETABLE.NAME = 'S_PARTY'" +
                                " AND BUSCOMP.NAME = 'User' THEN 'S_USER'" +
                                " WHEN BASETABLE.NAME = 'S_PARTY' AND BUSCOMP.NAME = 'Employee' THEN 'S_CONTACT'" +
                                " WHEN BASETABLE.NAME = 'S_PARTY' AND BUSCOMP.NAME = 'Position' THEN 'S_POSTN' ELSE BASETABLE.NAME END" +
                                " FROM SIEBEL.S_BUSCOMP BUSCOMP INNER JOIN SIEBEL.S_REPOSITORY REP " +
                                " ON REP.ROW_ID = BUSCOMP.REPOSITORY_ID AND REP.NAME = 'Siebel Repository' " +
                                " INNER JOIN SIEBEL.S_TABLE BASETABLE ON BASETABLE.NAME = BUSCOMP.TABLE_NAME AND " +
                                " BASETABLE.REPOSITORY_ID = REP.ROW_ID " +
                                " WHERE BUSCOMP.NAME = 'Contact'";
                    
                  
                    Statement st=con.createStatement();
                    //st.execute("set search_path to '" + schema + "'");
                    ResultSet mySet=st.executeQuery(query);
                     
                while(mySet.next())
                {
                    System.out.println("myset is"+mySet.getString(1));
                    System.out.println("myset second is"+mySet.getString(2));
                }
                SiebelDBConnectionManager.closeConnection(con);
              }
              else
              {
                     System.out.println("Failed to make connection!");
              }
        }
}
