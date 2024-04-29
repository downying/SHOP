/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-29 06:26:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shop.dao.ProductIORepository;
import java.util.ArrayList;
import shop.dto.Product;
import java.util.List;
import shop.dao.OrderRepository;
import shop.dto.Order;

public final class complete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("shop.dto.Product");
    _jspx_imports_classes.add("shop.dao.OrderRepository");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("shop.dao.ProductIORepository");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("shop.dto.Order");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>주문 완료</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/meta.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/link.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    // 세션에서 장바구니 목록을 가져옵니다.
    List<Product> cartList = (List<Product>) session.getAttribute("cartList");

    // 세션에서 사용자 정보 가져오기 
    // 회원
    String userId = (String) session.getAttribute("loginId");
    // 비회원
    String orderPw = request.getParameter("orderPw");
    String phone = request.getParameter("phone");
    

    // 주문 정보 받아오기
    Order order = (Order) session.getAttribute("order");
	order.setOrderPw(orderPw);
    
    OrderRepository orderDAO = new OrderRepository();

    // 주문을 디비에 저장
    int result = orderDAO.insert(order);

    // 성공적으로 주문이 처리 됐을 경우 추가 작업 수행
    int lastOrderId = orderDAO.lastOrderNo();
    if (result > 0) {
        // 주문이 성공적으로 처리되었을 때, 해당 주문의 주문번호를 가져옵니다.

        ProductIORepository productIoDAO = new ProductIORepository();

        // 장바구니에 있는 각 상품에 대해 주문 내역을 생성하고 데이터베이스에 저장합니다.
        for (Product cart : cartList) {
            // 주문한 상품 수량에 맞게 입출고량(amount)를 설정합니다.
            int amount = cart.getQuantity();

            // 상품 입출고 테이블에 출고 데이터를 추가합니다.
            Product product = new Product();
            product.setProductId(cart.getProductId());
            product.setOrderNo(lastOrderId); // 최근 주문번호를 설정합니다.
            product.setQuantity(amount);
            product.setType("OUT"); // 출고

            // 회원/비회원 여부에 따라 사용자 정보를 설정합니다.
            if (userId != null) {
                product.setUserId(userId);
            } else {
                product.setUserId(phone);
            }

            // 상품 입출고 테이블에 데이터를 추가합니다.
            int add = productIoDAO.insert(product);

            // 오류 처리
            if (add < 0) {
                // 오류 발생 시 처리
                break;
            }
        }
    }

    // 주문 완료 후 장바구니 비우기
    if (result > 0) {
        cartList.clear();
        session.setAttribute("cartList", cartList); // 변경된 장바구니를 다시 세션에 저장
        request.setAttribute("order_no", lastOrderId); // 주문 번호를 request에 설정
    }

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"px-4 py-5 my-5 text-center\">\r\n");
      out.write("    <h1 class=\"display-5 fw-bold text-body-emphasis\">주문 완료</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 주문 완료 확인 -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container order mb-5 p-5\">\r\n");
      out.write("\r\n");
      out.write("    <h2 class=\"text-center\">주문이 완료되었습니다.</h2>\r\n");
      out.write("    <!-- 주문정보 -->\r\n");
      out.write("    <div class=\"ship-box\">\r\n");
      out.write("        <table class=\"table \">\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>주문번호 :</td>\r\n");
      out.write("                    <td>");
      out.print( request.getAttribute("order_no") );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>배송지 :</td>\r\n");
      out.write("                    <td>");
      out.print( order.getAddress() );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"btn-box d-flex justify-content-center\">\r\n");
      out.write("            <a href=\"../user/order.jsp\" class=\"btn btn-primary btn-lg px-4 gap-3\">주문내역</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 푸터 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"/static/js/validation.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
