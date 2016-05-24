<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<%@ include file="/header.jsp" %>
    <title>Create New Project</title>
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
        <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
    </form>
    <br>
    
    <form name="test" action="projectservlet" method="post">
        <table class="table table-striped table-hover">
            <tr>
                <td>
                    <Label>PROJECT NAME: </Label>
                </td>
                <td>
                    <input id="PROJECT_NAME" name="PROJECT_NAME"  />
                </td>
            </tr>
            <tr>
                <td>
                    <Label>SIEBEL USER NAME: </label>
                </td>
                <td>
                    <input id="SIEBEL_USER_NAME" name="SIEBEL_USER_NAME"/>
                 </td>   
            </tr>
            <tr>
                <td>
                    <Label>SIEBEL PASSWORD: </label>
                </td>
                <td>
                    <input  id="SIEBEL_PASSWORD" name="SIEBEL_PASSWORD"/>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>SIEBEL TOKEN: </label>
                </td>
                <td>
                    <input  id="SIEBEL_TOKEN" name="SIEBEL_TOKEN"/>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>SIEBEL REPOSITORY NAME: </label>
                </td>
                <td>
                    <input  id="SIEBEL_REPO_NAME" name="SIEBEL_REPO_NAME"/>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>OSC USER NAME: </label>
                </td>
                <td>
                    <input  id="TG_SC_USERNAME" name="TG_SC_USERNAME"/>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>OSC PASSWORD: </label>
                </td>
                <td>
                    <input  id="TG_SC_PWD" name="TG_SC_PWD"/>
                </td>
            </tr>
            <tr>
                <td>
                    <Label>OSC HOST NAME: </label>
                </td>
                <td>
                    <input  id="TG_SC_HOSTNAME" name="TG_SC_HOSTNAME"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center">
                     <button type="submit" value="Submit" class="btn btn-primary">Submit</button>
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