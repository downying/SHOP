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
<title>상품수정</title>
<jsp:include page="/layout/meta.jsp" />
<jsp:include page="/layout/link.jsp" />
</head>

<body>

	<%
	String root = request.getContextPath();

	String productId = request.getParameter("id");
	ProductRepository productDAO = new ProductRepository();
	Product product = productDAO.getProductById(productId);
	%>
	<!-- 헤더 -->
	<jsp:include page="/layout/header.jsp" />

	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">상품 수정</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">Shop 쇼핑몰 입니다.</p>
		</div>
	</div>

	<!-- 상품 수정 입력 화면 -->
	<div class="container shop">
		<form name="product" action="./update_pro.jsp" onsubmit="return checkProduct()" method="post" enctype="multipart/form-data">

			<div class="input-group mb-3 row">
				<img src="<%=root%>/shop/img?id=<%=product.getProductId()%>"
					class="w-100 p-2">
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">상품 이미지</label> <input
					type="file" class="form-control col-md-10" name="file">
			</div>

			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">상품 코드</label> <input
					type="text" class="form-control col-md-10" name="productId"
					value="<%=product.getProductId()%>" readonly="">
			</div>

			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">상품명</label> <input
					type="text" class="form-control col-md-10" name="name"
					value="<%=product.getName()%>">
			</div>

			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">가격</label> <input
					type="number" class="form-control col-md-10" name="unitPrice"
					value="<%=product.getUnitPrice()%>">
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">상세 정보</label>
				<textarea class="form-control col-md-10" name="description" rows="5"><%=product.getDescription()%></textarea>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">제조사</label> <input
					type="text" class="form-control col-md-10" name="manufacturer"
					value="<%=product.getManufacturer()%>">
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">분류</label> <input
					type="text" class="form-control col-md-10" name="category"
					value="<%=product.getCategory()%>">
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">재고 수</label> <input
					type="number" class="form-control col-md-10" name="unitsInStock"
					value="<%=product.getUnitsInStock()%>">
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">상태</label>
				<div class="col-md-10 d-flex align-items-center">
					<div class="radio-box d-flex">
						<div class="radio-item mx-5">
							<input type="radio" class="form-check-input" name="condition" value="NEW" id="condition-new"> 
							<label for="condition-new">신규 제품</label>
						</div>

						<div class="radio-item mx-5">
							<input type="radio" class="form-check-input" name="condition" value="OLD" id="condition-old"> 
							<label for="condition-old">중고 제품</label>
						</div>

						<div class="radio-item mx-5">
							<input type="radio" class="form-check-input" name="condition" value="RE" id="condition-re"> 
							<label for="condition-re">재생 제품</label>
						</div>
					</div>
				</div>
			</div>
			
			<div class="d-flex justify-content-between mt-5 mb-5">
				<a href="./products.jsp" class="btn btn-lg btn-secondary">목록</a>
				<input type="submit" class="btn btn-lg btn-success" value="수정">
			</div>
			
		</form>
	</div>


	<jsp:include page="/layout/footer.jsp" />
	<jsp:include page="/layout/script.jsp" />
	<script src="/static/js/validation.js"></script>

	<script>
    // JSP 코드로부터 가져온 상태 정보
    let condition = "<%= product.getCondition() %>"; // 문자열로 가져옵니다.

    // 가져온 상태 정보를 사용하여 해당 라디오 버튼을 선택
    let radioCondition = document.getElementById("condition-" + condition.toLowerCase()); // 소문자로 변환하여 id를 찾습니다.
    if (radioCondition) { // 해당 상태에 해당하는 라디오 버튼이 존재하는지 확인
        radioCondition.checked = true;
    }
</script>


</body>
</html>