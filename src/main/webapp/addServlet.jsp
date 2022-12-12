<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset=UTF-8"/>
    <title>求和结果</title>
</head>
<body>
<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String result = String.valueOf(num1+num2);
    if (session.getAttribute("user") != "Glimpse"){
        result = "未登录，请先登录";
    }
%>
result: <input type="text" value="<%=result%>"/>
</body>
</html>