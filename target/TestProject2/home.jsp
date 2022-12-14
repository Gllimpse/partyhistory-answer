<%--
  Created by IntelliJ IDEA.
  User: Glimpse
  Date: 2022/12/13
  Time: 8:07
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>党史答题大比拼</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        html {
            height: 100%;
        }

        body {
            height: 100%;
        }

        .container {
            height: 100%;
            background-image: linear-gradient(to right, #fbc2eb, #a6c1ee);
        }

        .login-wrapper {
            background-color: #fff;
            width: 360px;
            height: 588px;
            border-radius: 15px;
            padding: 0 50px;
            position: relative;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }

        .header {
            font-size: 38px;
            font-weight: bold;
            text-align: center;
            line-height: 200px;
        }

        .input-item {
            /*text-align: center;*/
            display: block;
            width: 320px;
            height: 40px;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -160px;
            margin-top: -30px;
            padding: 10px;
            /*隐藏边框*/
            border: 0;
            /*border-bottom: 1px solid rgb(128, 125, 125);*/
            font-size: 22px;
            font-family: "Comic Sans MS", serif;
            outline: none;
        }

        .input-item::placeholder {
            text-transform: uppercase;
        }

        .btn {
            padding: 10px;
            width: 350px;
            height: 55px;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -175px;
            margin-top: 200px;
            /*隐藏边框*/
            border: 0;
            background-image: linear-gradient(to right, #a6c1ee, #fbc2eb);
            color: #fff;
            font-family: "Comic Sans MS", serif;
            font-size: 20px;
            border-radius:30px;
        }

        a {
            text-decoration-line: none;
            color: #abc1ee;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="login-wrapper">
        <div class="header">党史答题大比拼</div>
        <input type="text" value="今日还未答题，赶快开始答题吧" class="input-item" readonly=readonly >

        <form action="StartServlet" method="post">
            <input type="submit" value="Start" class="btn">
        </form>
    </div>

</div>
</body>
</html>

