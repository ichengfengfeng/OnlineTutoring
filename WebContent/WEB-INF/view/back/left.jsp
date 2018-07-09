<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="tpl-left-nav tpl-left-nav-hover">
            <div class="tpl-left-nav-title">
                欢迎管理员登录
            </div>
            <div class="tpl-left-nav-list">
                <ul class="tpl-left-nav-menu">
                    <li class="tpl-left-nav-item">
                        <a href="index.html" class="nav-link">
                            <i class="am-icon-home"></i>
                            <span>首页</span>
                        </a>
                    </li>
                    
                     <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list active" >
                            <i class="am-icon-wpforms"></i>
                            <span>基本信息维护</span>
                            <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>
                        <ul class="tpl-left-nav-sub-menu">
                            <li>
                                <a href="<%=basePath%>admin/grade/init" id="grade">
                                    <i class="am-icon-angle-right"></i>
                                    <span>学员所在年级维护</span>
                                    <i class="am-icon-star tpl-left-nav-content-ico am-fr am-margin-right"></i>
                                </a>

                                <a href="<%=basePath%>admin/tutortype/init">
                                    <i class="am-icon-angle-right"></i>
                                    <span>可受教课程分类维护</span>
                                </a>
                                 <a href="<%=basePath%>admin/area/init">
                                    <i class="am-icon-angle-right"></i>
                                    <span>区域维护</span>
                                </a>
                                <a href="<%=basePath%>admin/school/init">
                                    <i class="am-icon-angle-right"></i>
                                    <span>高校信息管理维护</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            
        </div>
