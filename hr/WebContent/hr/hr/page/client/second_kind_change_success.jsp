﻿<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String uri=request.getRequestURI();
String path=uri.substring(0,uri.lastIndexOf("/"));
 
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/" ;
%>
<html>
	<head>
     	<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="../../css/table.css"
			type="text/css"></link>
 
	</head>

<script type="text/javascript">
	function returns(){
		document.forms[0].submit();
	}
</script>
	<body>
		<form method="post" action="">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--II级机构设置--II级机构变更
						</font>
					</td>
				</tr>
				<tr>
					<td width="49%">
						更改成功，请返回。
					</td>
					<td width="51%" align="right">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="window.location.href='second_kind.html'">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

