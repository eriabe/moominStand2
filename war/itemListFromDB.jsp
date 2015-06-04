<%-- 
    Document   : itemListFromDB
    Created on : 2013/12/02, 16:56:11
    Author     : 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
            } else {
                for (var i = 0;i < json.length;i++){
                    res += '<tr><td><a href="javascript:return false;" onclick="getData(' + json[i].id +');">' + json[i].id + '</a></td>';
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
    <table id="datatable" border="1">
      <tr>
        <td>wait...</td>
      </tr>
    </table>
    <form action="confirm.jsp" method="post">
    <input type="submit" name="cart" value="カートの内容を確認して注文へ進む"/>  
    </form>
    <form action="login.jsp" method="post">
    <input type="submit" name="logout" value="ログアウト"/>
    </form>
    <hr>
  
  </body>
</html>

<!--  %@ page import="java.util.ArrayList" %>-->
<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%>-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<CENTER>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>注文ページ</title>
        </head>
        <body background="back.jpg">
            <h1>ムーミンスタンド　商品一覧</h1>
            <div align="center">
                <h2>${user}さん、お好きな飲み物、またはドーナツを選んでください</h2>
    	    <form action="/cart" method="post" >
                    <!--  <table class="menu">
                        <c:forEach items="${data}" var="rec">
                            <tr>
                               <td><input type="checkbox" value="${rec.id}" name="shohinid"</td>
                                <td>${rec.id}</td>
                                <td>${rec.name}</td>
                                <td class="price">${rec.price} 円</td>
                            </tr>
                        </c:forEach>
                    </table>-->
                    <input type="submit" name="cart" value="カートの内容を確認して注文へ進む"/>  
                </form>
                <form action="login.jsp" method="post">
                    <input type="submit" name="logout" value="ログアウト"/>
                </form>
                  <hr>
     <!-- 試し -->
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
</CENTER>--%>


