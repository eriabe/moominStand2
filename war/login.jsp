<%-- 
    Document   : login
    Created on : 2013/12/02, 16:46:50
    Author     : 
    value="<%=request.getAttribute("input") %>"
--%>

<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>
<%
String bg = request.getParameter("background");
session.setAttribute("bg", bg);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Public Page</title>
    </head>
  <body background=<%=bg%>>
    <div align="center">
    <font face="fantasy">
        <h1>ムーミンスタンドへようこそ！</h1>
        <br>
        <a href="/itemListFromDB.jsp">ログイン</a>
        <p>背景を変えたい方はこちらでどうぞ</p>
        <form ><%--action="back">--%>
			<select name="background">
			<option value="white.jpg">そのまま</option>
			<option value="back.jpg">みどり</option>
			<option value="backPastel.jpg">かわいらしい</option>
			<option value="milktea.jpg">ぽっぷ</option>
			<option value="kaba.png">ムーミン</option>
			<option value="moomin.jpg">ノーマル</option>
			<option value="colurful.jpg">カラフル</option>
			</select>
			<input type="submit" name="button" value="変更">
		</form>
		</font>
    </body>
</html>
