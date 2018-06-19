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
   String userName=request.getParameter("userName");
   String action=request.getParameter("action");
   if (action.equals("spentCreate"))
   {
       String spentType=request.getParameter("spentType");
       String money=request.getParameter("money");
       Saler saler=new Saler();
       saler.setUserId(userid);
       saler.setUserName(userName);
       saler.setSpentType(spentType);
       saler.setSpentMoney(money);
//       studentDAO.spentMoney(userid,Integer.parseInt(money));
       studentDAO.createSpent(saler);
%>
<jsp:forward page="Saler.jsp"/>
<%
   }

%>


</body>
</html>
