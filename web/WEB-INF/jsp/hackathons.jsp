<%--
  Created by IntelliJ IDEA.
  User: schanna
  Date: 7/30/2019
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>

<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hackathons</title>
</head>
<body>
<h1>${hackthonDetailList}</h1>
</body>
</html>
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Spring MVC and List Example</h2>

<c:if test="${not empty lists}">

    <ul>
        <c:forEach var="listValue" items="${lists}">
            <li><%--<c:out value="$listValue.event_name"/>--%>${listValue.event_name} ${listValue.mo_office} ${listValue. no_of_idea} ${listValue.event_conducted}</li>
        </c:forEach>
    </ul>

</c:if>
</body>
</html>