<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Home</title>
    <meta charset="utf-8">
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
</head>
<body>
<!-- Start Header Top area -->
<div class="header-top">
    <div class="container">
        <div class="row">
            <%--<div class="col-md-5 col-sm-6">--%>
                <%--&lt;%&ndash;<div class="phone-mail-area">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<ul>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<li>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<a href="#"><i class="fa fa-phone"></i>+123 456 789 000</a>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<li>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<a href="mailto:admin@bootexperts.com"><i class="fa fa-envelope-o"></i>admin@bootexperts.com</a>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
            <%--</div>--%>
            <%--<div class="col-md-7 col-sm-6">--%>
                <%--<div class="login-bookmark-area">--%>
                    <%--<div class="register-login">--%>
                        <%--<a href="#"><i class="fa fa-user"></i>Login</a>--%>
                        <%--<a href="#"><i class="fa fa-sign-in"></i>Register</a>--%>
                    <%--</div>--%>
                    <%--&lt;%&ndash;<div class="top-bookmark">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<ul>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<li><a href="#"><i class="fa fa-facebook"></i></a></li>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<li><a href="#"><i class="fa fa-twitter"></i></a></li>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<li><a href="#"><i class="fa fa-pinterest"></i></a></li>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<li><a href="#"><i class="fa fa-linkedin"></i></a></li>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<li><a href="#"><i class="fa fa-google-plus"></i></a></li>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                <%--</div>--%>
            <%--</div>--%>
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
                    <a href="#"><img src="static/static/img/logo.png" alt=""></a>
                </div>
                <!-- Logo End -->
            </div>
            <%--<div class="col-md-9">--%>
                <%--<!-- Main Menu Start -->--%>
                <%--<div class="main-menu">--%>
                    <%--<nav>--%>
                        <%--<ul id="nav">--%>
                            <%--<li class="active"><a href="#">Home</a>--%>
                                <%--<ul class="sub-menu">--%>
                                    <%--<li><a href="#">Homepage Version 2</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">PROPERTIES</a>--%>
                                <%--<ul class="sub-menu">--%>
                                    <%--<li><a href="#">Properties  1 Column</a></li>--%>
                                    <%--<li><a href="#">Properties  2 Column</a></li>--%>
                                    <%--<li><a href="#">Properties  3 Column</a></li>--%>
                                    <%--<li><a href="#">Single Properties</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">aGENTS</a>--%>
                                <%--<ul class="sub-menu">--%>
                                    <%--<li><a href="#">Agent</a></li>--%>
                                    <%--<li><a href="#">Single Agent</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">Pages</a>--%>
                                <%--<div class="mega-menu">--%>
									<%--<span>--%>
										<%--<a href="#">404</a>--%>
										<%--<a href="#">contact Us</a>--%>
										<%--<a href="#">Team </a>--%>
										<%--<a href="#">Team Single Member</a>--%>
									<%--</span>--%>
                                    <%--<span>--%>
										<%--<a href="#">property</a>--%>
										<%--<a href="#">property two column</a>--%>
										<%--<a href="#">property three column </a>--%>
										<%--<a href="#">Single Property</a>--%>
									<%--</span>--%>
                                    <%--<span>--%>
										<%--<a href="#">FAQ</a>--%>
										<%--<a href="#">Blog Right Sidebar</a>--%>
										<%--<a href="#">Blog left Sidebar</a>--%>
										<%--<a href="#">single post</a>--%>
									<%--</span>--%>
                                <%--</div>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">blog</a>--%>
                                <%--<ul class="sub-menu">--%>
                                    <%--<li><a href="#">Blog Right Sidebar</a></li>--%>
                                    <%--<li><a href="#">Blog left Sidebar</a></li>--%>
                                    <%--<li><a href="#">Single Blog Post</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">FAQs</a></li>--%>
                            <%--<li><a href="#">contact</a></li>--%>
                        <%--</ul>--%>
                    <%--</nav>--%>
                <%--</div>--%>
                <%--<!-- Main Menu End -->--%>
            <%--</div>--%>
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
                    <%--<nav id="mobile-menu">--%>
                        <%--<ul>--%>
                            <%--<li><a href="#">Home</a>--%>
                                <%--<ul>--%>
                                    <%--<li><a href="#">Home 2</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">Property</a>--%>
                                <%--<ul>--%>
                                    <%--<li><a href="#">property two column</a></li>--%>
                                    <%--<li><a href="#">property three column</a></li>--%>
                                    <%--<li><a href="#">Single Property</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">Agent</a>--%>
                                <%--<ul>--%>
                                    <%--<li><a href="#">agent</a></li>--%>
                                    <%--<li><a href="#">Single Agent</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">Blog</a>--%>
                                <%--<ul>--%>
                                    <%--<li><a href="#">Blog Left</a></li>--%>
                                    <%--<li><a href="#">Blog Right</a></li>--%>
                                    <%--<li><a href="#">Single Post</a></li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>
                            <%--<li><a href="#">FAQ</a></li>--%>
                            <%--<li><a href="#">Contact</a></li>--%>
                        <%--</ul>--%>
                    <%--</nav>--%>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- mobile-menu-area end -->
