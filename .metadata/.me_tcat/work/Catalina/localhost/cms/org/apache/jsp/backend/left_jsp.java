package org.apache.jsp.backend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/backend/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>CMS 后台管理工作平台</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-ui-1.8.custom.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tjQuery().ready(function(){\r\n");
      out.write("\t\tjQuery('#navigation').accordion({\r\n");
      out.write("\t\t\theader: '.head',\r\n");
      out.write("\t\t\tevent: 'click',\r\n");
      out.write("\t\t\tfillSpace: true,\r\n");
      out.write("\t\t\tanimated: 'bounceslide'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("#navigation {\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("\twidth:147px;\r\n");
      out.write("}\r\n");
      out.write("#navigation a.head {\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tbackground:url(images/main_34.gif) no-repeat scroll;\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:5px 0 5px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#navigation ul {\r\n");
      out.write("\tborder-width:0px;\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("\ttext-indent:0px;\r\n");
      out.write("}\r\n");
      out.write("#navigation li {\r\n");
      out.write("\tlist-style:none; display:inline;\r\n");
      out.write("}\r\n");
      out.write("#navigation li li a {\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tpadding:3px;\r\n");
      out.write("}\r\n");
      out.write("#navigation li li a:hover {\r\n");
      out.write("\tbackground:url(images/tab_bg.gif) repeat-x;\r\n");
      out.write("\t\tborder:solid 1px #adb9c2;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div  style=\"height:100%;\">\r\n");
      out.write("  <ul id=\"navigation\">\r\n");
      out.write("    <li> <a class=\"head\">文章管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"ArticleServlet\" target=\"rightFrame\">查询文章</a></li>\r\n");
      out.write("        <li><a href=\"ArticleServlet?m=addinput\" target=\"rightFrame\">添加文章</a></li>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">留言管理</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li> <a class=\"head\">频道管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"ChannelServlet\" target=\"rightFrame\">查询频道</a></li>\r\n");
      out.write("        <li><a href=\"channel/add_channel.jsp\" target=\"rightFrame\">添加频道</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li> <a class=\"head\">爬虫管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">设定爬虫规则</a></li>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">爬虫文章管理</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li> <a class=\"head\">会员管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">会员管理</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li> <a class=\"head\">系统管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">修改管理员密码</a></li>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">修改数据库配置</a></li>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">备份网站内容</a></li>\r\n");
      out.write("        <li><a href=\"#\" target=\"rightFrame\">导入网站内容</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
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
}
