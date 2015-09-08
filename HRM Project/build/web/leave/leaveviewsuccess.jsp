   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hrm"
                   user="root" password="my1234"/>
<sql:query var="conn" dataSource="${tarik}">
select * from hrm.leave  where employee_id=?;
<sql:param value="${param.employeeId}"/>

</sql:query>
<table border="1"  width="50%" style="background-image:url(../images/tableimage.jpg) " align="center">
    <caption style="font-size: 30px">View Leave</caption>  
    
    <thead>
        <tr>
            <td>Casual Leave</td>
            <td>Medical Leave</td>
            <td>Special Leave</td>
            <td>Office Leave</td>
            
            <td>Leave Without Pay</td>
             <td>Leave With Pay</td>
                <td>Employee Id</td>
             
            
        </tr>
    </thead>
<c:forEach var="tava" items="${conn.rows}">
    <tr>
        <td><c:out value="${tava.casual_leave}"/></td>
         <td><c:out value="${tava.medical_leave}"/></td>
          <td><c:out value="${tava.special_leave}"/></td>
          
          <td><c:out value="${tava.office_leave}"/></td>
          <td><c:out value="${tava.leave_without_pay}"/></td>
         <td><c:out value="${tava.leave_with_pay}"/></td>
         <td><c:out value="${tava.employee_id}"/></td>
         
    </tr>
    
</c:forEach>
     
</table>
<a href="../employees/employeespage.jsp" >Back</a>