<!-- Slider area Start -->
<%--<section class="slider-section ">--%>
    <%--<div class="item">--%>
        <%--<div class="item">--%>
            <%--<img src="static/static/img/slider/1.jpg" alt="">--%>
            <%--<div class="slide-content carousel-caption hidden-xs">--%>
                <%--<div class="slide-content-top">--%>
                    <%--<h1>Relax Home</h1>--%>
                    <%--<h2>786 relax avenue, Lafayette, US</h2>--%>
                    <%--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tempor arcu non ligula convallis, vel tincidunt ipsum posuere. Fusce sodales lacus ut pellentesque sollicitudin.</p>--%>
                <%--</div>--%>
                <%--<div class="slide-property-detail">--%>
                    <%--<ul>--%>
                        <%--<li>4 BEDRoom</li>--%>
                        <%--<li>4BATHroom</li>--%>
                        <%--<li> 3250 SQ.FT</li>--%>
                        <%--<li> $ 1,23,000.000</li>--%>
                        <%--<li class="slider-btn"><a href="#">purchase</a></li>--%>
                    <%--</ul>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--&lt;%&ndash;<div class="item">&ndash;%&gt;--%>
        <%--&lt;%&ndash;<img src="static/img/slider/2.jpg" alt="">&ndash;%&gt;--%>
        <%--&lt;%&ndash;<div class="slide-content carousel-caption hidden-xs">&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<div class="slide-content-top">&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<h1>Relax Apartment</h1>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<h2>786 relax avenue, Lafayette, US</h2>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tempor arcu non ligula convallis, vel tincidunt ipsum posuere. Fusce sodales lacus ut pellentesque sollicitudin.</p>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;</div>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;<div class="slide-property-detail">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<ul>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<li>4 BEDRoom</li>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<li>4BATHroom</li>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<li> 3250 SQ.FT</li>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<li> $ 1,23,000.000</li>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<li class="slider-btn"><a href="#">purchase</a></li>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
<%--</section>--%>
<!-- Slider Area End -->
<!-- Property query area start -->
<section class="property-query-area">
    <div class="container">
        <%--<div class="row">--%>
            <%--<div class="col-md-3 col-sm-6">--%>
                <%--<div class="query-title">--%>
                    <%--<h2>Find your Property</h2>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="row">
            <form action="#">
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label for="keyword-input">关键字</label>
                        <input type="text" id="keyword-input" placeholder="任意">
                        <label>室</label>
                        <select name="room">
                            <option value="" selected>任意</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label>租房类型</label>
                        <select>
                            <option value="0" selected>任意</option>
                            <option value="整租">整租</option>
                            <option value="合租">合租</option>
                        </select>
                        <label>厅</label>
                        <select>
                            <option value="hall" selected>任意</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label>地址</label>
                        <input type="text" id="" placeholder="任意">
                        <label>房屋面积（单位：平方米）</label>
                        <select>
                            <option value="">任意</option>
                            <option value="30">30以下</option>
                            <option value="30-50">30-50</option>
                            <option value="50-80">50-80</option>
                            <option value="80-100">80-100</option>
                            <option value="100-120">100-120</option>
                            <option value="120">120以上</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-query">
                        <label>租金（单位：元）</label>
                        <select>
                            <option value="" selected>任意</option>
                            <option value="500">500以下</option>
                            <option value="500-800">500-800</option>
                            <option value="800-1000">800-1000</option>
                            <option value="1000-1500">1000-1500</option>
                            <option value=" 1500-2000">1500-2000</option>
                            <option value="2000-3000">2000-3000</option>
                            <option value="3000-5000">3000-5000</option>
                            <option value="5000">5000+</option>
                        </select>
                        <label>朝向</label>
                        <select>
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
<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>

