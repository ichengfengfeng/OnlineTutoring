function add() {
	$.ajax({
		type: "post",
		url: "add",
		data: $('#addschool').serialize(),
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

function deleteschools(){
	 $('#schools').submit();
}

function deleteschool(scuuid) {
	debugger;
	if(confirm("您确定删除吗？")==true) {
		$("input:checkbox[value='"+scuuid+"']").attr('checked','true');
		$('#schools').submit();
	}
}