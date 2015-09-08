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
        <title>Deduction Page</title>
        <sx:head/>
    </head>
    <body style="background-color:grey">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 200px">
        <h1 style="background-color: #343434;color: lightcoral">Deduction Form</h1>
        <s:form action="deductionsetting.jsp" method="POST">
            
            <s:textfield name="providentFund" label="Provident Fund"/>
              
            <s:textfield name="advance" label="Advance"/>
            <s:textfield name="tax" label="Tax"/>
            
            <s:textfield name="employeeId" label="Employee Id"/>
             
             
            <s:submit value="Save"/>
        </s:form>
        </div>
           <a href="../admin/deductionsettingform.jsp" >Back</a>
    </center>
  
    
    
    
    
    </body>
</html>
