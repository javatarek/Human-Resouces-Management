 <%@taglib uri="/struts-tags" prefix="s"%>
    
<html>
<head></head>
<body>
<center>
    
    <s:form>
    <h1 style="background-color: #C5EAA1;color: lightcoral">Employee Details</h1>
        <table border="2" height="100px" width="100%" style="background-image: url(images/tableimage.jpg)">
<tr>
<th>Employee Id</th>
<th>Manager Id</th>
<th>Department Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Phone Number</th>
<th>Hire Date</th>
<th>Job Id</th>
<th>Salary</th>
<th>Commission Pct</th>
<th>Gender</th>
<th>City</th>
<th>Job Grade</th>
<th>Department Name</th>
<th>Job Location</th>
<th>Primary Skill</th>
<th>Secondary Skill</th>
</tr>

<s:iterator value="employeelist" var="employee">
<tr>
<td><s:property value="employeeId"/></td>
<td><s:property value="managerId"/></td>
<td><s:property value="departmentId"/></td>
<td><s:property value="firstName"/></td>
<td><s:property value="lastName"/></td>
<td><s:property value="email"/></td>
<td><s:property value="phoneNumber"/></td>
<td><s:property value="hireDate"/></td>
<td><s:property value="jobId"/></td>
<td><s:property value="salary"/></td>
<td><s:property value="commissionPct"/></td>
<td><s:property value="gender"/></td>
<td><s:property value="city"/></td>
<td><s:property value="jobGrade"/></td>
<td><s:property value="departmentName"/></td>
<td><s:property value="jobLocation"/></td>
<td><s:property value="primarySkill"/></td>
<td><s:property value="secondarySkill"/></td>

</tr>
</s:iterator>
</table>
    </s:form>
<br/><br/>

 
<a href="admincontrolpage.jsp">Back</a>
</center>
</body>
</html>