<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/employeeFormStyle.css"/>
    </head>
    <body>
        <form action="${editMode == true ? '/editEmployee' : '/addEmployee'}" method="post">
            <input type="hidden" name="index" value="${index}">
            <label>Employee Name : </label>
            <input type="text" placeholder="Employee Name" name="empName" value="${employee != null ? employee.empName : ''}"/>

            <label>Employee Department : </label>
            <input type="text" placeholder="Employee Department" name="empDepartment" value="${employee != null ? employee.empDepartment : ''}" />

            <label>Employee Email : </label>
            <input type="email" placeholder="Employee Email" name="empEmail" value="${employee != null ? employee.empEmail : ''}" />

            <input type="submit" value="${editMode == true ? 'Edit Employee' : 'Add Employee'}">
        </form>
    </body>
</html>