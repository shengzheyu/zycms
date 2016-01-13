<%@ page language="java" import="java.util.*,cn.edu.sjzc.cms.model.Channel" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/backend/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>CMS 后台管理工作平台</title>
<style type="text/css">
<!--
body {
	margin-left: 3px;
	margin-top: 0px;
	margin-right: 3px;
	margin-bottom: 0px;
}
.STYLE1 {
	color: #e1e2e3;
	font-size: 12px;
}
.STYLE6 {color: #000000; font-size: 12; }
.STYLE10 {color: #000000; font-size: 12px; }
.STYLE19 {
	color: #344b50;
	font-size: 12px;
}
.STYLE21 {
	font-size: 12px;
	color: #3b6375;
}
.STYLE22 {
	font-size: 12px;
	color: #295568;
}
A:active,A:visited,A:link {
	COLOR: #0629FD;
	TEXT-DECORATION: none
}

A:hover {
	COLOR: #FF6600;
	TEXT-DECORATION: none
}

A.relatelink:active,A.relatelink:visited,A.relatelink:link { 
	color: white;
	TEXT-DECORATION: none
}

A.relatelink:hover {
	COLOR: #FF6600;
	TEXT-DECORATION: none
}

td {
	font-size: 12px;
	color: #003366;
	height:24px
}

.STYLE1 a{
	COLOR: white;
}
.STYLE1 A:active,.STYLE1 A:visited,.STYLE1 A:link {
	COLOR: white;
	TEXT-DECORATION: none
}
.STYLE1 a:hover{
	COLOR: red;
}
-->
</style>
</head>
<body>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="6%" height="19" valign="bottom"><div align="center"><img src="images/tb.gif" width="14" height="14" /></div></td>
                <td width="94%" valign="bottom"><span class="STYLE1"> 网站文章信息列表</span></td>
              </tr>
            </table></td>
            <td><div align="right"><span class="STYLE1">
             &nbsp;&nbsp;<img src="images/add.gif" width="10" height="10" /> <a href="#">添加</a>   
             &nbsp;&nbsp;<img src="images/edit.gif" width="10" height="10" /> <a href="#">发布</a>
             &nbsp; <img src="images/del.gif" width="10" height="10" /> <a href="#">删除</a>    &nbsp;&nbsp;   &nbsp;
             </span><span class="STYLE1"> &nbsp;</span></div></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>
     <%Channel channel=(Channel)request.getAttribute("channel");
     %>
    <form action="ChannelServlet?m=mod" method="post"  >
	    <fieldset>
			<legend>频道基本信息</legend>
			<div>
				<label for="id">频道代码:</label>
				<input type="text" readonly="readonly" name="id" id="id" value="<%=channel.getId() %>" size="60" maxlength="20" /> 
				<br/>
			</div>
			<div>
				<label for="channelname">频道名称:</label>
				<input type="text" name="channelname" id="channelname" value="<%=channel.getChannelname() %>" size="60" maxlength="50" /> 
				<br/>
			</div>
			<div>
				<label for="description">频道描述:</label>
				<textarea rows="10" cols="100" name="description" id="description" ><%=channel.getDescription() %></textarea>
				<br/>
			</div>
			<div class="enter">
			    <input name="submit" type="submit" class="buttom" value="提交" />
			    <input name="reset" type="reset" class="buttom" value="重置" />
			</div>
		</fieldset>
 		</form>
    </td>
  </tr>
  <tr>
    <td height="30">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="33%"><div align="left"><span class="STYLE22">&nbsp;&nbsp;&nbsp;&nbsp;共有<strong> 243</strong> 条记录，当前第<strong> 1</strong> 页，共 <strong>10</strong> 页</span></div></td>
        <td width="67%" align=right vAlign="center" noWrap>
				<a href="#">首页</a>
				<font color="red">1</font>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">下页</a>
				<a href="#">尾页</a>
				<select name="pagesize" onchange="selectPagesize(this)" >

	<option value="5"
	selected 
	>5</option>

	<option value="10"
	 
	>10</option>

	<option value="15"
	 
	>15</option>

	<option value="20"
	 
	>20</option>

	<option value="25"
	 
	>25</option>

	<option value="30"
	 
	>30</option>

	<option value="35"
	 
	>35</option>

	<option value="40"
	 
	>40</option>

	<option value="45"
	 
	>45</option>

	<option value="50"
	 
	>50</option>

</select>

      </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>

