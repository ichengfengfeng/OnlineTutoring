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
<title>Tabbed Profile Widget Flat Responsive Widget Template :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tabbed Profile Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/setting/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script  type="text/javascript" src="js/settingjs/setting.js"></script>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300italic,300,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>
	<div class="main">
		<div class="content">
			<div class="sap_tabs">
			<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;height: 99%;">
					<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
						<script type="text/javascript">
							$(document).ready(function () {
								$('#horizontalTab').easyResponsiveTabs({
									type: 'default', //Types: default, vertical, accordion           
									width: 'auto', //auto or any width like 600px
									fit: true,   // 100% fit in a container
									closed: 'accordion', // Start closed if in accordion view
									activate: function(event) { // Callback function if tab is switched
										var $tab = $(this);
										var $info = $('#tabInfo');
										var $name = $('span', $info);
										$name.text($tab.text());
										$info.show();
									}
								});

								$('#verticalTab').easyResponsiveTabs({
									type: 'vertical',
									width: 'auto',
									fit: true
								});
							});
						</script>
						<div class="portfolio-grid">
							<div class="port-left" align="left">
								<ul class="resp-tabs-list">
									  <img class="lady" src="${user.headimg}" alt="未上传" />
									  <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>个人信息</span></li>
									  <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>修改密码</span></li>
									  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>待确认记录</span></li>
									  <li class="resp-tab-item" aria-controls="tab_item-3" role="tab"><span>已预约记录</span></li>
									  <li class="resp-tab-item" aria-controls="tab_item-4" role="tab"><span>修改密码</span></li>
									  <div class="clear"></div>
								</ul>		
							</div>
							<div class="port-right">
								
									<div class="resp-tabs-container">
										<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
											<div class="work-play">
												<h4>账号</h4>
													<input type="text" value="${user.username}" readonly="readonly">	
											</div>
											<div class="work-play">
												<h4>真实姓名</h4>
													<input type="text" value="${user.realname}" >	
											</div>
											<div class="profile-content">
												<h3>邮箱</h3>
												<div class="email-group">
														<div class="email-icon"><span></span></div>
														<div class="email-form">
																<input type="text" class="fb-ico" value="${user.email}" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'notebookchick@gmail.com';}">	
														</div>
														<div class="clear"></div>
												</div>
												<h3>手机号</h3>	
												<div class="phone-group">			
													<div class="cell-icon"><span></span></div>
														<div class="cell-form">
																<input type="text" value="${user.phone}" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '123-456-7890';}">	
														</div>
														<div class="clear"></div>					 
												</div>
												<h3>性别</h3>	
													<div class="radio-btns">
														<div class="swit">	
														<c:if test="${user.sex==1}">
															<div class="check_box"> <div class="radio"> <label><input type="radio" name="radio" checked><i></i><img src="images/man.png" alt=" "/></label> </div></div>
														    <div class="check_box"> <div class="radio2"> <label><input type="radio" name="radio"><i></i><img src="images/woman.png" alt=" "/></label> </div></div>
														</c:if>
					 								    <c:if test="${user.sex==2}">
															<div class="check_box"> <div class="radio"> <label><input type="radio" name="radio" ><i></i><img src="images/man.png" alt=" "/></label> </div></div>
														    <div class="check_box"> <div class="radio2"> <label><input type="radio" name="radio" checked><i></i><img src="images/woman.png" alt=" "/></label> </div></div>
														</c:if>
														</div>
														<div class="clear"></div>			
													</div>
													
												
											</div>
											<div class="update">
												<a href="javascript:;">提交修改信息</a>
											</div>
											<div class="clear"></div>
										</div>
										<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
											<div class="interests">
												<h3>Interested in</h3>
												<div class="single-bottom">
													<ul>
														<li>
															<input type="checkbox"  id="brand" value="">
															<label for="brand"><span></span>Arts & Entertainment</label>
														</li>
														<li>
															<input type="checkbox"  id="brand1" value="">
															<label for="brand1"><span></span> Beauty & Fitness</label>
														</li>
														<li>
															<input type="checkbox"  id="brand2" value="">
															<label for="brand2"><span></span> Finance</label>
														</li>
														<li>
															<input type="checkbox"  id="brand3" value="">
															<label for="brand3"><span></span> Computer & Electronics</label>
														</li>
														<li>
															<input type="checkbox"  id="brand4" value="">
															<label for="brand4"><span></span>Food And Drinks</label>
														</li>
														<li>
															<input type="checkbox"  id="brand5" value="">
															<label for="brand5"><span></span>Business & Industrial</label>
														</li>
														<li>
															<input type="checkbox"  id="brand6" value="">
															<label for="brand6"><span></span>Home & Garden</label>
														</li>
														
														
													</ul>
												</div>
											</div>
											<div class="update">
												<a href="#">Update</a>
											</div>
											<div class="clear"></div>											
										</div>
										<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
											<div class="social-life">
												
												
												<div class="col-md-6">
                     <!--    Context Classes  -->
                    <div class="panel panel-default">
                       
                        <div class="panel-heading">
                            Context Classes
                        </div>
                        
                      <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th align="center">编号</th>
                                            <th align="center">学员信息</th>
                                            <th align="center">要求描述</th>
                                            <th align="center">授课区域</th>
                                            <th align="center">预约时间</th>
                                            <th align="center">预约操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                  <c:forEach items="${appointmentDtos}" var="appointmentdto">
                                        <tr>
                                         <td>${appointmentdto.appointment.appointmentid}</td>
                                         <td>姓名：【<c:if test="${appointmentdto.stuDto.usersex==1}">男</c:if><c:if test="${appointmentdto.stuDto.usersex==2}">女</c:if>】${appointmentdto.stuDto.realname}<br>
                                                                                                                学员年级： ${appointmentdto.stuDto.gradename}                                                                   
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
                                          ${appointmentdto.appointment.yytime}
                                         </td>
                                         <td>
                                         111
                                         </td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                    <!--  end  Context Classes  -->
                </div>
												
												
											</div>
										</div>
										<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-3">
											<div class="work-play">
												<h3>Work and Organization</h3>
												<h4>Profile Name</h4>
												<form>
													<input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">	
												</form>
												
												<h4>Customer Id</h4>
												<form>
													<input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">	
												</form>
												<h4>Employed In</h4>
												<form>
													<input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">	
												</form>
												<h4>Organization</h4>
												<form>
													<input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">	
												</form>
											</div>	
											<div class="update">
												<a href="#">Update</a>
											</div>
											<div class="clear"></div>
										</div>
										<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-4">
											<div class="work-play">
												<h3>密码修改</h3>
												
												<h4>原密码</h4>
													<input id = "ysPassword" name = "ysPassword" type="password"   onblur="checkPassword()" onkeyup="checkPassword()">	
												    <br><span id = "checkPass" style="font-size: small;color: red"></span>
												<h4>新密码</h4>
													<input id = "newPassword" name = "newPassword" type="password" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}"><br />	
												<span style="font-size: small;color: red;">长度6-20位,支持数字、字母和特殊字符( 仅限 !@#$%^&*() )</span>
												<form id = "updatePassword"  method="post">
												<h4>确认密码</h4>
													<input id = "qrpassword" name = "qrpassword" type="password" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">	<br>
												</form>
											</div>	
											<div class="update">
												<a href="javascript:;" onclick="updatePassword()">确认修改</a>
											</div>
											<div class="clear"></div>
										</div>									
									</div>	
								
							</div>	
							<div class="clear"></div>
						</div>
						
			</div>
		</div>

		</div>
		<p class="footer">Copyright © 2016 Tabbed Profile Widget. All Rights Reserved | Template by <a href="https://w3layouts.com/" target="_blank">w3layouts</a></p>
	</div>
</body>
</html>