<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Title</title>
  <script src="stylish/jQuery3.7.js" type="text/javascript"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      // 用户名检查
      $('#usernameInput').on('blur', function (){
        var name = $(this).val();
        $.ajax({
          url: "${pageContext.request.contextPath}/user/checkName",
          data: {"name": name},
          type: "post",
          dataType: "json",
          success: function (data) {
            var message = data ? "用户名已存在" : "用户名可用";
            $('#usernameStatus').html(message);
          },
          error: function(xhr, status, error) {
            console.error("AJAX request failed: " + status + ", " + error);
          }
        });
      });

      // 获取用户集合
      $('#getUsersButton').on('click', function (){
        $.ajax({
          url: "${pageContext.request.contextPath}/user/getAll",
          type: "post",
          dataType: "json",
          success: function (data) {
            var tableRows = data.map(function(user) {
              return "<tr><td>" + user.name + "</td><td>" + user.password + "</td><td>" + user.age + "</td><td>" + user.dob + "</td></tr>";
            }).join('');
            $('table').append(tableRows);
          },
          error: function(xhr, status, error) {
            console.error("AJAX request failed: " + status + ", " + error);
          }
        });
      });
    });
  </script>
</head>
<body>
<h2>欢迎进入首页</h2>
<hr>

<a href="${pageContext.request.contextPath}/user/login6">用户登录</a>
<form action="${pageContext.request.contextPath}/user/login" method="post" id="myForm">
  <label>
    用户名：
    <input type="text" id="usernameInput" name="name"/><span id="usernameStatus"></span>
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
<button id="getUsersButton">获取集合</button><br>
<table>
  <tr>
    <td>User</td>
    <td>Pwd</td>
    <td>Age</td>
    <td>DoB</td>
  </tr>
</table>
</body>
</html>
