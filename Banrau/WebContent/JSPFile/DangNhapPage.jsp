<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Đăng nhập</title>
</head>
<body>
<%-- <jsp:include page="_Menu.jsp"></jsp:include>    --%>
 
      <h3>Login Page</h3>
 
      <p style="color: red;">${errorString}</p>
 
      <form method="POST" action="#">
         <input type="hidden" name="redirectId" value="${param.redirectId}" />
         <table border="0">
            <tr>
               <td>User Name</td>
               <td><input type="text" name="userName" value= "${user.userName}" /> </td>
            </tr>
            <tr>
               <td>Password</td>
               <td><input type="password" name="password" value= "${user.password}" /> </td>
            </tr>
          
            <tr>
               <td colspan ="2">
                  <input type="submit" value= "Submit" />
                  <a href="${pageContext.request.contextPath}/">Cancel</a>
               </td>
            </tr>
         </table>
      </form>

      <p style="color:blue;">Login with:</p>
       
      chutich/123 <br>
      nv1/123
</body>
</html>