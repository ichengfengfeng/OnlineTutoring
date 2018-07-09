<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
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
<script type="text/javascript" src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<script  type="text/javascript" src="<%=basePath%>js/settingjs/setting.js"></script>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300italic,300,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script src="<%=basePath%>laydate/laydate.js"></script>
 <script>
      laydate.render({
      elem: '#birthday' //指定元素
    });
    </script>
</head>
<body>
<div class="main">
		<div class="content"><form  id ="user">
		<input name="uuid" type="hidden" value="${user.uuid}">
											<div class="work-play">
												<h4>账号</h4>
													<input type="text" value="${user.username}" readonly="readonly">	
											</div>
											<div class="work-play">
												<h4>真实姓名</h4>
													<input type="text" id = "realname"name = "realname" value="${user.realname}" >	
											</div>
											<div class="work-play">
												<h4>出生日期</h4>
													<input type="text" id = "birthday"name = "birthday" value="<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/>" >	
											</div>
											<div class="work-play">
												<h4>详细地址</h4>
													<input type="text" id = "address" name = "address" value="${user.address}" >	
											</div>
											
											<div class="profile-content">
												<h3>邮箱</h3>
												<div class="email-group">
														<div class="email-icon"><span></span></div>
														<div class="email-form">
																<input type="text" id = "email"  name = "email"class="fb-ico" value="${user.email}" >	
														</div>
														<div class="clear"></div>
												</div>
												<h3>手机号</h3>	
												<div class="phone-group">			
													<div class="cell-icon"><span></span></div>
														<div class="cell-form">
																<input type="text"  id = "phone" name = "phone"value="${user.phone}" >	
														</div>
														<div class="clear"></div>					 
												</div>
												<h3>性别</h3>	
													<div class="radio-btns">
														<div class="swit">	
														<c:if test="${user.sex==1}">
															<div class="check_box"> <div class="radio"> <label><input type="radio" name="radio" id = "men" value= "1" checked><i></i><img src="<%=basePath%>images/man.png" alt=" "/></label> </div></div>
														    <div class="check_box"> <div class="radio2"> <label><input type="radio" name="radio" id = "wumen" value="2" ><i></i><img src="<%=basePath%>images/woman.png" alt=" "/></label> </div></div>
														</c:if>
					 								    <c:if test="${user.sex==2}">
															<div class="check_box"> <div class="radio"> <label><input type="radio" name="radio" id="men" value= "1" ><i></i><img src="<%=basePath%>images/man.png" alt=" "/></label> </div></div>
														    <div class="check_box"> <div class="radio2"> <label><input type="radio" name="radio" id = "wumen" value= "2" checked><i></i><img src="<%=basePath%>images/woman.png" alt=" "/></label> </div></div>
														</c:if>
														</div>
														
														<div class="clear"></div>			
													</div>
													
												
											</div>
											<div class="work-play">
												<h4>修改头像</h4>
													<input type="file" id = "headfile" name = "headfile" >	
											</div>
											</form>
											<div class="update">
												<a href="javascript:;" onclick="updateUserInfo()">提交修改信息</a>
											</div>
											<div class="clear"></div>
										</div>
										</div>
</body>
</html>