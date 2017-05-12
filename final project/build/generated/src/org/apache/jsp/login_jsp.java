package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Style.CSS --> <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Logout", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("link", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logout.jsp", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("<!-- Container -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"tabs\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"sap_tabs\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"resp-tabs-list\">\n");
      out.write("\t\t\t\t\t\t<li class=\"resp-tab-item\" aria-controls=\"tab_item-1\" role=\"tab\"><span>LOGIN</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"resp-tab-item\" aria-controls=\"tab_item-2\" role=\"tab\"><span>SIGNUP</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"resp-tab-item\" aria-controls=\"tab_item-3\" role=\"tab\"><span>RESET </span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"resp-tab-item\" aria-controls=\"tab_item-4\" role=\"tab\"><span>LOGIN OPTIONS</span></li>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"resp-tabs-container\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-1\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Form -->\n");
      out.write("\t\t\t\t\t\t\t<form action=\"Login\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" Name=\"Username\" placeholder=\"Username\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" Name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"brand1\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"brand1\"><span></span>Remember Me</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"LOGIN\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t<!-- //Form -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-2 resp-tab-content\" aria-labelledby=\"tab_item-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"register\">\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"Registeration\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" Name=\"UserName\" placeholder=\"Choose a UNIQUE USERNAME\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" Name=\"Email\" placeholder=\"Email\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" Name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" Name=\"Password\" class=\"lessgap\" placeholder=\"Confirm Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" Name=\"Phone\" placeholder=\"Phone Number\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"send-button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"REGISTER\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-3 resp-tab-content\" aria-labelledby=\"tab_item-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"reset\">\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" Name=\"Email\" placeholder=\"Email\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>(Or)</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" Name=\"Phone Number\" placeholder=\"Phone Number\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"RESET MY PASSWORD\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-4 resp-tab-content\" aria-labelledby=\"tab_item-4\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cbp-ig-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/facebook.png\" class=\"cbp-ig-icon cbp-ig-icon-facebook\" alt=\"Fashion\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cbp-ig-title\">Facebook</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/twitter.png\" class=\"cbp-ig-icon cbp-ig-icon-twitter\" alt=\"Fashion\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cbp-ig-title\">Twitter</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/gplus.png\" class=\"cbp-ig-icon cbp-ig-icon-gplus\" alt=\"Fashion\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cbp-ig-title\">Google +</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/pinterest.png\" class=\"cbp-ig-icon cbp-ig-icon-pinterest\" alt=\"Fashion\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cbp-ig-title\">Pinterest</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/tumblr.png\" class=\"cbp-ig-icon cbp-ig-icon-tumblr\" alt=\"Fashion\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cbp-ig-title\">Tumblr</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/linkedin.png\" class=\"cbp-ig-icon cbp-ig-icon-linkedin\" alt=\"Fashion\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cbp-ig-title\">Linkedin</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("<!-- Container -->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer>\n");
      out.write("\t<p class=\"credits\">copyright &copy; <a href=\"#\" > ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" 2016</a> </p>\n");
      out.write("</footer>\n");
      out.write("<!-- End Footer -->\n");
      out.write("\n");
      out.write("<!-- Back To Top -->\n");
      out.write("<a id=\"back-to-top\" href=\"#\">\n");
      out.write("\t<i class=\"font-icon-arrow-simple-up\"></i>\n");
      out.write("</a>\n");
      out.write("<!-- End Back to Top -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
