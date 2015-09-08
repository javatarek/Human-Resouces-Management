   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/hrm"
                   user="root" password="123"/>
<sql:update var="con" dataSource="${tarik}">
     insert into deduction values( ?,?,?,?);
     
   <sql:param value="${param.providentFund}"/>
   <sql:param value="${param.advance}"/>
   <sql:param value="${param.tax}"/>
   
   <sql:param value="${param.employeeId}"/>
     
    
</sql:update>
     <c:if test="${con>=1}">
         <h1><c:out value="Data Insert Successfully"/></h1>
    </c:if>
    
 