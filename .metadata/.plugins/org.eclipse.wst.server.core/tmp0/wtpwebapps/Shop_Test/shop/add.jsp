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
	<title>상품 등록</title>
	<jsp:include page="/layout/meta.jsp" />
	<jsp:include page="/layout/link.jsp" />
	
	<style>
	.input-group-text {
		background-color: white;
	}
	</style>
	
</head>
<body>
	<!-- 헤더 -->
	<jsp:include page="/layout/header.jsp" />
	
	
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">상품 등록</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">Shop 쇼핑몰 입니다.</p>
		</div>
	</div>

	<!-- 상품 등록 입력 화면 -->
	<div class="container shop">
		<c:if test="${param.msg == 0}">
	           <p style="color: red;">상품 등록에 실패하였습니다.</p>
	    </c:if>
	    
		<!--  등록버튼 클릭 시  ./add_pro.jsp -->
		<form name="product" action="./add_pro.jsp" onsubmit="return checkProduct()" method="post" enctype="multipart/form-data">

			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="file">상품 이미지</label> 
				<input type="file" class="form-control col-md-10" name="file">
			</div>


			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="product_id">상품 코드</label> 
				<input type="text" class="form-control col-md-10" name="productId">
			</div>


			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="name">상품명</label> 
				<input type="text" class="form-control col-md-10" name="name">
			</div>


			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="unit_price">가격</label> 
				<input type="number" class="form-control col-md-10" name="unitPrice">
			</div>
			
			
			<div class="input-group mb-3 row">
				<label class="input-group-text w-100" id="description">상세 정보</label>
				<textarea class="form-control" name="description" style="height: 200px !important;"></textarea>
			</div>
			
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="manufacturer">제조사</label> 
				<input type="text" class="form-control col-md-10" name="manufacturer">
			</div>
			
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="category">분류</label> 
				<input type="text" class="form-control col-md-10" name="category">
			</div>
			
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="units_in_stock">재고 수</label> 
				<input type="number" class="form-control col-md-10" name="unitsInStock">
			</div>
			
			
			<div class="input-group mb-3 row">
				<div class="col-md-2 p-0">
					<label class="input-group-text" id="condition">상태</label>
				</div>
				<div class="col-md-10 d-flex align-items-center">
					<div class="radio-box d-flex">
					
						<div class="radio-item mx-5">
							<input type="radio" class="form-check-input" name="condition"
								value="NEW" id="condition-new"> 
							<label for="condition-new">신규 제품</label>
						</div>

						<div class="radio-item mx-5">
							<input type="radio" class="form-check-input " name="condition"
								value="OLD" id="condition-old"> 
							<label for="condition-old">중고 제품</label>
						</div>

						<div class="radio-item mx-5">
							<input type="radio" class="form-check-input " name="condition"
								value="RE" id="condition-re"> 
							<label for="condition-re">재생 제품</label>
						</div>
						
					</div>
				</div>
			</div>

			<div class="d-flex justify-content-between mt-5 mb-5">
			<!--  목록버튼 클릭 시  ./products.jsp -->
				<a href="./products.jsp" class="btn btn-lg btn-secondary">목록</a>
				 <input type="submit" class="btn btn-lg btn-primary" value="등록">
			</div>
		</form>
	</div>

	<!-- 푸터 -->
	<jsp:include page="/layout/footer.jsp" />
    <jsp:include page="/layout/script.jsp" />
    
    <script src="/static/js/validation.js"></script>
    
    
</body>
</html>