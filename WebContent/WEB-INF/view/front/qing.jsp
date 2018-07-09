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
		<title>请家教</title>
	</head>
	<body>
		 <jsp:include page="head.jsp"></jsp:include>
          <hr />
            <div id="page-inner">
		 <div class="row">
                    <div class="col-md-12">
                     <form id = "annosearch">
                     	<div class="quyu"> 
                     		 <label>一级区域</label>
                     	<select onchange="superAreachange()" id = "superArea"  class="form-control" >
                     	<option>--请选择--</option>
                     	<c:forEach items="${areas}" var="area"><option value="${area.id}">${area.areaDescribe}</option></c:forEach>
                         </select>
                         </div>
                         <div class="quyu"> 
                     		 <label>二级区域</label>
                     	<select  id= "lowerArea"name = "id" class="form-control">
                     	<option value="0">--请选择--</option>
                     	<c:forEach items="${lowerareas}" var="area"><option value="${area.id}">${area.areaDescribe}</option></c:forEach>
                                                
                         </select>
                         </div>
                         <div class="kong">
                         </div>
                         <div class="tutortype"> 
                         	<label style="align-content: center;">家教科目分类</label>
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
                         	<label style="align-content: center;">请选择高校分类</label>
                         <select id = "scuuid" name = "scuuid" class="form-control">
                          <option value="">--请选择高校--</option>
                         <c:forEach items="${schools}" var="school">
                            <option value="${school.scuuid}">${school.scname}</option>
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
               
                  <div class="row">
                  	  <hr />
                     <div class="col-md-12">
                     	<div class="fenlei">
                     		&nbsp;&nbsp;&nbsp;&nbsp;科目分类：&nbsp;&nbsp;&nbsp;&nbsp;</div>
                       <a href="javascript:;" class="btn btn-primary btn-xs" onclick="tutor('')">不限</a>
                       <c:forEach items="${tutors}" var="tutor">
                       <a href="javascript:;" class="btn btn-primary btn-xs" onclick="tutor('${tutor.typeid}')">${tutor.typeDescribe}</a>
                       </c:forEach>
                    	</div>
                    </div>
                 <div class="row">
                 	 <hr />
                     <div class="col-md-12">
                     	<div class="fenlei">
                     		&nbsp;&nbsp;&nbsp;&nbsp;高校分类：&nbsp;&nbsp;&nbsp;&nbsp;</div>
                     		<a href="javascript:;" class="btn btn-primary btn-xs" onclick="school('')">不限</a>
                     		 <c:forEach items="${schools}" var="school">
                     		  <a href="javascript:;" class="btn btn-primary btn-xs" onclick="school('${school.scuuid}')">${school.scname}</a>
                             </c:forEach>
                    	</div>
                    </div>
                 <div class="row">
                 	 <hr />
                     <div class="col-md-12">
                     	<div class="fenlei">
                     		&nbsp;&nbsp;&nbsp;&nbsp;区域分类：&nbsp;&nbsp;&nbsp;&nbsp;</div>
                     		<a href="javascript:;" class="btn btn-primary btn-xs" onclick="area('')">不限</a>
                     		<c:forEach items="${areas}" var="area">
                     		  <a href="javascript:;" class="btn btn-primary btn-xs" onclick="area(${area.id})">${area.areaDescribe}</a>
                     		
                     		</c:forEach>
                    	</div>
                   </div>
                 <hr />
		        <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             查询教员结果
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th style="width: 50px">教员</th>
                                            <th >可授课分类</th>
                                            <th align="center">授课区域</th>
                                            <th style="width: 120px">价格：元/小时</th>
                                            <th style="width: 100px">预约操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${annodtos}" var="annodto">
                                     <tr class="gradeC"> 
                                            <td align="center">
                                           <a href="<%=basePath%>tercherinfo/${annodto.teacuuid}"><div>
                                           <img class="lady" src="${annodto.headimg}" alt="头像"/><br>${annodto.realname}
                                           <c:if test="${annodto.sex==1}">
                                            &nbsp;&nbsp;&nbsp;&nbsp;男</c:if>
                                            <c:if test="${annodto.sex==2}">
                                            &nbsp;&nbsp;&nbsp;&nbsp;女</c:if>
                                            </div>
                                            <a>
                                            </td>
                                            <td align="center">
                                            <c:forEach items="${annodto.tutors}" var="tutor">
                                                                                                                 【${tutor.typeDescribe}】
                                            </c:forEach>
                                            </td>
                                            <td align="center">
                                            <c:forEach items="${annodto.areas}" var="area">
                                                                                                                 【${area.areaDescribe}】
                                            </c:forEach>
                                            </td>
                                            <td class="price" align="center">${annodto.price}</td>
                                            <td align="center"><button class="btn btn-default" type="button" onclick="yuyue('${annodto.teacuuid}')">预约</button></td>
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
   <script type="text/javascript" src="js/qing/qing.js"></script>
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