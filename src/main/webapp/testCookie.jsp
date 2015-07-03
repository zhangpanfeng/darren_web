<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    
});
</script>
</head>
<body>
<%
Cookie cookie = new Cookie("hi",null);
//cookie.setPath("/");
cookie.setMaxAge(60);
cookie.setDomain("/test");
out.print("sss");
out.print(cookie);
out.print(response);
response.addCookie(cookie);
%>
</body>
</html>