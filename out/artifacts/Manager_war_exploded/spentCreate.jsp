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
    <form action="sucessSpent.jsp?">
        <table>
            <tr>
                <td>
                    UserId:
                </td>
                <td>
                    <input type="text" name="userid" id="userid">
                </td>
            </tr>

            <tr>
                <td>
                    消费类型
                    <select id="spentType" name="spentType">
                    <option value="健身">健身</option>
                    <option value="仓买">仓买</option>
                    <option value="食堂">食堂</option>
                    <option value="洗浴">洗浴</option>
                </select>
                </td>
            </tr>
            <tr>
                <td>
                   消费金额:
                </td>
                <td>
                    <input type="text" name="money" id="money">
                    <input type="hidden" name="action" value="spentCreate">
                </td>
            </tr>
            <tr>
                <td><input type="submit" name="确定消费"></td>
                <td><input type="reset" name="清除信息"></td>
            </tr>
        </table>
    </form>


</div>
</body>
</html>
