<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Th�ng tin</title>
</head>
<body>
<jsp:include page="_Menu.jsp"></jsp:include>
 
      <h3>Hello: ${loginedUser.userName}</h3>
 
      User Name: <b>${loginedUser.userName}</b>
      <br>
      Gender: ${loginedUser.gender } <br>
</body>
</html>