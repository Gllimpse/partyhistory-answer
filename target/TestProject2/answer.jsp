<%--
  Created by IntelliJ IDEA.
  User: 15927
  Date: 2022/12/13
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    List<Integer> questionInfo = new ArrayList<>(10);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>党史答题大比拼</title>
    <style>
        .input-item{
            border: 0;
            outline: none;
        }
    </style>
</head>
<body>

<h2>题目列表</h2>
<form action="AnswerServlet" method="post">
    <ul>
        <li>
            <h1 title="q1"></h1>
            <input type="radio" name="q1">A.
<%--            添加普通文本--%>
            <input type="text" value="answerA" readonly=readonly class="input-item"><br>

            <input type="radio" name="q1">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q1">C.
            <input type="text" value="answerC" readonly=readonly class="input-item"><br>

            <input type="radio" name="q1">D.
            <input type="text" value="answerD" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q1_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q2"></h1>
            <input type="radio" name="q2">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q1_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q3"></h1>
            <input type="radio" name="q3">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q1_answer" value="<%=1%>>">
        </li>
    </ul>
    <input type="submit" id="submitBtn" value="提交">
</form>
</body>
</html>
