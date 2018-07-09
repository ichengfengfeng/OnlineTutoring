function stuevaluate(appointmentid,teacuuid){
	debugger;
	$.ajax({
		type: "post",
		url: "pingjia",
		data: {"appointmentid": appointmentid},
		success: function(data) {
			if(data=='success'){
				top.location.href = '../tercherinfo/'+teacuuid;
			}
		},
		error: function() {
			alert("网络繁忙");
		}
		
	})
}
