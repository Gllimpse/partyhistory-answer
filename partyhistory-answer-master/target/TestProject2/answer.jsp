<%--
  Created by IntelliJ IDEA.
  User: 15927
  Date: 2022/12/13
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="entity.Question" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    List<Question> qList = (List<Question>)request.getAttribute("questions");
    List<List<String>> aList = (List<List<String>>)request.getAttribute("answers");
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
            width: 100%;
        }
        .ol{
            width: 100%;
        }

    </style>
</head>
<body>

<h2>题目列表</h2>
<form action="AnswerServlet" method="post">
    <ol class="ol">
        <li>
            <h1 title="q1"></h1>
            <input type="text" value="<%=qList.get(0).question%>" readonly=readonly class="input-item">
            <input type="radio" name="q1" value="A">
            <input type="text" value="<%=aList.get(0).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q1" value="B">
            <input type="text" value="<%=aList.get(0).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q1" value="C">
            <input type="text" value="<%=aList.get(0).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q1" value="D">
            <input type="text" value="<%=aList.get(0).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q1_answer" value="<%=qList.get(0).rightAnswer%>">
        </li>
        <li>
            <h1 title="q2"></h1>
            <input type="text" value="<%=qList.get(1).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2" value="A">
            <input type="text" value="<%=aList.get(1).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2" value="B">
            <input type="text" value="<%=aList.get(1).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2" value="C">
            <input type="text" value="<%=aList.get(1).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q2" value="D">
            <input type="text" value="<%=aList.get(1).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q2_answer" value="<%=qList.get(1).rightAnswer%>">
        </li>
        <li>
            <h1 title="q3"></h1>
            <input type="text" value="<%=qList.get(2).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3" value="A.">
            <input type="text" value="<%=aList.get(2).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3" value="B.">
            <input type="text" value="<%=aList.get(2).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3" value="C.">
            <input type="text" value="<%=aList.get(2).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q3" value="D.">
            <input type="text" value="<%=aList.get(2).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q3_answer" value="<%=qList.get(2).rightAnswer%>">
        </li>
        <li>
            <h1 title="q4"></h1>
            <input type="text" value="<%=qList.get(3).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4" value="A.">
            <input type="text" value="<%=aList.get(3).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4" value="B.">
            <input type="text" value="<%=aList.get(3).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4" value="C.">
            <input type="text" value="<%=aList.get(3).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q4" value="D.">
            <input type="text" value="<%=aList.get(3).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q4_answer" value="<%=qList.get(3).rightAnswer%>">
        </li>
        <li>
            <h1 title="q5"></h1>
            <input type="text" value="<%=qList.get(4).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5" value="A.">
            <input type="text" value="<%=aList.get(4).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5" value="B.">
            <input type="text" value="<%=aList.get(4).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5" value="C.">
            <input type="text" value="<%=aList.get(4).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q5" value="D.">
            <input type="text" value="<%=aList.get(4).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q5_answer" value="<%=qList.get(4).rightAnswer%>">
        </li>
        <li>
            <h1 title="q6"></h1>
            <input type="text" value="<%=qList.get(5).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6" value="A.">
            <input type="text" value="<%=aList.get(5).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6" value="B.">
            <input type="text" value="<%=aList.get(5).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6" value="C.">
            <input type="text" value="<%=aList.get(5).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q6" value="D.">
            <input type="text" value="<%=aList.get(5).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q6_answer" value="<%=qList.get(5).rightAnswer%>">
        </li>
        <li>
            <h1 title="q7"></h1>
            <input type="text" value="<%=qList.get(6).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q7" value="A.">
            <input type="text" value="<%=aList.get(6).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q7" value="B.">
            <input type="text" value="<%=aList.get(6).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q7" value="C.">
            <input type="text" value="<%=aList.get(6).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q7" value="D.">
            <input type="text" value="<%=aList.get(6).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q7_answer" value="<%=qList.get(6).rightAnswer%>">
        </li>
        <li>
            <h1 title="q8"></h1>
            <input type="text" value="<%=qList.get(7).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8" value="A.">
            <input type="text" value="<%=aList.get(7).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8" value="B.">
            <input type="text" value="<%=aList.get(7).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8" value="C.">
            <input type="text" value="<%=aList.get(7).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q8" value="D.">
            <input type="text" value="<%=aList.get(7).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q8_answer" value="<%=qList.get(7).rightAnswer%>">
        </li>
        <li>
            <h1 title="q9"></h1>
            <input type="text" value="<%=qList.get(8).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9" value="A.">
            <input type="text" value="<%=aList.get(8).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9" value="B.">
            <input type="text" value="<%=aList.get(8).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9" value="C.">
            <input type="text" value="<%=aList.get(8).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q9" value="D.">
            <input type="text" value="<%=aList.get(8).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q9_answer" value="<%=qList.get(8).rightAnswer%>">
        </li>
        <li>
            <h1 title="q10"></h1>
            <input type="text" value="<%=qList.get(9).question%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10" value="A.">
            <input type="text" value="<%=aList.get(9).get(0)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10" value="B.">
            <input type="text" value="<%=aList.get(9).get(1)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10" value="C.">
            <input type="text" value="<%=aList.get(9).get(2)%>" readonly=readonly class="input-item"><br>

            <input type="radio" name="q10" value="D.">
            <input type="text" value="<%=aList.get(9).get(3)%>" readonly=readonly class="input-item"><br>

            <input type="hidden" name="q10_answer" value="<%=qList.get(9).rightAnswer%>">
        </li>


    </ol>
    <input type="submit" id="submitBtn" value="提交">
</form>
</body>
</html>
