<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASGARLI
  Date: 28.12.2019
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Qrup 41</title>




    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery.dataTables.min.css" >
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css" >
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/main.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-ui.js"></script>


</head>
<body>
<%--Hello World!! ${fullname}<br>
<a href="${pageContext.request.contextPath}/studentList">GetStudenList</a> <br>
<a href="${pageContext.request.contextPath}/newStudent">New Student</a>--%>

<div> <a id="studentBtn" href="#">Get Student List</a><br>
    <a id="addStudentBtn" href="#">Add New Student</a><br>
    <a id="test" href="#">TEST CLICK</a>
</div>

<div id="studentList"></div>
<div id="addNewStudent"></div>
<div id="editStudentPlace"></div>
<div id="editStudentDialogId"></div>


</body>
</html>
