<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/4
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="dao.*" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="vo.Student" %>
<html>
<head>
    <title>Title</title>
    <style>
        .bg{
            position: absolute;
            left: 250px;
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
            <td>尊敬的用户<%=request.getParameter("student")%>您好!</td>
            <td style="position: absolute;left:90%"><a href="login.jsp">注销登陆</a> </td>
        </tr>
    </table>
    <tr>
        <td><img src="img/city.jpg" height="260px" width="100%"></td>
    </tr>
</div>

<div class="bg">
    <table border="1" cellspacing="0" style="font-size: 25px">
        <caption>基本信息</caption>
        <tr>
            <th>ID</th>
            <th>UserID</th>
            <th>UserName</th>
            <th>MoneyBalance</th>
            <th>DoorState</th>
        </tr>
        <%
            String userid=request.getParameter("username");
           StudentDAOImpl serivce=new StudentDAOImpl();
            List<Student> list=serivce.queryCard(userid);
            Iterator<Student> it=list.iterator();
            Student student0=serivce.queryDoorS(userid);

            int id=1;
            while(it.hasNext()){
              Student student=it.next();
        %>
        <tr>
            <td>
                <%=id++%>
            </td>
            <td>
                <%=student.getUserId()%>
            </td>
            <td>
                <%=student.getUserName()%>
            </td>

            <td>
                <%=student.getMoneyBalance()%>元
            </td>

        <%
            }
        %>
            <td>
                <%=student0.getDoorState()%>
            </td>
        </tr>
    </table>
    <table border="1" cellspacing="0" style="font-size: 25px">
    <caption>借书信息</caption>
    <tr>
        <th>ID</th>
        <th>BookId</th>
        <th>BookName</th>
        <th>BorrowData</th>
        <th>ReturnData</th>
    </tr>
    <%
        List<Student> list1=serivce.queryBook(userid);
        Iterator<Student> it1=list1.iterator();
        int id1=1;
        while(it1.hasNext()){
            Student student1=it1.next();
    %>

    <tr>
        <td>
            <%=id1++%>
        </td>
        <td>
            <%=student1.getBookId()%>
        </td>
        <td>
            <%=student1.getBookName()%>
        </td>

        <td>
            <%=student1.getBorrowData()%>
        </td>
        <td>
            <%=student1.getReturnData()%>
        </td>
    </tr>
    <%
        }
    %>
    </table>

    <table border="1" cellspacing="0" style="font-size: 25px">
        <caption>消费信息</caption>
        <tr>
            <th>ID</th>
            <th>SpentType</th>
            <th>SpentMoney</th>
        </tr>
        <%
            List<Student> list2=serivce.querySpent(userid);
            Iterator<Student> it2=list2.iterator();
            int id2=1;
            while(it2.hasNext()){
                Student student2=it2.next();
        %>

        <tr>
            <td>
                <%=id2++%>
            </td>
            <td>
                <%=student2.getSpentType()%>
            </td>
            <td>
                <%=student2.getSpentMoney()%>
            </td>
        </tr>
        <%
            }
        %>
    </table>

    <table border="1" cellspacing="0" style="font-size: 25px">
        <caption>签到信息</caption>
        <tr>
            <th>ID</th>
            <th>SignNumber</th>
            <th>SignData</th>
        </tr>
        <%
            List<Student> list3=serivce.querySign(userid);
            Iterator<Student> it3=list3.iterator();
            int id3=1;
            while(it3.hasNext()){
                Student student3=it3.next();
        %>

        <tr>
            <td>
                <%=id3++%>
            </td>
            <td>
                <%=student3.getSignNumber()%>
            </td>
            <td>
                <%=student3.getSignData()%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
</div>
</body>
</html>
