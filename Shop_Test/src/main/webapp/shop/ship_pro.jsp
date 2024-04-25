<%@page import="shop.dao.OrderRepository"%>
<%@page import="javax.swing.plaf.synth.SynthLookAndFeel"%>
<%@page import="shop.dto.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name");
	String shippingDate = request.getParameter("shippingDate");
	String country = request.getParameter("country");
	String zipCode = request.getParameter("zipCode");
	String addressName = request.getParameter("addressName");
	String phone = request.getParameter("phone");
	
	// Ship 객체 생성 및 데이터 설정
	OrderRepository orderDAO = new OrderRepository();
	Order order = new Order();
	order.setShipName(name);
	order.setDate(shippingDate);
	order.setCountry(country);
	order.setZipCode(zipCode);
	order.setAddress(addressName);
	order.setPhone(phone);
	

	session.setAttribute("order", order);

	response.sendRedirect("order.jsp");
%>
