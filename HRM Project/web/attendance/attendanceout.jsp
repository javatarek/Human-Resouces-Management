<%-- 
    Document   : attendanceout
    Created on : Nov 28, 2014, 2:20:54 AM
    Author     : Md.Tarikul Islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance Out Page</title>
    </head>
    <body style="background-color: steelblue">
    <center>
        <h1>Attendance Out Form</h1>
        <s:form action="attendanceupdate.jsp" method="POST">
             <s:textfield name="employeeId" label="Employee Id"/>
            <s:textfield name="officeOut" label="Office Out"/>
            <s:submit value="Save"/>
        </s:form>
          <a href="attendancesetting.jsp" >Back</a>
    </center>
    </body>
</html>
