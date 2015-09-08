  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body   style="background-color: grey">
     <center>
         <div style="background-color:  darkcyan;width: 400px;height: 150px">
        <h1 style="background-color: #343434;color: lightcoral">Insert Total Deduction</h1>
        <s:form action="inserttotaldeduct.jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
            <s:hidden name="totalDeduct" label="Total Deduct"/>
              <s:hidden name="netSalary" label="Net Salary"/>
            <s:submit value="Add"/>
        </s:form>
          
         </div>
    
        
         <h3><p style="color: red">Note:</p>First insert Employee Id Then Set Total Deduction</h3>
         <div style="background-color: #009000;width: 400px;height: 150px">
        <h1 style="background-color: #343434;color: lightcoral" >Set Total Deduction</h1>
        <s:form action="updatetotaldeduct.jsp" method="POST">
            
            
            <s:textfield name="employeeId" label="Employee Id"/>
            
            <s:submit value="Set"/>
        </s:form>
          <a href="../admin/deductionsettingform.jsp" >Back</a>
         </div>
     </center>
    
    
</body>
  </html>