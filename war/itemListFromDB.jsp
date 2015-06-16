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
//String bg = request.getParameter("background");
String bg = (String)session.getAttribute("bg");
String[] sels = request.getParameterValues("check");
int total = 0;
if (sels != null){
    for(int i = 0;i < sels.length;i++)
        total = total + Integer.parseInt(sels[i]);
}
String str = "合計:" + total + "円";
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
                res += '<tr><td>' + json[0].food +'</td></tr>';
                res += '<tr><td>' + json[0].price +'円</td></tr>';
                res += '<img src ="'+json[0].img+'"width="280" height="420">'; 
            } else {
                for (var i = 0;i < json.length;i++){
                	res += '<tr><td><a href="javascript:return false;" onclick="getData(' + json[i].id +');">' +i + '</a></td>';
                    res += '<td>' + json[i].food + '</td>';
                    res += '<td>' + json[i].price + '円</td></tr>';
                 }
            }
            var obj = document.getElementById("datatable");
            obj.innerHTML = res;
        }
       
     //-->
  </script>
  </head>
  <body background=<%=bg %>>
  <body onload="getData(null);">
  <div align="center">
  <font face="fantasy">
    <h1>ムーミンスタンド　商品一覧</h1>
    <div style="font-weight: bold;">ユーザー：<%=user.getNickname() %></div><br>
    <p><%=str  %></p><br>
    <table id="datatable" border="1">
      <tr>
        <td>wait...</td>
      </tr>
    </table>
     <form action="itemListFromDB.jsp" >
    	<input type="submit" name="itemListFromDB" value="商品一覧"/>
   	 </form>
   	  <p>購入したいメニュー番号をクリックして下さい。</p><br>
  	 <form action="itemListFromDB.jsp" method="post">
  		<tr><td>
  			<input type="checkbox"  name="check" value="389">0
    	</td>
    	<td>
    		<input type="checkbox" name="check" value="389">1
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">2
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="296">3
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">4
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">5
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">6
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">7
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="296">8
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="370">9
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">10
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="296">11
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">12
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">13
  		</td>
  		<td>
    		<input type="checkbox" name="check" value="389">14
  		</td>
  		
  		<td>
    		<input type="checkbox" name="check" value="389">15
  		</td>
		</tr>
  		<br><input type="submit" name="cart" value="合計を表示する"/> 
  	</form>
  	 <form action="logout.jsp">
  		<br><input type="submit" name="cart" value="購入完了"/>   
    </form>
    <form action="/logout">
    <input type="submit" name="logout" value="ログアウト"/>
    </form>
    <hr>
    </font>
  </body>
</html>