<%@page import="java.util.ArrayList"%>
<%@page import="shop.dto.Product"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String root = request.getContextPath();

    // 상품 개별 또는 전체 삭제를 위한 파라미터 받기
    String productId = request.getParameter("id");
    String deleteAll = request.getParameter("deleteAll");

    // 세션에서 장바구니 목록을 가져옴
    List<Product> cartList = (List<Product>) session.getAttribute("cartList");


    // 개별 상품 삭제 또는 전체 상품 삭제 처리
    if (productId != null) {
        // 개별 상품 삭제일 경우
        for (Product item : cartList) {
            // 장바구니에서 해당 상품을 찾아 삭제
            if (item.getProductId().equals(productId)) {
                cartList.remove(item);
                break;
            }
        }
    } else if ("true".equals(deleteAll)) {
        // 전체 상품 삭제일 경우
        cartList.clear();
    }

    // 변경된 장바구니 정보를 세션에 다시 저장
    session.setAttribute("cartList", cartList);

    // 장바구니 페이지로 리다이렉트
    response.sendRedirect(root + "/shop/cart.jsp");
%>
