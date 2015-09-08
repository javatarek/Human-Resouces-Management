  <%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body>
<center>
    
    <s:form action="view" >
    <h1 style="background-color: #343434;color: lightcoral">View Attendance</h1>
        <table border="2" height="100px" width="100%" style="background-image: url(tableimage.jpg)">
<tr>
<th>Employee Id</th>
<th>Date From</th>
<th>Office In</th>
<th>Office Out</th>
<th>Status</th>
<th>Remarks</th>
 
</tr>

<s:iterator value="attendancelist" var="attendance">
<tr>
<td><s:property value="employeeId"/></td>
<td><s:property value="dateFrom"/></td>
<td><s:property value="officeIn"/></td>
<td><s:property value="officeOut"/></td>
<td><s:property value="status"/></td>
<td><s:property value="remarks"/></td>
 
</tr>
</s:iterator>
</table>
    </s:form>
<br/><br/>
 
</center>
</body>
</html>