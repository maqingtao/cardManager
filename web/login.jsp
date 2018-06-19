<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/3
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body
        {
            background: url(img/login.jpg) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;//这条一定要
        }
        .login{
            position: absolute;
            top: 200px;
            left: 500px;
        }
    </style>
</head>
<body>
<h1>大学校园卡管理系统</h1>
<div align="center" class="login">
  <form id="f1" name="f1" method="get" action="check.jsp">
      <table style="font-size: 20px">
          <caption style="font-size:20px">用户登录</caption>
          <tr>
              <td>
                  Username:
              </td>
              <td>
                  <input type="text" name="username" id="username" placeholder="输入用户名">
              </td>
          </tr>
          <tr>
              <td>
                  Password:
              </td>
              <td>
                  <input type="password" name="password" id="password" placeholder="输入密码">
              </td>
          </tr>
         <tr>
             <td>
                 身份：<select id="character" name="character">
                 <option value="cardmanager">卡管理员</option>
                 <option value="bookmanager">图书管理员</option>
                 <option value="doormanager">门禁管理员</option>
                 <option value="saler">售货员</option>
                 <option value="teacher">老师</option>
                 <option value="student">学生</option>
             </select>
             </td>
         </tr>
          <tr>
              <td>
                  <input type="submit" name="submit" id="submit">
              </td>
              <td>
                  <input type="reset" name="reset" id="reset">
              </td>
          </tr>
      </table>
  </form>
</div>
<div style="position: absolute;right: 200px; top: 400px">
    <h1>研发</h1>
    <ol>
        <li>马庆涛</li>
    </ol>
</div>

</body>
</html>
