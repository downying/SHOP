<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Shop</title>
	<jsp:include page="/layout/meta.jsp" /> <jsp:include page="/layout/link.jsp" />
</head>
<body>   
	<% 
		String root = request.getContextPath(); 
		String loginId = (String) session.getAttribute("loginId");

	%>
	
	<jsp:include page="/layout/header.jsp" />
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">회원 정보</h1>
		
	</div>
	<!-- 회원 가입/수정/탈퇴 완료 -->
	<div class="container mb-5" style="text-align: center;">
		<!-- 로그인 성공 -->
		<c:if test="${ param.msg==0 }">
			<h1 style="font-size: 40px;"><%= loginId %>님 환영 합니다.</h1>
			<button class="btn btn-primary btn-lg px-4 gap-3" style="margin-top: 30px; " onclick="moveToIndexPage()">메인 화면</button>		
		</c:if>
		<!-- 회원가입 성공 -->
		<c:if test="${ param.msg==1 }">
			<h1 style="font-size: 40px;">회원가입이 완료되었습니다.</h1>
			<button class="btn btn-primary btn-lg px-4 gap-3" style="margin-top: 30px;" onclick="moveToIndexPage()">메인 화면</button>
		</c:if>
		<!-- 회원가입 성공 -->
		<c:if test="${ param.msg==2 }">
			<h1 style="font-size: 40px;">회원 정보가 수정되었습니다.</h1>
			<button class="btn btn-primary btn-lg px-4 gap-3" style="margin-top: 30px;" onclick="moveToIndexPage()">메인 화면</button>
		</c:if>
		<!-- 회원 탈퇴 -->
		<c:if test="${ param.msg==3 }">
			<h1 style="font-size: 40px;">회원 정보가 삭제되었습니다.</h1>
			<button class="btn btn-primary btn-lg px-4 gap-3" style="margin-top: 30px;" onclick="moveToIndexPage()">메인 화면</button>
		</c:if>
	</div>
	
	<jsp:include page="/layout/footer.jsp" />
	<jsp:include page="/layout/script.jsp" />
	
	<script >
        function moveToIndexPage() {
            var root = "<%= request.getContextPath() %>";
            window.location.href = root + "/index.jsp";
        }
        
    </script>
</body>
</html>







