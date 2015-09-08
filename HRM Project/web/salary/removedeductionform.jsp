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
        <h2 style="background-color: #343434;color: lightcoral">Remove Data From Deduction Table</h2>
        <s:form action="removedeductionjstl.jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
             
             
            <s:submit value="Delete"/>
        </s:form>
          <a href="../admin/deductionsettingform.jsp" >Back</a>
              </div>
    </center>
    </body>
</html>
