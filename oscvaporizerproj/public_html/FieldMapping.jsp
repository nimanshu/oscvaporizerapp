<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=windows-1252" import="java.util.ArrayList" %>
<html>
   <%@ include file="/header.jsp" %>
    <title>Field Mappings</title>
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
        <input type="submit" name="newFieldMap" value="Create New Field Mapping"  class="btn btn-primary"/> 
        &nbsp; &nbsp;
        <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
    </form>
    <br> 
    
    <table class="table table-hover">
             <tr>
                <th>
                    ID
                </th>
                <th>
                    OBJ_MAPPING_ID
                </th>
                <th>
                    SIEBEL_BASE_TABLE_NAME
                </th>
                <th>
                    SIEBEL_BASE_TABLE_COLUMN_NAME
                </th>
                <th>
                    OSC_OBJECT_NAME
                </th>
                <th>
                    OSC_OBJECT_FIELD_NAME
                </th>
             </tr>
             <c:forEach items="${vFieldMapList}" var="row">
              <?audit suppress oracle.ide.xml.validation-error?>
              <tr>
                <td>
                    <c:out value="${row.id}"/>
                </td>
                <td>
                    <c:out value="${row.objMapId}"/>
                </td>
                <td>
                    <c:out value="${row.siebBaseTableName}"/>
                </td>
                <td>
                    <c:out value="${row.siebColumnName}"/>
                </td>
                <td>
                    <c:out value="${row.oscObjName}"/>
                </td>
                 <td>
                    <c:out value="${row.oscFieldName}"/>
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