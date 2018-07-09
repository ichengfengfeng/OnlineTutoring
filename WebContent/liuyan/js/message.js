function addmessage() {
	debugger;
	var teacuuid = $("#teacuuid").val();
	$.ajax({
		type: "post",
		url: "../user/addmessage",
		data: $('#liuyan').serialize(),
		async: false,
		success: function(data) {
			if(data=="login"){
				alert("请登录");
				window.location.href = 'login';
			}
			if(data=="notStudent") {
				alert("非学员登录");
			}
			if(data=="success"){
				window.location.href = '../tercherinfo/' +teacuuid;
			}
				
		},
		error: function() {
			alert("网络异常，加载失败");
		}
	})
	
}