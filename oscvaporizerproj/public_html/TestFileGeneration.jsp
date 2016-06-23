<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=windows-1252"
         import="com.deloitte.vaporizer.siebel.dao.AccountsDAO" %>
<html>
    <%@ include file="/header.jsp" %>
    <title>All Projects</title>
    <% 
       AccountsDAO dao = new AccountsDAO();
       dao.getSiebelAccounts();
    %>    
    <body>
        <div class="container">
        TEST
        </div>
    </body>
    <%@ include file="/footer.jsp" %>
</html>