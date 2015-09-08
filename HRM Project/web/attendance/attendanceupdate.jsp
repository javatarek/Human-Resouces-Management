   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hrm"
                   user="root" password="my1234"/>
<sql:update var="con" dataSource="${tarik}">
     update attendance set office_out=?
     where employee_id="${param.employeeId}";
     
   
     
    
    
    <sql:param value="${param.officeOut}"/>
     
    
</sql:update>
     <c:if test="${con>=1}">
        <c:out value="Data Updated Successfully"/>
    </c:if>
    
 