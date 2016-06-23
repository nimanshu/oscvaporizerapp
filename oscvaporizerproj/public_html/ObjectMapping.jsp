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
        <div class="container">
            <div class="row">
            <div class="col-sm-12">
            <form action="projectservlet" method="POST" class="row col-sm-12 ">
                <input type="submit" name="newObjMap" value="Create New Object Mapping"  class="btn btn-primary"/>
                &nbsp; &nbsp;
                <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
            </form>
    <br>    
    
        <table id="allObjMappingsTable" class="display" cellspacing="0" width="100%">
            <thead>
                 <tr>
                    <th>
                        Sequence
                    </th>
                    <th>
                        Siebel Object
                    </th>
                    <th>
                        Siebel Primary Base Table
                    </th>
                    <th>
                        OSC Object
                    </th>
                    <th>
                        Extraction Query
                    </th>
                 </tr>
            </thead>
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
    <script type="text/javascript">
    $(document).ready(function(){
        $('#allObjMappingsTable').DataTable();
    });
    </script>
</html>