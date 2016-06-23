<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=windows-1252"
         import="com.deloitte.vaporizer.jcs.dao.VapProjectDAO,java.util.ArrayList,com.deloitte.vaporizer.jcs.bean.VapProject" %>
<html>
    <%@ include file="/header.jsp" %>
    <title>All Projects</title>
    <% 
       VapProjectDAO dao = new VapProjectDAO();
       ArrayList<VapProject> projList = dao.getAllProjects();
       pageContext.setAttribute("projList", projList);
    %>    
    <body>
        <div class="container">
        <div class="row">
        <div class="col-sm-12">
    <form action="projectservlet" method="POST" class="row col-sm-12">
        <input type="submit" name="newProj" value="Create New Project" class="btn btn-primary"/>
    </form>
        
     <br>
        <table id="allProjectsTable" class="display" cellspacing="0" width="100%">
        <thead>
             <tr>
                <th>
                    Project ID
                </th>
                <th>
                    Project Name
                </th>
                <th>
                    Siebel User Name
                </th>
                <th>
                    Siebel Password
                </th>
                <th>
                    Siebel Token
                </th>
                <th>
                    Siebel Repository Name
                </th>
             </tr>
            </thead>
             <c:forEach items="${projList}" var="row">
              <?audit suppress oracle.ide.xml.validation-error?>
              <tr>
                <td>
                    <a href="projectservlet?id=<c:out value="${row.projectId}"/>"><c:out value="${row.projectId}"/></a>
                </td>
                <td>
                    <c:out value="${row.projectName}"/>
                </td>
                <td>
                    <c:out value="${row.siebelUserName}"/>
                </td>
                <td>
                    <c:out value="${row.siebelPassword}"/>
                </td>
                <td>
                    <c:out value="${row.siebelToken}"/>
                </td>
                <td>
                    <c:out value="${row.siebelRepositoryName}"/>
                </td>
              </tr>
              </c:forEach>
        </table>
        </div>
        </div>
    </div>
    </body>
    <%@ include file="/footer.jsp" %>
    <script type="text/javascript">
    $(document).ready(function(){
        $('#allProjectsTable').DataTable();
    });
    
    </script>
</html>