<%-- 
    Document   : admininsert
    Created on : Nov 16, 2014, 5:13:20 PM
    Author     : apcl
--%>

 <%@taglib  prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:  plum">
    <center>
        <h1>Add Admin Data</h1>
        <s:form action="insert" method="post">
        
        <s:textfield label="Admin ID" name="admin.userId"/>
        <s:password label="Admin PASSWORD" name="admin.password"/> 
         <s:textfield label="Employee Type" name="admin.employeeType"/>
         <s:textfield label="Department" name="admin.department"/>
         <s:textfield label="Unit" name="admin.unit"/>
           
    <s:combobox name="admin.lastLoginOn"  headerKey="-1" headerValue="--- Select One ---" list="{'Today','Yesterday'}" label="Last Login ON"  /> 
        
       
        
         <s:textfield label="First Name" name="admin.firstName"/>
         <s:textfield label="Last Name" name="admin.lastName"/>
         <s:textfield label="User Name" name="admin.userName"/>
         <s:textfield label="Email" name="admin.email"/>
        <s:submit value="Add Admin"/> 
        </s:form>
        Back To :<a href="adminloginform.jsp">Click Here</a>
    </center>
    </body>
</html>