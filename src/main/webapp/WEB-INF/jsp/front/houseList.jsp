<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!doctype html>
<html lang="en">
<head>
    <!-- Basic page needs
    ======================================-->
    <base href="<%=basePath%>">
    <title>房源总汇</title>
    <meta charset="utf-8">
    <meta name="referrer" content="no-referrer" />
    <meta name="author" content="">
    <meta name="description" content="">
    <meta name="keywords" content="">

    <!-- Mobile specific meat
    ==============================================-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <!-- Favicon
    ============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="static/static/img/favicon.ico">

    <!-- Template Fonts form google
    =============================================-->
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>

    <!-- Theme main CSS File
    ==========================================================-->

    <link rel="stylesheet" href="static/css/test.css">

    <!-- Mordernizer Js -->
    <script src="js/modernizr-2.8.3.min.js"></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <script>
      function myAlert() {
        var message = "${message}";
        var messageStr = message.toString();
        if (null != messageStr && !"".endsWith(messageStr)) {
          alert(messageStr);
        }

      }

      function fang() {
        if (confirm("是否开始，爬取房天下房源信息？")) {
          window.location.href = "crawl/fang";
          alert("即将开始爬取，请耐心等待，请勿刷新页面！！！！！");
        }

      }
      function anjuke() {
        if (confirm("是否开始，爬取房天下房源信息？")) {
          window.location.href = "crawl/anjuke";
          alert("即将开始爬取，请耐心等待，请勿刷新页面！！！！！");
        }

      }
    </script>
</head>
<body onload="myAlert()">
<!-- Start Header Top area -->
<div class="header-top">
    <div class="container">
        <div class="row">

        </div>
    </div>
</div>
<!-- End of Header Top area -->
<!-- Header Area Start -->
<header class="header-area">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <!-- Logo Start -->
                <div class="logo-wrap">
                </div>
                <!-- Logo End -->
            </div>
        </div>
    </div>
</header>
<!-- Header Area End -->
<!-- mobile-menu-area start -->
<div class="mobile-menu-area">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="mobile-menu">
                    <div class="logo">
                        <a href="#"><img src="static/static/img/logo2.jpg" alt="" /></a>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<!-- Property query area start -->
<section class="property-query-area">
    <div class="container">
        <button onclick="fang()">爬取房天下</button>
        <button onclick="anjuke()">爬取安居客</button>

        <div class="row">

            <form action="house/seach" method="post">
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label for="keyword-input">关键字</label>
                        <input type="text" id="keyword-input" name="title" placeholder="任意">
                        <label>室</label>
                        <select name="roomSum">
                            <option value="-1" selected>任意</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5以上</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label>租房类型</label>
                        <select name="rentType">
                            <option value="" selected>任意</option>
                            <option value="整租">整租</option>
                            <option value="合租">合租</option>
                        </select>
                        <label>厅</label>
                        <select name="hallSum">
                            <option value="-1" selected>任意</option>
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3以上</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label>地址</label>
                        <input type="text" id="" name="addr" placeholder="任意">
                        <label>房屋面积（单位：平方米）</label>
                        <select name="areaRange">
                            <option value="">任意</option>
                            <option value="0-30">30以下</option>
                            <option value="30-50">30-50</option>
                            <option value="50-80">50-80</option>
                            <option value="80-100">80-100</option>
                            <option value="100-120">100-120</option>
                            <option value="120-500">120以上</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label>租金（单位：元）</label>
                        <select name="monthlyRentRange">
                            <option value="" selected>任意</option>
                            <option value="0-500">500以下</option>
                            <option value="500-800">500-800</option>
                            <option value="800-1000">800-1000</option>
                            <option value="1000-1500">1000-1500</option>
                            <option value="1500-2000">1500-2000</option>
                            <option value="2000-3000">2000-3000</option>
                            <option value="3000-5000">3000-5000</option>
                            <option value="5000-20000">5000+</option>
                        </select>
                        <label>朝向</label>
                        <select name="faceTo">
                            <option value="" selected>任意</option>
                            <option value="东">东</option>
                            <option value="南">南</option>
                            <option value="西">西</option>
                            <option value="北">北</option>
                        </select>
                    </div>
                    <div class="query-submit-button pull-right">

                        <input type="submit" value="搜索">

                    </div>
                </div>
            </form>

        </div>
    </div>
</section>
<!--Property query area End-->
<%--<section class="properties-area area-pading fix">--%>
    <div class="container">
        <!--Start of Recent Single Recent Properties  Area -->

        <div class="row">
        <c:forEach items="${houseInfoList}" var="houseInfoList">
            <div class="col-md-4 col-sm-6" style="overflow:auto;white-space:nowrap;width: 50%;">
                <div class="single-featured-properties">
                    <div class="properties-image">
                        <img src="${houseInfoList.fristImg}" alt="">

                    </div>
                    <br>
                    <div>

                        <h3 style="font-size: 18px;font-weight: bold" l>${houseInfoList.title}</h3>
                    </div>

                    <div class="properties-include">

                        <ul>

                            <li><i class="fa fa-home"></i>${houseInfoList.area} 平方米</li>
                            <li><i class="fa fa-bed"></i>${houseInfoList.roomType}</li>
                            <li><i class="fa fa-tty"></i> ${houseInfoList.monthlyRent} 元</li>
                            <li><i class="fa fa-tty"></i> ${houseInfoList.rentType}</li>
                            <li><i class="fa fa-tty"></i> ${houseInfoList.faceTo}</li>
                            <li><i class="fa fa-tty"></i> ${houseInfoList.payType}</li>
                            <li><i class="fa fa-tty"></i> ${houseInfoList.floor}</li>

                        </ul>
                    </div>
                    <div class="properties-content">

                        <p><i class="fa fa-map-marker"></i> ${houseInfoList.addr}</p>
                        <div class="price-detail">
                            <p class="price-range pull-left">发布日期：${houseInfoList.releaseDate}</p>
                            <p class="price-range pull-right">装修情况：${houseInfoList.decoration}</p>
                            <br><br>
                            <p class="price-range pull-left">来源：${houseInfoList.source}</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End of Single properties -->
        </c:forEach>
        </div>
        <!-- End of Recent Single Recent Properties  Area -->
    </div>
<!-- Footer Top Area End Hear-->
<!-- Footer Area Start Hear-->
<footer class="footer-area">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6">
                <div class="copy-right-text">
                    <p>Copyright &copy; 2019.沈阳航空航天大学</p>
                </div>
            </div>

        </div>
    </div>
</footer>
<!-- Footer Area End Hear-->

<!-- Placed js at the end of the document so the pages load faster -->
<!-- Main jQuery file -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Bootstrap Js -->
<script src="js/bootstrap.min.js"></script>
<!-- Owl carousel js -->
<script src="js/owl.carousel.min.js"></script>
<!-- scroll up js -->
<script src="js/jquery.scrollUp.min.js"></script>
<!-- BX Slider js -->
<script src="js/jquery.bxslider.min.js"></script>
<!-- wow js -->
<script src="js/wow.min.js"></script>
<!-- meanmenu js -->
<script src="js/jquery.meanmenu.js"></script>
<!-- Initialize WOW js for Animation-->
<script>
    new WOW().init();
</script>
<!-- Theme jQuery Codes goes hear -->
<script src="js/script.js"></script>
</body>
<!-- Body End  -->
</html>





