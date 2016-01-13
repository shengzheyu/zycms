<%@ page pageEncoding="UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"%>
<%@page import="cn.edu.sjzc.cms.utils.DateConverter"%>
<%		ChannelDao channelDao= new ChannelDao();
		Channel channel=new Channel();
		
		channel=channelDao.query_one(request.getParameter("channelId"));
%>
<div class="index_topic">
			<img src="images/jiantou.gif" style="float:left">
			<span style="margin-top:8px;float:left;FONT-WEIGHT: bold; FONT-SIZE: 12px; COLOR: #852b2b; FONT-FAMILY: 宋体;"><%=channel.getChannelname() %></span>
			
			<a href="topic.jsp?channelId=<%=request.getParameter("channelId")%>"><img src="images/more_gray.gif" style="float:right;border:0px"></a>
			<%List<Article> articles=(List<Article>)request.getAttribute("articles");
      		for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
			Article article = (Article) iterator.next();
      		 %>
			<div class="index_topic_list">
				<img src="images/h_article.gif" >
				<a href="article.jsp?articleId=<%=article.getId() %>" title="<%=article.getTitle()%>"><%=(article.getTitle().length()>8)?article.getTitle().substring(0,8):article.getTitle()%></a>
				<span>[<%=DateConverter.format(article.getPublish_time(),"yyyy-MM-dd")%>]</span>
			</div>
			<%} %>
		</div>
