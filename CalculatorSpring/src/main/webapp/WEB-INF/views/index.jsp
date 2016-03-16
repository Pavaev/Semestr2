<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <meta charset="utf-8">
</head>

<body>

<form method="GET" action="/">
    <p>Calculator</p>

    <p>
        <input type="text" name="op1"> op1 <br>
        <input type="text" name="op2"> op2 <br>
    </p>

    <p>
        <input type="submit" value="+">
        <input type="submit" value="-">
        <input type="submit" value="*">
        <input type="submit" value="/">
    </p>
</form>
<p><span>${message}</span>

</body>
</html>
