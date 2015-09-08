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
	<title>Manager Control Page</title>
		<!-- Start css3menu.com HEAD section -->
	<link rel="stylesheet" href="style_1.css" type="text/css" /><style type="text/css">._css3m{display:none}</style>
	<!-- End css3menu.com HEAD section -->

	
</head>
<body style="background-color: skyblue">
    <div style="background-color: #444444;margin-top: -30px" >
        <div style="float:right">
                         
            <h3 style="color: lawngreen">Welcome,</h3>
                                
                                <h3 style="color: lawngreen"><s:property value="role.departmentId"/></h3>
                                 <s:form action="logoutm" method="POST">
                             <h2 ><s:submit value="Logout" style="color:red"/></h2>
                        </s:form>
        </div>
                        <h2 style="width: 50px;height: 100px;color:lawngreen">HUMAN RESOURCES MANAGEMENT</h2>
                        <h2 style="color: lawngreen; text-align:center">Manager Control Page</h2>
                        
                    </div>
    <div style="margin-left:-5px;">
 <ul id="css3menu1" class="topmenu">
<input type="checkbox" id="css3menu-switcher" class="switchbox"><label onclick="" class="switch" for="css3menu-switcher"></label>	<li class="toplast"><a href="#" style="height:28px;line-height:28px;"><span>Resources</span></a>
	<ul>
		<li><a href="myprofile.jsp">My Profile</a></li>
		<li><a href="projectdetails.jsp">Project Information</a></li>
		<li><a href="viewsalaryform.jsp">View Salary</a></li>
                <li><a href="viewdeductionform.jsp">View Deduction</a></li>
		<li><a href="mangetemployee.jsp">Employee Details</a></li>
		<li><a href="manageleave.jsp">Manage Employees Leave</a></li>
		<li><a href="atview">Verify Attendance</a></li>
		<li><a href="manipulation.jsp">Manipulation</a></li>
		<li><a href="manager/approvetimesheet.jsp">Approve/Reject Timesheet</a></li>
		 
	</ul></li>
</ul>
    </div>
    
    <div style="margin-right: 150px;float:right">
        <img src="tree.png" width="350px" height="250px"/>
    </div>
</body>
</html>
