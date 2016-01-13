<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/main.css">
<title>欢迎访问ZY的JAVA</title>
</head>
<body>
<!-- 网站的logo，其它背景，首页横幅广告等等 -->
<%@include file="/site/header.jsp"%>
<!-- 首页的导航条 -->
<jsp:include page="/site/IndexServlet?m=nav"></jsp:include>
<!-- 首页中间 -->
<div id="mid">
	<!-- 首页左边 -->
	<div id="left">
		<!-- 首页图片及首页文章标题、简介 -->
		<jsp:include page="/site/IndexServlet?m=headline"></jsp:include>
		<!-- 底下是专题或频道的文章标题列表 -->
		<jsp:include page="/site/IndexServlet?m=channelIndex&channelId=1"></jsp:include>
		<jsp:include page="/site/IndexServlet?m=channelIndex&channelId=2"></jsp:include>
		<jsp:include page="/site/IndexServlet?m=channelIndex&channelId=3"></jsp:include>
		<jsp:include page="/site/IndexServlet?m=channelIndex&channelId=4"></jsp:include>
	</div>
	<!-- 首页右边 -->
	<%@include file="/site/search.jsp" %>
	<jsp:include page="/site/IndexServlet?m=recommend&pageNo=1&pageSize=6"></jsp:include>
	<jsp:include page="/site/IndexServlet?m=latest&pageNo=1&pageSize=10"></jsp:include>
	<jsp:include page="/site/IndexServlet?m=etc"></jsp:include>
	<div style="clear:both"></div>
</div>
<!-- 首页下部，版权信息等等 -->
<%@include file="/site/footer.jsp" %>
</body>
</html>