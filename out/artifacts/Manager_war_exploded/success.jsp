<%@ page import="vo.Cardmanager" %>
<%@ page import="dao.StudentDAOImpl" %><%--
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
    String createuserId=request.getParameter("createuserID");
    String createuserName=request.getParameter("createuserName");
    Cardmanager cardmanager=new Cardmanager();
    cardmanager.setUserId(createuserId);
    cardmanager.setUsername(createuserName);
    StudentDAOImpl studentDAO=new StudentDAOImpl();
    studentDAO.createCard(cardmanager);
%>
<jsp:forward page="cardManager.jsp"/>
</body>
</html>
