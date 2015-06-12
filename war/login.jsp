<%-- 
    Document   : login
    Created on : 2013/12/02, 16:46:50
    Author     : 
    value="<%=request.getAttribute("input") %>"
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Public Page</title>
    </head>
  <body background="back.jpg">
        <h1>ムーミンスタンドへようこそ！</h1>
        <br>
        <a href="/itemListFromDB.jsp">ログインへ</a>
        <p>背景を変えたい方はこちらでどうぞ</p>
        <form ><%--action="back">--%>
			<select name="background">
			<option value="1" selected>みどり</option>
			<option value="2">かわいらしい</option>
			<option value="3">ぽっぷ</option>
			</select>
			<input type="submit" name="button" value="変更">
		</form>
    </body>
</html>
<%--
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<CENTER>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログインページ</title>
    </head>
    <body background="back.jpg">
        <h1>ムーミンスタンドへようこそ！</h1>
        <form action="/login" method="post" >
            <table>
                <tr>
                    <td>ユーザー名</td>
                    <td><input type="text" name="user" size="16" value=""/></td>
                </tr>
                <tr>
                    <td>パスワード</td>
                    <td><input type="text" name="password" size="16" value=""/></td>
                </tr>
            </table>
            <input type="submit" value="ログイン">
        </form>
    </body>
</html>
</CENTER>
--%>