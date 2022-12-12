<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset=UTF-8"/>
    <title>两数相加</title>
</head>
<body>
<%
    session.setAttribute("user","Glimpse");
%>
<form action="addServlet.jsp" method="post">
    <input type="text" name="num1"/>
    <br>
    <br>
    <input type="text" name="num2"/>
    <br>
    <br>
    <input type="submit" value="Add"/>
</form>
</body>
</html>
