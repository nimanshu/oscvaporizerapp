<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<%@ include file="/header.jsp" %>
    <title>Create New Project</title>
    <body>
        <div class="container">
        <div class="row">
        <div class="col-sm-12">
        
        <form action="projectservlet" method="POST" class="row col-sm-12">
            <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
        </form>
    <br><br>    <br><br>

    
        <form name="test" action="projectservlet" method="post">
            <div class="row">
                <div class="col-xs-12">
                    <div class="col-sm-4">
                            <Label>Project Name: </Label>
                    </div>
                    <div class="col-sm-6">
                            <input id="PROJECT_NAME" name="PROJECT_NAME" class="form-control" />
                    </div>
                    <div class="col-sm-4">
                        <Label>Siebel User Name: </label>
                   </div>
                   <div class="col-sm-6">
                        <input id="SIEBEL_USER_NAME" name="SIEBEL_USER_NAME" class="form-control"/>
                     </div>
                     <div class="col-sm-4">
                        <Label>Siebel Password: </label>
                    </div>
                    <div class="col-sm-6">
                        <input  id="SIEBEL_PASSWORD" name="SIEBEL_PASSWORD" class="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <Label>Siebel Token: </label>
                    </div>
                    <div class="col-sm-6">
                        <input  id="SIEBEL_TOKEN" name="SIEBEL_TOKEN" class="form-control"/>
                    </div>
                    
                    <div class="col-sm-4">
                        <Label>Siebel Repository Name: </label>
                    </div>
                    <div class="col-sm-6">
                        <input  id="SIEBEL_REPO_NAME" name="SIEBEL_REPO_NAME" class="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <Label>OSC User Name: </label>
                    </div>
                    <div class="col-sm-6">
                        <input  id="TG_SC_USERNAME" name="TG_SC_USERNAME" class="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <Label>OSC Password: </label>
                    </div>
                    <div class="col-sm-6">
                        <input  id="TG_SC_PWD" name="TG_SC_PWD" class="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <Label>OSC Host Name: </label>
                    </div>
                    <div class="col-sm-6">
                        <input  id="TG_SC_HOSTNAME" name="TG_SC_HOSTNAME" class="form-control"/>
                    </div>
                    <div class="col-sm-10 text-center"><br><br>
                         <button type="submit" value="Submit" class="btn btn-success ">Submit</button>
                    </div>
                    </div>
                </div>
            </form>
        </div>
        </div>
    </div>
    
    </body>
    <%@ include file="/footer.jsp" %>
</html>