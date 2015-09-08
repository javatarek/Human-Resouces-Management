 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/hrm"
                   user="root" password="123"/>

<sql:update var="conn" dataSource="${tarik}">
    insert into total values(?,?,?);
    <sql:param value="${param.employeeId}"/>
    <sql:param value="0"/>
    <sql:param value="0"/>
    <%--
    update total set total_deduct=(SELECT (d.provident_fund+d.advance+d.tax)From deduction d  where employee_id=1157555) ;
    --%>
</sql:update>
     <c:if test="${conn>=1}">
         <h1><c:out value="Data Insert Successfully"/></h1>
    </c:if>




