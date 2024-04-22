/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-22 05:58:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;
import shop.dao.ProductRepository;
import shop.dto.Product;
import java.io.File;

public final class add_005fpro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(5);
    _jspx_imports_classes.add("shop.dto.Product");
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("shop.dao.ProductRepository");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
    _jspx_imports_classes.add("java.io.File");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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
            ProductRepository productRepository = new ProductRepository();
            int result = productRepository.insert(product);
            
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

      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
