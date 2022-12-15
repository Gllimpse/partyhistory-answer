<%--
  Created by IntelliJ IDEA.
  User: 15927
  Date: 2022/12/13
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>排行榜</title>
</head>
<style>
    body{
        font-family: Arial,sans-serif;
        background: linear-gradient(to bottom, #a6c1ee, #fbc2eb);
    }
    h1{
        text-align: center;
        color: #00b7ff;
    }

    .container{
        max-width: 800px;
        margin: 0 auto;
        padding: 20px;
    }

    table{
        width: 100%;
        border-collapse: collapse;
        text-align: center;
    }

    th,td{
        border: 1px solid #ccc;
        padding: 10px;
    }
    th{
        background-color: #00b7ff;
        color: white;
    }

    tr:nth-child(even){
        background-color: #f2f2f2;
    }

</style>
<body>
    <h1>排行榜</h1>
    <div class="container">
        <table>
            <tr>
                <th>排名</th>
                <th>用户</th>
                <th>分数</th>
            </tr>
            <tr>
                <td>1</td>
                <td>张三</td>
                <td>10</td>
            </tr>
            <tr>
                <td>2</td>
                <td>李四</td>
                <td>9</td>
            </tr>
        </table>
    </div>
</body>
</html>
