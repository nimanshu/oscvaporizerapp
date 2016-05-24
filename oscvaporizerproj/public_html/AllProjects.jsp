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
    <header>
    <center>
        <img id="e" src="resources/images/AppHeader.png" alt="nothing" style="width:40%"/>
    </center>
    </header>
    <br><br>
        <div class="container">
        <div class="row">
        <div class="col-sm-12">
    
    
    <form action="projectservlet" method="POST" class="row col-sm-12">
        <input type="submit" name="newProj" value="Create New Project" class="btn btn-primary"/>
    </form>
        
     <br>
        <table class="table table-hover">
             <tr>
                <th>
                    PROJECT_ID
                </th>
                <th>
                    PROJECT_NAME
                </th>
                <th>
                    SIEBEL_USER_NAME
                </th>
                <th>
                    SIEBEL_PASSWORD
                </th>
                <th>
                    SIEBEL_TOKEN
                </th>
                <th>
                    SIEBEL_REPO_NAME
                </th>
             </tr>
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
</html>