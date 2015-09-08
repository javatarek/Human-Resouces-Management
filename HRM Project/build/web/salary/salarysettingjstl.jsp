   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource var="tarik" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/hrm"
                   user="root" password="123"/>
<sql:update var="con" dataSource="${tarik}">
     insert into salary values( ? ,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);
     
   <sql:param value="${param.month}"/>
   <sql:param value="${param.year}"/>
   <sql:param value="${param.fileNo}"/>
   <sql:param value="${param.employeeName}"/>
   <sql:param value="${param.joinedDate}"/>
    <sql:param value="${param.departmentName}"/>
    <sql:param value="${param.profession}"/>
    <sql:param value="${param.basic}"/>
    <sql:param value="${param.housing}"/>
    <sql:param value="${param.transport}"/>
    <sql:param value="${param.fuel}"/>
    <sql:param value="${param.other}"/>
    <sql:param value="${param.note}"/>
    <sql:param value="${param.employeeId}"/>
     
     <sql:param value="${param.bonus}"/>
     <sql:param value="${param.netSal}"/>
     
    
</sql:update>
     <c:if test="${con>=1}">
         <h1><c:out value="Data Insert Successfully"/></h1>
    </c:if>
    
 