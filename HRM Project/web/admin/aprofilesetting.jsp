 <%-- 
    Document   : myprofile
    Created on : Nov 26, 2014, 1:47:36 PM
    Author     : Md.Tarikul Islam
--%>
  

<%@taglib  prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: grey">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 150px">
        <p style="background-color: #343434;color: lightcoral">If View your Personal Information Please get User Id</p>
        <s:form action="aview" method="post">
        <s:textfield name="admin.userId" label="Enter Your User Id"/>
        <s:submit value="Admin View"/>
        </s:form>
          <a href="admincontrolpage.jsp" >Back</a>
        </div>
    </center>
    </body>
</html>
