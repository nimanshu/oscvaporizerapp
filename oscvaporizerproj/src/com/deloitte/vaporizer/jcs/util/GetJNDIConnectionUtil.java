package com.deloitte.vaporizer.jcs.util;


import java.sql.Connection;

public class GetJNDIConnectionUtil 
{
    static Connection con = null;
    
    static
    {
        System.out.println("static block con = "+ con);
        con = GetConnection.getJNDIConnection();     
    }
    
    public GetJNDIConnectionUtil()
    {
           
    }
    public static Connection getConnection()
    {
        System.out.println("getConnection method con = "+ con);
        return con;
    }
}
