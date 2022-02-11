<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/10/31
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成语接龙</title>
</head>

<script type="text/javascript" src="webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript">


            function query(){
                     $.getJSON("http://localhost:8080/ChengYu/s", "action=query&queryChengYu="+$("#queryChengYu").val(),function (queryChengYu) {
                        $("#msg").html(queryChengYu);
                })
            }


            function add(){
                    $.getJSON("http://localhost:8080/ChengYu/s","action=add&"+$("#form02").serialize(),function (addChengYu){
                        alert(JSON.stringify(addChengYu));
                    })
            }

    </script>

<body>


<div align="center">
    <h1><font color="aqua">成语接龙</font></h1>
</div>

<span id="msg"></span>

<table align="center">
    <tr>
            <td>
                输入成语:
            </td>
            <td>
                <input type="text" id="queryChengYu">
            </td>
            <td>
            <button id="query" onclick="query()">接龙</button>
            </td>
    </tr>
</table>

<table align="center">
    <tr>
        <form id="form02">
             <td>添加成语:
             </td>
             <td><input type="text" name="addChengYu">
             </td>
        </form>
             <td>
            <button id="add" onclick="add()">添加</button>
             </td>
    </tr>
</table>

</body>
</html>
