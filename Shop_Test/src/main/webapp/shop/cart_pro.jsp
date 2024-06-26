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
    
    // 요청된 상품 ID에 해당하는 상품 정보를 데이터베이스에서 가져옴
    Product product = productDAO.getProductById(productId);
   
    List<Product> cartList = (List<Product>) session.getAttribute("cartList");

	// 카트가 null인지 확인
	if (cartList == null) {
		session.setAttribute("cartList", cartList);
		cartList = new ArrayList<>(); // 새로운 카트 생성
	}
	
   // 기존에 장바구니에 같은 상품이 있는지 확인
    boolean duplicated = false;
    for (Product item : cartList) {
        // 이미 장바구니에 있는 상품인 경우 수량을 증가시키고 duplicated를 true로 설정
    	if (item.getProductId() != null && item.getProductId().equals(productId)) {
    	    // 이미 장바구니에 있는 상품인 경우 수량을 증가시키고 duplicated를 true로 설정
    	    item.setQuantity(item.getQuantity() + 1);
    	    duplicated = true;
    	    break;
    	}

    }
   
    // 장바구니에 새로운 상품을 추가하는 경우
    if (!duplicated) {
        product.setQuantity(1); // 수량을 1로 설정
        cartList.add(product); // 장바구니에 상품 추가
    }

    // 업데이트된 장바구니 목록을 세션에 저장
    session.setAttribute("cartList", cartList);
    
    // 상품 목록 페이지로 이동
    response.sendRedirect(request.getContextPath() + "/shop/products.jsp");
%>
