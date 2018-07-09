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
		<meta charset="UTF-8">
		 <link href="assets/css/bootstrap.css" rel="stylesheet" />
		 <script src="<%=basePath%>/js/jquery-2.1.4.min.js"></script>
     <!-- FONTAWESOME STYLES-->
     <!-- MORRIS CHART STYLES-->
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
     <!-- TABLE STYLES-->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
		<title>学员信息</title>
	</head>
	<body>
		 <jsp:include page="head.jsp"></jsp:include>
          <hr />
            <div id="page-inner">
		 <div class="row">
                    <div class="col-md-12">
                     <form id = "stuannosearch">
                     	<div class="quyu"> 
                     		 <label>一级区域</label>
                     	<select onchange="superAreachange()" id = "superArea"  class="form-control" >
                     	<option>--请选择--</option>
                     	<c:forEach items="${areas}" var="area"><option value="${area.id}">${area.areaDescribe}</option></c:forEach>
                         </select>
                         </div>
                         <div class="quyu"> 
                     		 <label>二级区域</label>
                     	<select  id= "lowerArea"name = "area_id" class="form-control">
                     	<option value="0">--请选择--</option>
                     	<c:forEach items="${lowerareas}" var="area"><option value="${area.id}">${area.areaDescribe}</option></c:forEach>
                                                
                         </select>
                         </div>
                         <div class="kong">
                         </div>
                         <div class="tutortype"> 
                         	<label style="align-content: center;">求教科目</label>
                         <select id = "typeid" name = "typeid" class="form-control">
                            <option value="">--请选择科目分类--</option>
                            <c:forEach items="${tutors}" var="tutor">
                            <option value="${tutor.typeid}">${tutor.typeDescribe}</option>
                            </c:forEach>
                             
                         </select>
                         </div>
                           <div class="kong">
                         </div>
                          <div class="tutortype"> 
                         	<label style="align-content: center;">就读年级及以下</label>
                         <select id = "rank" name = "rank" class="form-control">
                          <option value="0">--请选择--</option>
                         <c:forEach items="${grades}" var="grade">
                            <option value="${grade.rank}">${grade.gradename}</option>
                         </c:forEach>
                         </select>
                         </div>
                          <div class="kong">
                         </div>
                          <div class="quyu"> 
                         	<label style="align-content: center;">性别</label>
                         <select name = "sex" class="form-control">
                        	  <option value="0">--请选择--</option>
                              <option value="1">男</option>
                              <option value = "2">女</option>
                         </select>
                         </div>
                          <div class="kong">
                         </div>
                      <div class="search">
            <button class="btn btn-default" type="button" onclick="search()">搜索</button>
                       </div>
                     </form>
                       
                    </div>
                 <!-- /. ROW  -->
               
                 <hr />
		        <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             查询学员结果
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th style="width: 150px">发布编号</th>
                                            <th style="width: 150px">学员信息</th>
                                            <th style="width: 150px">求教科目</th>
                                            <th style="width: 150px">授课区域</th>
                                            <th style="width: 150px">教员性别要求</th>
                                            <th style="width: 150px">其他要求</th>
                                            <th style="width: 150px">预约操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                   <c:forEach items="${stuannoDtos}" var="stuannoDto">
                                   <tr>
                                   <td>${stuannoDto.stuannouuid}</td>
                                   <td>${stuannoDto.realname}<br>${stuannoDto.gradename}【<c:if test="${stuannoDto.usersex==1}">男</c:if><c:if test="${stuannoDto.usersex==2}">女</c:if>】<br>${stuannoDto.phone}<br>${stuannoDto.address}</td>
                                   <td>${stuannoDto.type_describe}</td>
                                   <td>${stuannoDto.area_describe}</td>
                                   <td><c:if test="${stuannoDto.sex==1}">男</c:if><c:if test="${stuannoDto.sex==2}">女</c:if></td>
                                   <td>${stuannoDto.other_desc}</td>
                                   <td> <button class="btn btn-default" type="button" onclick="yuyue('${stuannoDto.stuannouuid}','${stuannoDto.stuuuid}')">预约</button></td>
                                      </tr>
                                   </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
            </div>
        </div>
   <script type="text/javascript" src="js/student/student.js"></script>
     <!--<script src="assets/js/jquery-1.10.2.js"></script> -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
    <table id="table1">
    <tbody>
    </tbody>
    </table>
	</body>
</html>