/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-23 08:26:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1713256031031L));
    _jspx_dependants.put("jar:file:/D:/DOWNY/SHOP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shop_Test/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/DOWNY/SHOP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shop_Test/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/DOWNY/SHOP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shop_Test/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/sql.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/DOWNY/SHOP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shop_Test/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <meta charset=\"UTF-8\">\r\n");
      out.write("   <title>Shop</title>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/meta.jsp", out, false);
      out.write(' ');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/link.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <!-- jQuery CDN 방식으로 포함하기 -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("      function validateForm() {\r\n");
      out.write("         //아이디: 영문자 또는 한글로 시작\r\n");
      out.write("         var id = document.getElementById('id').value;\r\n");
      out.write("         var idCheck = /^[A-Za-z가-힣][A-Za-z가-힣0-9]*$/;\r\n");
      out.write("         if (!idCheck.test(id)) {\r\n");
      out.write("            alert(\"아이디는 영문자 또는 한글로 시작해야합니다.\");\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         // 비밀번호: 영문자, 숫자, 특수문자만 사용하되, 특수문자는 반드시 1개 포함하고 전체글자 6글자 이상\r\n");
      out.write("         var password = document.getElementById(\"pw\").value;\r\n");
      out.write("         var passwordCheck = /^(?=.*[A-Za-z0-9])(?=.*[!@#$%^&*()-_+=])[A-Za-z0-9!@#$%^&*()-_+=]{6,}$/;\r\n");
      out.write("         if (!passwordCheck.test(password)) {\r\n");
      out.write("            alert(\"비밀번호는 영문자,숫자,특수문자로 이루어져야하며, 특수문자가 1개가 반드시 포함되어야 합니다.\");\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         // 비밀번호 확인 : 일치해야함\r\n");
      out.write("         var confirmPassword = document.getElementById(\"pw_confirm\").value;\r\n");
      out.write("         if (password !== confirmPassword) {\r\n");
      out.write("               alert(\"비밀번호와 비밀번호 확인이 일치하지 않습니다.\");\r\n");
      out.write("               return false;\r\n");
      out.write("           }\r\n");
      out.write("         // 이름 : 한글만 입력\r\n");
      out.write("         var name = document.getElementById(\"name\").value;\r\n");
      out.write("         var nameCheck = /^[가-힣]+$/;\r\n");
      out.write("         if (!nameCheck.test(name)) {\r\n");
      out.write("            alert(\"이름은 한글로만 입력되어야합니다.\");\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         return true;\r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>   \r\n");
      out.write("   \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/header.jsp", out, false);
      out.write("\r\n");
      out.write("   <div class=\"px-4 py-5 mt-5 text-center\">\r\n");
      out.write("      <h1 class=\"display-5 fw-bold text-body-emphasis\">회원 가입</h1>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <!-- 회원 가입 영역 -->\r\n");
      out.write("   <div class=\"container shop p-5 mb-5\" >\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <form action=\"join_pro.jsp\" name=\"joinForm\" method=\"post\" onsubmit=\"return validateForm()\" >\r\n");
      out.write("      \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">아이디</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control col-md-8\"  name=\"id\" id=\"id\" placeholder=\"아이디\" required>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">비밀번호</label>\r\n");
      out.write("            <input type=\"password\" class=\"form-control col-md-8\" name=\"pw\" id=\"pw\"placeholder=\"비밀번호\" required>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">비밀번호 확인</label>\r\n");
      out.write("            <input type=\"password\" class=\"form-control col-md-8\" name=\"pw_confirm\" id=\"pw_confirm\" placeholder=\"비밀번호 확인\" required>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">이름</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control col-md-8\" name=\"name\" id=\"name\" placeholder=\"이름\" required>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <div class=\"col-md-4 p-0\">\r\n");
      out.write("               <label class=\"input-group-text\" id=\"\">성별</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-8 d-flex align-items-center\">\r\n");
      out.write("               <div class=\"radio-box d-flex\">\r\n");
      out.write("                  <div class=\"radio-item mx-3\">\r\n");
      out.write("                     <input type=\"radio\" class=\"form-check-input\" name=\"gender\" value=\"여\" id=\"gender-female\"> \r\n");
      out.write("                     <label for=\"gender-female\">여자</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"radio-item mx-3\">\r\n");
      out.write("                     <input type=\"radio\" class=\"form-check-input\" name=\"gender\" value=\"남\" id=\"gender-male\"> \r\n");
      out.write("                     <label for=\"gender-male\">남자</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <div class=\"col-md-4 p-0\">\r\n");
      out.write("               <label class=\"input-group-text\" id=\"\">생일</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-8 p-0\">\r\n");
      out.write("               <div class=\"row d-flex justify-content-between w-100 m-0\">\r\n");
      out.write("                  <div class=\"col-4 col-md-4 px-0\">\r\n");
      out.write("                     <input type=\"text\" class=\"form-control\" name=\"year\" placeholder=\"출생년도 \" size=\"6\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"col-4 col-md-4 pr-0\">\r\n");
      out.write("                     <select name=\"month\" class=\"h-100 form-select\">\r\n");
      out.write("                        <option value=\"01\">1월</option>\r\n");
      out.write("                        <option value=\"02\">2월</option>\r\n");
      out.write("                        <option value=\"03\">3월</option>\r\n");
      out.write("                        <option value=\"04\">4월</option>\r\n");
      out.write("                        <option value=\"05\">5월</option>\r\n");
      out.write("                        <option value=\"06\">6월</option>\r\n");
      out.write("                        <option value=\"07\">7월</option>\r\n");
      out.write("                        <option value=\"08\">8월</option>\r\n");
      out.write("                        <option value=\"09\">9월</option>\r\n");
      out.write("                        <option value=\"10\">10월</option>\r\n");
      out.write("                        <option value=\"11\">11월</option>\r\n");
      out.write("                        <option value=\"12\">12월</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"col-4 col-md-4 px-0\">\r\n");
      out.write("                     <input type=\"text\" class=\"form-control\" name=\"day\" placeholder=\"일자\" size=\"4\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">이메일</label>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row justify-content-between col-md-8 align-items-center p-0\">\r\n");
      out.write("               <div class=\"col-sm-5 col-md-5 px-0\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"email1\" placeholder=\"이메일\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"d-none d-sm-block col-sm-auto col-auto px-0 text-center\">\r\n");
      out.write("                  @\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-sm-6 col-md-6 px-0\">\r\n");
      out.write("                  <select name=\"email2\" class=\"form-select\">\r\n");
      out.write("                     <option value=\"naver.com\">naver.com</option>\r\n");
      out.write("                     <option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("                     <option value=\"kakao.com\">kakao.com</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">전화번호</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control col-md-8\" name=\"phone\" placeholder=\"전화번호\">\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"input-group mb-3 row\">\r\n");
      out.write("            <label class=\"input-group-text col-md-4\" id=\"\">주소</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control col-md-8\" name=\"address\" placeholder=\"주소\">\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div class=\"d-grid gap-2 mt-5 mb-5 d-md-flex justify-content-md-between\">\r\n");
      out.write("            <a href=\"javascript: history.back()\" class=\"btn btn-lg btn-secondary\">취소</a>\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-lg btn-primary\" value=\"가입\" />\r\n");
      out.write("         </div>   \r\n");
      out.write("      </form>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/script.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /user/join.jsp(60,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.msg == 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           <p style=\"color: red;\">회원가입에 실패하였습니다.</p>\r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
