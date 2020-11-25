<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<head>
    <title>Dicts</title>
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <meta content="text/html;charset=UTF8" http-equiv="Content-Type">
    <script type="text/javascript" src="${path}/static/jquery-3.5.1.min.js" />
</head>
<body>
    <p>content</p>
    <%--<table>
        <tr><th colspan="4">字典管理</th></tr>
        <tr>
            <th>类别名</th>
            <th>字典名</th>
            <th>字典值</th>
        </tr>
        <c:forEach items="${dicts}" var="dict">
            <tr id="dict-${dict.id}">
                <td>${dict.code}</td>
                <td>${dict.name}</td>
                <td>${dict.value}</td>
            </tr>
        </c:forEach>
    </table>--%>


</body>
</html>
