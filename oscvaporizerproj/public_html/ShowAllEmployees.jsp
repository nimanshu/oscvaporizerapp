<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=windows-1252"
         import="com.deloitte.vaporizer.jcs.dao.EmployeeDAO,com.deloitte.vaporizer.jcs.bean.Employee,java.util.ArrayList"%>
<html>
    <%@ include file="/header.jsp" %>
    <title>Show All Employees</title>
    
    <% 
       EmployeeDAO dao = new EmployeeDAO();
       ArrayList<Employee> empList = dao.getAllEmployeeDetails();
       pageContext.setAttribute("empList", empList);
    %>
    <body>
        
        
        <table class="af_column_column-header-table" id="mainTable1" style="position: relative; table-layout: fixed; width: 922px;"
                                       cellspacing="0">
                                  <thead>
                          
                                    <tr>
                                      <th class="af_column_column-header-cell">
                                         SNO
                                      </th>
                                      <th class="af_column_column-header-cell">
                                        NAME
                                      </th>
                                      <th class="af_column_column-header-cell">
                                        AGE
                                      </th>
                                      <th class="af_column_column-header-cell">
                                        SALARY
                                      </th>
                                    </tr>
                                  </thead>
                                  <tbody>
                                    <c:forEach items="${empList}" var="row">
                                      <?audit suppress oracle.ide.xml.validation-error?>
                                      <tr _afrrk="0" class="af_table_data-row">
                                            <td style="width:50px;" align="center" nowrap=""
                                                class="af_column_data-cell">
                                              <c:out value="${row.sno}"/>
                                            </td>
                                          
                                            <td style="width: 156px;" nowrap="" class="af_column_data-cell truncate">
                                            <c:out value="${row.employeeName}"/>
                                            </td>
                                            <td style="width:250px;" nowrap="" class="af_column_data-cell">
                                            <c:out value="${row.age}"/>
                                            </td>
                                            <td style="width:120px;" align="left" nowrap="" class="af_column_data-cell truncate">
                                            <c:out value="${row.salary}"/>
                                            </td>
                                          </c:forEach>
                                      </tr>
                                    
                                  </tbody>
                                </table>
        
    </body>
    <%@ include file="/footer.jsp" %>
</html>