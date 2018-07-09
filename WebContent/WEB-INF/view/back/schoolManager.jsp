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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>iStudy后台管理系统head</title>
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
    <script src="<%=basePath%>layer/jquery.min.js"></script>
    <script src="<%=basePath%>layer/layer.js"></script>
    <script src="<%=basePath%>js/school/school.js"></script>
</head>

<body data-type="generalComponents">
<jsp:include page="head.jsp"></jsp:include>
 <div class="tpl-page-container tpl-page-header-fixed">
    <jsp:include page="left.jsp"></jsp:include>
        <div class="tpl-content-wrapper">
            <div class="tpl-content-page-title">
               高校信息管理维护
            </div>
            <ol class="am-breadcrumb">
                <li><a href="#" class="am-icon-home">首页</a></li>
            </ol>
            <div class="tpl-portlet-components">
                <div class="portlet-title">
                    <div class="caption font-green bold">
                        <span class="am-icon-code"></span> 高校信息表
                    </div>
                </div>
                <div class="tpl-block">
                    <div class="am-g">
                        <div class="am-u-sm-12 am-u-md-6">
                            <div class="am-btn-toolbar">
                                <div class="am-btn-group am-btn-group-xs">
                                    <button type="button" class="am-btn am-btn-default am-btn-success" id="add"><span class="am-icon-plus"></span> 新增</button>
                                    <button type="button" class="am-btn am-btn-default am-btn-danger" onclick="deleteschools()"><span class="am-icon-trash-o"></span> 删除</button>
                                </div>
                            </div>
                        </div>
                        <div class="am-u-sm-12 am-u-md-3">
                          
                        </div>
                        <div class="am-u-sm-12 am-u-md-3">
                           
                        </div>
                    </div>
                    <div class="am-g">
                        <div class="am-u-sm-12">
                            <form class="am-form" id= "schools" action="<%=basePath%>admin/school/delete" method="post">
                               <input type="hidden" value = "${page.currentpage}" name="currentpage">
                                <table class="am-table am-table-striped am-table-hover table-main" >
                                    <thead>
                                        <tr>
                                            <th class="table-check"><input type="checkbox" class="tpl-table-fz-check"></th>
                                            <th class="table-title">序号</th>
                                            <th class="table-title">名称</th>
                                            <th class="table-title">描述</th>
                                            <th class="table-set">操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${schools}" var="school">
                                     <tr>
                                            <td><input type="checkbox" name = "scuuid[]" value = "${school.scuuid}"></td>
                                            <td>${school.num}</td>
                                            <td>${school.scname}</td>
                                            <td>${school.scdesc}</td>
                                            <td>
                                                <div class="am-btn-toolbar">
                                                    <div class="am-btn-group am-btn-group-xs">
                                                        <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only" onclick="deleteschool('${school.scuuid}')"><span class="am-icon-trash-o"></span> 删除</button>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    
                                    </c:forEach>
                                     
                                    </tbody>
                                </table>
                                <div class="am-cf">

                                    <div class="am-fr">
                                        <ul class="am-pagination tpl-pagination">
                                        <li><a href="<%=basePath%>admin/school/init?currentpage=${page.previous}">«</a></li>
                                        <c:forEach begin="${page.lpage}" end="${page.rpage}" var="pageNum">
                                           <c:if test="${pageNum==page.currentpage}"><li class="am-active"><a href="<%=basePath%>admin/school/init?currentpage=${pageNum}">${pageNum}</a></li></c:if>
                                           <c:if test="${pageNum!=page.currentpage}"><li><a href="<%=basePath%>admin/school/init?currentpage=${pageNum}">${pageNum}</a></li></c:if>
                                        </c:forEach>
                                            <li><a href="<%=basePath%>admin/school/init?currentpage=${page.next}">»</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <hr>

                            </form>
                        </div>

                    </div>
                </div>
                <div class="tpl-alert"></div>
            </div>
        </div>

    </div>
<script>


    //官网欢迎页
	$('#add').on('click', function(){
 layer.open({
        type: 2,
        title: '新增高校',
        fix: false,
        shadeClose: true,
        maxmin: true,
        area: ['600px', '300px'],
        content: '<%=basePath%>/admin/school/addinit',
    });
});
</script>
    <script src="<%=basePath%>assets/js/jquery.min.js"></script>
    <script src="<%=basePath%>assets/js/amazeui.min.js"></script>
    <script src="<%=basePath%>assets/js/app.js"></script>
</body>

</html>