<%--<section class="properties-area area-pading fix">--%>
    <div class="container">
        <!--Start of Recent Single Recent Properties  Area -->
        <div class="row">
            <div class="col-md-4 col-sm-6">
                <div class="single-featured-properties">
                    <div class="properties-image">
                        <a href="#"><img src="static/img/properties/4.jpg" alt=""></a>
                    </div>
                    <div class="sale-tag">
                        <p>For Sale</p>
                    </div>
                    <div class="properties-include">
                        <ul>
                            <li><i class="fa fa-home"></i> 30,000 Acres</li>
                            <li><i class="fa fa-bed"></i>4 Bedrooms</li>
                            <li><i class="fa fa-tty"></i> 4 Bathrooms</li>
                        </ul>
                    </div>
                    <div class="properties-content">
                        <h3><a href="#">South Mervin Boulevard001</a></h3>
                        <p><i class="fa fa-map-marker"></i> Merrick Way, Miami, USA</p>
                        <p class="detail-text">Lorem ipsum dolor sit amet, consectetuer adipiing elit. Aenean commodo ligula eget dolor. </p>
                        <div class="price-detail">
                            <p class="price-range pull-left">$ 1,23,00.000</p>
                            <a href="#" class="price-detail pull-right">Details <i class="fa fa-angle-right"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End of Single properties -->
            <div class="col-md-4 col-sm-6">
                <div class="single-featured-properties">
                    <div class="properties-image">
                        <a href="#"><img src="static/img/properties/5.jpg" alt=""></a>
                    </div>
                    <div class="sale-tag">
                        <p>For Sale</p>
                    </div>
                    <div class="properties-include">
                        <ul>
                            <li><i class="fa fa-home"></i> 30,000 Acres</li>
                            <li><i class="fa fa-bed"></i>4 Bedrooms</li>
                            <li><i class="fa fa-tty"></i> 4 Bathrooms</li>
                        </ul>
                    </div>
                    <div class="properties-content">
                        <h3><a href="#">South Mervin Boulevard002</a></h3>
                        <p><i class="fa fa-map-marker"></i> Merrick Way, Miami, USA</p>
                        <p class="detail-text">Lorem ipsum dolor sit amet, consectetuer adipiing elit. Aenean commodo ligula eget dolor. </p>
                        <div class="price-detail">
                            <p class="price-range pull-left">$ 1,23,00.000</p>
                            <a href="#" class="price-detail pull-right">Details <i class="fa fa-angle-right"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End of Single properties -->
            <div class="col-md-4 col-sm-6">
                <div class="single-featured-properties">
                    <div class="properties-image">
                        <a href="#"><img src="static/img/properties/6.jpg" alt=""></a>
                    </div>
                    <div class="sale-tag">
                        <p>For Sale</p>
                    </div>
                    <div class="properties-include">
                        <ul>
                            <li><i class="fa fa-home"></i> 30,000 Acres</li>
                            <li><i class="fa fa-bed"></i>4 Bedrooms</li>
                            <li><i class="fa fa-tty"></i> 4 Bathrooms</li>
                        </ul>
                    </div>
                    <div class="properties-content">
                        <h3><a href="#">South Mervin Boulevard003</a></h3>
                        <p><i class="fa fa-map-marker"></i> Merrick Way, Miami, USA</p>
                        <p class="detail-text">Lorem ipsum dolor sit amet, consectetuer adipiing elit. Aenean commodo ligula eget dolor. </p>
                        <div class="price-detail">
                            <p class="price-range pull-left">$ 1,23,00.000</p>
                            <a href="#" class="price-detail pull-right">Details <i class="fa fa-angle-right"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End of Single properties -->
            <div class="col-md-4 col-sm-6">
                <div class="single-featured-properties">
                    <div class="properties-image">
                        <a href="#"><img src="static/img/properties/4.jpg" alt=""></a>
                    </div>
                    <div class="sale-tag">
                        <p>For Sale</p>
                    </div>
                    <div class="properties-include">
                        <ul>
                            <li><i class="fa fa-home"></i> 30,000 Acres</li>
                            <li><i class="fa fa-bed"></i>4 Bedrooms</li>
                            <li><i class="fa fa-tty"></i> 4 Bathrooms</li>
                        </ul>
                    </div>
                    <div class="properties-content">
                        <h3><a href="#">South Mervin Boulevard004</a></h3>
                        <p><i class="fa fa-map-marker"></i> Merrick Way, Miami, USA</p>
                        <p class="detail-text">Lorem ipsum dolor sit amet, consectetuer adipiing elit. Aenean commodo ligula eget dolor. </p>
                        <div class="price-detail">
                            <p class="price-range pull-left">$ 1,23,00.000</p>
                            <a href="#" class="price-detail pull-right">Details <i class="fa fa-angle-right"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End of Single properties -->
            <div class="col-md-4 col-sm-6">
                <div class="single-featured-properties">
                    <div class="properties-image">
                        <a href="#"><img src="static/img/properties/4.jpg" alt=""></a>
                    </div>
                    <div class="sale-tag">
                        <p>For Sale</p>
                    </div>
                    <div class="properties-include">
                        <ul>
                            <li><i class="fa fa-home"></i> 30,000 Acres</li>
                            <li><i class="fa fa-bed"></i>4 Bedrooms</li>
                            <li><i class="fa fa-tty"></i> 4 Bathrooms</li>
                        </ul>
                    </div>
                    <div class="properties-content">
                        <h3><a href="#">South Mervin Boulevard005</a></h3>
                        <p><i class="fa fa-map-marker"></i> Merrick Way, Miami, USA</p>
                        <p class="detail-text">Lorem ipsum dolor sit amet, consectetuer adipiing elit. Aenean commodo ligula eget dolor. </p>
                        <div class="price-detail">
                            <p class="price-range pull-left">$ 1,23,00.000</p>
                            <a href="#" class="price-detail pull-right">Details <i class="fa fa-angle-right"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End of Single properties -->
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
                    <p>Copyright &copy; 2019.XXXXXXXXXXX</p>
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





