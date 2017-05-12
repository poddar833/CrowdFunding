package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("<!-- For-Mobile-Apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Multi Login & Signup Form Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //For-Mobile-Apps -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Web-Fonts -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,700,900,300' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //Web-Fonts -->\n");
      out.write("<link href=\"_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/supersized.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/supersized.shutter.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Horizontal-Tabs-JavaScript -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\t$('#horizontalTab').easyResponsiveTabs({\n");
      out.write("\t\t\ttype: 'default', //Types: default, vertical, accordion           \n");
      out.write("\t\t\twidth: 'auto', //auto or any width like 600px\n");
      out.write("\t\t\tfit: true, // 100% fit in a container\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- Horizontal-Tabs-JavaScript -->\n");
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
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("    <div class=\"sticky-nav\">\n");
      out.write("    \t<a id=\"mobile-nav\" class=\"menu-nav\" href=\"#menu-nav\"></a>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <nav id=\"menu\">\n");
      out.write("            <ul id=\"menu-nav\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li></li>\n");
      out.write("                <li><a href=\"\"><img src=\"_include\\img\\glo.png\" alt=\"\"  width=\"80\" height=\"60\" /> </a></li>\t  \n");
      out.write("            \t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"project.jsp\">All Projects</a></li>\n");
      out.write("                <li><a href=\"registerProject.jsp\">Register Projects</a></li>\n");
      out.write("                <li><a href=\"#about\">About Us</a></li>\n");
      out.write("                <li><a href=\"index.jsp#contact\">Contact</a></li>\n");
      out.write("                <li><a href=\"personalInfo.jsp\">Personal Info</a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jsp \" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\t\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
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
