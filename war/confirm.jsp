<%-- 
    Document   : confirm
    Created on : 2013/12/09, 16:32:21
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<CENTER>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>注文結果</title>
        </head>
        <body background="back.jpg">
            <h1>カートの中身を表示します。</h1>
            <div align="center">
                <h2>${user}さん、注文はこれでよろしいですか？</h2>
                <form action="logout.jsp">
                    <table class="menu">
                        <tr>あなたが注文したのは</tr>
                        <c:forEach items="${data}" var="rec">
                            <tr>${rec.name}　</tr>
                        </c:forEach>
                        <tr>です。</tr><br>
                        <tr>注文数は合計${count}個</tr><br>
                        <tr>合計金額は${total} 円</tr><br>
                    </table>
                    <input type="submit" value="注文を確定する"/>
                </form>
        </body>
    </html>
</CENTER>

