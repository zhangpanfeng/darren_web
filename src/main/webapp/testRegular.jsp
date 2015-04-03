<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Regular</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//var regex =  /^(http|ftp|https):\/\/([a-zA-Z0-9]+(\.[a-zA-Z0-9]+){0,3})(:[0-9]{1,4})?(\/\w+)*(\/|(\.\w+)?)$/;
	var regex =  "^(http|ftp|https)://([a-zA-Z0-9]+(\.[a-zA-Z0-9]+){0,3})(:[0-9]{1,4})?(/\w+)*(/|(\.\w+)?)$"; 
	var urlRegExp = new RegExp(regex);
    
   $("#button").click(function(){
	   var url = $("#url").val();
	   var result = urlRegExp.test(url);
	   alert(url);
	   alert(result);
   });
	   
    
});
</script>
</head>
<body>
URL: <input type="text" id="url" style="width:500px; height:22px" >
<input type="button" id="button" value="测试">
</body>
</html>