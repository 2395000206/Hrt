﻿<%@ page language="java" contentType="text/html; charset=utf-8"
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
		<title>欢迎使用Bette伯乐人力资源管理系统</title>
		<script language="JavaScript" type="text/JavaScript">
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
//--
</script>

		<script>
function onClose(){

if(window.screenTop>10000){
var targeturl="auto_logout.jsp"
newwin=window.open("","","scrollbars,Toolbar=yes")
if (document.all){
newwin.moveTo(0,0)
newwin.resizeTo(80,60)
}
newwin.location=targeturl
}
}
window.onunload=onClose
</script>
	</head>
	<frameset rows="69,*" framespacing="1" border="1"
		onunload="onClose()">
		<frame src="top.jsp" name="top" scrolling="no" marginwidth="1"
			marginheight="1" frameborder="0">
		<frameset cols="200,*" frameborder="NO" border="0" framespacing="0">
			<frame src="left.jsp" name="left" scrolling="yes" noresize>
			<frame src="main.jsp" name="mainFrame">
		</frameset>
		<noframes>
			<body topmargin="0" leftmargin="0" bgcolor="#b5daff">
			</body>
		</noframes>
	</frameset>
</html>
