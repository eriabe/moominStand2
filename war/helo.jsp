<%@ page language="java" contentType="text/html; charset=utf-8"
        pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Sample jsp</title>
<style>
h1{
    font-size: 16pt;
    background: #AAFFAA;
    padding: 5px;
}
table tr td {
    background: #DDFFDD;
    padding: 2px;
}
</style>
</head>
<body>
    <h1>Hello App Engine!</h1>
    <hr>
    <p id="msg">※メッセージ：</p>
    <form method="post" action="/mygaeapp">
    <table>
        <tr>
            <td>入力</td>
            <td><input type="text" id="input" name="text1"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="送信する">
            </td>
        </tr>
    </table>
    </form>
    <hr>
    <table>
    <%
    ArrayList<String> datas = (ArrayList<String>)application.getAttribute("datas");
    if (datas != null){
        for(String str : datas){
            out.println("<tr><td>" + str + "</td></tr>");
        }
    }
    %>
    </table>
</body>
</html>