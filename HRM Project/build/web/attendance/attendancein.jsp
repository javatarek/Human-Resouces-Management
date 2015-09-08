<%-- 
    Document   : attendancesetting
    Created on : Nov 23, 2014, 9:43:15 AM
    Author     : Tarikul
--%>

 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Attendance Page</title>
        <sx:head />
    </head>
    <body  style="background-color:grey">
    <center>
        
        <form action="attendanceinsert" method="POST">
            <h1>Employee Attendance Form</h1>
        <table >
            <tr><td>
                    <s:textfield name="attendance.employeeId" label="Employee Id" /> 
                </td></tr>
      <tr>
          <td>
        <sx:datetimepicker name="attendance.dateFrom" label="Date From"
        displayFormat="dd-MMM-yyyy" value="todayDate" />
        </td>
      </tr>
      
        
      
        <tr>
            <td>
        <s:textfield name="attendance.officeIn" label="Office In"/> 
            </td>
        </tr>
        
        
       
        
      <tr>
            <td><s:combobox name="attendance.status"  headerKey="-1" headerValue="--- Select Status ---" list="{'Present','Absent','Late'}" label="Status:" /> 
        </td>
        </tr>
        
        
        <tr>
            <td><s:combobox name="attendance.remarks"  headerKey="-1" headerValue="--- Select Remarks ---" list="{'OK'}" label="Remarks" /> 
        </td>
        </tr>
        
         
       
        <tr>
            <td>
        <s:submit value="SAVE"/>
            </td>
        </tr>
            
        <tr>
            <td></td>
            <td> <s:reset value="Reset"/></td>
     
        </tr>
      
        
       
        </table>
         </form>
            <a href="attendancesetting.jsp" >Back</a>
    </center>
    </body>
</html>
