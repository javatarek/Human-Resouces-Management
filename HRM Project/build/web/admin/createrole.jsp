<%-- 
    Document   : createrole
    Created on : Nov 18, 2014, 3:17:35 PM
    Author     : apcl
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: grey">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 200px">
        <h1 style="background-color: #343434;color: lightcoral">Create Role </h1>
        <s:form action="createrole" method="POST">
            <s:textfield name="role.roleName" label="Role Name"/>
            <s:textfield name="role.departmentId" label="Department Id"/>
            <s:textfield name="role.employeeId" label="Employee Id"/>
            <s:textfield name="role.password" label="Password"/>
            <s:submit value="Create Role"/>
        </s:form>
        </div>
         Back To :<a href="admincontrolpage.jsp">Click Here</a>
    </center>
    </body>
</html>
