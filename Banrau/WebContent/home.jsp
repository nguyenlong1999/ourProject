<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Chuyên bán rau</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="banrau.css" type="text/css" />
 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<!--  	<h1>Hello World</h1> -->
<!--  	<a href="/Banrau/JSPFile/page1.jsp" >ngáo ngáo quá</a> -->
<!--  	Chào mừng bạn đến với website của chúng tôi -->
<!--  	ádasdass -->
 	<p>Mời bạn đăng nhập</p>
	<a href="${pageContext.request.contextPath}/login">Đăng nhập</a>

<nav class="navbar navbar-inverse aqua-gradient" style="border-radius:0;position:relative">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand " href="#" style="color:#9F3" >WEBSITE BÁN RAU</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Link</a></li>
      <li><a href="#">Link</a></li>
    </ul>
    <div style=" position:absolute; right:10px; bottom:8px;">
     <ul class="nav navbar-nav flex-row">
                <li class="nav-item order-2 order-md-1"><a href="#" class="nav-link" title="settings"><i class="fa fa-cog fa-fw fa-lg"></i></a></li>
                <li class="dropdown order-1">
                    <button type="button" id="dropdownMenu1" data-toggle="dropdown" class="btn btn-outline-secondary dropdown-toggle">Login <span class="caret"></span></button>
                    <ul class="dropdown-menu dropdown-menu-right mt-2">
                       <li class="px-3 py-2">
                           <form class="form" role="form"  method="POST" action="#" >
                            <input type="hidden" name="redirectId" value="${param.redirectId}" />
                                <div class="form-group">
                                    <input id="" placeholder="Tài khoản" class="form-control form-control-sm"  name="userName" type="text"  value= "${user.userName}" />
                                </div>
                                <div class="form-group">
                                    <input id="" placeholder="Password" class="form-control form-control-sm" name="password" type="password" value= "${user.password}" />
                                </div>
                                <div class="form-group">
                                    <input type="submit" value= "Login"  class="btn btn-primary btn-block" />
                                </div>
                                <div class="form-group text-center">
                                    <small><a href="#" data-toggle="modal" data-target="#modalPassword">Forgot password?</a></small>
                                </div>
                            </form>
                        </li>
                    </ul>
                </li>
           </ul>
          </div>
  </div>
</nav>
<div class="container">
<div class="jumbotron" style="padding:0; margin:0">
 <img src="./images/Banner 1.png" width="1140px" height="397px" title="7 lợi ích sức khỏe của việc ăn rau xanh hàng ngày ">
</div>
 <div class="container-fluid" style="padding:0px" >
    <ul class="nav nav-justified navbar-default">
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#one">One</a>
      </li>
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#two">Two</a>
      </li>
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#three">Three</a>
      </li>
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#four">Four</a>
      </li>
    </ul>
</div>
<div class="container-fluid" style="padding:0; margin:0">
  <nav id="submenu">
    <ul class="nav nav-justified">
      <li>
        <ul class="nav nav-justified collapse" id="one">
          <li><a href="#" id=""></a></li>
        </ul>
       </li>
       <li>
         <ul class="nav nav-justified collapse" id="two">
            <li><a href="#" id="">Two sub 1</a></li>
          </ul>
       </li>
       <li>
          <ul class="nav nav-justified collapse" id="three">
            <li><a href="#" id="">Three sub 1</a></li>
          </ul>
       </li>
       <li>
          <ul class="nav nav-justified collapse" id="four">
            <li><a href="#" id="">Four sub 1</a></li>
          </ul>
       </li>
    </ul>
  </nav>
</div>
 
<div class="container-fluid bg-3 text-center" style="padding:0px">    
  <h3>Some of my Work</h3><br>
  <div class="row">
    <div class="col-sm-3">
      <p class="text-success" style="font-weight:bold; font-size:20px">Súp lơ</p>
      <img src="./images/sup-lo-45263.jpg" style="width:100%" alt="Image"
      title="Lợi ích của việc ăn rau xanh hàng ngày"
      >
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Bắp cải</p>
      <img src="./images/rau-xanh-tot-cho-huyet-ap.jpg" style="width:255px" height="190px" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Chuối</p>
      <img src="./images/qua chuoi.jpg" class="img-responsive" style="width:255px" height="190px" alt="Image">
    </div>
    <div class="col-sm-3">
      <p class="text-success" style="font-weight:bold; font-size:20px">Bưởi</p>
      <img src="./images/buoi_dien.jpg" style="width:100%; height:190px" alt="Image">
    </div>
  </div>
</div>
<br>

<div class="container-fluid bg-3 text-center" >    
  <div class="row">
    <div class="col-sm-3">
      <p class="text-success" style="font-weight:bold; font-size:20px">Quýt</p>
      <img src="./images/quyt.jpg" style="width:100%;height:190px" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Lê</p>
      <img src="./images/tac_dung_tuyet_voi_cua_le_skgd_UWOA.jpg" class="img-responsive" style="width:100%; height:190px" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Đào</p>
      <img src="./images/2a0d3e59f61f1f41460e.jpg" style="width:100%;height:190px" alt="Image">
    </div>
    <div class="col-sm-3">
     <p class="text-success" style="font-weight:bold; font-size:20px">Ổi</p>
      <img src="./images/qua-oi-12-pbof-1477467336129.jpg" class="img-responsive" style="width:100%;height:190px" alt="Image">
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</div>



</body>
</html>