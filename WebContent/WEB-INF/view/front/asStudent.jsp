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
<title>请家教</title>
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
<script src="<%=basePath%>js/student/student.js"></script>
   <!--pie-chart--->
</head> 
<body>
 <jsp:include page="head.jsp"></jsp:include>
          <hr />
   	<div class="panel panel-widget forms-panel">
						<div class="progressbar-heading general-heading">
							<h4>发布学员信息:</h4>
						</div>
						<div class="forms">
								<h3 class="title1"></h3>
								<div class="form-three widget-shadow">
									<form class="form-horizontal" action="<%=basePath%>user/studentform" method="post" >
										<div class="form-group">
											<label for="disabledinput" class="col-sm-2 control-label">联系方式</label>
											<div class="col-sm-8">
												<input disabled="" type="text" value = "${user.phone}"class="form-control1" id="disabledinput" placeholder="联系方式">
											</div>
											<div class="col-sm-2">
												<p class="help-block"><a href="<%=basePath%>updateuserinfo">点我修改</a></p>
											</div>
										</div>
										<div class="form-group">
											<label for="disabledinput" class="col-sm-2 control-label">详细地址</label>
											<div class="col-sm-8">
												<input disabled="" type="text" value = "${user.address}" class="form-control1" id="disabledinput" placeholder="详细地址">
											</div>
											<div class="col-sm-2">
												<p class="help-block"><a href="<%=basePath%>updateuserinfo">点我修改</a></p>
											</div>
										</div>
										<div class="form-group">
											<label for="selector1" class="col-sm-2 control-label">选择授课区域</label>
											<div class="col-sm-8">
											<select onchange="superAreachange()" name="selector1" id="superArea" class="form-controlquyu">
												<option>--请选择--</option>
                                              	<c:forEach items="${areas}" var="area"><option value="${area.id}">${area.areaDescribe}</option></c:forEach>
											</select>
											<select name="areId" id="lowerArea" class="form-controlquyu">
												<option value="0">--请选择--</option>
											</select>	
											</div>
										</div>
										<div class="form-group">
											<label for="selector1" class="col-sm-2 control-label">选择授教科目</label>
											<div class="col-sm-8"><select name="typeid" id="typeid" class="form-control1">
												<option value="">--请选择科目分类--</option>
                                                <c:forEach items="${tutors}" var="tutor">
                                                     <option value="${tutor.typeid}">${tutor.typeDescribe}</option>
                                                </c:forEach>
											</select></div>
										</div>
										<div class="form-group">
											<label class="col-sm-2 control-label">所在年级</label>
											<div class="col-sm-8">
												<select multiple="" class="form-control1" name = "id">
												<c:forEach items="${grades}" var="grade">
												 <option value = "${grade.rank}">${grade.gradename}</option>
												</c:forEach>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label for="radio" class="col-sm-2 control-label">教员性别要求</label>
											<div class="col-sm-8">
												
												<div class="radio block"><label><input name="sex" type="radio" checked="" value="0"> 无</label></div>
												<div class="radio block"><label><input name="sex" type="radio" value="1"> 男</label></div>
												<div class="radio block"><label><input name="sex" type="radio" value="2"> 女</label></div>
											</div>
										</div>
										<div class="form-group">
											<label for="txtarea1" class="col-sm-2 control-label">其他要求</label>
											<div class="col-sm-8"><textarea name="other_desc" id="txtarea1" cols="50" rows="8" class="form-control1"></textarea></div>
										</div>
										<div class="form-group">
										<label for="txtarea1" class="col-sm-2 control-label"></label>
											<div class="col-sm-8"><button type="submit" class="btn btn-default">提交发布信息</button> </div>
										</div>
									</form>
								</div>
						</div>
					</div>
</body>
</html>