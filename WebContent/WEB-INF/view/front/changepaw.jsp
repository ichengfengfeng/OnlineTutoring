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
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tabbed Profile Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="<%=basePath%>css/setting/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=basePath%>assets/css/bootstrap.css" rel="stylesheet" />
<script src="<%=basePath%>/js/jquery-2.1.4.min.js"></script>   
<link href="<%=basePath%>assets/css/custom.css" rel="stylesheet" />
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script  type="text/javascript" src="<%=basePath%>js/settingjs/setting.js"></script>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300italic,300,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script src="<%=basePath%>layer/jquery.min.js"></script>
<title> 密码修改</title>
<body>
<div class="main">
		<div class="content">
											<div class="work-play">
												<h3>密码修改</h3>
												
												<h4>原密码</h4>
													<input id = "ysPassword" name = "ysPassword" type="password"   onblur="checkPassword()" onkeyup="checkPassword()">	
												    <br><span id = "checkPass" style="font-size: small;color: red"></span>
												<h4>新密码</h4>
													<input id = "newPassword" name = "newPassword" type="password" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}"><br />	
												<span style="font-size: small;color: red;">长度6-20位,支持数字、字母和特殊字符( 仅限 !@#$%^&*() )</span>
												<form id = "updatePassword"  method="post">
												<h4>确认密码</h4>
													<input id = "qrpassword" name = "qrpassword" type="password" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">	<br>
												</form>
											</div>	
											<div class="update">
												<a href="javascript:;" onclick="updatePassword()">确认修改</a>
											</div>
											<div class="clear"></div>
										</div>		
										</div>
									
</body>
</html>