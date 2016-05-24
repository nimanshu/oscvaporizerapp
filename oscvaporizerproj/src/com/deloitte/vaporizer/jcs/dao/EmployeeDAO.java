package com.deloitte.vaporizer.jcs.dao;

import com.deloitte.vaporizer.jcs.bean.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import com.deloitte.vaporizer.jcs.util.GetJNDIConnectionUtil;

public class EmployeeDAO 
{
    private String getEmployeeSql;
    private Connection con;
    private Statement stmt;
    private ArrayList<Employee> employeeArray;
    
    public EmployeeDAO()
    {
        getEmployeeSql = "SELECT SNO,NAME,AGE,SALARY FROM EMPLOYEE";
        con = GetJNDIConnectionUtil.getConnection();
        try 
        {
            stmt = con.createStatement();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        employeeArray = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getAllEmployeeDetails()
    {
        if(con != null)
        {
            try 
            {
                ResultSet rs = stmt.executeQuery(getEmployeeSql);
                while(rs.next())
                {
                    Employee emp = new Employee();
                    emp.setSno(Integer.valueOf(rs.getString("SNO")));
                    emp.setEmployeeName(rs.getString("NAME"));
                    emp.setAge(Integer.valueOf(rs.getString("AGE")));
                    emp.setSalary(Integer.valueOf(rs.getString("SALARY")));
                    employeeArray.add(emp);
                    System.out.println(employeeArray);
                }
                stmt.close();
                return employeeArray;
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    public static void main(String [] args)
    {
        EmployeeDAO dao = new EmployeeDAO();
        dao.getAllEmployeeDetails();
    }
    
    
}
