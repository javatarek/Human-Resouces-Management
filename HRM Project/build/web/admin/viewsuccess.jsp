<%@taglib uri="/struts-tags" prefix="s"%>
  

<html>
<head></head>
<body><center>
<table border="2" height="100" width="500">
<tr>
<th>User Id</th>
<th>Password</th>
</tr>

<s:iterator value="admList" var="aa">
<tr>
<td><s:property value="userId"/></td>
<td><s:property value="password"/></td>
</tr>
</s:iterator>
</table>
<br/><br/>
<a href="adminloginform.jsp">Back To</a>
</center>
</body>
</html>