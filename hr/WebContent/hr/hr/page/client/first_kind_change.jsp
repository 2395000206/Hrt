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
			href="../../css/table.css" type="text/css"></link>
   <script type="text/javascript"
			src="../../javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="../../javascript/comm/dan.js">
		</script>
	</head>
	<body>
		<form  method="post"
			action="../../../../hr/hr/page/client/first_kind_change_successctr">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置--I级机构变更
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
				
						<input type="submit" value="提交" class="BUTTON_STYLE1" />
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
	 
				<tr>
					<td width="19%" class="TD_STYLE1">
						I级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
					<input type="hidden" name="ffk_id" value="${kindid.ffk_id}">
						<input type="text" name="first_kind_id" value="${kindid.first_kind_id}"
							readonly="readonly" class="INPUT_STYLE1">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						I级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="first_kind_name" value="${kindid.first_kind_name}"
							readonly="readonly" class="INPUT_STYLE1">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea name="first_kind_salary_id" rows="4"
							class="TEXTAREA_STYLE1">${kindid.first_kind_salary_id }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea name="first_kind_sale_id" rows="4"
							class="TEXTAREA_STYLE1">${kindid.first_kind_sale_id }</textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
