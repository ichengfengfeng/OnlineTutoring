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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>css/main/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<!-- Custom Theme files -->
<link href="<%=basePath%>css/main/style.css" rel="stylesheet" type="text/css" media="all"/>
<title>Insert title here</title>
</head>
<body>
<div class="header">
	<div class="container">
		<div class="header-main">
			 <div class="logo">
			 	<h1><a href="<%=basePath%>main">iStudy<span class="logo-clr">家教网</span></a></h1>
			 </div>
			 <div class="head-right">
			   <div class="top-nav">
			   		<span class="menu"> <img src="<%=basePath%>images/icon.png" alt=""/></span>
					<ul class="res">
						<li><a class="active" href="<%=basePath%>main">首页</a></li>
						<li><a href="<%=basePath%>accountSetting"><span data-hover="Account settings">账户设置</span></a></li>
						<li><a href="<%=basePath%>user/asStudent"><span data-hover="Student">请家教</span></a></li>
						<li><a href="<%=basePath%>user/asTutor"><span data-hover="Tutor">做家教</span></a></li>
						<li><a href="<%=basePath%>getStu"><span data-hover="Contact">预约学员</span></a></li>
						<li><a href="<%=basePath%>getTutor"><span data-hover="Tutor information bank">预约教员</span></a></li>
					<div class="clearfix"> </div>
					</ul>

				<!-- script-for-menu -->
							 <script>
							   $( "span.menu" ).click(function() {
								 $( "ul.res" ).slideToggle( 300, function() {
								 // Animation complete.
								  });
								 });
							</script>
			<!-- /script-for-menu -->
			  </div>
			 <div class="social">
				<ul>
				<c:if test="${user!= null}">
				   <li><a href="<%=basePath%>accountSetting"><span>Hi,${user.realname}</span> </a></li>
				   <li><a href="<%=basePath%>user/logout"><span>退出</span> </a></li>
				</c:if>
				<c:if test="${user==null }">
					<li><a href="<%=basePath%>login"><span>登录</span> </a></li>
					<li><a href="<%=basePath%>register" target="_blank"><span>注册 </span> </a></li>
				</c:if>
				</ul>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   <div class="clearfix"> </div>
		</div>
	</div>
</div>

</body>
</html>