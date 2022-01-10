<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Test Page</title>
</head>
<body>
    <h2>This is Zero Page!</h2>
    <c:forEach var="item" items="${numList}" varStatus="idx">
    <a href="/test/?id=${idx.index}"> 
        ${idx.index} : ${numList} / ${name}<br />
    </a>
    </c:forEach>
</body>
</html>