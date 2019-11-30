<%@ page language="java" contentType="text/html; charset=utf-8"
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
		<script type="text/javascript"
			src="../../javascript/comm/comm.js">
		</script>
	</head>
	
<script type="text/javascript">
	//控件判断不能为空
	function check(){
		if (document.getElementById("secondKind.secondSalaryId").value==""){
			alert("薪酬发放责任人编号不能为空!!!");
			return false;
		}
		if(document.getElementById("secondKind.secondSaleId").value==""){
			alert("销售责任人编号不能为空!!!");
			return false;
		}
		document.forms[0].submit();
	}		
</script>

	<body>

		<form action="../../../../hr/hr/page/client/second_kind_change_successctr" method="post">
			
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--II级机构设置--II级机构变更
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<input type="hidden" name="fsk_id" value="${kindid.fsk_id}" class="INPUT_STYLE1" />
				<tr>
					<td width="19%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text" name="first_kind_name" readonly="readonly" class="INPUT_STYLE1" value="${kindid.first_kind_name}">
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						II级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text" name="second_kind_id" readonly="readonly" class="INPUT_STYLE1" value="${kindid.second_kind_id}">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						II级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="second_kind_name" readonly="readonly" class="INPUT_STYLE1" value="${kindid.second_kind_name}">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
					<textarea rows="4" cols="120" name="second_salary_id" class="TEXTAREA_STYLE1">${kindid.second_salary_id}</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
					<textarea rows="4" cols="120" name="second_sale_id" class="TEXTAREA_STYLE1">${kindid.second_sale_id}</textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
