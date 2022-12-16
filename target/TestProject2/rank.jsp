<%@ page import="java.util.List" %>
<%@ page import="entity.Rank" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Rank> ranks=new ArrayList<>();
    int ranksLen = 0;
    if (request.getAttribute("ranks")!=null) {
        ranks = (List<Rank>)request.getAttribute("ranks");
        ranksLen=ranks.size();
//        System.out.println("first account:"+ranks.get(0).account);
//        System.out.println("size:"+ranks.size());
    }
    int k = 0;%>

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
        max-width: 1000px;
        margin: 0 auto;
        padding: 20px;
    }

    thead,tbody{
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
        <table width="1000px" border="1">
            <thead>
            <tr>
                <th>排名</th>
                <th>用户</th>
                <th>分数</th>
            </tr>
            </thead>
            <tbody id="tbBody"></tbody>>
        </table>
    </div>
    <script type="text/javascript">
        //打开窗口就执行
        window.onload=function () {
            let tbody=document.getElementById('tbBody');
            for(let i=0;i<<%=ranksLen%>;i++){
                let trow=getDataRow(i,<%=ranks.get(k).account%>,<%=ranks.get(k++).score%>);
                console.log(<%=k%>)
                tbody.appendChild(trow)
            }
        }
        //获取数据
        function getDataRow(i,account,score) {
            let row=document.createElement('tr');
            let idCell=document.createElement('td');
            //向id填充数据
            idCell.innerText=i+1;
            //加入行
            row.appendChild(idCell);
            /*创建第二列属性name 和上面类似*/
            let accountCell=document.createElement('td');
            accountCell.innerText=account;
            row.appendChild(accountCell);
            /*创建第三列属性job 和上面类似*/
            let scoreCell=document.createElement('td');
            scoreCell.innerText=score;
            row.appendChild(scoreCell);
            return row;
        }
    </script>
</body>
</html>
