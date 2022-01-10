<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Test Page</title>
</head>
<body>
    <h2><a href="/boardlist">ShowBoard Detail! ${pageNum}</a></h2>
    <div>JSP BoardList Test</div>
    <div>
        <h1> TITLE: ${boardDetail.title} </h1>
        <h2> CONTENT: ${boardDetail.content} </h2>
    </div>
    <c:forEach var="item" items="${boardList}" varStatus="idx">
    <a href="/showboard/?id=${item.id}"> 
        ${item.id} title: ${item.title} / ${item.content} <br />
    </a>
    </c:forEach>
</body>
</html>