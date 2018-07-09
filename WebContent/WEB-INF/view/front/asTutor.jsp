<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<title>做家教</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Gretong Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/astutor/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="<%=basePath%>css/astutor/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="<%=basePath%>css/astutor/font-awesome.css" rel="stylesheet"> 

<!-- jQuery -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'/>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="<%=basePath%>css/astutor/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<script src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<script src="<%=basePath%>js/astutor/asTutor.js"></script>
</head> 
<body>
   <!--/content-inner-->
	<jsp:include page="head.jsp"></jsp:include>
			<div class="content">
<div class="women_main">
	<!-- start content -->
	<div class="catalog">				
			<div id="tabs" class="tabs">
					<form id="asTutorForm" action="<%=basePath%>user/tutorForm" method="post" >
						<div class="graph">
							<nav>
								<ul>
									<li class="tab-current"><a href="#section-1" class="icon-shop" id="firststep"><span>第一步：填写基本教师信息</span></a></li>
									<li><a href="#section-2" class="icon-cup" id="secondstep"><span>第二步：选择可授课类型</span></a></li>
									<li><a href="#section-3" class="icon-food" id="thirdstep"><span>第三步：选择可授课区域</span></a></li>
									<li><a href="#section-4" class="icon-food" id="clickSuccess"><span>第四步：完成提交</span></a></li>
								</ul>
							</nav>
								<div class="content tab">
									<section id="section-1" class="content-current">
									<div class="form-horizontal">
									<div class="form-group">
											<label for="disabledinput" class="col-sm-2 control-label">账号</label>
											<div class="col-sm-8">
												<input disabled="" type="text" name= "username" value = "${user.username}" class="form-control1" id="disabledinput" placeholder="Disabled Input">
											</div>
										</div>
										<div class="form-group">
											<label for="disabledinput" class="col-sm-2 control-label">姓名</label>
											<div class="col-sm-8">
												<input disabled="" type="text" name= "realname" value = "${user.realname}"class="form-control1" id="disabledinput" placeholder="Disabled Input">
											</div>
										</div>
										<div class="form-group">
											<label for="mediuminput" class="col-sm-2 control-label">价格</label>
											<div class="col-sm-8">
												<input type="text" name = "price" class="form-control1" id="mediuminput" placeholder="Medium Input">
											</div>
										</div>
										<div class="form-group">
											<label for="mediuminput" class="col-sm-2 control-label">标题</label>
											<div class="col-sm-8">
												<input type="text" name = "title" class="form-control1" id="mediuminput" placeholder="Medium Input">
											</div>
										</div>
										<div class="form-group">
											<label for="selector1" class="col-sm-2 control-label">选择高校</label>
											<div class="col-sm-8"><select name="school" id="selector1" class="form-control1">
												<c:forEach items="${schools}" var="school">
												<option value="${school.scuuid}">${school.scname}</option>
												</c:forEach>
											</select></div>
											</div>
											<div class="form-group">
											<label for="selector1" class="col-sm-2 control-label"></label>
											     <div class="col-sm-8">
											         <div class="nextstep">
											         <button type="button" class="btn btn-default" onclick="nextstep(1)" >下一步</button>
											         </div>
											     </div>
											</div>
										</div>
									</section>
									<section id="section-2">
									<div class="form-horizontal">
									<c:forEach items="${tutors}" var="tutor">
										<div class="form-group">
											<label for="checkbox" class="col-sm-2 control-label">${tutor.typeDescribe}</label>
											<div class="col-sm-8">
											    <c:forEach items="${tutor.tutorialclasstypes}" var="lowertutor"> 
												<div class="checkbox-inline"><label><input type="checkbox" name = "tutorialclasstype[]" value="${lowertutor.typeid}"> ${lowertutor.typeDescribe}</label></div>
												</c:forEach>
											</div>
										</div>
										</c:forEach>
										<div class="form-group">
											<label for="selector1" class="col-sm-2 control-label"></label>
											     <div class="col-sm-8">
											      <div class="laststep">
											            <button type="button" class="btn btn-default" onclick="laststep(2)" > 上一步</button>
											       </div>  
											         <div class="nextstep">
											          <button type="button" class="btn btn-default" onclick="nextstep(2)" >下一步</button>
											         </div>
											     </div>
											</div>
									</div>
									</section>
									<section id="section-3">
										<div class="form-horizontal">
										    <c:forEach items="${areas}" var="area">
										    <div class="form-group">
											<label for="checkbox" class="col-sm-2 control-label">${area.areaDescribe}</label>
											<div class="col-sm-8">
											<c:forEach items="${area.allAreas}" var="lowerArea"> 
												<div class="checkbox-inline"><label><input type="checkbox" name = "quyu[]" value="${lowerArea.id}">${lowerArea.areaDescribe}</label></div>
											</c:forEach>
											</div>
											</div>
											</c:forEach>
											<div class="form-group">
											<label for="selector1" class="col-sm-2 control-label"></label>
											     <div class="col-sm-8">
											      <div class="laststep">
											            <button type="button" class="btn btn-default" onclick="laststep(3)" > 上一步</button>
											       </div>  
											         <div class="nextstep">
											          <button type="button" class="btn btn-default" onclick="astutor()" >提交</button>
											         </div>
											     </div>
											</div>
										</div>
									</section>
									<section id="section-4">
									<div class = "fooll">
									<h1><span id="success"></span></h1>
									</div>
									</section>
								</div><!-- /content -->
						</div>
						</form>
								<script src="<%=basePath%>js/astutor/cbpFWTabs.js"></script>
									<script>
										new CBPFWTabs( document.getElementById( 'tabs' ) );
									</script>
	</div>

	<!-- end content -->
			<!--content-->
		</div>
		</div>
</div>
				<!--//content-inner-->
			<!--/sidebar-menu-->
				
						
<!--js -->
		   <script src="<%=basePath%>js/astutor/menu_jquery.js"></script>
</body>
</html>