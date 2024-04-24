<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="shop.dao.ProductRepository" %>
<%@ page import="shop.dto.Product" %>
<%@ page import="java.io.File" %>

<%
	//파일 업로드 관련 설정
	String realFolder = "D:/DOWNY/upload"; // 파일이 업로드될 실제 폴더 경로
	int maxSize = 5 * 1024 * 1024; // 최대 업로드 파일 크기 (5MB)
	String enType = "UTF-8"; // 인코딩 타입


   try {
       // MultipartRequest 객체를 사용하여 파일 업로드 처리
       MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, enType, new DefaultFileRenamePolicy());
       
       	// 상품 정보 받아오기
        String file = multi.getFilesystemName("file"); // 업로드된 파일 이름
        
        String productId = multi.getParameter("productId");
        String name = multi.getParameter("name");
        int unitPrice = Integer.parseInt(multi.getParameter("unitPrice"));
        String description = multi.getParameter("description");
        String manufacturer = multi.getParameter("manufacturer");
        String category = multi.getParameter("category");
        long unitsInStock = Long.parseLong(multi.getParameter("unitsInStock"));
        String condition = multi.getParameter("condition");
        
        // 업로드된 파일이 있는지 확인
        if (file != null) {
            // 파일 경로 설정
            
            Product product = new Product();
            product.setProductId(productId);
            product.setName(name);
            product.setUnitPrice(unitPrice);
            product.setDescription(description);
            product.setManufacturer(manufacturer);
            product.setCategory(category);
            product.setUnitsInStock(unitsInStock);
            product.setCondition(condition);
            
            String filePath = realFolder + File.separator + file;
            product.setFile(filePath); // 파일 경로 설정
            
            // 데이터베이스에 상품 등록
            ProductRepository productDAO = new ProductRepository();
            int result = productDAO.insert(product);
            
            String root = request.getContextPath();
            
            if (result > 0) {
                response.sendRedirect(root + "/shop/products.jsp");
            } else {
            	 out.println("<script>alert('상품 등록에 실패했습니다.');history.back();</script>");
            }
        } else {
            // 파일 업로드 실패 시 처리
        	out.println("<script>alert('상품 등록에 실패했습니다. (파일 업로드 실패)');history.back();</script>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
