<%@page import="java.util.ArrayList"%>
<%@page import="shop.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="shop.dao.ProductRepository"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 목록</title>
	<jsp:include page="/layout/meta.jsp" />
	<jsp:include page="/layout/link.jsp" />
</head>

<body>  
<%
	ProductRepository productDAO = new ProductRepository();
	List<Product> productList = productDAO.list();
	
	String root = request.getContextPath();
	
	String keyword = request.getParameter("keyword");
	
	// 검색 키워드가 비어 있지 않으면, productDAO.list(keyword)를 호출하여 해당 키워드로 상품을 검색
	if(keyword != null && !keyword.trim().isEmpty()) {
		productList = productDAO.list(keyword);
		
		// 검색 결과가 없으면 다시 productDAO.list()를 호출하여 모든 상품을 가져옵니다. 
		if(productList.size() == 0) {
			productList = productDAO.list();
		}
		
		//검색 키워드가 비어 있으면 모든 상품을 가져옵니다.
	} else {
		productList = productDAO.list();
	
	}
%>
	<!-- 헤더 -->
	<jsp:include page="/layout/header.jsp" />
	
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">상품 목록</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">쇼핑몰 상품 목록 입니다.</p>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
				<a href="add.jsp" class="btn btn-primary btn-lg px-4 gap-3">상품 등록</a>
				<a href="editProducts.jsp" class="btn btn-success btn-lg px-4 gap-3">상품 편집</a>
				<a href="cart.jsp" class="btn btn-warning btn-lg px-4 gap-3">장바구니</a>
			</div>
		</div>
	</div>

	<div class="container mb-5">
    <div class="row gy-4">
        <%
            for (Product product : productList) {
        %>
        <div class="col-md-6 col-xl-4 col-xxl-3">
            <div class="card p-3">
                <!-- 이미지 영역 -->
                <div class="img-content">
                     <img class="p-3" alt="" src="<%= root %>/shop/img?id=<%= product.getProductId() %>">
                </div>
                <!-- 컨텐츠 영역 -->
                <div class="content">
                    <h3 class="text-center"><%= product.getName() %></h3>
                    <p></p>
                    <p class="text-end price">₩ <%= product.getUnitPrice() %></p>
                    <p class="d-flex justify-content-between">
                        <a href="cart.jsp" class="btn btn-outline-primary"> <i class="material-symbols-outlined">shopping_bag</i></a>
                        <a href="./product.jsp?id=<%= product.getProductId() %>" class="btn btn-outline-primary">상세 정보</a>
                    </p>
                </div>
            </div>
        </div>
        <%
            }
        %>
    </div>
</div>


	<!-- 푸터 -->
	<jsp:include page="/layout/footer.jsp" />
    <jsp:include page="/layout/script.jsp" />
    
    <script src="/static/js/validation.js"></script>
    
    
</body>
</html>