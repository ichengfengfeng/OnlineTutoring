function confirm() {
    	debugger;
    	$.ajax({
    		type: "post",
    		url: "../confirmsub",
    		data: $('#confirmtime').serialize(),
    		success: function(data){
    			if(data=='success')
    				alert("修改成功");
    		},
    		error: function(){
    			alert("未登录或者网络异常");
    		}
    	})
}
