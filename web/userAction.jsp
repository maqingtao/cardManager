<%@ page import="dao.StudentDAOImpl" %><%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/8
  Time: 9:22
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
        String action=request.getParameter("action");
        String userid=request.getParameter("userid");
        if (action.equals("delbook"))
        {
            if (studentDAO.delbook(userid))
             %>
    <jsp:forward page="BookManager.jsp"/>
    <%
        }
    if (action.equals("delcard"))
    {
    if (studentDAO.delcard(userid))
    %>
    <jsp:forward page="cardManager.jsp"/>
    <%
        }
    if (action.equals("doorstate"))
    {
        String doorstate=request.getParameter("state");
    if (studentDAO.door(userid,doorstate))
    %>
    <jsp:forward page="DoorManager.jsp"/>
    <%
        }
    if (action.equals("sign"))
    {
    String oldNumber=request.getParameter("oldNumber");
    int number=Integer.parseInt(oldNumber);
    if (studentDAO.sign(userid,number))
    %>
    <jsp:forward page="Teacher.jsp"/>
    <%
        }

    if (studentDAO.cardState(userid,request.getParameter("state"))){
    %>
    <jsp:forward page="cardManager.jsp"/>
<%
    }
    %>
</body>
</html>
