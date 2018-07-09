var version = 0;
function astutor() {
	version = version + 1;
	debugger;
	$.ajax({
		type: "post",
		url: "tutorForm/" + version,
		data: $('#asTutorForm').serialize(),
		success: function(data) {
			debugger;
			if(data == 'repeat') {
				alert("请勿重复提交！！");
				window.location.reload();
			}
			if(data == "true") {
				document.getElementById("clickSuccess").click(); 
				 $("#success").html("");
				 $("#success").html("恭喜你，操作成功");
				 version = 0;
			}
			if (data == "false") {
				 document.getElementById("clickSuccess").click(); 
				 $("#success").html("");
				 $("#success").html("对不起，操作失误请重新操作");
				 version = 0;
			}
			if (data == 'login') {
				window.location.href = '../login';
			}
		}
		
	});
	
	
}


function nextstep(step) {
	if(step==2)
		document.getElementById("thirdstep").click(); 
	if(step==1)
		document.getElementById("secondstep").click(); 
}

function laststep(step) {
	if(step==2)
		document.getElementById("firststep").click(); 
	if(step==3)
		document.getElementById("secondstep").click(); 
}