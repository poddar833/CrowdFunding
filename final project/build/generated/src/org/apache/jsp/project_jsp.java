package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DatabaseConnectivity.DataFactory;

public final class project_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("<!-- Meta Tags -->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\n");
      out.write("<title>Brushed | Responsive One Page Template</title>   \n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Logout", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("link", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logout.jsp", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!-- Our Work Section -->\n");
      out.write("<div id=\"work\" class=\"page\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("    \t<!-- Title Page -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"span12\">\n");
      out.write("                <div class=\"title-page\">\n");
      out.write("                    <h2 class=\"title\">Our Work</h2>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Title Page -->\n");
      out.write("        \n");
      out.write("        <!-- Portfolio Projects -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("        \t<div class=\"span3\">\n");
      out.write("            \t<!-- Filter -->\n");
      out.write("                <nav id=\"options\" class=\"work-nav\">\n");
      out.write("                    <ul id=\"filters\" >\n");
      out.write("                    \t<li class=\"type-work\">Type of Work</li>\n");
      out.write("                        <li><a href=\"http://localhost:8084/final_project/project.jsp\" data-option-value=\"*\" class=\"selected\">All Projects</a></li>\n");
      out.write("                        <li><a  href=\"http://localhost:8084/final_project/project.jsp?link=Startup\" >Startups</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8084/final_project/project.jsp?link=Educational\" >Educational</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8084/final_project/project.jsp?link=Medical\" data-option-value=\".video\">Medical</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8084/final_project/project.jsp?link=Housing\" data-option-value=\".video\">Housing</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8084/final_project/project.jsp?link=Donation\" data-option-value=\".video\">Donation</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End Filter -->\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"span9\">\n");
      out.write("            \t<div class=\"row\">\n");
      out.write("                \t<section id=\"projects\">\n");
      out.write("                    \t<ul id=\"thumbs\">\n");
      out.write("                        \n");
      out.write("\t\t\t\t");

                                   
                               

        String sql , name;
        String link = request.getParameter("link");
        
        
        
            
            
        
        
        DataFactory  db = new DataFactory();
        Connection con = DataFactory.getConnectionToDb();
        ResultSet r=null;
        
        if(link!=null){
            sql = "select *  from  Project_Register  where category=?";
               PreparedStatement pr = con.prepareStatement(sql);
                pr.setString(1, link);
               r = pr.executeQuery();
                               
        }
        
            else{
            sql = "select  *   from  Project_Register";
           Statement st = con.createStatement();
            r = st.executeQuery(sql);
        }
                                  while(r.next()){
                                    name     = r.getString(1);
                                    String p = r.getString(3);
                                    String q = r.getString(6);
                                    String u = q.substring(70); 
                                    System.out.print(name);
                                
      out.write("\t\n");
      out.write("                        \t<li class=\"item-thumbs span3 design\">\n");
      out.write("                            \t\n");
      out.write("                                    <a class=\"hover-wrap fancybox\" data-fancybox-group=\"gallery\" title=\"The City\" href=\"http://localhost:8084/final_project/show.jsp?uname=");
      out.print(name );
      out.write("\"  >\n");
      out.write("                                \t<span class=\"overlay-img\">");
      out.print(p);
      out.write("</span>\n");
      out.write("                                </a>\n");
      out.write("                                \n");
      out.write("                                <img src=\"");
      out.print(u);
      out.write("\"  alt=\"img\">\n");
      out.write("                                \n");
      out.write("                                </li>\n");
      out.write("                                 \n");
      out.write("                        \t\n");
      out.write("                                ");

                                }
                                
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </section>\n");
      out.write("                    \n");
      out.write("            \t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Portfolio Projects -->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Our Work Section -->\n");
      out.write("\n");
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
