package org.apache.jsp.backend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write(" \r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/backend/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>后台管理工作平台</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/admin/login.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\" ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction reflash(){\r\n");
      out.write("\t\t\tdocument.getElementById(\"safecode\").src=\"CheckCodeServlet?m\"+Math.random();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"top\"> </div>\r\n");
      out.write("<form id=\"login\" action=\"AdminServlet\" method=\"post\">\r\n");
      out.write("  <div id=\"center\">\r\n");
      out.write("    <div id=\"center_left\"></div>     \r\n");
      out.write("    <div id=\"center_middle\">\r\n");
      out.write("    <div class=\"error\">    \r\n");
      out.write("        ");
      out.print((request.getAttribute("error")==null)?"":request.getAttribute("error"));
      out.write("\r\n");
      out.write("       \r\n");
      out.write("      </div> \r\n");
      out.write("      <div class=\"user\">\r\n");
      out.write("        <label>用户名：\r\n");
      out.write("        <input type=\"text\" name=\"username\" id=\"username\" />\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"user\">\r\n");
      out.write("        <label>密　码：\r\n");
      out.write("        <input type=\"password\" name=\"password\" id=\"password\" />\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("    <!--   <div class=\"chknumber\">\r\n");
      out.write("        <label>验证码：\r\n");
      out.write("        <input name=\"checkcode\" type=\"text\" id=\"checkcode\" maxlength=\"4\" class=\"chknumber_input\" />\r\n");
      out.write("        </label>\r\n");
      out.write("        <img src=\"CheckCodeServlet\" id=\"safecode\" onclick=\"reflash()\"/>\r\n");
      out.write("      </div> -->\r\n");
      out.write("      \r\n");
      out.write("       <div class=\"chknumber\">\r\n");
      out.write("         <label> 验证码:\r\n");
      out.write("         \t<input class=\"input_yzm\" type=\"text\" name=\"verifyCode\" id=\"verifyCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.verifyCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("         </label>\r\n");
      out.write("         <img id=\"vCode\" src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" onclick=\"javascript:_hyz()\"/>\r\n");
      out.write("         <br><label id=\"verifyCodeError\" class=\"error\"></label>\r\n");
      out.write("        <!--  <a id=\"verifyCode\" href=\"javascript:_hyz()\">换张图</a> -->\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"center_middle_right\"></div>\r\n");
      out.write("    <div id=\"center_submit\">\r\n");
      out.write("      <div class=\"button\"> <img src=\"images/dl.gif\" width=\"57\" height=\"20\" onclick=\"form_submit()\" > </div>\r\n");
      out.write("      <div class=\"button\"> <img src=\"images/cz.gif\" width=\"57\" height=\"20\" onclick=\"form_reset()\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"center_right\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"footer\">北京XXXX科技有限公司</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /backend/login.jsp(16,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/jquery/jquery-1.5.1.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /backend/login.jsp(54,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/VerifyCodeServlet");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
