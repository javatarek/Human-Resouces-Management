<%-- 
    Document   : attendanceout
    Created on : Nov 28, 2014, 2:20:54 AM
    Author     : Md.Tarikul Islam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salary Page</title>
        <sx:head/>
    </head>
    <body style="background-color: #444444">
          <center>
        <div style="background-color: burlywood;width: 450px;height: 680px">
  
        <h1 style="color: aqua;background-color:green">Salary Form</h1>
        <s:form action="salarysettingjstl.jsp" method="POST">
            <s:combobox name="month"  headerKey="-1"   headerValue=" Select Month" list="{'January','February','March','April','May','June','July','August','September','October','November','December'}" label="Month" />
             <s:combobox name="year"  headerKey="-1" headerValue=" Select Year " list="{'2014','2015','2016','2017','2018','2019','2020','2021','2022','2023','2024','2025','2026','2027','2028','2029','2030','2031','2032','2033','2034','2035','2036','2037','2038','2039','2040','2041','2042','2043','2044','2045','2046','2047','2048','2049','2050'}" label="Year" />
            <s:textfield name="fileNo" label="File No"/>
            <s:textfield name="employeeName" label="Employee Name"/>
              <sx:datetimepicker name="joinedDate" label="Joined Date(*)"
                                   displayFormat="dd-MMM-yyyy" value="todayDate" />
            <s:textfield name="departmentName" label="Department Name"/>
            <s:textfield name="profession" label="Profession"/>
            <s:textfield name="basic" label="Basic"/>
            <s:textfield name="housing" label="Housing"/>
            <s:textfield name="transport" label="Transport"/>
            <s:textfield name="fuel" label="Fuel"/>
            <s:textfield name="other" label="Other"/>
            <s:textarea name="note" label="Note" rows="5" cols="16" />
            <s:textfield name="employeeId" label="Employee Id(*)"/>
             
              <s:textfield name="bonus" label="Bonus"/>
              <s:textfield name="netSal" label="Net Sal"/>
             
             
            <s:submit value="Save"/>
        </s:form>
        <h3 ><b style="color: red">Note:</b>Fields Marked with an  asterisk <b style="color: red">*</b> are required</h3>
        <a href="../admin/admincontrolpage.jsp" style="color: red" >Back</a>
    </center>
        </div>
    </body>
</html>
