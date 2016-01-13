package org.apache.jsp.backend.channel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.edu.sjzc.cms.model.*;

public final class list_005fchannel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>CMS 后台管理工作平台</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 3px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 3px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tcolor: #e1e2e3;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE6 {color: #000000; font-size: 12; }\r\n");
      out.write(".STYLE10 {color: #000000; font-size: 12px; }\r\n");
      out.write(".STYLE19 {\r\n");
      out.write("\tcolor: #344b50;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE21 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #3b6375;\r\n");
      out.write("}\r\n");
      out.write(".STYLE22 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #295568;\r\n");
      out.write("}\r\n");
      out.write("A:active,A:visited,A:link {\r\n");
      out.write("\tCOLOR: #0629FD;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A:hover {\r\n");
      out.write("\tCOLOR: #FF6600;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.relatelink:active,A.relatelink:visited,A.relatelink:link { \r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.relatelink:hover {\r\n");
      out.write("\tCOLOR: #FF6600;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #003366;\r\n");
      out.write("\theight:24px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE1 a{\r\n");
      out.write("\tCOLOR: white;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 A:active,.STYLE1 A:visited,.STYLE1 A:link {\r\n");
      out.write("\tCOLOR: white;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 a:hover{\r\n");
      out.write("\tCOLOR: red;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction All(){\r\n");
      out.write("\t\t\tvar ids = document.getElementsByName(\"ids\");\r\n");
      out.write("\t\t\tfor(var i=0;i<ids.length;i++){\r\n");
      out.write("\t\t\t\tids[i].checked=document.getElementById(\"checkbox\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction delBatch(){\r\n");
      out.write("\t\t\talert(\"确定删除吗？\");\r\n");
      out.write("\t\t\twindow.document.getElementById(\"f\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction pageSize(ps){\r\n");
      out.write("\t\t\twindow.location.href=\"ChannelServlet?m=list&pageSize=\"+ps;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\" bgcolor=\"#353c44\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"6%\" height=\"19\" valign=\"bottom\"><div align=\"center\"><img src=\"images/tb.gif\" width=\"14\" height=\"14\" /></div></td>\r\n");
      out.write("                <td width=\"94%\" valign=\"bottom\"><span class=\"STYLE1\"> 网站文章信息列表</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td><div align=\"right\"><span class=\"STYLE1\">\r\n");
      out.write("             &nbsp;&nbsp;<img src=\"images/add.gif\" width=\"10\" height=\"10\" /> <a href=\"#\">添加</a>   \r\n");
      out.write("             &nbsp;&nbsp;<img src=\"images/edit.gif\" width=\"10\" height=\"10\" /> <a href=\"#\">发布</a>\r\n");
      out.write("             &nbsp; <img src=\"images/del.gif\" width=\"10\" height=\"10\" /> <a href=\"javascript:delBatch()\">删除</a>    &nbsp;&nbsp;   &nbsp;\r\n");
      out.write("             </span><span class=\"STYLE1\"> &nbsp;</span></div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("    <form action=\"ChannelServlet?m=delBatch\" id=\"f\" method=\"post\">\r\n");
      out.write("    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#a8c7ce\">\r\n");
      out.write("      <tr>\r\n");
      out.write("      <td width=\"4%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE10\"><div align=\"center\">\r\n");
      out.write("          <input type=\"checkbox\" name=\"checkbox\" id=\"checkbox\" onclick=\"All()\"/>\r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td width=\"20\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">频道代码</span></div></td>\r\n");
      out.write("        <td width=\"50\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">频道名称</span></div></td>\r\n");
      out.write("        <td width=\"100\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">频道内容</span></div></td>\r\n");
      out.write("        <td width=\"30\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">基本操作</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      ");
List<Channel> channels=(List<Channel>)request.getAttribute("channels");
      	for (Iterator iterator = channels.iterator(); iterator.hasNext();) {
			Channel channel = (Channel) iterator.next();
       
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("      <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("          <input type=\"checkbox\" name=\"ids\" id=\"checkbox2\" value=\"");
      out.print(channel.getId());
      out.write("\" />\r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\" align=\"center\"><a href=\"ChannelServlet?m=show&amp;id=");
      out.print(channel.getId() );
      out.write("\" title=\"点击查看和编辑文章\">");
      out.print(channel.getId());
      out.write("</a><br></td>\r\n");
      out.write("        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\">");
      out.print(channel.getChannelname() );
      out.write("</div></td>\r\n");
      out.write("        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\">");
      out.print(channel.getDescription() );
      out.write("</div></td>\r\n");
      out.write("        <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\" class=\"STYLE21\">\r\n");
      out.write("         | \r\n");
      out.write("        <a href=\"ChannelServlet?m=del&id=");
      out.print(channel.getId());
      out.write("\" title=\"点击删除文章\">删除</a> |\r\n");
      out.write("        <a href=\"ChannelServlet?m=list_one&id=");
      out.print(channel.getId());
      out.write("\" title=\"点击编辑文章\">编辑</a>\r\n");
      out.write("           | \r\n");
      out.write("        </div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    ");
} 
      out.write("  \r\n");
      out.write("      \r\n");
      out.write("    </table>\r\n");
      out.write("    </form>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\">\r\n");
      out.write("    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("      ");
PageModel pm=(PageModel)request.getAttribute("pm");
      out.write("\r\n");
      out.write("        <td width=\"33%\"><div align=\"left\"><span class=\"STYLE22\">&nbsp;&nbsp;&nbsp;&nbsp;共有<strong>");
      out.print(pm.getAllRecond());
      out.write("</strong> 条记录，当前第<strong>");
      out.print(pm.getPageNo() );
      out.write("</strong> 页，共 <strong>");
      out.print(pm.getTotalPage() );
      out.write("</strong> 页</span></div></td>\r\n");
      out.write("        <td width=\"67%\" align=right vAlign=\"center\" noWrap>\r\n");
      out.write("\t\t\t\t<a href=\"ChannelServlet?m=list&pageNo=1\">首页</a>\r\n");
      out.write("\t\t\t\t<a href=\"ChannelServlet?m=list&pageNo=");
      out.print((pm.getPageNo()-1)<1?1:(pm.getPageNo()-1));
      out.write("\">上页</a>\r\n");
      out.write("\t\t\t\t<font color=\"red\">\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t<a href=\"ChannelServlet?m=list&pageNo=");
      out.print((pm.getPageNo()+1)>pm.getAllRecond()?pm.getAllRecond():(pm.getPageNo()+1));
      out.write("\">下页</a>\r\n");
      out.write("\t\t\t\t<a href=\"ChannelServlet?m=list&pageNo=");
      out.print(pm.getTotalPage());
      out.write("\">尾页</a>\r\n");
      out.write("\t\t\t\t<select name=\"pageSize\" onchange=\"pageSize(this.value)\"  >\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"\"\r\n");
      out.write("\t>记录数</option>\r\n");
      out.write("\t<option value=\"5\"\r\n");
      out.write("\t>5</option>\r\n");
      out.write("\t<option value=\"10\"\r\n");
      out.write("\t \r\n");
      out.write("\t>10</option>\r\n");
      out.write("\t\r\n");
      out.write("\t<option value=\"15\"\r\n");
      out.write("\t \r\n");
      out.write("\t>15</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"20\"\r\n");
      out.write("\t \r\n");
      out.write("\t>20</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"25\"\r\n");
      out.write("\t \r\n");
      out.write("\t>25</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"30\"\r\n");
      out.write("\t \r\n");
      out.write("\t>30</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"35\"\r\n");
      out.write("\t \r\n");
      out.write("\t>35</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"40\"\r\n");
      out.write("\t \r\n");
      out.write("\t>40</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"45\"\r\n");
      out.write("\t \r\n");
      out.write("\t>45</option>\r\n");
      out.write("\r\n");
      out.write("\t<option value=\"50\"\r\n");
      out.write("\t \r\n");
      out.write("\t>50</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
