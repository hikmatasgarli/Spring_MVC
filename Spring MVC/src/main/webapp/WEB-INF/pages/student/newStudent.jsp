<%--
  Created by IntelliJ IDEA.
  User: ASGARLI
  Date: 28.12.2019
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="${pageContext.request.contextPath}/addStudent" method="post">

    <div class="nameTxt">Name : <input type="text" name="name"/></div>
    <div class="surnameTxt">Surname : <input type="text" name="surname"/></div>
    <div class="addressTxt">Address : <input type="text" name="address"/></div>
    <input type="submit" value="SEND">


</form>


salam