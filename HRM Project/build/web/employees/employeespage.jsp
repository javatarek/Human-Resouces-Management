  <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
    <%--
    <%
        response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store"); 
response.setHeader("Expires", "0");
response.setDateHeader("Expires", -1);

        %>
    --%>
    
    
    
    <%@taglib  prefix="s" uri="/struts-tags" %>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Employees  Page</title>
		<!-- Start css3menu.com HEAD section -->
	<link rel="stylesheet" href="style_1.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu.com HEAD section -->

	
</head>
<body style="background-color: skyblue">
    <div style="background-color: activeborder;height:110px;margin-top: -20px" >
                         <div style=" float: right">
                           
                             <h3 style=" color: red">Welcome,</h3> 
                             <h3> <s:property value="role.employeeId"/></h3>
                             <s:form action="logoute" method="POST">
                             <h2 ><s:submit value="Logout"/></h2>
                        </s:form>
                         </div>
                        <h2 style="width: 50px;height: 40px;color: blue">HUMAN RESOURCES MANAGEMENT</h2>
                        <blink><h2 align="center" style=" color:  #009000">Employees Page</h2></blink>
                        
                    </div>
    <div style="margin-left:-5px;">
 <ul id="css3menu1" class="topmenu">
<input type="checkbox" id="css3menu-switcher" class="switchbox"><label onclick="" class="switch" for="css3menu-switcher"></label>	<li class="toplast"><a href="#" style="height:28px;line-height:28px;"><span>Resources</span></a>
	<ul>
		<li><a href="../employees/addEmployee.jsp">Enter Personal Details</a></li>
		<li><a href="loginlogoff.jsp">Login/Logoff to Mark Attendance</a></li>
		<li><a href="applyleave.jsp">Apply Leave</a></li>
		<li><a href="myprofile.jsp">View Profile</a></li>
                <li><a href="viewsalaryform.jsp">View Salary</a></li>
                <li><a href="viewdeductionform.jsp">View Deduction</a></li>
                <li><a href="../leave/viewleave.jsp">View Total Leave</a></li>
		<li><a href="entertimesheet.jsp">Enter Timesheet</a></li>
		 
	</ul> 
</ul>
    </div>
    
    <div style="margin-right: 150px;float:right">
        <img src="employee.jpg" width="350px" height="250px"/>
    </div>
</body>
</html>
