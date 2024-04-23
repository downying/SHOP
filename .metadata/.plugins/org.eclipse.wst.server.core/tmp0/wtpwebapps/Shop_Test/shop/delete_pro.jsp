<%@page import="java.security.ProtectionDomain"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="shop.dto.Product"%>
<%@page import="shop.dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 상품 ID를 요청 파라미터에서 가져옴
    String productId  = request.getParameter("id");
    
    // ProductRepository 인스턴스 생성
    ProductRepository productDAO = new ProductRepository();
    
	int result = productDAO.delete(productId);

	if (result > 0) {
		response.sendRedirect("editProducts.jsp");
	} else {
		out.println("<script>alert('제품 삭제 중 에러가 발생하였습니다.'); history.back();</script>");
	}
%>
	