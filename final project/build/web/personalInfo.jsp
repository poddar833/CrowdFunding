<%-- 
    Document   : personalInfo
    Created on : Jul 31, 2016, 11:11:02 AM
    Author     : Abhishek Poddar 
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DatabaseConnectivity.DatabaseActivity" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
       <% if(session.getAttribute("name")==null) {
     response.sendRedirect("login.jsp");
 }
         %>     
   <jsp:include page="header.jsp">
             <jsp:param value="Logout" name="name" />
             <jsp:param value="logout.jsp" name="link" />
   </jsp:include>
         
         <%
         DatabaseActivity db = new DatabaseActivity();
         Connection con = DatabaseActivity.con;
         String name=(String)session.getAttribute("name");
         String sql = "select * from  Registration where Username=?";
         PreparedStatement pr = con.prepareStatement(sql);
         pr.setString(1,name );
         ResultSet rs=pr.executeQuery();
         while(rs.next()){
         %>
    <center>     
      <div style="background: #363636; height: 500px; width: 500px; margin-top:20px; margin-bottom: 20px ;" >
     <div class="multi-borders">
         <div class="card-face__avatar" style="margin-top: 50px;"><img src="images/nouser.gif" width="170" height="170" alt="Abhishek"/></div>
         <h2 class="card-face__name"><%=rs.getString(1) %></h2>
         <p class="card_p2">Email:<%=rs.getString(2) %></p>
	<p class="card_p3">Contact No:<%=rs.getString(4) %></p> 
        <p class="card_p3">Donation No:<%=rs.getInt(5) %></p> 
    </div> 
        </div>
     <%
         }
    %>
    </center>
   
       <%@include file="footer.jsp" %>
    </body>
</html>
