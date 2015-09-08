 <%-- 
    Document   : managerloginform
    Created on : Nov 14, 2014, 9:35:41 PM
    Author     : Tarikul
--%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employees Login Page</title>
    </head>
    <body style="background-image: url(../images/d.jpg)">
    <center>
         <div style="background-color: #36B6DB;width: 350px;height: 300px">
        <h1 style="color: #FF0DDB; font-family: viner Hand ITC;background-color:black; ">Employees Login Form</h1>
        <p style="font-family:Viner Hand ITC;color: #F8F8F8;font-size: 20px">Please enter your Id And Password below:</p>
        <s:actionerror/>
        <s:form action="logine">
            <s:textfield label="Enter User ID" style="color:blue" name="role.employeeId"/>
            <s:password label="Password" style="color:blue"  name="role.password"/>
            <s:submit value="Login" style="color:blue" />
        </s:form>
         </div>
    </center>
    </body>
</html>
