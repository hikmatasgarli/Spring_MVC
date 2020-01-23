<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASGARLI
  Date: 28.12.2019
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table style="width:100%">

    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Date of Birth</th>

    </tr>
    </thead>

    <tbody>
    <c:forEach items="${studentList}" var="st">
        <tr>
            <td>${st.id}</td>
            <td>${st.name}</td>
            <td>${st.surname}</td>
            <td>${st.address}</td>
            <td>${st.phone}</td>
            <td>${st.dob}</td>
            <td><a href="javascript: editStudent('${st.id}');">Edit</a></td>
            <td><a href="javascript: deleteStudent('','');">Delete</a></td>

        </tr>

    </c:forEach>
    </tbody>
</table>