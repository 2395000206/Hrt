<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String uri=request.getRequestURI();
 
String path=uri.substring(0,uri.lastIndexOf("/"));
 
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/" ;
%><html>
	<head>
		   <base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="../css/table.css" type="text/css">
		<style type="text/css">
		body {
			margin: 0;
			padding: 0;
			background-color: #FFD553;
			font-family: 微软雅黑;
		}
		</style>
	</head>
	<body topmargin="0" leftmargin="0">
		<table style="width: 70%; margin-left: 30%;">
			<tr>
				<td style="text-align: right;width:30%">
					<p
						style="font-size: 40px; margin: 0; color: white; filter:progid:DXImageTransform.Microsoft.Shadow(color=black,direction=120,strength=5); text-shadow: 4px 4px 15px black;">
						人力资源管理系统
					</p>
				</td>
				<td style="text-align: right;font-size:17px;width:35%;color:black;">
					<br />
					欢迎你：${user.u_true_name }(人事经理)&nbsp;
					<input type="button" value="退出系统" class="BUTTON_STYLE1" onclick="parent.location.href='../login.jsp'"/>&nbsp;&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
		</table>
	</body>