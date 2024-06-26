<%@page import="shop.dao.UserRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userDAO" class="shop.dao.UserRepository" />

<%
	String root = request.getContextPath();
	
	String id = request.getParameter("id");
	int result = userDAO.delete(id);
	
	if(result > 0) {
		 // 세션 무효화
	    session.invalidate();
	
	    // 자동 로그인 쿠키와 토큰 쿠키 삭제
	    Cookie[] cookies = request.getCookies();
	    if (cookies != null) {
	        for (Cookie cookie : cookies) {
	            if (cookie.getName().equals("rememberMe") || cookie.getName().equals("token")) {
	                cookie.setMaxAge(0); 
	                cookie.setPath("/"); 
	                response.addCookie(cookie);
	            }
	        }
	    }
	
	 	// 삭제 성공 -> complete.jsp 이동
	    response.sendRedirect( root + "/user/complete.jsp?msg=3" );
	}
	else {
		
		// 삭제 실패
		out.println("<script>alert('삭제에 실패했습니다.'); history.back();</script>");
	}
%>
