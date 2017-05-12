package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("<!-- Meta Tags -->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\n");
      out.write("<title>Glucili.com</title>   \n");
      out.write("\n");
      out.write("<meta name=\"description\" content=\"Insert Your Site Description\" /> \n");
      out.write("\n");
      out.write("<!-- Mobile Specifics -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"HandheldFriendly\" content=\"true\"/>\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\"/>   \n");
      out.write("\n");
      out.write("<!-- Mobile Internet Explorer ClearType Technology -->\n");
      out.write("<!--[if IEMobile]>  <meta http-equiv=\"cleartype\" content=\"on\">  <![endif]-->\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"_include/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Main Style -->\n");
      out.write("<link href=\"_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Supersized -->\n");
      out.write("<link href=\"_include/css/supersized.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/supersized.shutter.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- FancyBox -->\n");
      out.write("<link href=\"_include/css/fancybox/jquery.fancybox.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Font Icons -->\n");
      out.write("<link href=\"_include/css/fonts.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Shortcodes -->\n");
      out.write("<link href=\"_include/css/shortcodes.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Responsive -->\n");
      out.write("<link href=\"_include/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Supersized -->\n");
      out.write("<link href=\"_include/css/supersized.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/supersized.shutter.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Google Font -->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!-- Fav Icon -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\">\n");
      out.write("\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"#\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"#\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"#\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"#\">\n");
      out.write("\n");
      out.write("<!-- Modernizr -->\n");
      out.write("<script src=\"_include/js/modernizr.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Analytics -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  var _gaq = _gaq || [];\n");
      out.write("  _gaq.push(['_setAccount', 'Insert Your Code']);\n");
      out.write("  _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("  (function() {\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("  })();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!-- End Analytics -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
 if(session.getAttribute("name")==null) {
         
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Login", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("link", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("login.jsp", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("         ");
  } 
        else{
         
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Logout", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logout.jsp", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("         \n");
      out.write("        \t\n");
      out.write("\n");
      out.write("<!-- Our Shortcodes Section -->\n");
      out.write("<div id=\"shortcodes\" class=\"page\">\n");
      out.write("\t<div class=\"container\">   \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Start Buttons/Video Responsive Section -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("        \t<!-- Start Buttons -->\n");
      out.write("        \t<div class=\"span6\">\n");
      out.write("            \t<h3 class=\"spec\"> Easiest way to crowdfund</h3>\n");
      out.write("                <br/>\n");
      out.write("                \n");
      out.write("                <h4> <span style=\"font-family: wingdings; font-size: 200%; color:#2a85a0 \">&#252;</span> &nbsp; &nbsp;Sign up for free</h4>\n");
      out.write("                 <h4> <span style=\"font-family: wingdings; font-size: 200%; color:#2a85a0 \">&#252;</span> &nbsp; &nbsp;Daily access to funds</h4>\n");
      out.write("      \n");
      out.write("                <h4> <span style=\"font-family: wingdings; font-size: 200%; color:#2a85a0 \">&#252;</span> &nbsp; &nbsp;24 X 7  email support</h4>\n");
      out.write("                          <h4> <span style=\"font-family: wingdings; font-size: 200%; color:#2a85a0 \">&#252;</span> &nbsp; &nbsp;Indian and foreign donations</h4>\n");
      out.write("                <h4> <span style=\"font-family: wingdings; font-size: 200%; color:#2a85a0 \">&#252;</span> &nbsp; &nbsp;No time-limit or minimum goals</h4>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!-- End Buttons -->\n");
      out.write("            \n");
      out.write("            <!-- Start Video -->\n");
      out.write("            <div class=\"span6\">\n");
      out.write("            \t<h3 class=\"spec\">What is Crowd Funding</h3>\n");
      out.write("                <div class=\"video-container\">\n");
      out.write("                    <video style=\"border:2 \" src=\"video/CrowdFunding.mp4\"  onclick=\"$('video').pause()\"></video>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\t\n");
      out.write("            <!-- End Video -->\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- End Buttons/Video Responsive Section -->\n");
      out.write("     \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Shortcodes Section -->\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      out.write("\n");
      out.write("<!-- Our Work Section -->\n");
      out.write("<div id=\"about\" class=\"page-alternate\">\n");
      out.write("<div class=\"container\">\n");
      out.write("    <!-- Title Page -->\n");
      out.write("    \n");
      out.write("        <div class=\"span12\">\n");
      out.write("            <div class=\"title-page\">\n");
      out.write("                <h2 class=\"title\">Our Projects</h2>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("\t\n");
      out.write("    <!-- End Title Page -->\n");
      out.write("    \n");
      out.write("    <!-- People -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("    \t\n");
      out.write("        <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">CTO/Founder</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-01.jpg\" alt=\"John Doe\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("        \n");
      out.write("        <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Creative Director</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-02.jpg\" alt=\"Jane Helf\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("\t\t\n");
      out.write("\t\t  <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Creative Director</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-02.jpg\" alt=\"Jane Helf\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("\t\t  <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Creative Director</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-02.jpg\" alt=\"Jane Helf\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("\t\t  <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Creative Director</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-02.jpg\" alt=\"Jane Helf\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("        \n");
      out.write("        <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Lead Designer</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-03.jpg\" alt=\"Joshua Insanus\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <!-- End People -->\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      out.write("\n");
      out.write("<!-- About Section -->\n");
      out.write("<div id=\"about\" class=\"page-alternate\">\n");
      out.write("<div class=\"container\">\n");
      out.write("    <!-- Title Page -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span12\">\n");
      out.write("            <div class=\"title-page\">\n");
      out.write("                <h2 class=\"title\">About Us</h2>\n");
      out.write("                <h3 class=\"title-description\">Learn About our Team &amp; Culture.</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Title Page -->\n");
      out.write("    <!-- People -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("    \t\n");
      out.write("        <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">CEO/Founder</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-01.jpg\" alt=\"John Doe\">\n");
      out.write("            </div>\n");
      out.write("            <h3 class=\"profile-name\">Sudhir Kumar Sinha</h3>\n");
      out.write("            <p class=\"profile-description\"></p>\n");
      out.write("            \t\n");
      out.write("            <div class=\"social\">\n");
      out.write("            \t<ul class=\"social-icons\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-twitter\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-linkedin\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-google-plus\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("        \n");
      out.write("        <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Managing Director</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-02.jpg\" alt=\"Ayush Bhalla\">\n");
      out.write("            </div>\n");
      out.write("            <h3 class=\"profile-name\">Ayush Bhalla</h3>\n");
      out.write("            <p class=\"profile-description\"></p>\n");
      out.write("            <div class=\"social\">\n");
      out.write("            \t<ul class=\"social-icons\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-twitter\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-linkedin\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-google-plus\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("        \n");
      out.write("        <!-- Start Profile -->\n");
      out.write("    \t<div class=\"span4 profile\">\n");
      out.write("        \t<div class=\"image-wrap\">\n");
      out.write("                <div class=\"hover-wrap\">\n");
      out.write("                    <span class=\"overlay-img\"></span>\n");
      out.write("                    <span class=\"overlay-text-thumb\">Developer</span>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"_include/img/profile/profile-03.jpg\" alt=\"Joshua Insanus\">\n");
      out.write("            </div>\n");
      out.write("            <h3 class=\"profile-name\">Abhishek Poddar</h3>\n");
      out.write("            <p class=\"profile-description\"></p>\n");
      out.write("            <div class=\"social\">\n");
      out.write("            \t<ul class=\"social-icons\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-twitter\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-linkedin\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"font-icon-social-google-plus\"></i></a></li>\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Profile -->\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <!-- End People -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- End About Section -->\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Contact Section -->\n");
      out.write("<div id=\"contact\" class=\"page\">\n");
      out.write("<div class=\"container\">\n");
      out.write("    <!-- Title Page -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span12\">\n");
      out.write("            <div class=\"title-page\">\n");
      out.write("                <h2 class=\"title\">Get in Touch</h2>\n");
      out.write("                <h3 class=\"title-description\">We’re currently accepting new client projects. We look forward to serving you.</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Title Page -->\n");
      out.write("    \n");
      out.write("    <!-- Contact Form -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("    \t<div class=\"span9\">\n");
      out.write("        \n");
      out.write("            <form id=\"contact-form\" class=\"contact-form\" action=\"EmailServlet\" method=\"post\">\n");
      out.write("            \t<p class=\"contact-name\">\n");
      out.write("            \t\t<input id=\"contact_name\" type=\"text\" placeholder=\"Full Name\"  name=\"name\" />\n");
      out.write("                </p>\n");
      out.write("                <p class=\"contact-email\">\n");
      out.write("                \t<input id=\"contact_email\" type=\"text\" placeholder=\"Email Address\"  name=\"email\" />\n");
      out.write("                </p>\n");
      out.write("                <p class=\"contact-message\">\n");
      out.write("                \t<textarea id=\"contact_message\" placeholder=\"Your Message\" name=\"message\" rows=\"15\" cols=\"40\"></textarea>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"contact-submit\">\n");
      out.write("                    <input type=\"submit\"  style=\"color:#DE5E60; \"value=\"Send Your Message\"/>\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <div id=\"response\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"span3\">\n");
      out.write("        \t<div class=\"contact-details\">\n");
      out.write("        \t\t<h3>Contact Details</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">poddar833@gmail.com</a></li>\n");
      out.write("                    <li>(+91)9669870142</li>\n");
      out.write("                    <li>\n");
      out.write("                        Glucili.com\n");
      out.write("                        <br>\n");
      out.write("                        B-55 , Lakshmi Nagar , \n");
      out.write("                        <br>\n");
      out.write("                        New Delhi -110059\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Contact Form -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Contact Section -->\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Socialize -->\n");
      out.write("<div id=\"social-area\" class=\"page\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("    \t<div class=\"row\">\n");
      out.write("            <div class=\"span12\">\n");
      out.write("                <nav id=\"social\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\" title=\"Follow Me on Twitter\" target=\"_blank\"><span class=\"font-icon-social-twitter\"></span></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\" title=\"Follow Me on Facebook\" target=\"_blank\"><span class=\"font-icon-social-facebook\"></span></a></li>\n");
      out.write("                        <li><a href=\"#\" title=\"Follow Me on Google Plus\" target=\"_blank\"><span class=\"font-icon-social-google-plus\"></span></a></li>\n");
      out.write("                        <li><a href=\"#\" title=\"Follow Me on LinkedIn\" target=\"_blank\"><span class=\"font-icon-social-linkedin\"></span></a></li>\n");
      out.write("                         </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Socialize -->\n");
      out.write("\n");
      out.write("<!-- *************************************************************************************** -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("fname", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Gloculli", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
