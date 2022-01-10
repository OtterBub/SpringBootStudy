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
    <h2><a href="/boardlist">ShowBoard Detail! ${pageNum}</a></h2>
    <div>JSP BoardInsert Test</div>
    <form action="/insertboard" method="post">
        <table class="table table-striped" style="width: 500px;">
            <caption><b>글쓰기</b></caption>
            <tr>
                <th>작성자</th>
                <td>
                    <input type="text" name="registerId" style="width: 100px;" class="form-control input-sm">
                </td>
            </tr>
            <tr>
                <th>제목</th>
                <td>
                    <input type="text" name="title" style="width: 300px;" class="form-control input-sm">
                </td>
            </tr>
            <tr>
                <th>내용</th>
                <td>
                    <input type="text" name="content" style="width: 400px; height: 150px;" class="form-control input-sm">
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit" class="btn btn-info">저장</button>
                </td>
            </tr>
        </table>
    </form>
    <div>
        
    </div>
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
</body>
</html>