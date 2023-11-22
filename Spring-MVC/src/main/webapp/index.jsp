<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link href="stylish/index.css" rel="stylesheet" type="text/css">
    <script src="stylish/index.js" type="text/javascript"></script>
</head>
<body>
<div class="container">
    <h2 onclick="check()">欢迎进入首页</h2>
<a href="${pageContext.request.contextPath}/user/login4">TestData</a>
<hr>
<hr>

<a href="${pageContext.request.contextPath}/user/login?name=Mai&password=Mai&age=19">用户登录</a>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    <label>
        用户名：
        <input type="text" name="name"/>
    </label><br>
    <label>
        密码：
        <input type="password" name="password"/>
    </label><br>
    <label>
        年龄：
        <input type="number" name="age"/>
    </label><br>
    <input type="submit" value="login"/>
</form>
<hr>
<hr>
<a href="${pageContext.request.contextPath}/user/login2?name=Mai&password=Mai&age=19&birthday=1998-12-02">用户登录</a>
<form action="${pageContext.request.contextPath}/user/login2" method="post">
    <label>
        用户名：
        <input type="text" name="name"/>
    </label><br>
    <label>
        密码：
        <input type="password" name="password"/>
    </label><br>
    <label>
    <label>
        年龄：
        <input type="number" name="age"/>
    </label>
    </label><br>
    <label>
        生日：
        <input type="date" name="birthday"/>
    </label><br>
    <input type="submit" value="login"/>
</form>
<hr>
<hr>
<a href="${pageContext.request.contextPath}/user/login3?ids=1&ids=3&ids=5">测试数组入参</a>
<form action="${pageContext.request.contextPath}/user/login3" method="post">
    <label>
        ids1:
        <input type="number" name="ids"/>
    </label><br>
    <label>
        ids2:
        <input type="number" name="ids"/>
    </label><br>
    <label>
        ids3:
        <input type="number" name="ids"/>
    </label><br>
    <label>
        ids4:
        <input type="number" name="ids"/>
    </label><br>
    <input type="submit" value="提交"/>
</form>
</div>
</body>
</html>

