<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/homePageStyle.css"/>
    </head>
    <body>
        <h1>Welcome To Employee Management Project</h1>
        <div class="navigation">
            <a href="<c:url value='/showAllEmployees' />"> Show All Employees </a>
            <a href="<c:url value='/showAddEmployee' />"> Add New Employee </a>
        </div>
    </body>
</html>