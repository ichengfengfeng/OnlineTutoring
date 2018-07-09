function deletetypes(){
	 $('#tutortypes').submit();
}

function deletetype(typeid) {
	debugger;
	if(confirm("您确定删除吗？")==true) {
		$("input:checkbox[value='"+typeid+"']").attr('checked','true');
		$('#tutortypes').submit();
	}
	
}