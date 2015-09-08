 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
    <%@taglib  prefix="s" uri="/struts-tags" %>
    <%--
    <%
        response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store"); 
response.setHeader("Expires", "0");
response.setDateHeader("Expires", -1);

        %>
    --%>
    
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Admin Control Page</title>
		<!-- Start css3menu.com HEAD section -->
	<link rel="stylesheet" href="style_1.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu.com HEAD section -->

	
</head>
<body style=" background-color: buttonface">
    <div style="background-color: #36B6DB; padding: 10px;" >
        <h3 style="color: white; margin-top: -20px;float: right;padding: 5px">Welcome,<s:property value="admin.userId"/></h3>
                         
                         
        <div style=" float: right;margin-left: 300px">               
        <s:form action="logouta" method="POST"  >
                            <s:submit  value="Logout"/>
                        </s:form>
                        
        </div>
                            
                       
                        <!-- <img src="images/admin.jpg" /> -->
                        <h2 align="center" style="color:white;">Admin Control Page</h2>
                       
                       
                        
                    </div>
    <div style="margin-left:-5px;">
<!-- Start css3menu.com BODY section -->

<ul id="css3menu1" class="topmenu">
<input type="checkbox" id="css3menu-switcher" class="switchbox"><label onclick="" class="switch" for="css3menu-switcher"></label>	<li class="topfirst"><a  style="width:185px;">RESOURCES</a></li>
	<li class="topmenu"><a href="aprofilesetting.jsp" style="width:185px;">Profile</a></li>
        <%--<li class="topmenu"><a href="about.jsp" style="width:185px;">About</a></li>--%>
	<li class="topmenu"><a href="../salary/salaryform.jsp" style="width:185px;">Salary Setting</a></li>
        <li class="topmenu"><a href="deductionsettingform.jsp" style="width:185px;">Deduction Setting</a></li>
        <li class="topmenu"><a href="revokerole.jsp" style="width:272px;">Revoke a Role</a></li> 
        <li class="topmenu"><a href="updaterole.jsp" style="width:272px;">Update a Role</a></li> 
            <%--<li class="toplast"><a href="software.jsp" style="width:185px;">Software</a></li>--%>
</ul> 
<!-- End css3menu.com BODY section -->
    
    <div class="line"> .</div>
    
        <ul id="css3menu1" class="topmenu">
<input type="checkbox" id="css3menu-switcher" class="switchbox"/><label onclick="" class="switch" for="css3menu-switcher"></label>	<li class="topfirst">
   <a href="employeeview" style="width:272px;">Employee Details</a></li>
	<li class="topmenu"><a href="projectdetails.jsp" style="width:272px;">Project Details</a></li>
	<li class="topmenu"><a href="addEmployee.jsp" style="width:272px;">Add Employee</a></li>
	<li class="topmenu"><a href="updateemployeeinformation.jsp" style="width:272px;">Update Employee Information</a></li>
        <li class="topmenu"><a href="createrole.jsp" style="width:272px;">Create a Role</a></li> 
        
        <li class="topmenu"><a href="../leave/leavegenerate.jsp" style="width:272px;">Generate Leave</a></li> 
        
        
</ul>
    </div>
    
    <div style="margin-right: 50px;float:right">
        <img src="images/tree2.png" width="350px" height="250px"/>
    </div>
    
    
</body>
</html>
