<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/css/style.css">
    <title>View Test Page</title>
</head>
<body>
    <div class="container">
        <h2>Board!</h2>
        <div>JSP BoardList Test</div>
        <table class="board_list">
            <colgroup>
                <col width="15%"/>
                <col width="*"/>
                <col width="15%"/>
                <col width="25%"/>
            </colgroup>
            <thead>
                <tr>
                    <th scope="col">글번호</th>
                    <th scope="col">제목</th>
                    <th scope="col">조회수</th>
                    <th scope="col">작성일</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${boardList}" varStatus="idx">
                    <tr>
                        <td>
                            <a> 
                                ${item.id}
                            </a>
                        </td>
                        <td>
                            <a href="/showboard/?id=${item.id}"> 
                                ${item.title}
                            </a>
                        </td>
                        <td>
                            <a> 
                                ${item.readCnt}
                            </a>
                        </td>
                        <td>
                            <a> 
                                ${item.readCnt}
                            </a>
                        </td>
                        
                    </tr>
                </c:forEach>    
            </tbody>
        </table>
        <button id="createBtn">등록</button>
    </div>
    <div>---- JSP UserList Test ----</div>
    <c:forEach var="item" items="${list}" varStatus="idx">
    <a href="/test/?id=${idx.index}&name=${item.name}"> 
        ${idx.index} Hello! ${item.name}, Welcome ${item.city} <br />
    </a>
    </c:forEach>
</body>
</html>