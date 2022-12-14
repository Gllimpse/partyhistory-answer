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
    <ol>
        <li>
            <h1 title="q1"></h1>
            <input type="radio" name="q1" value="A.">A.
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

            <input type="hidden" name="q2_answer" value="<%=1%>>">
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

            <input type="hidden" name="q3_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q4"></h1>
            <input type="radio" name="q4">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q4_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q5"></h1>
            <input type="radio" name="q5">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q5_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q6"></h1>
            <input type="radio" name="q6">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q6_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q7"></h1>
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
        <li>
            <h1 title="q8"></h1>
            <input type="radio" name="q8">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q8_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q9"></h1>
            <input type="radio" name="q9">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q9_answer" value="<%=1%>>">
        </li>
        <li>
            <h1 title="q10"></h1>
            <input type="radio" name="q10">A.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10">B.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10">C.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10">D.
            <input type="text" value="answerB" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q10_answer" value="<%=1%>>">
        </li>


    </ol>
    <input type="submit" id="submitBtn" value="提交">
</form>
</body>
</html>
