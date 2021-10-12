<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1><%= "Login:" %>
</h1>
<form name="form" action="hello-servlet">
    <label>Name:</label>
    <input type="text" name="name"/>
    </br>
    <label>Age:</label>
    <input type="text" name="age"/>

    <input type="submit"/>

</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>