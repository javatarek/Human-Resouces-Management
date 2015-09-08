  <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hrm"
                   user="root" password="my1234"/>
<sql:query var="conn" dataSource="${tarik}">
select * from salary where employee_id=? ;  
<sql:param value="${param.employeeId}"/>

</sql:query>
<table border="1"  width="50%" style="background-image:url(../images/tableimage.jpg) " align="center">
    <caption style="background-color: #343434;color: lightcoral;font-size: 30px">View Salary</caption>  
    
    <thead>
        <tr style="color: #FF0DDB">
            <td>Month</td>
            <td>Year</td>
            <td>File No</td>
            <td>Employee Name</td>
            <td>Joined Date</td>
             <td>Department Name</td>
             <td>Profession</td>
             <td>Basic</td>
              <td>Housing</td>
               <td>Transport</td>
                <td>Fuel</td>
                 <td>Other</td>
                  <td>Note</td>
                   <td>Employee Id</td>
                    <td>Bonus</td>
                     <td>Net Salary</td>
            
            
        </tr>
    </thead>
<c:forEach var="java" items="${conn.rows}">
    <tr>
        <td><c:out value="${java.month}"/></td>
         <td><c:out value="${java.year}"/></td>
          <td><c:out value="${java.file_no}"/></td>
          
          <td><c:out value="${java.employee_name}"/></td>
          <td><c:out value="${java.joined_date}"/></td>
         <td><c:out value="${java.department_name}"/></td>
         <td><c:out value="${java.profession}"/></td>
         <td><c:out value="${java.basic}"/></td>
         <td><c:out value="${java.housing}"/></td>
         <td><c:out value="${java.transport}"/></td>
         <td><c:out value="${java.fuel}"/></td>
         <td><c:out value="${java.other}"/></td>
         <td><c:out value="${java.note}"/></td>
         <td><c:out value="${java.employee_id}"/></td>
         <td><c:out value="${java.bonus}"/></td>
         <td><c:out value="${java.net_sal}"/></td>
    </tr>
    
</c:forEach>
     
</table>
<a href="managercontrolpage.jsp" >Back</a>


