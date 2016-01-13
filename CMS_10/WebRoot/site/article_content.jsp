<%@ page pageEncoding="UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"%>
<%Article article =(Article)request.getAttribute("article"); %>
	<div id="left" style="text-align:left">
		首页 -&gt; <%=article.getChannel().getChannelname() %> - <%=article.getTitle()%>
		<hr>
<!-- 文章标题及简介 -->
<div class="h2title"><%=article.getTitle() %></div>
<div CLASS="atime">
<%PageModel pm=(PageModel)request.getAttribute("pm"); %>
点击量：<%=article.getClick_score() %>
|留言数：<%=pm.getAllRecond() %>
|作者：<%=article.getAuthor() %>
| 来源：<%=article.getSource() %>
| <%=article.getPublish_time() %>
</div>
<p>
<%=article.getContent() %>
</p>
<hr>
<%
	if(pm.getAllRecond()!=0){
		List<Massage> massages=(List<Massage>)request.getAttribute("massages");%>
		<%for(int i=0;i<massages.size();i++){%>
			用户：<%=massages.get(i).getPublisher() %>
		<font color="red">留言:<%=massages.get(i).getContent() %></font>
			<br>
		<%}%>

	 <%if(pm.getTotalPage()>1){
	 for(int i=1;i<pm.getTotalPage()+1;i++){ %>
	[<a href="article.jsp?articleId=<%=article.getId()%>&pageNo=<%=i%>"><%=i%></a>]
	<% }
	}%>
  <%}%>
<hr/>
<form action="/cms/site/MassageServlet?m=add" method="post">
	<fieldset>
			<legend>留言板</legend>
				<input type="hidden" name="publisher" value="***">
				<input type="hidden" name="articleId" value=<%=article.getId()%>>
				<textarea rows="4" cols="65" name="content" id="content"></textarea>
				<br/>
			    <input name="submit" type="submit" class="buttom" value="提交" />
			    <input name="reset" type="reset" class="buttom" value="重置" />
	</fieldset>
</form>
</div>