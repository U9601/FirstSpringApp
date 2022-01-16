<%--
  Created by IntelliJ IDEA.
  User: ctjon
  Date: 16/01/2022
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST"
           action="/addHockey" modelAttribute="hockeyAdd">
    <table>
        <tr>
            <td><form:label path="competitorNumber">Competitor Number</form:label></td>
            <td><form:input path="competitorNumber"/></td>
        </tr>
        <tr>
            <td><form:label path="name.firstName">First Name</form:label></td>
            <td><form:input path="name.firstName"/></td>
        </tr>
        <tr>
            <td><form:label path="name.middleName">Middle Name</form:label></td>
            <td><form:input path="name.middleName"/></td>
        </tr>
        <tr>
            <td><form:label path="name.lastName">Last Name</form:label></td>
            <td><form:input path="name.lastName"/></td>
        </tr>
        <tr>
            <td><form:label path="level">
                Level</form:label></td>
            <td><form:input path="level"/></td>
        </tr>
        <tr>
            <td><form:label path="league">
                League</form:label></td>
            <td><form:input path="league"/></td>
        </tr>
        <tr>
            <td><form:label path="ratings">
                Ratings</form:label></td>
            <td><form:input path="ratings"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>