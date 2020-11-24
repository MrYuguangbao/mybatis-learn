<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>我的Mybatis</title>
</head>
<body>
<h2>Hello World!</h2>
<p>
    <%--<%
        Date now = new Date();
    %>--%>
    当前时间:<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss" />
</p>
</body>
</html>
