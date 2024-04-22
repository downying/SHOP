<%@page import="shop.dao.ProductRepository"%>
<%@page import="java.util.List"%>
<%@page import="shop.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Shop</title>
	<jsp:include page="/layout/meta.jsp" />
	<jsp:include page="/layout/link.jsp" />
	<style>
	
	</style>
</head>
<body>   
	
	<jsp:include page="/layout/header.jsp" />
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">메인화면</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">Shop 쇼핑몰 입니다.</p>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
			<button class="btn btn-primary btn-lg px-4 gap-3" onclick="moveToProductsPage()">상품목록</button>
			<button type="button" class="btn btn-outline-secondary px-4 gap-3" style="font-size: 20px;" onclick="moveToLoginPage()">로그인</button>

			</div>
		</div>
	</div>
	<jsp:include page="/layout/footer.jsp" />
	<jsp:include page="/layout/script.jsp" />
	
	<script >
        function moveToProductsPage() {
            var root = "<%= request.getContextPath() %>";
            window.location.href = root + "/shop/products.jsp";
        }
        
        function moveToLoginPage() {
            var root = "<%= request.getContextPath() %>";
            window.location.href = root + "/user/login.jsp";
        }
    </script>
</body>
</html>




