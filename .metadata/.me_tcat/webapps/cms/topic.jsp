 <%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*,cn.edu.sjzc.cms.model.*,cn.edu.sjzc.cms.dao.*"
    pageEncoding="UTF-8" 
    import="java.util.*"
 %>
 <%
     String channelId=request.getParameter("channelId");
     Channel channel= new Channel();
     ChannelDao channelDao=new ChannelDao();
     channel=channelDao.query_one(channelId);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="style/main.css">
	<title>欢迎访问领航致远JAVA联盟【<%=channel.getChannelname()%>】</title>
</head>
<body>
			<!-- 网站的logo，其它背景，首页横幅广告等等 -->
			<%@include file="/site/header.jsp"%>
			<!-- 首页的导航条 -->
			<jsp:include page="/site/IndexServlet?m=nav"></jsp:include>
			<!-- 首页中间 -->
			<div id="mid">
				<!-- 首页左边 -->
				<jsp:include page="/site/IndexServlet?m=topic_left"></jsp:include>
				<!-- 首页右边 -->
				<%@include file="/site/search.jsp" %>
				<jsp:include page="/site/IndexServlet?m=recommend"></jsp:include>
				<div style="clear:both"></div>
			</div>
			<!-- 首页下部，版权信息等等 -->
			<%@include file="/site/footer.jsp"%>
</table>
</body>
</html>