<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASGARLI
  Date: 21.11.2019
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $(function () {
        $('#dobIdU').datepicker({
            changeMonth: true,
            changeYear: true
        });
    });

</script>
<div id="editStudentView">
    <c:forEach items="${studentList}" var="ss">
<div class="lblDesign">Name:</div> <input type="text"  id="nameIdU" value="${ss.name}"> <br>
<div class="lblDesign">Surname:</div> <input type="text"  id="surnameIdU" value="${ss.surname}"> <br>
<div class="lblDesign">Address:</div> <input type="text"  id="addressIdU" value="${ss.address}"> <br>
<div class="lblDesign">Dob:</div> <input type="text"  id="dobIdU" value="${ss.dob}"> <br>
<div class="lblDesign">Phone:</div> <input type="text"  id="phoneIdU" value="${ss.phone}"> <br>
    </c:forEach>
</div>