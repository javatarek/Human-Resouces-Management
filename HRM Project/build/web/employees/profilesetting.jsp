<%@taglib uri="/struts-tags" prefix="s"%>
<html>
    <head></head>
    <body style="background-color: grey">
    <center>
<div style="background-color:  darkcyan;width: 400px;height: 550px">
        <s:form >
            <h1 style="background-color: #343434;color: lightcoral">Personal Information</h1>

            <table border="1">
                <tr>
                    <td>Employee Id:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="employeeId"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Manager Id:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="managerId"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Department Id:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="departmentId"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>First Name:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="firstName"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Last Name:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="lastName"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Email:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="email"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Phone Number:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="phoneNumber"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Hire Date:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="hireDate"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Job Id:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="jobId"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Salary:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="salary"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Commission Pct:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="commissionPct"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>Gender:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="gender"/></td>
                    </s:iterator>
                </tr>
                 <tr>
                    <td>City:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="city"/></td>
                    </s:iterator>
                </tr>
                
                <tr>
                    <td>Job Grade:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="jobGrade"/></td>
                    </s:iterator>
                </tr>
                
                <tr>
                    <td>Department Name:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="departmentName"/></td>
                    </s:iterator>
                </tr>
                
                <tr>
                    <td>Job Location:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="jobLocation"/></td>
                    </s:iterator>
                </tr>
                <tr>
                    <td>Primary Skill:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="primarySkill"/></td>
                    </s:iterator>
                </tr>
                
                <tr>
                    <td>Secondary Skill:</td> 
                    <s:iterator value="employeelist" var="employee">
                        <td><s:property value="secondarySkill"/></td>
                    </s:iterator>
                </tr>
                
            </table>
        </s:form>
</div>
     <br/><br/>
 <a href="employeespage.jsp" >Back</a>
    </center>
</body>
</html>