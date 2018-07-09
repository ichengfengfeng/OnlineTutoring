<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>登录页</title>
  <meta name="description" content="这是一个 index 页面">
  <meta name="keywords" content="index">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="<%=basePath%>assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="<%=basePath%>assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="<%=basePath%>assets/css/amazeui.min.css" />
  <link rel="stylesheet" href="<%=basePath%>assets/css/admin.css">
  <link rel="stylesheet" href="<%=basePath%>assets/css/app.css">
</head>
<body data-type="login">

  <div class="am-g myapp-login">
	<div class="myapp-login-logo-block  tpl-login-max">
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
				<span> iStudy网上家教后台管理系统</span> 
			</div>
		</div>

		<div class="login-font">
			<i>登录</i>
		</div>
		<div class="am-u-sm-10 login-am-center">
			<form class="am-form" action="" method="post">
				<fieldset>
					<div class="am-form-group">
						<input type="text" name="username" id="doc-ipt-email-1" placeholder="admin" value="${username}">
					</div>
					<div class="am-form-group">
						<input type="password" name="password" id="doc-ipt-pwd-1" placeholder="admin">
					</div>
					<p><button type="submit" class="am-btn am-btn-default">登录</button></p>
				</fieldset>
			</form>
		</div>
		<div class="login-font">
			<span> ${errmsg}</span>
		</div>
	</div>
</div>
  <script src="<%=basePath%>assets/js/jquery.min.js"></script>
  <script src="<%=basePath%>assets/js/amazeui.min.js"></script>
  <script src="<%=basePath%>assets/js/app.js"></script>
</body>
</html>