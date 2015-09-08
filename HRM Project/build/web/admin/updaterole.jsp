<%-- 
    Document   : updateemployeeinformation
    Created on : Nov 18, 2014, 2:15:55 PM
    Author     : apcl
--%>

   
 <%@taglib uri="/struts-tags" prefix="s"%>
 <body style="background-color: grey">
<s:actionerror/>
<center>
    <div style="background-color:  darkcyan;width: 400px;height: 200px">
    <h1 style="background-color: #343434;color: lightcoral">Update Role Information</h1>
    <s:form action="updaterole" method="POST">
<s:textfield name="role.employeeId" label="Employee Id"/>
<s:textfield name="role.roleName" label="Role Name"/>
<s:textfield name="role.departmentId" label="Department Id"/>
 
<s:submit value="Update Role "/>
</s:form>
    </div>
    Back To :<a href="admincontrolpage.jsp">Click Here</a>
</center>
</body>