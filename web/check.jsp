<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/3
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="dao.*,db.*,service.*,vo.*" language="java" %>
<%@ page import="dao.UserDAOImpl" %>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    String character=request.getParameter("character");
    UserDAOImpl service=new UserDAOImpl();
    User user=new User();
    user.setUsername(username);
    user.setPassword(password);
    user.setCharacter(character);
    if (service.login(user)&&(character.equals("cardmanager"))) {
%>
<jsp:forward page="cardManager.jsp">
    <jsp:param name="managername" value="<%=username%>"/>
</jsp:forward>
<%
    }
    %>
<%
if (service.login(user)&&(character.equals("bookmanager"))) {
%>
<jsp:forward page="BookManager.jsp">
    <jsp:param name="bookmanager" value="<%=username%>"/>
</jsp:forward>
<%
    }
%>
<%
    if (service.login(user)&&(character.equals("doormanager"))) {
%>
<jsp:forward page="DoorManager.jsp">
    <jsp:param name="doormanager" value="<%=username%>"/>
</jsp:forward>
<%
    }
%>
<%
    if (service.login(user)&&(character.equals("saler"))) {
%>
<jsp:forward page="Saler.jsp">
    <jsp:param name="saler" value="<%=username%>"/>
</jsp:forward>
<%
    }
%>
<%
    if (service.login(user)&&(character.equals("teacher"))) {
%>
<jsp:forward page="Teacher.jsp">
    <jsp:param name="teacher" value="<%=username%>"/>
</jsp:forward>
<%
    }
%>
<%
if (service.login(user)&&(character.equals("student"))) {
%>
<jsp:forward page="Student.jsp">
    <jsp:param name="student" value="<%=username%>"/>
</jsp:forward>
<%
    }
    else{
    %>
<jsp:forward page="error.jsp"/>
    <%
    }
%>
