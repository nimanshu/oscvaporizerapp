<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
    <%@ include file="/header.jsp" %>
    <title>Create Field Mappings</title>
    <body>
    
        <br><br>
        <div class="container">
        <div class="row">
        <div class="col-sm-12">
    <form action="projectservlet" method="POST" class="row col-sm-12">
        <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
    </form>
    <br>
         <form name="test" action="projectservlet" method="post">
        <table class="table table-striped table-hover">
            <tr>
                <td>
                    <Label>SIEBEL_BASE_TABLE_NAME: </Label>
                </td>
                <td>
                    <output id="SIEBEL_BASE_TABLE_NAME" name="SIEBEL_BASE_TABLE_NAME"  >S_ORG_EXT</output>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>SIEBEL_BASE_TABLE_COLUMN_NAME: </Label>
                </td>
                <td>
                    <select id="SIEBEL_BASE_TABLE_COLUMN_NAME" name="SIEBEL_BASE_TABLE_COLUMN_NAME"  >
                        <option>NAME</option>
                        <option>SITE</option>
                        <option>ROW_ID</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>OSC_OBJECT_NAME: </Label>
                </td>
                <td>
                    <output id="OSC_OBJECT_NAME" name="OSC_OBJECT_NAME">SalesParty</output>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>OSC_OBJECT_FIELD_NAME: </Label>
                </td>
                <td>
                    <select id="OSC_OBJECT_FIELD_NAME" name="OSC_OBJECT_FIELD_NAME"  >
                        <option>SalesPartyName</option>
                        <option>Site</option>
                        <option>Party Id</option>
                    </select>
                </td>
            </tr>
            
            
            <tr>
                <td colspan="2" style="text-align:center">
                     <button type="submit" name="createFieldMapping" value="Submit" class="btn btn-primary">Submit</button>
                </td>
             </tr>   
                
         </table>       
        </form>
        </div>
        </div>
    </div>
</body>
<%@ include file="/footer.jsp" %>
</html>