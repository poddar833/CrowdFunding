<%-- 
    Document   : index
    Created on : Jul 10, 2016, 8:29:21 PM
    Author     : Abhishek Poddar 
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
   <head>
<!-- Meta Tags -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Glucili.com</title>   

<meta name="description" content="Insert Your Site Description" /> 

<!-- Mobile Specifics -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="HandheldFriendly" content="true"/>
<meta name="MobileOptimized" content="320"/>   

<!-- Mobile Internet Explorer ClearType Technology -->
<!--[if IEMobile]>  <meta http-equiv="cleartype" content="on">  <![endif]-->

<!-- Bootstrap -->
<link href="_include/css/bootstrap.min.css" rel="stylesheet">

<!-- Main Style -->
<link href="_include/css/main.css" rel="stylesheet">

<!-- Supersized -->
<link href="_include/css/supersized.css" rel="stylesheet">
<link href="_include/css/supersized.shutter.css" rel="stylesheet">

<!-- FancyBox -->
<link href="_include/css/fancybox/jquery.fancybox.css" rel="stylesheet">

<!-- Font Icons -->
<link href="_include/css/fonts.css" rel="stylesheet">

<!-- Shortcodes -->
<link href="_include/css/shortcodes.css" rel="stylesheet">

<!-- Responsive -->
<link href="_include/css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="_include/css/responsive.css" rel="stylesheet">

<!-- Supersized -->
<link href="_include/css/supersized.css" rel="stylesheet">
<link href="_include/css/supersized.shutter.css" rel="stylesheet">

<!-- Google Font -->
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>

<!-- Fav Icon -->
<link rel="shortcut icon" href="#">

<link rel="apple-touch-icon" href="#">
<link rel="apple-touch-icon" sizes="114x114" href="#">
<link rel="apple-touch-icon" sizes="72x72" href="#">
<link rel="apple-touch-icon" sizes="144x144" href="#">

<!-- Modernizr -->
<script src="_include/js/modernizr.js"></script>

<!-- Analytics -->
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'Insert Your Code']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
<!-- End Analytics -->

</head>

    <body>
        <% if(session.getAttribute("name")==null) {
         %>
         <jsp:include page="header.jsp">
             <jsp:param  value="Login" name="name"/>
             <jsp:param value="login.jsp" name="link" />
             
             
         </jsp:include>
         <%  } 
        else{
         %>
         <jsp:include page="header.jsp">
             <jsp:param value="Logout" name="name" />
             <jsp:param value="logout.jsp" name="link" />
         </jsp:include>
         <% } %>
         
        	

<!-- Our Shortcodes Section -->
<div id="shortcodes" class="page">
	<div class="container">   

        
        
        <!-- Start Buttons/Video Responsive Section -->
        <div class="row">
        	<!-- Start Buttons -->
        	<div class="span6">
            	<h3 class="spec"> Easiest way to crowdfund</h3>
                <br/>
                
                <h4> <span style="font-family: wingdings; font-size: 200%; color:#2a85a0 ">&#252;</span> &nbsp; &nbsp;Sign up for free</h4>
                 <h4> <span style="font-family: wingdings; font-size: 200%; color:#2a85a0 ">&#252;</span> &nbsp; &nbsp;Daily access to funds</h4>
      
                <h4> <span style="font-family: wingdings; font-size: 200%; color:#2a85a0 ">&#252;</span> &nbsp; &nbsp;24 X 7  email support</h4>
                          <h4> <span style="font-family: wingdings; font-size: 200%; color:#2a85a0 ">&#252;</span> &nbsp; &nbsp;Indian and foreign donations</h4>
                <h4> <span style="font-family: wingdings; font-size: 200%; color:#2a85a0 ">&#252;</span> &nbsp; &nbsp;No time-limit or minimum goals</h4>
               
                
                

                
            </div>
            <!-- End Buttons -->
            
            <!-- Start Video -->
            <div class="span6">
            	<h3 class="spec">What is Crowd Funding</h3>
                <div class="video-container">
                    <video style="border:2 " src="video/CrowdFunding.mp4"  onclick="$('video').pause()"></video>
		</div>
            </div>	
            <!-- End Video -->
            
        </div>
        <!-- End Buttons/Video Responsive Section -->
     
        
      
    </div>
</div>
<!-- End Shortcodes Section -->

		





<!-- *************************************************************************************** -->

<!-- Our Work Section -->
<div id="about" class="page-alternate">
<div class="container">
    <!-- Title Page -->
    
        <div class="span12">
            <div class="title-page">
                <h2 class="title">Our Projects</h2>
                
            </div>
        </div>
   
	
    <!-- End Title Page -->
    
    <!-- People -->
    <div class="row">
    	
        <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">CTO/Founder</span>
                </div>
                <img src="_include/img/profile/profile-01.jpg" alt="John Doe">
            </div>
           
        </div>
        <!-- End Profile -->
        
        <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Creative Director</span>
                </div>
                <img src="_include/img/profile/profile-02.jpg" alt="Jane Helf">
            </div>
           
        </div>
        <!-- End Profile -->
		
		  <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Creative Director</span>
                </div>
                <img src="_include/img/profile/profile-02.jpg" alt="Jane Helf">
            </div>
           
        </div>
        <!-- End Profile -->
		  <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Creative Director</span>
                </div>
                <img src="_include/img/profile/profile-02.jpg" alt="Jane Helf">
            </div>
           
        </div>
        <!-- End Profile -->
		  <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Creative Director</span>
                </div>
                <img src="_include/img/profile/profile-02.jpg" alt="Jane Helf">
            </div>
           
        </div>
        <!-- End Profile -->
        
        <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Lead Designer</span>
                </div>
                <img src="_include/img/profile/profile-03.jpg" alt="Joshua Insanus">
            </div>
           
        </div>
        <!-- End Profile -->
        
    </div>
    <!-- End People -->
    
