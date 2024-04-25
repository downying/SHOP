<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배송 정보</title>
<jsp:include page="/layout/meta.jsp" />
<jsp:include page="/layout/link.jsp" />
</head>
<body>   
	
	<jsp:include page="/layout/header.jsp" />
	<div class="px-4 py-5 mt-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">배송 정보</h1>
	</div>
	
	<!-- 배송 정보 입력 -->
	<div class="container shop mb-5 p-4">
		<form action="ship_pro.jsp" class="form-horizontal" method="post"  onsubmit="return validateForm()">
		
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">성명</label> 
				<input type="text" class="form-control col-md-10" name="name" value="" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">배송일</label> <input
					type="text" class="form-control col-md-10" name="shippingDate" value="" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">국가명</label> 
				<input type="text" class="form-control col-md-10" name="country" value="" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">우편번호</label> 
				<input type="text" class="form-control col-md-10" name="zipCode" value="" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">주소</label> 
				<input type="text" class="form-control col-md-10" name="addressName" value="" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-2" id="">전화번호</label> 
				<input type="text" class="form-control col-md-10" name="phone" value="" required>
			</div>

			<!-- 버튼 영역 -->
			<div class="d-flex justify-content-between mt-5 mb-5">
				<div class="item">
					<a href="cart.jsp" class="btn btn-lg btn-success">이전</a>
					<!-- 취소 프로세스는 이어서... -->
					<a href="../index.jsp" class="btn btn-lg btn-danger">취소</a>
				</div>
				<div class="item">
					<input type="submit" class="btn btn-lg btn-primary" value="등록">
				</div>
			</div>

		</form>
	</div>

	<!-- 푸터 -->
	<jsp:include page="/layout/footer.jsp" />
	<script src="/static/js/validation.js"></script>



</body>
</html>