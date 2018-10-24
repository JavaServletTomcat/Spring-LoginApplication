<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<%--@elvariable id="login1" type="com"--%>
<f:form action="home" method="post" modelAttribute="login1">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><f:label path="account">Account:</f:label></td>
                <td><f:input path="account" /></td>
            </tr>
            <tr>
                <td><f:label path="password">Password:</f:label></td>
                <td><f:input path="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><f:button>Login</f:button></td>
            </tr>
        </table>
    </fieldset>
</f:form>
</body>
</html>