</div>
    
</div>

<!-- *************************************************************************************** -->








<!-- *************************************************************************************** -->

<!-- About Section -->
<div id="about" class="page-alternate">
<div class="container">
    <!-- Title Page -->
    <div class="row">
        <div class="span12">
            <div class="title-page">
                <h2 class="title">About Us</h2>
                <h3 class="title-description">Learn About our Team &amp; Culture.</h3>
            </div>
        </div>
    </div>
    <!-- End Title Page -->
    <!-- People -->
    <div class="row">
    	
        <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">CEO/Founder</span>
                </div>
                <img src="_include/img/profile/profile-01.jpg" alt="John Doe">
            </div>
            <h3 class="profile-name">Sudhir Kumar Sinha</h3>
            <p class="profile-description"></p>
            	
            <div class="social">
            	<ul class="social-icons">
                    <li><a href="#"><i class="font-icon-social-twitter"></i></a></li>
                    <li><a href="#"><i class="font-icon-social-linkedin"></i></a></li>
                    <li><a href="#"><i class="font-icon-social-google-plus"></i></a></li>
                </ul>
            </div>
        </div>
        <!-- End Profile -->
        
        <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Managing Director</span>
                </div>
                <img src="_include/img/profile/profile-02.jpg" alt="Ayush Bhalla">
            </div>
            <h3 class="profile-name">Ayush Bhalla</h3>
            <p class="profile-description"></p>
            <div class="social">
            	<ul class="social-icons">
                    <li><a href="#"><i class="font-icon-social-twitter"></i></a></li>
                    <li><a href="#"><i class="font-icon-social-linkedin"></i></a></li>
                    <li><a href="#"><i class="font-icon-social-google-plus"></i></a></li>
                </ul>
            </div>
        </div>
        <!-- End Profile -->
        
        <!-- Start Profile -->
    	<div class="span4 profile">
        	<div class="image-wrap">
                <div class="hover-wrap">
                    <span class="overlay-img"></span>
                    <span class="overlay-text-thumb">Developer</span>
                </div>
                <img src="_include/img/profile/profile-03.jpg" alt="Joshua Insanus">
            </div>
            <h3 class="profile-name">Abhishek Poddar</h3>
            <p class="profile-description"></p>
            <div class="social">
            	<ul class="social-icons">
                    <li><a href="#"><i class="font-icon-social-twitter"></i></a></li>
                    <li><a href="#"><i class="font-icon-social-linkedin"></i></a></li>
                    <li><a href="#"><i class="font-icon-social-google-plus"></i></a></li>
                   
                </ul>
            </div>
        </div>
        <!-- End Profile -->
        
    </div>
    <!-- End People -->
</div>
</div>
<!-- End About Section -->

<!-- *************************************************************************************** -->



<!-- Contact Section -->
<div id="contact" class="page">
<div class="container">
    <!-- Title Page -->
    <div class="row">
        <div class="span12">
            <div class="title-page">
                <h2 class="title">Get in Touch</h2>
                <h3 class="title-description">We’re currently accepting new client projects. We look forward to serving you.</h3>
            </div>
        </div>
    </div>
    <!-- End Title Page -->
    
    <!-- Contact Form -->
    <div class="row">
    	<div class="span9">
        
            <form id="contact-form" class="contact-form" action="EmailServlet" method="post">
            	<p class="contact-name">
            		<input id="contact_name" type="text" placeholder="Full Name"  name="name" />
                </p>
                <p class="contact-email">
                	<input id="contact_email" type="text" placeholder="Email Address"  name="email" />
                </p>
                <p class="contact-message">
                	<textarea id="contact_message" placeholder="Your Message" name="message" rows="15" cols="40"></textarea>
                </p>
                <p class="contact-submit">
                    <input type="submit"  style="color:#DE5E60; "value="Send Your Message"/>
                </p>
                
                <div id="response">
                
                </div>
            </form>
         
        </div>
        
        <div class="span3">
        	<div class="contact-details">
        		<h3>Contact Details</h3>
                <ul>
                    <li><a href="#">poddar833@gmail.com</a></li>
                    <li>(+91)9669870142</li>
                    <li>
                        Glucili.com
                        <br>
                        B-55 , Lakshmi Nagar , 
                        <br>
                        New Delhi -110059
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!-- End Contact Form -->
</div>
</div>
<!-- End Contact Section -->

<!-- *************************************************************************************** -->



<!-- *************************************************************************************** -->


<!-- Socialize -->
<div id="social-area" class="page">
	<div class="container">
    	<div class="row">
            <div class="span12">
                <nav id="social">
                    <ul>
                        <li><a href="#" title="Follow Me on Twitter" target="_blank"><span class="font-icon-social-twitter"></span></a></li>
			<li><a href="#" title="Follow Me on Facebook" target="_blank"><span class="font-icon-social-facebook"></span></a></li>
                        <li><a href="#" title="Follow Me on Google Plus" target="_blank"><span class="font-icon-social-google-plus"></span></a></li>
                        <li><a href="#" title="Follow Me on LinkedIn" target="_blank"><span class="font-icon-social-linkedin"></span></a></li>
                         </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
<!-- End Socialize -->

<!-- *************************************************************************************** -->
<jsp:include page="footer.jsp">
    <jsp:param value="Gloculli" name="fname" />
</jsp:include>
        
        
    </body>
</html>
