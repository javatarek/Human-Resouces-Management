<%-- 
    Document   : updateemployeeinformation
    Created on : Nov 18, 2014, 2:15:55 PM
    Author     : apcl
--%>

   
 <%@taglib uri="/struts-tags" prefix="s"%>
 <body style="background-color: burlywood">
<s:actionerror/>
<center>
    <div style="background-color:  darkcyan;width: 400px;height: 250px">
    <h2 style="background-color: #343434;color: lightcoral">Update Employee Information</h2>
<s:form action="updateemployee">
<s:textfield name="employee.employeeId" label="Employee Id"/>
<s:textfield name="employee.managerId" label="Manager Id"/>
<s:textfield name="employee.departmentId" label="Department Id"/>
<s:textfield name="employee.jobId" label="Job Id"/>
<s:textfield name="employee.salary" label="Salary"/>
<s:textfield name="employee.commissionPct" label="Commission Pct"/>
<s:submit value="Update Employee "/>
</s:form>
    </div>
    Back To :<a href="admincontrolpage.jsp">Click Here</a>
</center>
</body>