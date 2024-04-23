<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="shop.dto.Product"%>
<%@page import="shop.dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>상품 정보</title>
<jsp:include page="/layout/meta.jsp" />
<jsp:include page="/layout/link.jsp" />
<!-- jQuery CDN 방식으로 포함하기 -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>  
	<%
		String root = request.getContextPath(); 
	
		String productId  = request.getParameter("id");
		ProductRepository productDAO = new ProductRepository();
		Product product = productDAO.getProductById(productId);
	
		// 세션에 저장한 장바구니 상품리스트 빼오기
		List<Product> cartList = (List<Product>) session.getAttribute("cartList");
	
		// 카트가 null인지 확인
		if (cartList == null) {
			session.setAttribute("cartList", cartList);
			cartList = new ArrayList<>(); // 새로운 카트 생성
		}
	%>
	
	<!-- 헤더 -->
	<jsp:include page="/layout/header.jsp" />
	
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">상품 정보</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">Shop 쇼핑몰 입니다.</p>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
				<a href="./products.jsp" class="btn btn-primary btn-lg px-4 gap-3">상품목록</a>
			</div>
		</div>
	</div>
	
	<!-- 상품 정보 영역 -->
	<div class="container">
		<div class="row">
		
			<div class="col-md-6">
				<img src="<%= root %>/shop/img?id=<%= product.getProductId() %>" class="w-100 p-2">
			</div>
			
			<div class="col-md-6">
			
				<h3 class="mb-5"><%= product.getName() %></h3>
				
			 	<table class="table">
			 	
			 		<colgroup>
			 			<col width="120px">
			 			<col>
			 		</colgroup>
			 		<tbody><tr>
			 			<td>상품ID :</td>
			 			<td><%= product.getProductId() %></td>
			 		</tr>
			 		<tr>
			 			<td>제조사 :</td>
			 			<td><%= product.getManufacturer() %></td>
			 		</tr>
			 		<tr>
			 			<td>분류 :</td>
			 			<td><%= product.getCategory() %></td>
			 		</tr>
			 		<tr>
			 			<td>상태 :</td>
			 			<td><%= product.getCondition() %> </td>
			 		</tr>
			 		<tr>
			 			<td>재고 수 :</td>
			 			<td><%= product.getUnitsInStock() %></td>
			 		</tr>
			 		<tr>
			 			<td>가격 :</td>
			 			<td><%= product.getUnitPrice() %></td>
			 		</tr>
			 		
				</tbody>
				
				</table>
				<form name="addForm" action="addCart.jsp" method="post">
						<input type="hidden" name="id" value="<%= product.getProductId() %>">
						<div class="btn-box d-flex justify-content-end ">
							<!-- [NEW] 장바구니 버튼 추가 -->
							<a href="cart.jsp" class="btn btn-lg btn-warning mx-3">장바구니</a>
							
							<!-- 페이지 이동 막기 :  href="javascript:;" -->			
							<a href="javascript:;" class="btn btn-lg btn-success mx-3" onclick="addToCart()">주문하기</a>
						</div>
					</form>
			</div>
		</div>
	</div>

	
	<!-- 푸터 -->
	<jsp:include page="/layout/footer.jsp" />
    <jsp:include page="/layout/script.jsp" />

	<script>
	
		// 장바구니 추가
		function addToCart() {
			if( confirm("상품을 장바구니에 추가하시겠습니까?") ) {
				document.addForm.submit()
			} else {
				document.addForm.reset()
			}
			
		}
		
	</script>

</body>
</html>