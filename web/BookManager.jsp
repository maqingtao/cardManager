<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/4
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="dao.*" language="java" %>
<%@ page import="dao.UserDAOImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="vo.BookManager" %>
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
        </tr>
    </table>
    <tr>
        <td><img src="img/city.jpg" height="260px" width="100%"></td>
    </tr>
</div>

<div class="bg">
    <table border="1" cellspacing="0" style="font-size: 25px">
        <caption>学生借书管理</caption>
        <tr>
            <th>ID</th>
            <th>UserID</th>
            <th>UserName</th>
            <th>Book_ID</th>
            <th>Book_name</th>
            <th>Borrow_date</th>
            <th>Return_date</th>
            <th>操作</th>
        </tr>
        <%
            UserDAOImpl service=new UserDAOImpl();
            List<BookManager> list=service.queryBook();
            Iterator<BookManager> it=list.iterator();
            int id=1;
            while(it.hasNext()){
                BookManager bm=it.next();
        %>
        <tr>
            <td>
                <%=id++%>
            </td>
            <td>
                <%=bm.getUserid()%>
            </td>
            <td>
                <%=bm.getUsername()%>
            </td>
            <td>
                <%=bm.getBookid()%>
            </td>
            <td>
                <%=bm.getBookname()%>
            </td>
            <td>
                <%=bm.getBorrowData()%>
            </td>
            <td>
                <%=bm.getReturnData()%>
            </td>
            <td>
                <a href="userAction.jsp?action=delbook&userid=<%=bm.getUserid()%>">删除</a>
            </td>
        </tr>
        <%
            }
        %>
    </table>
</div>
</body>
</html>
