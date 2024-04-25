<%@page import="shop.dto.Order"%>
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
	// Ship_pro에서 Order 세션 가져오기
			Order order = (Order) session.getAttribute("order");
			System.out.println(order);
			// 회원/비회원 여부를 확인
			String loginId = (String) session.getAttribute("loginId"); // 회원 아이디
			String phoneNumber = (String) request.getParameter("phoneNumber"); // 비회원 전화번호
			
			boolean checkLogin = false; // 초기 : 비로그인 상태
			if(loginId != null) { checkLogin = true; } // 로그인아이디가 존재할 경우 로그인 상태로 바뀜
			String orderLogin = "비회원 주문";	// 초기 : 비회원 주문
			// 만약 checkLogin = true 일 경우 orderLogin = "회원 주문" 으로 설정
			
			List<Product> cartList = (List<Product>) session.getAttribute("cartList");
			
			// 카트가 null인지 확인
			if (cartList == null) {
				session.setAttribute("cartList", cartList);
				cartList = new ArrayList<>(); // 새로운 카트 생성
			}

			int sum = 0;
	%>
	<!-- 헤더 -->
	<jsp:include page="/layout/header.jsp" />
	
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">주문 정보</h1>
	</div>
	
	<div class="container order mb-5">
		<form action="complete.jsp" method="post">
		<!-- 배송정보 -->
		<div class="ship-box">
			<table class="table ">
				<tbody><tr>
					<%
						if(checkLogin) { orderLogin = "회원 주문"; }
						else		   { orderLogin = "비회원 주문"; }
					%>
					<td>주문 형태 :</td>
					<td><%= orderLogin %></td>
				</tr>
				<tr>
					<td>성 명 :</td>
					<td><%= order.getShipName() %></td>
				</tr>
				<tr>
					<td>우편번호 :</td>
					<td><%= order.getZipCode() %></td>
				</tr>
				<tr>
					<td>주소 :</td>
					<td><%= order.getAddress() %></td>
				</tr>
				<tr>
					<td>배송일 :</td>
					<td><%= order.getDate() %></td>
				</tr>
				<tr>
					<td>전화번호 :</td>
					<td><%= order.getPhone() %></td>
				</tr>
				
				<%
					if(!checkLogin) {
				%>
				<tr>
					<td>주문 비밀번호 : </td>
					<td><input type="password" class="form-control" name="orderPw" required></td>
				</tr>		
				<%
					}
				%>			
			</tbody></table>
		</div>
		
		<!-- 주문목록 -->
			<div class="cart-box">
				<table
					class="table table-striped table-hover table-bordered text-center align-middle">
					<thead>
						<tr class="table-primary">
							<th>상품</th>
							<th>가격</th>
							<th>수량</th>
							<th>소계</th>
							<th>비고</th>
						</tr>
					</thead>
					<tbody>
						<%
						if (cartList == null || cartList.isEmpty()) {
						%>
					
					<tfoot>
						<tr>
							<td colspan="5">추가된 상품이 없습니다.</td>
						</tr>
					</tfoot>
					<%
					} else {
					for (Product product : cartList) {

						sum += product.getQuantity() * product.getUnitPrice();
					%>
					<tr>
						<td><%=product.getName()%></td>
						<td>₩ <%=product.getUnitPrice()%></td>
						<td><%=product.getQuantity()%></td>
						<td>₩ <%=product.getQuantity() * product.getUnitPrice()%></td>
						<td></td>
					</tr>
					<%
					}
					%>
					</tbody>
					<%
					}
					if (!(cartList == null || cartList.isEmpty())) {
					%>
					<tfoot>
						<tr>
							<td></td>
							<td></td>
							<td>총액</td>
							<td id="sum">₩ <%=sum%></td>
							<td></td>
						</tr>
					</tfoot>
					<%
					}
					%>
				</table>
			</div>

			<!-- 버튼 영역 -->
			<div class="d-flex justify-content-between mt-5 mb-5">
				<div class="item">
					<a href="ship.jsp" class="btn btn-lg btn-success">이전</a>
					<!-- 취소 프로세스는 이어서... -->
					<a href="../index.jsp" class="btn btn-lg btn-danger">취소</a>
				</div>
				<div class="item">
					<input type="submit" class="btn btn-lg btn-primary" value="주문완료">
				</div>
			</div>
		</form>
	</div>
       	
       

	<!-- 푸터 -->
	<jsp:include page="/layout/footer.jsp" />
    <jsp:include page="/layout/script.jsp" />
    
    <script src="/static/js/validation.js"></script>
    

</body>
</html>