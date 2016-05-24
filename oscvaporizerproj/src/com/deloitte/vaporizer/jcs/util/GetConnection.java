package com.deloitte.vaporizer.jcs.util;

//java:comp/env/jdbc/HRConnDS
//java:comp/env/jdbc/blah

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

final class GetConnection {

  /** Uses JNDI and Datasource (preferred style).   */
  public static Connection getJNDIConnection(){
    //String DATASOURCE_CONTEXT = "java:comp/env/jdbc/blah";
  
    //String DATASOURCE_CONTEXT = "javatrial1870db";
    String DATASOURCE_CONTEXT = "javadb";
    
    Connection result = null;
    try {
      Context initialContext = new InitialContext();
      if ( initialContext == null){
        log("JNDI problem. Cannot get InitialContext.");
      }
      DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
      if (datasource != null) {
        result = datasource.getConnection();
      }
      else {
        log("Failed to lookup datasource.");
      }
    }
    catch ( NamingException ex ) {
      log("Cannot get connection: " + ex);
    }
    catch(SQLException ex){
      log("Cannot get connection: " + ex);
    }
    return result;
  }

  /** Uses DriverManager.  */
  public static Connection getSimpleConnection() {
    //See your driver documentation for the proper format of this string :
    String DB_CONN_STRING = "jdbc:oracle:thin:@localhost:1521:XE";
    //Provided by your driver documentation. In this case, a MySql driver is used : 
    String DRIVER_CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
    String USER_NAME = "SYSTEM";
    String PASSWORD = "Nimanshu_1";
    
    Connection result = null;
    try {
      Class.forName(DRIVER_CLASS_NAME).newInstance();
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

  private static void log(Object aObject){
    System.out.println(aObject);
  }
}