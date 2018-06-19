<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2017/12/4
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="dao.*" language="java" %>
<%@ page import="vo.Cardmanager" %>
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
            <td>尊敬的用户您好!</td>
            <td style="position: absolute;left:90%"><a href="cardManager.jsp">返回</a></td>
        </tr>
    </table>
    <tr>
        <td><img src="img/city.jpg" height="260px" width="100%"></td>
    </tr>
</div>
<div>
    <form action="storeAction.jsp">
        <table>
            <tr>
                <td>
                    Money:
                </td>
                <td>
                    <input type="text" name="money" id="money">
                    <input type="hidden" name="userid" value="<%=request.getParameter("userid")%>">
                    <input type="hidden" name="oldMoney" value="<%=request.getParameter("oldMoney")%>">
                </td>
            </tr>
            <tr>
                <td><input type="submit" name="存入"></td>
                <td><input type="reset" name="取消"></td>
            </tr>
        </table>
    </form>


</div>
</body>
</html>
