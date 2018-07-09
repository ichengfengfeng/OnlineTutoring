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
<link href="<%=basePath%>assets/css/bootstrap.css" rel="stylesheet" />
<script src="<%=basePath%>/js/jquery-2.1.4.min.js"></script>   
<link href="<%=basePath%>assets/css/custom.css" rel="stylesheet" />
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script  type="text/javascript" src="<%=basePath%>js/settingjs/setting.js"></script>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300italic,300,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script src="<%=basePath%>layer/jquery.min.js"></script>
<script src="<%=basePath%>layer/layer.js"></script>
</head>
<body>
<div class="main">
		<div class="content">
		  <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th style="width: 100px">教员</th>
                                            <th >可授课分类</th>
                                            <th align="center">授课区域</th>
                                            <th style="width: 120px">价格：元/小时</th>
                                            <th style="width: 200px">预约时间</th>
                                            <th style="width: 100px">状态</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                  <c:forEach items="${appointmentDtos}" var="appointmentdto">
                                        <tr>
  										<td align="center">
                                           <a href="<%=basePath%>tercherinfo/${appointmentdto.annoDto.teacuuid}" target="_parent"><div>
                                           <img class="lady" src="${appointmentdto.annoDto.headimg}" alt="头像"/><br>${appointmentdto.annoDto.realname}
                                           <c:if test="${appointmentdto.annoDto.sex==1}">
                                            &nbsp;&nbsp;&nbsp;&nbsp;男</c:if>
                                            <c:if test="${appointmentdto.annoDto.sex==2}">
                                            &nbsp;&nbsp;&nbsp;&nbsp;女</c:if>
                                            </div>
                                            <a>
                                            </td>
                                         	<td align="center">
                                            <c:forEach items="${appointmentdto.annoDto.tutors}" var="tutor">
                                                                                                                 【${tutor.typeDescribe}】
                                            </c:forEach>
                                            </td>
                                          <td align="center">
                                            <c:forEach items="${appointmentdto.annoDto.areas}" var="area">
                                                                                                                 【${area.areaDescribe}】
                                            </c:forEach>
                                            </td>
                                       <td class="price" align="center">${appointmentdto.annoDto.price}</td>
                                         <td>
                                         <fmt:formatDate value="${appointmentdto.appointment.yytime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                         </td>
                                         <td>
                                          已取消
                                         </td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
    <script src="<%=basePath%>assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="<%=basePath%>assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
	    </div>
</div>
</body>
</html>