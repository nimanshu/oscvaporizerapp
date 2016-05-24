<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=windows-1252"
         import="com.deloitte.vaporizer.jcs.dao.VapObjMappingDAO,java.util.ArrayList,com.deloitte.vaporizer.jcs.bean.VapObjMapping" %>
<html>
    <%@ include file="/header.jsp" %>
    <title>Object Mappings</title>
    <!--%
       VapObjMappingDAO dao = new VapObjMappingDAO();
       ArrayList<VapObjMapping> vObjMapList = dao.getProjRelatedObjectMappings(Integer.valueOf(request.getParameter("id")));
       //ArrayList<VapObjMapping> vObjMapList = dao.getAllObjectMappings();
       pageContext.setAttribute("vObjMapList", vObjMapList);
    %-->    
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
    <form action="projectservlet" method="POST" class="row col-sm-12 ">
        <input type="submit" name="newObjMap" value="Create New Object Mapping"  class="btn btn-primary"/>
        &nbsp; &nbsp;
        <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
    </form>
    <br>    
    
        <table class="table table-hover">
             <tr>
                <th>
                    SEQUENCE
                </th>
                <th>
                    SIEBEL_OBJECT
                </th>
                <th>
                    SIEBEL_PRIM_BASE_TABLE
                </th>
                <th>
                    OSC_OBJECT
                </th>
                <th>
                    EXTRACTION_QUERY
                </th>
             </tr>
             <c:forEach items="${vObjMapList}" var="row">
              <?audit suppress oracle.ide.xml.validation-error?>
              <tr>
                <td>
                    <a href="projectservlet?objMapId=<c:out value="${row.id}"/>"><c:out value="${row.sequence}"/></a>
                </td>
                <td>
                    <c:out value="${row.siebelObject}"/>
                </td>
                <td>
                    <c:out value="${row.siebelPrimBaseTable}"/>
                </td>
                <td>
                    <c:out value="${row.oscObject}"/>
                </td>
                <td>
                    <c:out value="${row.extractionQuery}"/>
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