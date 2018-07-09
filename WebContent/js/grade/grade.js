function add() {
	$.ajax({
		type: "post",
		url: "add",
		data: $('#addgrade').serialize(),
		success: function(data) {
			if(data=="success") {
				alert("添加成功");
			}else{
				alert("添加失败");
			}
			
		},
		error: function() {
            alert("未登录或者网络异常");
		}
	});
}

function deletegrades(){
	 $('#grades').submit();
}

function deletegrade(id) {
	debugger;
	if(confirm("您确定删除吗？")==true) {
		$("input:checkbox[value='"+id+"']").attr('checked','true');
		$('#grades').submit();
	}
	
}