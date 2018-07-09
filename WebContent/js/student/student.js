function search(){
	$.ajax({
		type: "post",
		url: "getStuTable",
		data: $('#stuannosearch').serialize(),
		success: function(data){
			$("#dataTables-example tbody").html("");
			var len = data.length;
			for(var i = 0;i<len;i++) {
				debugger;
				var usersex = data[i].usersex==0 ? '':(data[i].usersex==1 ? '男':'女');
				var sex = data[i].sex==0 ? '无':(data[i].sex==1 ? '男':'女');
				var other_desc = data[i].other_desc==null? '无':data[i].other_desc;
				$("#dataTables-example tbody").append('<tr>'+
						'<td>'+ data[i].stuannouuid+ '</td>' +
						'<td>'+ data[i].realname+ '<br>'+data[i].gradename + '【' +usersex + '】' + '<br>' +data[i].phone+  '<br>'+data[i].address +'</td>' + 
						'<td>'+data[i].type_describe +'</td>'+
				        '<td>'+data[i].area_describe+'</td>'+
				        '<td>'+sex+'</td>' +
				        '<td>'+other_desc+'</td>' +
				        '<td> <button class="btn btn-default" type="button" onclick="yuyue(&apos;'+data[i].stuannouuid+'&apos;,&apos;'+ data[i].stuuuid+'&apos;)">预约</button></td></tr>');
				
			}
		}
	
	});
	
}

function superAreachange() {
	var superArea =$('#superArea').val();
	$.ajax({
		type: "post",
		url: "/OnlineTutoring/superAreachange",
		data:{"superAreaid" : superArea},
		success: function(data) {
//			var json = eval('('+data+')'); //数组     
            var len = data.length;
            //debugger;
            	$("#lowerArea").empty();
            	$("#lowerArea").append("<option value='0'>--请选择--</option>");
            for(var i = 0;i<len;i++) {
            	var id = data[i].id;
                var areaDescribe = data[i].areaDescribe; 
                $("#lowerArea").append("<option value='"+ id+ "'>" + areaDescribe + "</option>");
            }
		},
		error: function() {
			alert("未登录或者网络异常");
		}
	});
}


function yuyue(stuannouuid,stuuuid){
	debugger;
	$.ajax({
		type: "post",
		url: "user/appoint",
		data: {"stuannouuid":stuannouuid,"stuuuid":stuuuid},
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
			if(data == 'notteacher') {
				alert("不是教员登录，请注册教员或者使用教员账号登录");
			}
			
		},
		error: function(data) {
			alert("未登录或者网络异常");
		}
	})
	
}

function check() {
	
	
}