<%-- 
    Document   : revokerole
    Created on : Dec 14, 2014, 11:11:20 AM
    Author     : ittarikul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: grey">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 150px">
        <h1  style="background-color: #343434;color: lightcoral">Revoke A Role</h1>
        <s:form  action="revoke" method="Post">
            <s:textfield name="role.employeeId"  label="Employee Id"/>
            <s:submit value="Delete Role"/>
            
        </s:form>
        </div>
    </center>
    </body>
</html>
