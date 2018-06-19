<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/4
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao.UserDAOImpl" %>
<%@ page import="vo.Cardmanager" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>Title</title>
    <style>
        .bg{
            position: absolute;
            left: 100px;
            top:300px;
           font-family: 新宋体;
         background-color: antiquewhite;
        }
        .bg1{
            background-color: antiquewhite;
        }
        .bg2{
            background-color: white;
        }
    </style>
</head>
<body class="bg1">
<div class="bg2">
    <table >

        <tr>
            <td>尊敬的用户您好!</td>
            <td style="position: absolute;left:90%"><a href="login.jsp">注销登陆</a> </td>
            <td style="position: absolute;left:83%"><a href="cardCreate.jsp">开户</a> </td>

        </tr>
    </table>
    <tr>
        <td><img src="img/city.jpg" height="260px" width="100%"></td>
    </tr>
</div>

<div class="bg">
      <table border="1" cellspacing="0" style="font-size: 25px">
          <caption>学生卡管理</caption>
    <tr>
        <th>ID</th>
        <th>UserID</th>
        <th>UserName</th>
        <th>CreateData</th>
        <th>MoneyBalance</th>
        <th>CardState</th>
        <th>操作</th>
    </tr>
<%


    UserDAOImpl service=new UserDAOImpl();
    List<Cardmanager> list=service.queryAll();

    Iterator<Cardmanager> it=list.iterator();
    int id=1;
    while(it.hasNext()){
        Cardmanager cdmanager=it.next();
%>
<tr>
    <td>
        <%=id++%>
    </td>
    <td>
        <%=cdmanager.getUserId()%>
    </td>
    <td>
        <%=cdmanager.getUsername()%>
    </td>
    <td>
        <%=cdmanager.getCreateDate()%>
    </td>
    <td>
        <%=cdmanager.getMoneyBalance()%>元
    </td>
    <td>
        <%=cdmanager.getState()%>
    </td>
    <td>
        <a href="userAction.jsp?action=delcard&userid=<%=cdmanager.getUserId()%>">销户</a>
        <a href="userAction.jsp?action=changeState&state=On&userid=<%=cdmanager.getUserId()%>">挂失恢复</a>
        <a href="userAction.jsp?action=changeState&state=Off&userid=<%=cdmanager.getUserId()%>">挂失</a>
        <a href="storeMoney.jsp?action=storeMoney&userid=<%=cdmanager.getUserId()%>&oldMoney=<%=cdmanager.getMoneyBalance()%>">存钱</a>
    </td>
</tr>
    <%
        }
    %>
</table>
</div>
</body>
</html>
