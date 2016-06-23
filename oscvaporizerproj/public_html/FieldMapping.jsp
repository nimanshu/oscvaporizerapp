<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=windows-1252" import="java.util.ArrayList" %>
<html>
   <%@ include file="/header.jsp" %>
    <title>Field Mappings</title>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <form action="projectservlet" method="POST" class="row col-sm-12">
                        <input type="submit" name="newFieldMap" value="Create New Field Mapping"  class="btn btn-primary"/> 
                        &nbsp; &nbsp;
                        <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
                    </form>
                    <br> 
            
                    <table id="objRelatedFieldMappingsTable" class="display" cellspacing="0" width="100%">
                         <thead>
                             <tr>
                                <th>
                                    ID
                                </th>
                                <th>
                                    Object Mapping ID
                                </th>
                                <th>
                                    Siebel Base Table Name
                                </th>
                                <th>
                                    Siebel Base Table Column Name
                                </th>
                                <th>
                                    OSC Object Name
                                </th>
                                <th>
                                    OSC Object Field Name
                                </th>
                             </tr>
                         </thead>
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
    <script type="text/javascript">
    $(document).ready(function(){
        $('#objRelatedFieldMappingsTable').DataTable();
    });
    </script>
</html>