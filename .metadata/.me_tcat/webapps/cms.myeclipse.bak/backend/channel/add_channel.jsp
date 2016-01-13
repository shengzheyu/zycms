<%@ page language="java" import="java.util.*,cn.edu.sjzc.cms.utils.*" pageEncoding="UTF-8"%>


<html>
<head>
    
<%
String path = request.getContextPath(); // /cms
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/backend/";
%>
<base href="<%=basePath%>">
<title>My JSP 'add_input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<style type="text/css">
	<!--新增的用于控制表单的样式 -->
	body {
		font-family: Arial, Helvetica, sans-serif;
		font-size:12px;
		color:#666666;
		background:#fff;
		text-align:center;
	}
	
	* {
		margin:0;
		padding:0;
	}
	
	a {
		color:#1E7ACE;
		text-decoration:none;	
	}
	
	a:hover {
		color:#000;
		text-decoration:underline;
	}
	h3 {
		font-size:14px;
		font-weight:bold;
	}
	
	pre,p {
		color:#1E7ACE;
		margin:4px;
	}
	input, select,textarea {
		padding:1px;
		margin:2px;
		font-size:12px;
	}
	.buttom{
		padding:1px 10px;
		font-size:12px;
		border:1px #1E7ACE solid;
		background:#D0F0FF;
	}
	#formwrapper {
		width:95%;
		margin:15px auto;
		padding:20px;
		text-align:left;
	}
	
	fieldset {
		padding:10px;
		margin-top:5px;
		border:1px solid #1E7ACE;
		background:#fff;
	}
	
	fieldset legend {
		color:#1E7ACE;
		font-weight:bold;
		background:#fff;
	}
	
	fieldset label {
		float:left;
		width:120px;
		text-align:right;
		padding:4px;
		margin:1px;
	}
	
	fieldset div {
		clear:left;
		margin-bottom:2px;
	}
	
	
	
	.enter{ text-align:center;}
	.clear {
		clear:both;
	}
	</style>
    
  </head>
  
  <body>
  <div id="formwrapper">
		<h3>请添加频道</h3>
   		<form action="ChannelServlet?m=add" method="post"  >
	    <fieldset>
			<legend>频道基本信息</legend>
			<div>
				<label for="id">频道代码:</label>
				<input type="text" name="id" id="id" value="" size="60" maxlength="20" /> 
				<br/>
			</div>
			<div>
				<label for="channelname">频道名称:</label>
				<input type="text" name="channelname" id="channelname" value="" size="60" maxlength="50" /> 
				<br/>
			</div>
			<div>
				<label for="description">频道描述:</label>
				<textarea rows="10" cols="100" name="description" id="description"></textarea>
				<br/>
			</div>
			<div class="enter">
			    <input name="submit" type="submit" class="buttom" value="提交" />
			    <input name="reset" type="reset" class="buttom" value="重置" />
			</div>
		</fieldset>
 		</form>
	</div>
  </body>
</html>
