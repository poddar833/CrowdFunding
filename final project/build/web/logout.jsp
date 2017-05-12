<%-- 
    Document   : logout
    Created on : Jul 12, 2016, 2:26:03 PM
    Author     : Abhishek Poddar 
--%>

<%@page import="javax.websocket.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       session = request.getSession();
       session.invalidate();  
       %>
       <span id="counter1"></span>
       <script type="text/javascript" src="js/jquery-3.0.0.js"></script>
       <script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
       <script type="text/javascript" src="js/counter2.js"></script>
       
    </body>
</html>
