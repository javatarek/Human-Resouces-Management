<%-- 
    Document   : viewleave
    Created on : Dec 13, 2014, 12:44:32 PM
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
        <h1 style="background-color: #343434;color: lightcoral" >View Total Leave</h1>
        <s:form action="leaveviewsuccess.jsp" method="POST">
            <s:textfield name="employeeId" label="Employee Id"/>
            <s:submit value="View Leave"/>
        </s:form>
        </div>
    </center>
    </body>
</html>
