<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Danh sách nhân viên</title>
</head>
<body>

<h2>Danh sách nhân viên</h2>

<ul>
    <c:forEach var="p" items="${employees}">
        <li>
            <a href="${pageContext.request.contextPath}/employees/${p.id}">
                ${p.fullName} - ${p.salary}
            </a>
        </li>
    </c:forEach>
</ul>

</body>
</html>
