<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>个人信息设置</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tabbed Profile Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/setting/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script  type="text/javascript" src="js/settingjs/setting.js"></script>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300italic,300,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>
	<div class="main">
		<div class="content">
		<input type="hidden" value="${ifreamid}" id = "ifreamid">
						<div class="portfolio-grid">
							<div class="port-left" align="left">
								<ul class="resp-tabs-list">
									  <img class="lady" src="${user.headimg}" alt="未上传" />
									  <li class="resp-tab-item"><a href="<%=basePath%>user/personinfo" target="settingright" id="personinfo"><span>个人信息</span></a></li>
									  <li class="resp-tab-item" ><a href="<%=basePath%>user/confirm"  target="settingright" id="confirm"><span>待确认记录</span></a></li>
									  <li class="resp-tab-item" ><a href="<%=basePath%>user/successful"  target="settingright" id="successful"><span>已预约记录</span></a></li>
									  <li class="resp-tab-item" ><a href="<%=basePath%>user/finished"  target="settingright" id="finished"><span>已完成记录</span></a></li>
									  <li class="resp-tab-item" ><a href="<%=basePath%>user/canceled"  target="settingright" id="cancled"><span>已取消记录</span></a></li>
									  <li class="resp-tab-item" ><a href="<%=basePath%>user/evaluate"  target="settingright" id="evaluate"><span>待评价记录</span></a></li>
									  <li class="resp-tab-item" ><a href="<%=basePath%>user/updatePassword"  target="settingright" id="updatePassword"><span>修改密码</span></a></li>
									  <div class="clear"></div>
								</ul>		
							</div>
							<div class="port-right">
								<iframe name="settingright" class="ifream-seting"></iframe>
						    </div>
						
			         </div>
		</div>
		<script type="text/javascript">
$(document).ready(function() {
	var ifreamid = $("#ifreamid").val();
	if(ifreamid==undefined ||ifreamid == null || ifreamid=='')
		ifreamid = 1;
	if(ifreamid==1)
		document.getElementById("personinfo").click(); 
	if(ifreamid==2)
		document.getElementById("confirm").click(); 
	if(ifreamid==3)
		document.getElementById("successful").click(); 
	if(ifreamid==4)
		document.getElementById("finished").click(); 
	if(ifreamid==5)
		document.getElementById("cancled").click(); 
	if(ifreamid==6)
		document.getElementById("evaluate").click(); 
	if(ifreamid==7)
		document.getElementById("updatePassword").click(); 
});
</script>
</div>
		<p class="footer">Copyright © 2016 Tabbed Profile Widget. All Rights Reserved | Template by <a href="https://w3layouts.com/" target="_blank">w3layouts</a></p>
</body>
</html>