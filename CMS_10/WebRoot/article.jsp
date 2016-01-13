<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/main.css">
<title>如何在JBPM的Action中访问Spring中的JavaBean</title>
</head>
<body>
<!-- 网站的logo，其它背景，首页横幅广告等等 -->
<%@include file="/site/header.jsp"%>
<!-- 首页的导航条 -->
<jsp:include page="/site/IndexServlet?m=nav"></jsp:include>
<!-- 首页中间 -->
<div id="mid">
	<!-- 首页左边 -->
<jsp:include page="/site/IndexServlet?m=article"></jsp:include>
	<!-- 首页右边 -->
<%@include file="/site/search.jsp" %>
<jsp:include page="/site/IndexServlet?m=latest&pageNo=1&pageSize=10"></jsp:include>
	<div style="clear:both"></div>
</div>
<!-- 首页下部，版权信息等等 -->
<div id="bottom">
	<hr style="border:1px dashed gray; height:1px;width:500px"> 
	<a href="#">关于本站</a> | 
	<a href="#">版权声明</a> | 
	<a href="#">联系方式</a> |
	<a href="#">在线留言</a>
	<br>
	&copy;www.topxp.org, all rights reserved.
	<strong><a href="http://www.miibeian.gov.cn">京ICP备06046340号</a></strong>
</div>
</body>
</html>