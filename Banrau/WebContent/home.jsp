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
<%-- <jsp:include page="JSPFile/DangNhapPage.jsp"></jsp:include>    --%>

<nav class="navbar navbar-inverse aqua-gradient" style="border-radius:0;position:relative">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand " href="#" style="color:#9F3" >WEBSITE BÁN RAU</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Đăng kí</a></li>
      <li><a href="#">HEHE</a></li>
    </ul>
    <div style=" position:absolute; right:10px; bottom:8px;">
     <ul class="nav navbar-nav flex-row">
                <li class="nav-item order-2 order-md-1"><a href="#" class="nav-link" title="settings"><i class="fa fa-cog fa-fw fa-lg"></i></a></li>
                <li class="dropdown order-1">
                    <button type="button" id="dropdownMenu1" data-toggle="dropdown" class="btn btn-outline-secondary dropdown-toggle">Đăng nhập <span class="caret"></span></button>
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
                                    <small><a href="#" data-toggle="modal" data-target="#modalPassword">Quên mật khẩu ?</a></small>
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
 <img src="https://raucuoivietnhat.com/public/media/file/files/slider/Banner%201.png" width="1140px" height="397px" title="7 lợi ích sức khỏe của việc ăn rau xanh hàng ngày ">
</div>
 <div class="container-fluid" style="padding:0px" >
    <ul class="nav nav-justified navbar-default">
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#one">Thực phẩm</a>
      </li>
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#two">Hải sản</a>
      </li>
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#three">Thủy Sản</a>
      </li>
      <li class="dropdown">
        <a href="#" data-toggle="collapse" data-target="#four">Nông sản</a>
      </li>
    </ul>
</div>
<div class="container-fluid" style="padding:0; margin:0">
  <nav id="submenu">
    <ul class="nav nav-justified">
      <li>
        <ul class="nav nav-justified collapse" id="one">
          <li><a href="#" id="">Hoa quả tươi</a></li>
        </ul>
       </li>
       <li>
         <ul class="nav nav-justified collapse" id="two">
            <li><a href="#" id="">Bạch tuộc</a></li>
          </ul>
       </li>
       <li>
          <ul class="nav nav-justified collapse" id="three">
            <li><a href="#" id="">Cá trê</a></li>
          </ul>
       </li>
       <li>
          <ul class="nav nav-justified collapse" id="four">
            <li><a href="#" id="">Cà phê</a></li>
          </ul>
       </li>
    </ul>
  </nav>
</div>
 
<div class="container-fluid bg-3 text-center" style="padding:0px">    
  <h3>BÁN RAU CHUYÊN NGHIỆP</h3><br>
  <div class="row">
    <div class="col-sm-3">
      <p class="text-success" style="font-weight:bold; font-size:20px">Súp lơ</p>
      <img src="http://2sao.vietnamnetjsc.vn/images/2016/12/03/14/40/sup-lo-1480667377829.jpg" style="width:100%" alt="Image"
      title="Lợi ích của việc ăn rau xanh hàng ngày"
      >
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Bắp cải</p>
      <img src="http://hatgiongrauhoaqua.com/files/sanpham/129/1/jpg/bap-cai-f1-tn-6.jpg" style="width:255px" height="190px" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Chuối</p>
      <img src="https://znews-photo.zadn.vn/w660/Uploaded/sgorvz/2016_05_27/chuoi_xanh_1.jpg" class="img-responsive" style="width:255px" height="190px" alt="Image">
    </div>
    <div class="col-sm-3">
      <p class="textsuccess" style="font-weight:bold; font-size:20px">Bưởi</p>
      <img src="http://imgs.vietnamnet.vn/Images/2016/11/21/08/20161121081806-buoi-2.jpg" style="width:100%; height:190px" alt="Image">
    </div>
  </div>
</div>
<br>

<div class="container-fluid bg-3 text-center" >    
  <div class="row">
    <div class="col-sm-3">
      <p class="text-success" style="font-weight:bold; font-size:20px">Quýt</p>
      <img src="https://cdn.tgdd.vn/Files/2018/03/07/1072496/co-nen-an-xo-quyt-2_800x400.jpg" style="width:100%;height:190px" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Lê</p>
      <img src="https://media.ex-cdn.com/EXP/media.phunutoday.vn/files/upload_images/2015/09/01/qua-le-chua-benh.jpg" class="img-responsive" style="width:100%; height:190px" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p class="text-success" style="font-weight:bold; font-size:20px">Đào</p>
      <img src="http://sohanews.sohacdn.com/thumb_w/660/2014/2-dao-0e383-1398406870285-crop1398407072693p.jpg" style="width:100%;height:190px" alt="Image">
    </div>
    <div class="col-sm-3">
     <p class="text-success" style="font-weight:bold; font-size:20px">Ổi</p>
      <img src="http://sohanews.sohacdn.com/thumb_w/660/2017/photo-1-1496016130671-0-0-559-900-crop-1496016576430.jpg" class="img-responsive" style="width:100%;height:190px" alt="Image">
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <marquee>Liên hệ : 113     , Calll me please</marquee>
</footer>

</div>

</body>
</html>