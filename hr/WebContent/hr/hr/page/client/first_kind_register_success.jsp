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
		<link rel="stylesheet"
			href="../../css/table.css" type="text/css">
		<script type="text/javascript"
			src="../../javascript/comm/comm.js">
		</script>
	</head>
	<body>
		<form method="post" action="configfilefirstkind.do">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置--I级机构添加
						</font>
					</td>
				</tr>
				<tr>
					<td width="49%">
						录入成功。
					</td>
					<td width="51%" align="right">
						<input type="button" value="继续录入" class="BUTTON_STYLE1"
							onclick="window.location.href='first_kind_register.html'">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="window.location.href='first_kind.html'">
					</td>
				</tr>
			</table>

		</form>
	</body>
</html>
