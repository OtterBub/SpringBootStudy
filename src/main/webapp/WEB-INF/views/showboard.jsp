<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/css/style.css">
     <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Board Detail</title>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/board/showboard.css" rel="stylesheet" />
</head>
<body id="page-top">
    
    <!-- Header-->
    <header class="bg-primary bg-gradient text-white">
        <div class="container px-4 text-center">
            <h1 class="fw-bolder">${boardDetail.title}</h1>
        </div>
    </header>
    <!-- About section-->
    <section id="about">
        <div class="container px-4">
            <div class="row gx-4 justify-content-center">
                <div class="col-lg-8">
                    <h2>Description</h2>
                    <ul>
                        <li>${boardDetail.content}</li>
                        <form name="delboard" method="post" action="/deleteboard/${boardDetail.id}">
                            <input type="hidden" name="_method" value="delete"/>
                            <button>삭제</button>
                        </form>
                        <form name="updateboard" method="get" action="/updateboard/">
                            <input type="hidden" name="id" value="${boardDetail.id}"/>
                            <button>수정</button>
                        </form>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <!-- Services section-->
    <section class="bg-light" id="services">
        <div class="container px-4">
            <div class="row gx-4 justify-content-center">
                <div class="col-lg-8">
                    <h2>Board List</h2>
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
                                            ${item.register_time}
                                        </a>
                                    </td>
                                    <td>
                                        <a> 
                                            ${item.read_cnt}
                                        </a>
                                    </td>
                                    
                                </tr>
                            </c:forEach>    
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </section>
    <!-- Contact section-->
    <section id="contact">
        <div class="container px-4">
            <div class="row gx-4 justify-content-center">
                <div class="col-lg-8">
                    <h2>Contact us</h2>
                    <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vero odio fugiat voluptatem dolor, provident officiis, id iusto! Obcaecati incidunt, qui nihil beatae magnam et repudiandae ipsa exercitationem, in, quo totam.</p>
                </div>
            </div>
        </div>
    </section>
    <!-- Footer-->
    <footer class="py-5 bg-dark">
        <div class="container px-4"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2021</p></div>
    </footer>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="js/board/showboard.js"></script>
</body>
</html>
