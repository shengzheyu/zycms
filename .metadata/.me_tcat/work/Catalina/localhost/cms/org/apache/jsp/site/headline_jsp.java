package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.edu.sjzc.cms.model.*;
import cn.edu.sjzc.cms.dao.*;

public final class headline_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div style=\"width:100%;border:0px;text-align: left;\">\r\n");
      out.write("\t\t\t<img style=\"float:left;width:200px;height:200px;\" src=\"images/earth.jpg\">\r\n");
      out.write("\t\t\t\t");
List<Article> articles=(List<Article>)request.getAttribute("articles");
					for(int i=0;i<4;i++){
				
      out.write("\t\r\n");
      out.write("\t\t\t\t<h4><a href=\"article.jsp?articleId=");
      out.print(articles.get(i).getId() );
      out.write("\" title=\"");
      out.print(articles.get(i).getTitle() );
      out.write('"');
      out.write('>');
      out.print(articles.get(i).getTitle() );
      out.write("</a></h4>\r\n");
      out.write("\t\t\t\t<p>");
      out.print((articles.get(i).getContent().length()>100)?articles.get(i).getContent().substring(0,100):articles.get(i).getContent());
      out.write("</p>\t\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>");
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
