<%--@elvariable id="list" type="com"--%>
<%--@elvariable id="user" type="com.aiden.pojo.User"--%>
<%--
  Created by IntelliJ IDEA.
  User: Aiden
  Date: 2023-11-08
  Time: 10:59
--%>

<%--
将后端数据发送到前端页面
1. ModelandView
2. Model
3. HttpServletRequest
4. HTTPSession
5. ServletContext
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 15px;
            text-align: left;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
${user}<br>
${user.name}--${user.password}--${user.age}--${user.birthday}<br>
${list}

<hr>
<hr>
<table>
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>

    <c:forEach items="${list}" var="user" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${user.name}</td>
        <td>${user.password}</td>
        <td>${user.age}</td>

        <td>
            <fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/>
        </td>
    </tr>
    </c:forEach>
</body>
</html>