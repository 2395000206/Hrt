<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<%
String uri=request.getRequestURI();
String path=uri.substring(0,uri.lastIndexOf("/"));
 
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/" ;
%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		if (document.getElementById("thirdKind.thirdKindSaleId").value==""){
			alert("销售责任人编号不能为空!!!");
			return false;
		}
		if(document.getElementById("thirdKind.thirdKindIsRetail").value!="是" && document.getElementById("thirdKind.thirdKindIsRetail").value!="否"){
			alert("零售店 只能填（是/否）!!!");
			return false;
		}
		document.forms[0].submit();
	}		
</script>	
	<body>
		<form action="../../../../third_kind_update" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--III级机构设置--III级机构变更
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
				<tr>
				    <td><input type="hidden" name="ftkId" value="${third.ftkId}"/></td>
					<td width="19%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text" readonly="readonly" class="INPUT_STYLE1" name="firstKindName" value="${third.firstKindName}"/>
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						II级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text" readonly="readonly" class="INPUT_STYLE1" name="secondKindName" value="${third.secondKindName }"/>
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						III级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text" readonly="readonly" class="INPUT_STYLE1" name="thirdKindId" value="${third.thirdKindId}"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						III级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" readonly="readonly" class="INPUT_STYLE1" name="thirdKindName" value="${third.thirdKindName}"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea rows="4" cols="120" class="TEXTAREA_STYLE1" name="thirdKindSaleId">${third.thirdKindSaleId}</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						是否为零售店（是/否） 
					</td>
					<td class="TD_STYLE2">
		 
					<select name="thirdKindIsRetail">
					<c:if test="${third.thirdKindIsRetail=='是'}">
						<option selected="selected">是</option>
						<option>否</option>
						</c:if>
					 <c:if test="${third.thirdKindIsRetail=='否'}">
						<option selected="selected">否</option>
						<option>是</option>
						</c:if>
					</select>
			 	</td>
				</tr>
			</table>
		</form>
	</body>
</html>

