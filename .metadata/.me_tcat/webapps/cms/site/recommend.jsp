<%@ page pageEncoding="UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"%>
<%@page import="cn.edu.sjzc.cms.utils.DateConverter"%>
<div class="right" style="height:200px">
		<div class="right_topic_1">
			推荐阅读
		</div>
		<div class="right_topic_2">
			<a href="#"><img src="images/more_red.gif" style="float:right;margin-top:10px;border:0px"></a>
		</div>
		
			<%List<Article> articles=(List<Article>)request.getAttribute("articles");
      		for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
			Article article = (Article) iterator.next();
      		 %>
      		 <div class="right_topic_3">
				<img src="images/h_article.gif" >
				·<a href="article.jsp?articleId=<%=article.getId() %>" title="<%=article.getTitle()%>"><%=(article.getTitle().length()>8)?article.getTitle().substring(0,8):article.getTitle()%></a>
				<span>[<%=DateConverter.format(article.getPublish_time(),"yyyy-MM-dd")%>]</span>
			</div>
			<%} %>
	</div>
