<%@ page pageEncoding="UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"%>
<div style="width:100%;border:0px;text-align: left;">
			<img style="float:left;width:200px;height:200px;" src="images/earth.jpg">
				<%List<Article> articles=(List<Article>)request.getAttribute("articles");
					for(int i=0;i<4;i++){
				%>	
				<h4><a href="article.jsp?articleId=<%=articles.get(i).getId() %>" title="<%=articles.get(i).getTitle() %>"><%=articles.get(i).getTitle() %></a></h4>
				<p><%=(articles.get(i).getContent().length()>100)?articles.get(i).getContent().substring(0,100):articles.get(i).getContent()%></p>	
				<%} %>
		</div>