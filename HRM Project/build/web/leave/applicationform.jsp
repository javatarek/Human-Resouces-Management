<%-- 
    Document   : addEmployee
    Created on : Nov 16, 2014, 6:30:22 PM
    Author     : apcl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Application Form</title>
        <sx:head />
    </head>
    <body  style="background-color:grey">
    <center>
        <div style="background-color:  darkcyan;width: 400px;height: 150px>
        <s:form action="employeeinsert" method="POST">
            <h1 style="background-color: #343434;color: lightcoral">Application Form</h1>
        <table >
            <tr><td>
                    <s:textfield name="employeeId" label="Employee Id(*)" /> 
                </td></tr>
        
        <tr>
            <td>
        <s:textfield name="departmentId" label="Department Id"/> 
        </td>
        </tr>
         <tr>
             <td><s:select name="departmentName"  headerKey="-1" headerValue="--- Select Department Name ---" list="{'IT','Marketting','Pharmacy','Medicine','ShareBazar','Sales','Recruitment'}" label="Department Name" /> 
        </td>
        </tr>
        
        <tr><td>
        <s:textfield name="firstName" label="First Name" /> 
        </td></tr>
        <tr><td>
        <s:textfield name="lastName" label="Last Name"/> 
            </td>
        </tr>
        
        <tr><td>
                <s:radio list="{'Male','Female'}"  label="Gender" name="employee.gender" />
            </td>
        </tr>
   
        <tr>
            <td><s:combobox name="employee.city"  headerKey="-1" headerValue="--- Select City ---" list="{'Dhaka','Khulna','Sylhet','Chittagong','Barisal','Rajshahi','Rongpur'}" label="City Name" /> 
        </td>
        </tr>
        
       
        
        <tr>
            <td>
        <s:textfield name="employee.email" label="Email"/> 
        </td>
        </tr>
        
        
        
      
        
         <tr><td>
                 <s:radio name="typeOfLeave"  list="{'Casual Leave','Medical Leave','Official Leave','Leave With Pay','Leave Without Pay'}"       label="Job Grade"/> 
        </td></tr>
        
        <tr>
            <td><s:combobox name="employee.jobLocation"  headerKey="-1" headerValue="--- Select Location ---" list="{'Dhanmondi','Gulshan','Uttra','Savar','Panthpath','Mirpur','Kalabagan'}" label="Location Name" /> 
        </td>
        </tr>
        
        <tr><td>
        <s:textfield name="employee.salary" label="Salary"/> 
        </td></tr>
        <tr><td>
        <s:textfield name="employee.commissionPct" label="Comission Pct"/> 
        </td></tr>
        <tr><td>
        <sx:datetimepicker name="employee.hireDate" label="Hire Date(*)"
        displayFormat="dd-MMM-yyyy" value="todayDate" />
        </td></tr>
         <tr><td>
        <s:textfield name="employee.primarySkill" label="Primary Skill"/> 
        </td></tr>
        
         <tr><td>
        <s:textfield name="employee.secondarySkill" label="Secondary Skill"/> 
        </td></tr>
        <tr>
             <td> 
             
        <s:submit value="Add Employee"/>
        <s:reset value="Reset"/> 
            </td>
        </tr>
            
        
      
        
       
        </table>
        </div>
         </s:form>
        
            <h3 ><b style="color: red">Note:</b>Fields Marked with an  asterisk <b style="color: red">*</b> are required</h3>
            <a href="../employees/employeespage.jsp" >Back</a>
    </center>
    </body>
</html>
