<%-- 
    Document   : show
    Created on : Jul 31, 2016, 11:12:29 PM
    Author     : Abhishek Poddar e
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DatabaseConnectivity.DataFactory"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
         <%
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
         %>
         
         <center>     
      <div style="background: #363636; height: 800px; width: 500px; margin-top:20px; margin-bottom: 20px ;" >
     <div class="multi-borders">
         <div class="card-face__avatar" style="margin-top: 50px;"><img src="<%=u%>" width="500" height="370" alt="Abhishek"/></div>
         <h2 class="card-face__name"><%=r.getString(3) %></h2>
         <p class="card_p2">Total Fund Required: <%=r.getString(4)%></p>
         <p class="card_p3">Total Fund Collected:<%=r.getInt(5) %></p> 
         <p class="card_p3"><%=r.getString(7) %></p> 
     </div> 
            
 <form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">

  <!-- Identify your business so that you can collect the payments. -->
  <input type="hidden" name="business" value="abhiseller@someshop.com">

  <!-- Specify a Buy Now button. -->
  <input type="hidden" name="cmd" value="_xclick">

  <!-- Specify details about the item that buyers will purchase. -->
  <input type="hidden" name="item_name" value="Hot Sauce-12oz. Bottle">
  <input type="text" name="amount">
  <input type="hidden" name="currency_code" value="USD">
  <input type="hidden" name="return" value="http://localhost:8084/Paypal/success.jsp">

  <!-- Display the payment button. -->
  <input type="image" name="submit" border="0"
  src="https://www.paypalobjects.com/webstatic/en_IN/mktg/logos/AM_mc_vs_dc_ae.jpg"
  alt="PayPal - The safer, easier way to pay online">
  <img alt="" border="0" width="1" height="1"
  src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif" >

</form>
        </div>
             <%
               }
             %>
    
    </center>
         
         
         
         <%@include file="footer.jsp" %>
    </body>
</html>
