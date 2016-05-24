package com.deloitte.vaporizer.jcs.util;


import java.io.IOException;

import java.sql.Connection;
import java.sql.SQLException;


public class TestJNDIName 
{
    public static void main(String [] args)
    {
        Connection con = null;
       
    /*        con = GetConnection.getSimpleConnection();
            if (con == null) 
            {
                System.out.println("test jndi failed");   
            }
            else 
            {
                System.out.println("test jndi pass");
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }*/
        
        con = GetConnection.getJNDIConnection();
        if (con == null) 
        {
            System.out.println("test jndi failed");   
        }
        else 
        {
            System.out.println("test jndi pass");
                try 
                {
                    con.close();
                } 
                catch (SQLException e) 
                {
                
                }
        }
       
       
    }
    
    public static String testConnection()
    {
        Connection con = null;
        con = GetConnection.getJNDIConnection();
        if (con == null) 
        {
            System.out.println("test jndi failed");   
            return "Failed";
        }
        
        else 
        {
            System.out.println("test jndi pass");
                try 
                {
                    con.close();
                    return "Hello";
                } 
                catch (SQLException e) 
                {
                
                }
        }
        
        return null;
    }
}
