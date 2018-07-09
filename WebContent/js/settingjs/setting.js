var flag = "failed";
//校验原始密码
function checkPassword() {
	debugger;
	var yspassword = $('#ysPassword').val();
	$.ajax({
		type: "post",
		url: "checkPassword",
		data: {"password" :yspassword},
		success: function(data) {
			if(data==1) {
				$('#checkPass').html("");
				$('#checkPass').html("输入正确");
				flag = "success";
			}else{
				
				$('#checkPass').html("请输入正确的密码");
				flag="failed";
			}
			
		},
		error: function() {
			alert("未登录或者网络异常");
		}
		
	});
}

function updatePassword() {
	if (typeof flag != "undefined" && flag == "success") {
		//1.正确的原始密码后校验 新密码 和确认密码一致性 
		//2、提交修改密码
		$.ajax({
			type:"post",
			url:"updatePassword",
			data: $("#updatePassword").serialize(),
			success:function(data) {
				if(data=="1") 
				alert("修改成功！");
				else
					alert("登录超时，请重新登录");
			}
		});
	}else {
		//提示输入正确的原始密码
		alert("请输入正确的原始密码");
	}
}


function updateUserInfo() {
	debugger;
	var formData = new FormData($("#user")[0]);
	$.ajax({
		type: "post",
		url: "updateuser",
		data: formData,
		dataType: "json",
		async: false,
		cache: false,
		contentType: false, 
        processData: false,
		success: function(data){
			debugger;
			if(data.uuid!=null &&data.uuid!=''){
				alert("修改成功");
				top.location.href = '../accountSetting';
			}
//			debugger;
//			$("realname").val(data.realname);
//			$("birthday").val(data.birthday);
//			$("address").val(data.address);
//			$("email").val(data.email);
//			$("phone").val(data.phone);
//			$("men").removeAttr("checked");
//			$("wumen").removeAttr("checked");
//			if(data.sex=='1'){
//				$("men").attr("checked","checked");
//			}else {
//				$("wumen").attr("checked","checked");
//			}
		},
		error: function() {
			alert("未登录或者网络异常");
		}
	})
	
}