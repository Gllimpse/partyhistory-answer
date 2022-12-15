<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String errInfo = (String)request.getAttribute("errInfo");         // 获取错误属性
    if(errInfo != null) {
%>
<script type="text/javascript" >
    window.alert("<%=errInfo%>")
</script>
<%
    }
    Cookie[] cookies=request.getCookies();
    for (Cookie cookie :cookies){
        if (cookie.getName().equals("userID")){ //存在cookie 重定向到home页面
            response.sendRedirect("home.jsp");
        }
    }
%>

<html>
<head>
    <meta charset=UTF-8"/>
    <title>党史答题大比拼</title>
    <style>
        body{
            font-family: Arial,sans-serif;
            background: linear-gradient(to bottom, #a6c1ee, #dff1ff);
        }

        form{
            width: 400px;
            margin: 0 auto;
        }

        h1 {
            text-align: center;
            color: #fbc2eb;
        }

        .form .inputBox input {
            width: 100%;
            padding: 10px 20px;
            background: rgba(255, 255, 255, 0.2);
            outline: none;
            border: none;
            border-radius: 30px;
            border: 1px solid rgba(255, 255, 255, 0.5);
            border-right: 1px solid rgba(255, 255, 255, 0.2);
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
            font-size: 16px;
            letter-spacing: 1px;
            color: #fff;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.05);
        }

        .form .inputBox input::placeholder {
            color: #fbc2eb;
        }

        input[type="text"],input[type="password"]{
            display: block;
            margin-bottom: 10px;
            padding: 10px;
            width: 100%;
            box-sizing: border-box;
        }

        input[value="注册"]{
            display: block flow;
            margin: 20px auto 0;
            padding: 10px;
            width: 150px;
            background-color: #00b7ff;
            color: black;
            border: none;
            cursor: pointer;
        }

        input[value="登录"]{
            display: block flow;
            width: 150px;
            margin: 20px auto 0;
            padding: 10px;
            background-color: #fbc2eb;
            color: black;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover{
            background-color: #0099cc;
        }
    </style>
</head>
<body>
<h1>Login</h1>
<form method="post" action=login>
    <label for="account">用户名:</label><br>
    <input type="text" id="account" name="account"><br>
    <label for="password">密码:</label><br>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit"  value="登录">
    <input type="submit" value="注册" onclick="this.form.action='./register';"/>
</form>
</body>
</html>
