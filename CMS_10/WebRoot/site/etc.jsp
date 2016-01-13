<%@ page pageEncoding="UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"%>
<%@page import="cn.edu.sjzc.cms.utils.DateConverter"%>
<div class="right" style="height:340px">
		<div class="right_topic_1">
			技术专题
		</div>
		<% List<Article> articles=(List<Article>)request.getAttribute("articles");%>
		<div class="right_topic_2">
			<a href="topic.jsp?channelId=<%=articles.get(1).getChannel().getId() %>"><img src="images/more_red.gif" style="float:right;margin-top:10px;border:0px"></a>
		</div>
		
			<%
      		for (int i=0;i<10;i++){
      		Article article=articles.get(i);
      		 %>
			<div class="right_topic_3">
				<img src="images/h_article.gif" >
				·<a href="article.jsp?articleId=<%=article.getId() %>" title="<%=article.getTitle()%>"><%=(article.getTitle().length()>8)?article.getTitle().substring(0,8):article.getTitle()%></a>
				<span>[<%=DateConverter.format(article.getPublish_time(),"yyyy-MM-dd")%>]</span>
			</div>
			<%} %>

	</div>