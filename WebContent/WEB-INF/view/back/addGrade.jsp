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
    <title>添加年级</title>
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
    <script type="text/javascript" src="<%=basePath%>js/grade/grade.js"></script>
</head>
<body>
              <div class="tpl-block">
                    <div class="am-g">
                        <div class="tpl-form-body tpl-form-line">
                            <form class="am-form tpl-form-line-form" id = "addgrade">
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">年级名称 <span class="tpl-form-line-small-title">名称</span></label>
                                    <div class="am-u-sm-9">
                            <input type="text" class="tpl-form-input" name="gradename" placeholder="年级名称">
                            <small>名称描述</small>
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">显示级别<span class="tpl-form-line-small-title">级别</span></label>
                                    <div class="am-u-sm-9">
                                        <input type="text" class="tpl-form-input" name="rank" placeholder="请输入数字类型">
                                        <small>请输入数字类型0-99，数字越大级别越高</small>
                                    </div>
                                </div>
                                 <div class="am-form-group">
                                    <div class="am-u-sm-9 am-u-sm-push-3">
                                        <button type="button" class="am-btn am-btn-primary tpl-btn-bg-color-success " onclick="add()">添加</button>
                                    </div>
                                </div>
                                </form>
                                
                                </div>
                                </div>
                                </div>
</body>
</html>