package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerProject_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("</head>\n");
      out.write(" ");
 if(session.getAttribute("name")==null) {
     response.sendRedirect("login.jsp");
 }
         
      out.write("\n");
      out.write("         \n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Logout", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("link", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logout.jsp", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <div id=\"contact\" class=\"page\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("    \t<div class=\"span9\">\n");
      out.write("            <form action=\"RegisterEvent\" id=\"contact-form\" class=\"contact-form\"  method=\"post\" enctype=\"multipart/form-data\"  >\n");
      out.write("                   \n");
      out.write("            \t <p class=\"contact-email\">\n");
      out.write("                   <input id=\"contact_email\" type=\"text\" placeholder=\"UserName\" value=\"\" name=\"uname\" />\n");
      out.write("                </p>\n");
      out.write("                <br/>\n");
      out.write("                \n");
      out.write("                <p class=\"contact-email\">\n");
      out.write("                    <select  name=\"cat\">\n");
      out.write("                        <option value=\"Select the category\">Select the category</option>\n");
      out.write("                        <option value=\"Startup\">Startup</option>\n");
      out.write("                        <option value=\"Educational\">Educational</option>\n");
      out.write("                        <option value=\"Housing\">Housing</option>\n");
      out.write("                        <option value=\"Donation\">Donation</option>\n");
      out.write("                        <option value=\"Medical\">Medical</option>\n");
      out.write("                    </select>\n");
      out.write("                </p>\n");
      out.write("                <br/>\n");
      out.write("                <p class=\"contact-email\">\n");
      out.write("                \t<input id=\"contact_email\" type=\"text\" placeholder=\"Project name\" value=\"\" name=\"Pname\" />\n");
      out.write("                </p>\n");
      out.write("                <br/>\n");
      out.write("                \n");
      out.write("                <p class=\"contact-email\">\n");
      out.write("                \t<input id=\"contact_email\" type=\"text\" placeholder=\"Amount Required\" value=\"\" name=\"amount\" />\n");
      out.write("                </p>\n");
      out.write("                <br/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <p class=\"contact-message\">\n");
      out.write("                \t<textarea id=\"contact_message\" placeholder=\"Project Details\" name=\"pdetails\" rows=\"7\" cols=\"25\"></textarea>\n");
      out.write("                </p>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                 <p class=\"contact-submit\">\n");
      out.write("                     Upload image<input type=\"file\" name=\"img\" >\n");
      out.write("                </p>\n");
      out.write("                 <p class=\"contact-submit\">\n");
      out.write("                     <input type=\"submit\" class=\"submit\" value=\"Submit\">\n");
      out.write("                </p>\n");
      out.write("                <br/>\n");
      out.write("                <div id=\"response\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>     \n");
      out.write("    </div>\n");
      out.write("    ");
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
      out.write("   \n");
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
