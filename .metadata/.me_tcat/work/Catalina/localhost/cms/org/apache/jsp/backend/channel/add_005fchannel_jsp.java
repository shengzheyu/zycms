package org.apache.jsp.backend.channel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.edu.sjzc.cms.utils.*;

public final class add_005fchannel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");

String path = request.getContextPath(); // /cms
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/backend/";

      out.write("\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<title>My JSP 'add_input.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t<!--新增的用于控制表单的样式 -->\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\tfont-size:12px;\r\n");
      out.write("\t\tcolor:#666666;\r\n");
      out.write("\t\tbackground:#fff;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t* {\r\n");
      out.write("\t\tmargin:0;\r\n");
      out.write("\t\tpadding:0;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ta {\r\n");
      out.write("\t\tcolor:#1E7ACE;\r\n");
      out.write("\t\ttext-decoration:none;\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ta:hover {\r\n");
      out.write("\t\tcolor:#000;\r\n");
      out.write("\t\ttext-decoration:underline;\r\n");
      out.write("\t}\r\n");
      out.write("\th3 {\r\n");
      out.write("\t\tfont-size:14px;\r\n");
      out.write("\t\tfont-weight:bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tpre,p {\r\n");
      out.write("\t\tcolor:#1E7ACE;\r\n");
      out.write("\t\tmargin:4px;\r\n");
      out.write("\t}\r\n");
      out.write("\tinput, select,textarea {\r\n");
      out.write("\t\tpadding:1px;\r\n");
      out.write("\t\tmargin:2px;\r\n");
      out.write("\t\tfont-size:12px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.buttom{\r\n");
      out.write("\t\tpadding:1px 10px;\r\n");
      out.write("\t\tfont-size:12px;\r\n");
      out.write("\t\tborder:1px #1E7ACE solid;\r\n");
      out.write("\t\tbackground:#D0F0FF;\r\n");
      out.write("\t}\r\n");
      out.write("\t#formwrapper {\r\n");
      out.write("\t\twidth:95%;\r\n");
      out.write("\t\tmargin:15px auto;\r\n");
      out.write("\t\tpadding:20px;\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfieldset {\r\n");
      out.write("\t\tpadding:10px;\r\n");
      out.write("\t\tmargin-top:5px;\r\n");
      out.write("\t\tborder:1px solid #1E7ACE;\r\n");
      out.write("\t\tbackground:#fff;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfieldset legend {\r\n");
      out.write("\t\tcolor:#1E7ACE;\r\n");
      out.write("\t\tfont-weight:bold;\r\n");
      out.write("\t\tbackground:#fff;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfieldset label {\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\twidth:120px;\r\n");
      out.write("\t\ttext-align:right;\r\n");
      out.write("\t\tpadding:4px;\r\n");
      out.write("\t\tmargin:1px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfieldset div {\r\n");
      out.write("\t\tclear:left;\r\n");
      out.write("\t\tmargin-bottom:2px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t.enter{ text-align:center;}\r\n");
      out.write("\t.clear {\r\n");
      out.write("\t\tclear:both;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <div id=\"formwrapper\">\r\n");
      out.write("\t\t<h3>请添加频道</h3>\r\n");
      out.write("   \t\t<form action=\"ChannelServlet?m=add\" method=\"post\"  >\r\n");
      out.write("\t    <fieldset>\r\n");
      out.write("\t\t\t<legend>频道基本信息</legend>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"id\">频道代码:</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" id=\"id\" value=\"\" size=\"60\" maxlength=\"20\" /> \r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"channelname\">频道名称:</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"channelname\" id=\"channelname\" value=\"\" size=\"60\" maxlength=\"50\" /> \r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for=\"description\">频道描述:</label>\r\n");
      out.write("\t\t\t\t<textarea rows=\"10\" cols=\"100\" name=\"description\" id=\"description\"></textarea>\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"enter\">\r\n");
      out.write("\t\t\t    <input name=\"submit\" type=\"submit\" class=\"buttom\" value=\"提交\" />\r\n");
      out.write("\t\t\t    <input name=\"reset\" type=\"reset\" class=\"buttom\" value=\"重置\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write(" \t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
