<%-- 
    Document   : myprofile
    Created on : Nov 26, 2014, 1:47:36 PM
    Author     : Md.Tarikul Islam
--%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(b.jpg)">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 150px">
        <h3 style="background-color: #343434;color: lightcoral">If View your Personal Information Please get Employee Id</h3>
        <s:form action="pview" method="post">
        <s:textfield name="employee.employeeId" label="Enter Your Employee Id"/>
        <s:submit value="View"/>
        </s:form>
        </div>
          <a href="employeespage.jsp" >Back</a>
    </center>
    </body>
</html>
