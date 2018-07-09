/**
 * 用户注册页面js
 */
function myFunction(){
	checkPassword2();
	$.ajax({
		type: "post",
		url: "register",
		data: $('#myRegister').serialize(),
		async: false,
		success: function(data) {
			debugger;
			if(data=="1") {
				alert("注册成功");
				//window.location.href = '/login';
			}else{
				alert("注册失败");
			}
		}
	})
	var succ = $('#myRegister').submit();
}
function checkRealName() {
	var realname = $('#realname').val();
	$("#rnameSpan").removeAttr("class");
	if(realname != undefined && ""!=username){
		$("#rnameSpan").attr("class","icon ticker");
	}else {
		$("#rnameSpan").attr("class","icon into");
	}
}
function checkSex() {
	$("#sexSpan").attr("class","icon ticker");
}
function checkPassword1() {
	var password1 = $('#password1').val();
	$("#password1Span").removeAttr("class");
	if(password1 != undefined && ""!=password1){
		$("#password1Span").attr("class","icon ticker");
	}else {
		$("#password1Span").attr("class","icon into");
	}
}
function checkPassword2() {
	var password2 = $('#password2').val();
	var password1 = $('#password1').val();
	$("#password2Span").removeAttr("class");
	$("#password2msg").removeAttr("class");
	$("#password2msg").html("");
	if(password2 != undefined && ""!=password2 && password1 != undefined && 
			""!=password1 && password1==password2){
			$("#password2Span").attr("class","icon ticker");
	}else {
		$("#password2Span").attr("class","icon into");
		$("#password2msg").attr("class","hintred");
		$("#password2msg").html("两次密码不一致");
		return false;
	}
}
function checkPhone() {
	var phone = $('#phone').val();
	$("#phoneSpan").removeAttr("class");
	if(phone != undefined && ""!=phone){
		$("#phoneSpan").attr("class","icon ticker");
	}else {
		$("#phoneSpan").attr("class","icon into");
	}
}
function checkEmail() {
	var email = $('#email').val();
	$("#emailSpan").removeAttr("class");
	if(phone != undefined && ""!=phone){
		$("#emailSpan").attr("class","icon ticker");
	}else {
		$("#emailSpan").attr("class","icon into");
	}
}
function checkRole() {
	$("#roleSpan").attr("class","icon ticker");
}
function checkAccount() {
	var username = $('#username').val();
	if(username != undefined && "" !=username){
		$.ajax({
			type:"GET",
			url:"checkAccount/"+username,
			success:function(data) {
				$("#checkSpan").removeAttr("class");
				$("#namemsg").removeAttr("class");
				$("#namemsg").html("");
				if(data=="success"){
					$("#checkSpan").attr("class","icon ticker");
					$("#namemsg").attr("class","hintgreen");
					$("#namemsg").html("可以使用");
				}else {
					$("#checkSpan").attr("class","icon into");
					$("#namemsg").attr("class","hintred");
					$("#namemsg").html("该用户名已经存在");
				}
			}
		});
	}
}