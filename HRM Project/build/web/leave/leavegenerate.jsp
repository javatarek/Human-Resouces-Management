<%-- 
    Document   : leavegenerate
    Created on : Dec 4, 2014, 10:55:06 PM
    Author     : Md.Tarikul Islam
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
        <div style="background-color:  darkcyan;width: 400px;height: 280px">
        <h1 style="background-color: #343434;color: lightcoral">Generate Leave Form</h1>
        <s:form action="ins" method="POST">
            <s:textfield name="leave.employeeId" label="Employee Id"/>
            <s:textfield name="leave.casualLeave" label="Casual Leave"/>
            <s:textfield name="leave.medicalLeave" label="Medical Leave"/>
            <s:textfield name="leave.specialLeave" label="Special Leave"/>
            <s:textfield name="leave.officeLeave" label="Office Leave"/>
            <s:textfield name="leave.leaveWithoutPay" label=" Leave Without Pay"/>
            <s:textfield name="leave.leaveWithPay" label=" Leave With Pay"/>
            <s:submit value="Generate"/>
        </s:form>
        </div>
        
        <a href="../admin/admincontrolpage.jsp">Back</a>
    </center>
    </body>
</html>
