<%@ page pageEncoding="UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"%>
<%@page import="cn.edu.sjzc.cms.utils.DateConverter"%>
<div id="mid">
	<!-- 首页左边 -->
	<%Channel channel=(Channel)request.getAttribute("channel");%>
	<div id="left" style="text-align:left">
		首页 -&gt; <%=channel.getChannelname() %>
		<hr>

<!-- 文章标题及简介 -->
	<%List<Article> articles=(List<Article>)request.getAttribute("articles");
				for(int i=0;i<articles.size();i++){
				Article article=articles.get(i);
	%>	
<div class="h2title"><%=article.getTitle()%></div>
<div CLASS="atime">
作者：<%=article.getAuthor()%>
| 来源：<%=article.getSource()%>
| <%=article.getPublish_time()%>
</div>
<%=(article.getContent().length()>100)?article.getContent().substring(0,100):article.getContent()%>
<br/>
<a href="article.jsp?articleId=<%=article.getId() %>">【阅读全文】</a>	
	<%} %>
<%PageModel pm=(PageModel)request.getAttribute("pm");%>
<hr>
共<%=pm.getTotalPage() %>页，第<%=pm.getPageNo() %>页&nbsp;&nbsp;&nbsp;<%for(int i=1;i<(pm.getTotalPage()>5?6:pm.getTotalPage()+1);i++){ %>
[<a href="topic.jsp?channelId=<%=channel.getId()%>&pageNo=<%=i%>"><%=i%></a>]
<%} %>
</div>

