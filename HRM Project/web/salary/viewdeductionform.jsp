<%-- 
    Document   : viewdeduction
    Created on : Dec 11, 2014, 9:07:29 AM
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
              <h1 style="background-color: #343434;color: lightcoral">View Deduction Table</h1>
        <s:form action="viewdeductionjstl.jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
             
             
            <s:submit style="red" value="View"/>
        </s:form>
          <a href="payrollsetting.jsp" >Back</a>
    </div>
    </center>
    </body>
</html>
