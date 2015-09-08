 <%-- 
    Document   : index
    Created on : Nov 5, 2014, 12:33:46 AM
    Author     : Md. Tarikul Islam
--%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
    </head>
    <body  style="background-image:url(images/waterlemon.jpg)">
    <center>
        
        <div style="background-color:  #5f5f5f;width: 350px;height: 420px">
        <h1 style="color: #FF0DDB; font-family: viner Hand ITC;background-color: #343434;color: lightcoral">Admin Login Form</h1>
       
        <p style="font-family:Viner Hand ITC;color: #F8F8F8;font-size: 20px">Please enter your Id And Password below:</p>
        <s:actionerror/>
        <s:form action="logina" method="post">
           <s:textfield label="Enter User Id" name="admin.userId" style="color:red" size="30px"/> 
            <s:password label="Password" style="color:red"  name="admin.password" size="30px"/>
            <s:submit value="Login" style="color:red" />
        </s:form>
         
        <p style="font-family:Viner Hand ITC;color: #36B6DB;font-size: 20px">If you do not have a Id then please <br/> enroll for the self-serve: <a href="admininsert.jsp" style="color: lime">Click here</a></p>
                        <p style="font-family:Viner Hand ITC;color: #00aaff;font-size: 20px">Forgot your password ?<%-- <a href="view" style="color: window">Click here</a>--%></p>
             </div>           
    </center>
    </body>
</html>
