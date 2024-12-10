<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/showAllEmployeesPageStyle.css"/>
    </head>
    <body>
    <p>Total Employees: ${employees.size()}</p>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Email</th>
                    <th colspan="2">Actions</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="emp" items="${employees}" varStatus="status">
                <tr>
                    <td>${emp.empName}</td>
                    <td>${emp.empDepartment}</td>
                    <td>${emp.empEmail}</td>
                    <td><a href="<c:url value = '/deleteEmployee?index=${status.index}'/>" > Delete </a></td>
                    <td><a href="<c:url value = '/showEditEmployee?index=${status.index}'/>" > Edit </a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </body>
</html>