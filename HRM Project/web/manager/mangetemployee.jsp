  <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hrm"
                   user="root" password="my1234"/>
<sql:query var="conn" dataSource="${tarik}">
select * from employees where  department_id<200 ;  
 

</sql:query>
<table border="1"  width="50%" style="background-image:url(../images/tableimage.jpg) " align="center">
    <caption style="font-size: 30px">View Salary</caption>  
    
    <thead>
        
            <tr>
<th>Employee Id</th>
<th>Manager Id</th>
<th>Department Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Phone Number</th>
<th>Hire Date</th>
<th>Job Id</th>
<th>Salary</th>
<th>Commission Pct</th>
<th>Gender</th>
<th>City</th>
<th>Job Grade</th>
<th>Department Name</th>
<th>Job Location</th>
<th>Primary Skill</th>
<th>Secondary Skill</th>
 
            
        </tr>
    </thead>
<c:forEach var="java" items="${conn.rows}">
    <tr>
        <td><c:out value="${java.employee_id}"/></td>
         <td><c:out value="${java.manager_id}"/></td>
          <td><c:out value="${java.department_id}"/></td>
          
          <td><c:out value="${java.first_name}"/></td>
          <td><c:out value="${java.last_name}"/></td>
         <td><c:out value="${java.email}"/></td>
         <td><c:out value="${java.phone_number}"/></td>
         <td><c:out value="${java.hire_date}"/></td>
         <td><c:out value="${java.job_id}"/></td>
         <td><c:out value="${java.salary}"/></td>
         <td><c:out value="${java.commission_pct}"/></td>
         <td><c:out value="${java.gender}"/></td>
         <td><c:out value="${java.city}"/></td>
         <td><c:out value="${java.job_grade}"/></td>
         <td><c:out value="${java.department_name}"/></td>
         <td><c:out value="${java.job_location}"/></td>
          <td><c:out value="${java.primary_skill}"/></td>
           <td><c:out value="${java.secondary_skill}"/></td>
    </tr>
    
</c:forEach>
     
</table>
<a href="managercontrolpage.jsp" >Back</a>


