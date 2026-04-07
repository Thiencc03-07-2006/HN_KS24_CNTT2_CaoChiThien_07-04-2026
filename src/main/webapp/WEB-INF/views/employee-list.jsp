
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>

<ul>
    <c:forEach var="p" items="${employees}">
        <li>
            <a href="employees/${p.id}">
                    ${p.name} - ${p.price}
            </a>
        </li>
    </c:forEach>
</ul>

</body>
</html>
