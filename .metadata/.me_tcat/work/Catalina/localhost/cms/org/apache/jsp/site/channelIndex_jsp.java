package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.edu.sjzc.cms.model.*;
import cn.edu.sjzc.cms.dao.*;
import cn.edu.sjzc.cms.utils.DateConverter;

public final class channelIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		ChannelDao channelDao= new ChannelDao();
		Channel channel=new Channel();
		
		channel=channelDao.query_one(request.getParameter("channelId"));

      out.write("\r\n");
      out.write("<div class=\"index_topic\">\r\n");
      out.write("\t\t\t<img src=\"images/jiantou.gif\" style=\"float:left\">\r\n");
      out.write("\t\t\t<span style=\"margin-top:8px;float:left;FONT-WEIGHT: bold; FONT-SIZE: 12px; COLOR: #852b2b; FONT-FAMILY: 宋体;\">");
      out.print(channel.getChannelname() );
      out.write("</span>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"topic.jsp?channelId=");
      out.print(request.getParameter("channelId"));
      out.write("\"><img src=\"images/more_gray.gif\" style=\"float:right;border:0px\"></a>\r\n");
      out.write("\t\t\t");
List<Article> articles=(List<Article>)request.getAttribute("articles");
      		for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
			Article article = (Article) iterator.next();
      		 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"index_topic_list\">\r\n");
      out.write("\t\t\t\t<img src=\"images/h_article.gif\" >\r\n");
      out.write("\t\t\t\t<a href=\"article.jsp?articleId=");
      out.print(article.getId() );
      out.write("\" title=\"");
      out.print(article.getTitle());
      out.write('"');
      out.write('>');
      out.print((article.getTitle().length()>8)?article.getTitle().substring(0,8):article.getTitle());
      out.write("</a>\r\n");
      out.write("\t\t\t\t<span>[");
      out.print(DateConverter.format(article.getPublish_time(),"yyyy-MM-dd"));
      out.write("]</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
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
