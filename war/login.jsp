<%-- 
    Document   : login
    Created on : 2013/12/02, 16:46:50
    Author     : 
    value="<%=request.getAttribute("input") %>"
--%>

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
