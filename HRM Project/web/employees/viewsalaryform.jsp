<%-- 
    Document   : updatenetsalaryform
    Created on : Dec 10, 2014, 11:09:17 PM
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
    <body>
         <center>
        <h1>View Salary</h1>
        <s:form action="viewsalaryjstl.jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
             
             
            <s:submit value="View"/>
        </s:form>
          <a href="../admin/admincontrolpage.jsp" >Back</a>
    </center>
    </body>
</html>
