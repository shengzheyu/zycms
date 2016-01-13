package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/site/header.jsp");
    _jspx_dependants.add("/site/search.jsp");
    _jspx_dependants.add("/site/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/main.css\">\r\n");
      out.write("<title>欢迎访问领航致远JAVA联盟</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 网站的logo，其它背景，首页横幅广告等等 -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"top\">\r\n");
      out.write("\t<img src=\"images/logo.gif\" class=\"logo\" title=\"领航致远JAVA联盟\">\r\n");
      out.write("\t<div class=\"bg\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 首页的导航条 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=nav", out, false);
      out.write("\r\n");
      out.write("<!-- 首页中间 -->\r\n");
      out.write("<div id=\"mid\">\r\n");
      out.write("\t<!-- 首页左边 -->\r\n");
      out.write("\t<div id=\"left\">\r\n");
      out.write("\t\t<!-- 首页图片及首页文章标题、简介 -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=headline", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- 底下是专题或频道的文章标题列表 -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=channelIndex&channelId=1", out, false);
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=channelIndex&channelId=2", out, false);
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=channelIndex&channelId=3", out, false);
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=channelIndex&channelId=4", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 首页右边 -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div class=\"right\">\r\n");
      out.write("\t\t<div class=\"right_topic_1\">\r\n");
      out.write("\t\t\t本站搜索\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right_topic_2\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right_topic_3\">\r\n");
      out.write("\t\t\t<form action=\"/cms/site/IndexServlet?m=like\" method=\"post\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<input type=\"text\" name=\"purpose\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"搜索\"> <br/>\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"type\" value=\"baidu\">百度\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"type\" value=\"google\">谷歌\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"type\" value=\"local\">本站\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=recommend&pageNo=1&pageSize=6", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=latest&pageNo=1&pageSize=10", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/site/IndexServlet?m=etc", out, false);
      out.write("\r\n");
      out.write("\t<div style=\"clear:both\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 首页下部，版权信息等等 -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"bottom\">\r\n");
      out.write("\t<hr style=\"border:1px dashed gray; height:1px;width:500px\"> \r\n");
      out.write("\t<a href=\"#\">关于本站</a> | \r\n");
      out.write("\t<a href=\"#\">版权声明</a> | \r\n");
      out.write("\t<a href=\"#\">联系方式</a> |\r\n");
      out.write("\t<a href=\"#\">在线留言</a>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t&copy;www.leadfar.org, all rights reserved.\r\n");
      out.write("\t<strong><a href=\"http://www.miibeian.gov.cn\">京ICP备06046340号</a></strong>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
