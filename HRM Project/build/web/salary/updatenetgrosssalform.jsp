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
    <body style="background-color: grey">
         <center>
             <div style="background-color:  darkcyan;width: 400px;height: 150px">
              
         <h1 style="background-color: #343434;color: lightcoral">Set Gross Salary</h1>
        
         <s:form action="updategrosssalary .jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
             
             
            <s:submit value="Update"/>
        </s:form>
             </div>
             <b style="color: red">Note:</b>Just Input Employee Id
             <div  style="background-color: #61a700;width: 400px;height: 150px">
        <h1 style="background-color: #343434;color: lightcoral">Set Net Salary</h1>
        
        <s:form action="updatenetsalary.jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
             
             
            <s:submit value="Update"/>
        </s:form>
       
          <a href="../admin/deductionsettingform.jsp" >Back</a>
             </div>
    </center>
    </body>
</html>
