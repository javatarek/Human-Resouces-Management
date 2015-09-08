 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hrm"
                   user="root" password="my1234"/>

<sql:update var="conn" dataSource="${tarik}">
    
    
    update total set total_deduct=(SELECT (d.provident_fund+d.advance+d.tax)From deduction d  where employee_id=?) ;
    <sql:param value="${param.employeeId}"/>
</sql:update>
     <c:if test="${conn>=1}">
         <h1><c:out value="Data Set Successfully"/></h1>
    </c:if>




