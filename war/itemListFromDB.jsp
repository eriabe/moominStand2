<%-- 
    Document   : itemListFromDB
    Created on : 2013/12/02, 16:56:11
    Author     : 
--%>
<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>
<%@ page import="com.google.appengine.api.users.*" %>
<%
User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>注文ページ</title>
    <script type="text/javascript" src="lib.js"></script>
        <script type="text/javascript">
        <!--
        function callback(request){
            var json = eval(request.responseText);
            var res = '';
            if (json.length == 1){
                res += '<tr><td>' + json[0].id +'</td></tr>';
                res += '<tr><td>' + json[0].food +'</td></tr>';
                res += '<tr><td>' + json[0].price +'</td></tr>';
                res += '<img src ="'+json[0].img+'"width="280" height="420">'; 
            } else {
                for (var i = 0;i < json.length;i++){
                	res += '<tr><td><input type="checkbox" name="shohin" value="json[i].price"/></input></td>'
                    res += '<td><a href="javascript:return false;" onclick="getData(' + json[i].id +');">' + json[i].id + '</a></td>';
                    res += '<td>' + json[i].food + '</td>'
                    res += '<td>' + json[i].price + '</td></tr>';
                }
            }
            var obj = document.getElementById("datatable");
            obj.innerHTML = res;
        }
       
     //-->
  </script>
  </head>
  <body background="back.jpg">
  <body onload="getData(null);">
  <div align="center">
    <h1>ムーミンスタンド　商品一覧</h1>
    <div style="font-weight: bold;">ユーザー：<%=user.getNickname() %></div><br>
    <table id="datatable" border="1">
      <tr>
        <td>wait...</td>
      </tr>
    </table>
     <form action="itemListFromDB.jsp" >
    <input type="submit" name="itemListFromDB" value="商品一覧"/>
    </form>
    <FORM>
		<INPUT type="text" name="namae">
	</FORM>
  <form action="/buy" method="post">
    <input type="submit" name="cart" value="カートの内容を確認して注文へ進む"/>  
  </form>
    <form action="/logout">
    <input type="submit" name="logout" value="ログアウト"/>
    </form>
    <hr>
  </body>
</html>
