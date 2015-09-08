 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/hrm"
                   user="root" password="123"/>
<sql:update var="conn" dataSource="${tarik}">
    update salary set net_sal=(SELECT (t.gross_salary-t.total_deduct)From total t  where employee_id=?) ;
    <sql:param value="${param.employeeId}"/>
</sql:update>
     <c:if test="${conn>=1}">
         <h1><c:out value="Data Update Successfully"/></h1>
    </c:if>




