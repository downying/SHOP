<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="shop.dao.ProductRepository" %>
<%@ page import="shop.dto.Product" %>
<%@ page import="java.io.File" %>

<%
    // 파일 업로드 관련 설정
    String realFolder = "D:/DOWNY/upload"; // 파일이 업로드될 실제 폴더 경로
    int maxSize = 5 * 1024 * 1024; // 최대 업로드 파일 크기 (5MB)
    String enType = "UTF-8"; // 인코딩 타입

    try {
        // MultipartRequest 객체를 사용하여 파일 업로드 처리
        MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, enType, new DefaultFileRenamePolicy());

        // 수정할 상품 정보 받아오기
        String productId = multi.getParameter("productId");
        String name = multi.getParameter("name");
        int unitPrice = Integer.parseInt(multi.getParameter("unitPrice"));
        String description = multi.getParameter("description");
        String manufacturer = multi.getParameter("manufacturer");
        String category = multi.getParameter("category");
        long unitsInStock = Long.parseLong(multi.getParameter("unitsInStock"));
        String condition = multi.getParameter("condition");

        // 상품 이미지 업로드 처리
        String file = multi.getFilesystemName("file"); // 업로드된 파일 이름

        // 데이터베이스에서 해당 상품 정보 가져오기
        ProductRepository productDAO = new ProductRepository();
        Product product = productDAO.getProductById(productId);

        if (product != null) {
            // 수정된 상품 정보 설정
            product.setName(name);
            product.setUnitPrice(unitPrice);
            product.setDescription(description);
            product.setManufacturer(manufacturer);
            product.setCategory(category);
            product.setUnitsInStock(unitsInStock);
            product.setCondition(condition);

            // 파일이 업로드된 경우에만 파일 경로 설정
            if (file != null) {
                String filePath = realFolder + File.separator + file;
                product.setFile(filePath);
            }

            // 상품 정보 업데이트
            int result = productDAO.update(product);

            String root = request.getContextPath();

            if (result > 0) {
                response.sendRedirect(root + "/shop/products.jsp");
            } else {
                out.println("<script>alert('상품 수정에 실패했습니다.');history.back();</script>");
            }
        } else {
            out.println("<script>alert('해당 상품을 찾을 수 없습니다.');history.back();</script>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
