// JavaScript Document
$(document).ready(function() {
	var stt = 1;
	$("img.imgslide").each(function() {
		if($(this).is(':visible'))
		stt = $(this).attr("stt");
	});
	$("#next").click(function(){
		next = ++stt;
		$("img.imgslide").hide();
		$("img.imgslide").eq(next).show();
	});
	$("#prev").click(function(){
		prev = --stt;
		$("img.imgslide").hide();
		$("img.imgslide").eq(prev).show();
	});
});