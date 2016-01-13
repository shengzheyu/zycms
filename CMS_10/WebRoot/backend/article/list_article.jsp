<%@ page language="java" import="java.util.*,cn.edu.sjzc.cms.model.*"contentType="text/html; charset=UTF-8"
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
	<script type="text/javascript">
		function All(){
			var ids = document.getElementsByName("ids");
			for(var i=0;i<ids.length;i++){
				ids[i].checked=document.getElementById("checkbox");
			}
		}	
		function delBatch(){
			if(confirm("确定删除吗？")){
			window.document.getElementById("f").action="ArticleServlet?m=delBatch";
			window.document.getElementById("f").submit();
			}
		}
		function publishBatch(){
			if(confirm("确定发布吗？")){
			window.document.getElementById("f").action="ArticleServlet?m=publishBatch";
			window.document.getElementById("f").submit();
			}
		}
		function pageSize(ps){
			window.location.href="ArticleServlet?m=list&pageSize="+ps+"&pageNo="+1;
		}
		function pageNode(ps){
			window.location.href="ArticleServlet?m=list&pageNo="+ps;
		}
	</script>
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
             &nbsp;&nbsp;<img src="images/edit.gif" width="10" height="10" /> <a href="javascript:publishBatch()">发布</a>
             &nbsp; <img src="images/del.gif" width="10" height="10" /> <a href="javascript:delBatch()">删除</a>    &nbsp;&nbsp;   &nbsp;
             </span><span class="STYLE1"> &nbsp;</span></div></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>
    <form id="f" method="post">
    <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce">
      <tr>
        <td width="4%" height="20" bgcolor="d3eaef" class="STYLE10"><div align="center">
          <input type="checkbox" name="checkbox" id="checkbox" onclick="All()"/>
        </div></td>
        <td width="100" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">文章标题</span></div></td>
        <td width="50" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">文章来源</span></div></td>
        <td width="50" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">点击量</span></div></td>
        <td width="50" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">留言数</span></div></td>
        <td width="70" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">创建时间</span></div></td>
        <td width="70" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">更新时间</span></div></td>
        <td width="70" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">发布时间</span></div></td>
        <td width="100" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">基本操作</span></div></td>
      </tr>
      <%List<Article> articles=(List<Article>)request.getAttribute("articles");
      		for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
			Article article = (Article) iterator.next();
       %>
      <tr>
        <td height="20" bgcolor="#FFFFFF"><div align="center">
          <input type="checkbox" name="ids" id="ids" value="<%=article.getId() %>" />
        </div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><a href="ArticleServlet?m=show&id=<%=article.getId() %>" title="点击查看和编辑文章"><%=article.getTitle() %></a></div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><%=article.getSource() %></div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><%=article.getClick_score() %></div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><%=article.getMsg_count() %></div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><%=article.getCreate_time() %></div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><%=article.getUpdate_time() %></div></td>
        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><%=article.getPublish_time() %></div></td>
        <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE21">
        <a href="ArticleServlet?m=publish&id=<%=article.getId() %>" title="点击发布文章">发布</a> | 
        <a href="ArticleServlet?m=del&id=<%=article.getId() %>" title="点击删除文章">删除</a> |
        <a href="ArticleServlet?m=mod&id=<%=article.getId() %>" title="点击编辑文章">编辑</a>
        </div></td>
      </tr>
      <%} %>
    </table>
    </form>
    </td>
  </tr>
  <tr>
    <td height="30">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
       <tr>
      <%PageModel pm=(PageModel)request.getAttribute("pm");%>
        <td width="33%"><div align="left"><span class="STYLE22">&nbsp;&nbsp;&nbsp;&nbsp;共有<strong><%=pm.getAllRecond()%></strong> 条记录，当前第<strong><%=pm.getPageNo() %></strong> 页，共 <strong><%=pm.getTotalPage() %></strong> 页</span></div></td>
        <td width="67%" align=right vAlign="center" noWrap>
				<a href="ArticleServlet?m=list&pageNo=1">首页</a>
				<a href="ArticleServlet?m=list&pageNo=<%=(pm.getPageNo()-1)<1?1:(pm.getPageNo()-1)%>">上页</a>
				<font color="red">
				<select name="pageNode" onchange="pageNode(this.value)"  >

				<%for(int i=1;i<pm.getTotalPage()+1;i++){%>
				<option value="<%=i %>" <%=(pm.getPageNo()==i?"selected":"")%>
				><%=i %></option>
				
				 <%}%>
				</select>
				</font>
				<a href="ArticleServlet?m=list&pageNo=<%=pm.getPageNo()+1>pm.getTotalPage()?pm.getTotalPage():(pm.getPageNo()+1)%>">下页</a>
				<a href="ArticleServlet?m=list&pageNo=<%=pm.getTotalPage()%>">尾页</a>
				<select name="pageSize" onchange="pageSize(this.value)"  >

	<%for(int i=5;i<=25;i+=5){ %>
	<option value=<%=i %> <%=(pm.getPageSize()==i?"selected":"")%>
	><%=i %></option>
	<%} %>
</select>
      </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>

