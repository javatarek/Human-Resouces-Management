  <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/hrm"
                   user="root" password="123"/>
<sql:query var="conn" dataSource="${tarik}">
select * from deduction where employee_id=?;  
<sql:param value="${param.employeeId}"/>

</sql:query>
<table border="1"  width="50%" style="background-image:url(../images/tableimage.jpg) " align="center">
    <caption style="font-size: 30px">View Deduction</caption>  
    
    <thead>
        <tr>
            <td>Provident Fund</td>
            <td>Advance</td>
            <td>Tax</td>
            <td>Employee Id</td>
        </tr>
    </thead>
<c:forEach var="java" items="${conn.rows}">
    <tr>
        <td><c:out value="${java.provident_fund}"/></td>
         <td><c:out value="${java.advance}"/></td>
          <td><c:out value="${java.tax}"/></td>
          
          <td><c:out value="${java.employee_id}"/></td>
        
    </tr>
    
</c:forEach>
     
</table>
<a href="payrollsetting.jsp" >Back</a>


