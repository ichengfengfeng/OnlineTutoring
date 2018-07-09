<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>教员信息</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Best Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="<%=basePath%>liuyan/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=basePath%>liuyan/css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="<%=basePath%>liuyan/js/bootstrap-3.1.1.min.js"></script>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- //animation-effect -->
<script type="text/javascript" src="<%=basePath%>liuyan/js/message.js"></script>
</head>
	
<body>

<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="<%=basePath%>getTutor"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>返回</a></li>
			</ol>
		</div>
	</div>
	<div class="single">
		<div class="container">
				<div calss="teacherinfo">
					<div class="mail-grid-right1">
						<img src="${teacher.headimg}" alt="头像 " class="img-responsive" />
						<h4>${teacher.realname}<span><c:if test="${teacher.sex==1}">男</c:if><c:if test="${teacher.sex==2}">女</c:if></span></h4>
						<ul class="phone-mail">
						    <li>就读院校: ${teacher.scname}</li>
						    <li>授课类型: <c:forEach items="${teacher.tutors}" var="tutor"> ${tutor.typeDescribe}&nbsp;&nbsp;&nbsp;</c:forEach> </li>
						    <li>授课区域: <c:forEach items="${teacher.areas}" var="area"> ${area.areaDescribe}&nbsp;&nbsp;&nbsp;</c:forEach> </li>
							<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>Phone: ${teacher.phone}</li>
							<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i>Email: ${teacher.email}</li>
						</ul>
					</div>
				</div>
				
				<div class="clearfix"> </div>
						<ul id="myTab" class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">描述</a></li>
							<li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile" >留言评价</a></li>
						</ul>
						<div id="myTabContent" class="tab-content">
							<div role="tabpanel" class="tab-pane fade in active bootstrap-tab-text" id="home" aria-labelledby="home-tab">
								<h5>自我描述</h5>
								<p><span>擅长英语</span></p>
							</div>
							<div role="tabpanel" class="tab-pane fade bootstrap-tab-text" id="profile" aria-labelledby="profile-tab">
								<div class="bootstrap-tab-text-grids">
									<div class="bootstrap-tab-text-grid">
									<c:forEach items="${messages}" var="message">
										<div class="bootstrap-tab-text-grid-left">
											<img src="${message.headimg}" alt=" " class="img-responsive" />
										</div>
										<div class="bootstrap-tab-text-grid-right">
											<ul>
												<li>${message.realname}&nbsp;&nbsp;留言：--------<fmt:formatDate value="${message.lydatetime}" pattern="yyyy-MM-dd HH:mm"/> </li>
											</ul>
											<p>${message.description}</p>
										</div>
										<div class="clearfix"> </div>
										</c:forEach>
									</div>
									<div class="add-review">
										<h4>添加留言</h4>
										<form id = "liuyan">
										    <input name="teacuuid" id = "teacuuid" type="hidden" value="${teacher.teacuuid}">
											<textarea type="text" name="mcontent" id = "lymessage" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message...';}" required="">Message...</textarea>
											<button onclick="addmessage()">提交留言</button> 
										</form>
									</div>
								</div>
							</div>
							
						</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<script type="text/javascript">
$(document).ready(function() {
	document.getElementById("profile-tab").click(); 
})

</script>
</body>
</html>