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
                                            <th style="width: 100px">编号</th>
                                            <th style="width: 200px">学员信息</th>
                                            <th style="width: 200px">要求描述</th>
                                            <th style="width: 100px">授课区域</th>
                                            <th style="width: 200px">预约时间</th>
                                            <th style="width: 100px">预约操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                  <c:forEach items="${appointmentDtos}" var="appointmentdto">
                                        <tr>
                                         <td>${appointmentdto.appointment.appointmentid}</td>
                                         <td>姓名：【<c:if test="${appointmentdto.stuDto.usersex==1}">男</c:if><c:if test="${appointmentdto.stuDto.usersex==2}">女</c:if>】${appointmentdto.stuDto.realname}<br>
                                                                                                                学员年级： ${appointmentdto.stuDto.gradename}    <br>                                                               
                                                                                                                  联系方式：${appointmentdto.stuDto.phone}<br>
                                                                                                                  详细地址：${appointmentdto.stuDto.address}<br>
                                         </td>
                                         <td>
                                                                                                                  授课类型：${appointmentdto.stuDto.type_describe}<br>
                                                                                                                  性别要求：<c:if test="${appointmentdto.stuDto.sex==1}">男</c:if><c:if test="${appointmentdto.stuDto.sex==2}">女</c:if><br>
                                                                                                                  其他要求：${appointmentdto.stuDto.other_desc}
                                         </td>
                                         <td>
                                         ${appointmentdto.stuDto.area_describe}
                                         </td>
                                         <td>
                                         <fmt:formatDate value="${appointmentdto.appointment.yytime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                         
                                         </td>
                                         <td>
                                         <button class="btn btn-default" type="button" onclick="confirm(this,'${appointmentdto.appointment.appointmentid}')">确认</button>
                                          <button class="btn btn-default" type="button" onclick="cancle(this,'${appointmentdto.appointment.appointmentid}')" >取消</button>
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
    <script>
function confirm(e,appointmentid){
var url = "confirmbutton/" +appointmentid;
 layer.open({
        type: 2,
        title: '确认预约',
        fix: false,
        shadeClose: true,
        maxmin: true,
        area: ['600px', '500px'],
        content: url,
    });
 
}
function cancle(e,appointmentid) {
	debugger;
	$.ajax({
		type: "post",
		url: "cancle",
		data: {"appointmentid": appointmentid},
		success: function(data) {
			alert("quxiao");
			if(data=="success")
				$(e).parent().parent().remove();
		}
	})
}

</script>
	    </div>
</div>
</body>
</html>