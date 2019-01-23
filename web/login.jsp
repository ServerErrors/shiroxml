<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login">
    <label>
        账号：<input type="text" name="username">
    </label>
    <label>
        密码：<input type="password" name="password">
    </label>
    <input type="submit" value="登录">
</form>
</body>
</html>