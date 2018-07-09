<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--webfonts-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text.css'/>
		<!--//webfonts-->
		<title>iStudy</title>
		<script src="<%=basePath%>/js/jquery-2.1.4.min.js"></script>
		<script src="<%=basePath%>/js/register.js"></script>
</head>
<body>
	<div class="main">
		<div class="header" >
			<h1>欢迎用户注册</h1>
		</div>
		<p>介绍</p>
			<form  id = "myRegister">
				<ul class="left-form">
					<h2>用户注册</h2>
					<li>
						<input type="text" id="realname"  name="realname" placeholder="真实姓名" required onblur="checkRealName()"/>
						<span id="rnameSpan"></span>
						<div class="clear"> </div>
					</li> 
					<li>
						<select id = "sex" name="sex"  onfocus="checkSex()">
							<option value="1" selected="selected">男</option>
							<option value="2" >女</option>
						</select>
					    <span id="sexSpan"></span>
					    <div class="clear"> </div>
					</li>
					<li>
						<input type="text" id ="username" name="username" placeholder="账号" required onblur="checkAccount()"/>
						<span id="checkSpan"></span> <div><span id="namemsg" class="hintgreen"></span></div>
						<div class="clear"> </div>
					</li>
					<li>
						<input type="password"   id = "password1" placeholder="密码"required onblur="checkPassword1()"/>
						<span id="password1Span"></span>
						<div class="clear"> </div>
					</li> 
					<li>
						<input type="password" id = "password2" name="password"  id = "password2" placeholder="确认密码" required onkeyup="checkPassword2()" />
						<span id="password2Span"></span> <span id="password2msg"></span> 
						<div class="clear"> </div>
					</li> 
					<li>
						<input type="text"  id= "phone" placeholder="手机号" name = "phone"required onblur="checkPhone()"/>
						<span id="phoneSpan"></span>
						<div class="clear"> </div>
					</li>
					<li>
						<input type="text"  id= "email"  placeholder="Email" name = "email" required onblur="checkEmail()"/>
						<span id="emailSpan"></span>
						<div class="clear"> </div>
					</li> 
					<li>
						<select id = "role" name="role" onfocus="checkRole()">
							<option value="SUTDENT" selected="selected">学员</option>
							<option value="TEACHER" >教员</option>
						</select>
					    <span id="roleSpan"></span>
					    <div class="clear"> </div>
					</li>
					<label class="checkbox"><input type="checkbox" name="checkbox" checked="" value="agree"><i> </i>我同意</label>
					<div class="clear"> </div>
					<input type="button" onclick="myFunction()" value="注册账户">
						<div class="clear"> </div>
				</ul>
				<div class="clear"> </div>
			</form>
			
		</div>
			<!-----start-copyright---->
   					<div class="copy-right">
						<p>欢迎访问<a href="<%=basePath%>main">iStudy.com</a></p> 
					</div>
				<!-----//end-copyright---->
</body>
</html>