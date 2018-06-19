<%@ page import="vo.Cardmanager" %>
<%@ page import="dao.StudentDAOImpl" %>
<%@ page import="vo.Saler" %><%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/4
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    StudentDAOImpl studentDAO=new StudentDAOImpl();
     String userid=request.getParameter("userid");
     int money=Integer.parseInt(request.getParameter("money"));
     int oldmoney=Integer.parseInt(request.getParameter("oldMoney"));

     studentDAO.storeMoney(userid,money,oldmoney);
%>

<jsp:forward page="cardManager.jsp"/>


</body>
</html>
