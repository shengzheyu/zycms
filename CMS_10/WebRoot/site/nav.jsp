<%@ page import="cn.edu.sjzc.cms.model.*,java.util.*" pageEncoding="UTF-8"%>
<div id="nav">
	<div id="menu">
		<a href="index.jsp">首页</a>
		<%List<Channel> channels=(List<Channel>)request.getAttribute("channels"); 
			for (Iterator iterator = channels.iterator(); iterator.hasNext();) {
			Channel channel = (Channel) iterator.next();
       %>
		<a href="topic.jsp?channelId=<%=channel.getId()%>"><%=channel.getChannelname() %></a>
		<%} %>
	</div>
</div>