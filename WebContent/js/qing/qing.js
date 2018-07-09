function superAreachange() {
	var superArea =$('#superArea').val();
	$.ajax({
		type: "post",
		url: "superAreachange",
		data:{"superAreaid" : superArea},
		success: function(data) {
            var len = data.length;
            //debugger;
            	$("#lowerArea").empty();
            	$("#lowerArea").append("<option value='0'>--请选择--</option>");
            for(var i = 0;i<len;i++) {
            	var id = data[i].id;
                var areaDescribe = data[i].areaDescribe; 
                $("#lowerArea").append("<option value='"+ id+ "'>" + areaDescribe + "</option>");
            }
		}
		
	});
}
function search(){
	
	$.ajax({
		type: "post",
		url: "getTable",
		data: $('#annosearch').serialize(),
		success: function(data){
			$("#dataTables-example tbody").html("");
			var len = data.length;
			for(var i = 0;i<len;i++) {
				debugger;
				var sex = data[i].sex==1 ? '男':'女';
				var tutors = data[i].tutors;
				var tutorlen = tutors.length;
				var tutortd = '';
				for (var j = 0;j<tutorlen;j++) {
					tutortd = tutortd + '【' +tutors[j].typeDescribe + '】';
				}
				var areas = data[i].areas;
				var arealen = areas.length;
				var areatd = '';
				for (var m = 0;m<tutorlen;m++) {
					areatd = areatd + '【' +areas[m].areaDescribe + '】';
				}
				var yybutton = '<button class="btn btn-default" type="button" onclick="yuyue()">预约</button>';
				$("#dataTables-example tbody").append('<tr class="gradeC">'+
						'<td align="center"><a href="tercherinfo/'+data[i].teacuuid +'"><img class="lady" src=\''+data[i].headimg+'\'/><br>'+data[i].realname + '&nbsp;&nbsp;&nbsp;&nbsp;' + sex + '<a></td>' + 
						'<td align="center">'+tutortd +'</td>'+
				        '<td align="center">'+areatd+'</td>'+
				        '<td align="center" class="price">'+data[i].price+'</td>' +
				        '<td align="center">'+yybutton+'</td></tr>');
			}
		}
	
	});
	
}

function tutor(typeid){
	$("select#typeid").val(typeid);
	search();
}
function school(scuuid) {
	$("select#scuuid").val(scuuid);
	search();
}

function area(id) {
	$("select#lowerArea").val(id);
	search();
}

function yuyue(teacuuid){
	debugger;
	$.ajax({
		type: "post",
		url: "user/stuappoint",
		data: {"teacuuid": teacuuid},
		success: function(data) {
			if(data=='login'){
				alert("请登录");
				window.location.href = 'login';
			}
			if(data == 'success') {
				window.location.href = 'accountSetting?ifreamid=2';
			}
			if(data == 'failed') {
				alert("网络繁忙，请重试");
			}
			if(data == 'notstudent') {
				alert("不是学员登录，请注册学员或者使用学员账号登录");
			}
			
		},
		error: function(data) {
			alert("未登录或者网络异常");
		}
	})
	
}
