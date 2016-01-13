<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/backend/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>后台管理工作平台</title>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<script type="text/javascript" src="js/admin/login.js"></script>
	<script type="text/javascript" src=" <c:url value='/jquery/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript">
		function reflash(){
			document.getElementById("safecode").src="CheckCodeServlet?m"+Math.random();
		}
	</script>
</head>
<body>
<div id="top"> </div>
<form id="login" action="/AdminServlet" method="post">
  <div id="center">
    <div id="center_left"></div>     
    <div id="center_middle">
    <div class="error">    
        <%=(request.getAttribute("error")==null)?"":request.getAttribute("error")%>
       
      </div> 
      <div class="user">
        <label>用户名：
        <input type="text" name="username" id="username" />
        </label>
      </div>
      <div class="user">
        <label>密　码：
        <input type="password" name="password" id="password" />
        </label>
      </div>
    <!--   <div class="chknumber">
        <label>验证码：
        <input name="checkcode" type="text" id="checkcode" maxlength="4" class="chknumber_input" />
        </label>
        <img src="CheckCodeServlet" id="safecode" onclick="reflash()"/>
      </div> -->
      
       <div class="chknumber">
         <label> 验证码:
         	<input class="input_yzm" type="text" name="verifyCode" id="verifyCode" value="${user.verifyCode }"/>
         </label>
         <img id="vCode" src="<c:url value='/VerifyCodeServlet'/>" onclick="javascript:_hyz()"/>
         <br><label id="verifyCodeError" class="error"></label>
        <!--  <a id="verifyCode" href="javascript:_hyz()">换张图</a> -->
      </div>
      
    </div>
    <div id="center_middle_right"></div>
    <div id="center_submit">
      <div class="button"> <img src="images/dl.gif" width="57" height="20" onclick="form_submit()" > </div>
      <div class="button"> <img src="images/cz.gif" width="57" height="20" onclick="form_reset()"> </div>
    </div>
    <div id="center_right"></div>
  </div>
</form>
<div id="footer">北京XXXX科技有限公司</div>
</body>
</html>

