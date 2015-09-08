<%-- 
    Document   : myprofile
    Created on : Dec 5, 2014, 12:28:03 PM
    Author     : Md.Tarikul Islam
--%>
   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Profile</title>
    </head>
    <body style="background-color: grey">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 210px">
        <h1 style="background-color: #343434;color: lightcoral">My Information</h1>
          <s:form action="aview" >
          <table>
                <tr>
                    <td>First Name:</td> 
                    <s:iterator value="admList" var="admin">
                        <td><s:property value="firstName"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Last Name:</td> 
                    <s:iterator value="admList" var="admin">
                        <td><s:property value="lastName"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Employee Type:</td> 
                    <s:iterator value="admList" var="admin">
                        <td><s:property value="employeeType"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Department:</td> 
                    <s:iterator value="admList" var="admin">
                        <td><s:property value="department"/></td>
                    </s:iterator>
                </tr>
                
                 <tr>
                    <td>Unit:</td> 
                    <s:iterator value="admList" var="admin">
                        <td><s:property value="unit"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Last Login On:</td> 
                    <s:iterator value="admList" var="admin">
                        <td><s:property value="lastLoginOn"/></td>
                    </s:iterator>
                </tr>
               
                 
                
          </table>
        </s:form>
        </div>
         <a href="admincontrolpage.jsp" >Back</a>
    </center>
    </body>
</html>
