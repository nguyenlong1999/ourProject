<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<a href="${pageContext.request.contextPath}/logout">
 <h1>Logout</h1> 
</a>
<span style="color:red">[ ${loginedUser.userName} ]</span>
</head>
</html>