package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import DatabaseConnectivity.DataFactory;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("         ");

         String q ;
         String u ;
        String sql , name;
        String link = request.getParameter("uname");
        DataFactory  db = new DataFactory();
        Connection con = DataFactory.getConnectionToDb();
        ResultSet r=null;
        
         sql = "select *  from  Project_Register  where Username=?";
               PreparedStatement pr = con.prepareStatement(sql);
                pr.setString(1, link);
               r = pr.executeQuery();
               while(r.next()){
                   q = r.getString(6);
                    u = q.substring(70); 
         
      out.write("\n");
      out.write("         \n");
      out.write("         <center>     \n");
      out.write("      <div style=\"background: #363636; height: 800px; width: 500px; margin-top:20px; margin-bottom: 20px ;\" >\n");
      out.write("     <div class=\"multi-borders\">\n");
      out.write("         <div class=\"card-face__avatar\" style=\"margin-top: 50px;\"><img src=\"");
      out.print(u);
      out.write("\" width=\"500\" height=\"370\" alt=\"Abhishek\"/></div>\n");
      out.write("         <h2 class=\"card-face__name\">");
      out.print(r.getString(3) );
      out.write("</h2>\n");
      out.write("         <p class=\"card_p2\">Total Fund Required: ");
      out.print(r.getString(4));
      out.write("</p>\n");
      out.write("         <p class=\"card_p3\">Total Fund Collected:");
      out.print(r.getInt(5) );
      out.write("</p> \n");
      out.write("         <p class=\"card_p3\">");
      out.print(r.getString(7) );
      out.write("</p> \n");
      out.write("     </div> \n");
      out.write("            \n");
      out.write(" <form action=\"https://www.sandbox.paypal.com/cgi-bin/webscr\" method=\"post\">\n");
      out.write("\n");
      out.write("  <!-- Identify your business so that you can collect the payments. -->\n");
      out.write("  <input type=\"hidden\" name=\"business\" value=\"abhiseller@someshop.com\">\n");
      out.write("\n");
      out.write("  <!-- Specify a Buy Now button. -->\n");
      out.write("  <input type=\"hidden\" name=\"cmd\" value=\"_xclick\">\n");
      out.write("\n");
      out.write("  <!-- Specify details about the item that buyers will purchase. -->\n");
      out.write("  <input type=\"hidden\" name=\"item_name\" value=\"Hot Sauce-12oz. Bottle\">\n");
      out.write("  <input type=\"text\" name=\"amount\">\n");
      out.write("  <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("  <input type=\"hidden\" name=\"return\" value=\"http://localhost:8084/Paypal/success.jsp\">\n");
      out.write("\n");
      out.write("  <!-- Display the payment button. -->\n");
      out.write("  <input type=\"image\" name=\"submit\" border=\"0\"\n");
      out.write("  src=\"https://www.paypalobjects.com/webstatic/en_IN/mktg/logos/AM_mc_vs_dc_ae.jpg\"\n");
      out.write("  alt=\"PayPal - The safer, easier way to pay online\">\n");
      out.write("  <img alt=\"\" border=\"0\" width=\"1\" height=\"1\"\n");
      out.write("  src=\"https://www.paypalobjects.com/en_US/i/scr/pixel.gif\" >\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("             ");

               }
             
      out.write("\n");
      out.write("    \n");
      out.write("    </center>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         ");
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
