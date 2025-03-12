<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/9/15
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
${msg}

<c:forEach var="users" items="${list}">
    <br>
    ${users.username}&nbsp;&nbsp;&nbsp;${users.password}
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="">update</a>&nbsp;&nbsp;&nbsp;
    <a href="/testMVC/delete?id = ${users.id}">delete</a>
    <br>
</c:forEach>
</body>
</html>
