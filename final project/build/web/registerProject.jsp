<%-- 
    Document   : registerProject
    Created on : Jul 11, 2016, 10:36:46 PM
    Author     : Abhishek Poddar 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
</head>
 <% if(session.getAttribute("name")==null) {
     response.sendRedirect("login.jsp");
 }
         %>
         
   <jsp:include page="header.jsp">
             <jsp:param value="Logout" name="name" />
             <jsp:param value="logout.jsp" name="link" />
   </jsp:include>
    <body>
    <div id="contact" class="page">
    <div class="container">
       <div class="row">
    	<div class="span9">
            <form action="RegisterEvent" id="contact-form" class="contact-form"  method="post" enctype="multipart/form-data"  >
                   
            	 <p class="contact-email">
                   <input id="contact_email" type="text" placeholder="UserName" value="" name="uname" />
                </p>
                <br/>
                
                <p class="contact-email">
                    <select  name="cat">
                        <option value="Select the category">Select the category</option>
                        <option value="Startup">Startup</option>
                        <option value="Educational">Educational</option>
                        <option value="Housing">Housing</option>
                        <option value="Donation">Donation</option>
                        <option value="Medical">Medical</option>
                    </select>
                </p>
                <br/>
                <p class="contact-email">
                	<input id="contact_email" type="text" placeholder="Project name" value="" name="Pname" />
                </p>
                <br/>
                
                <p class="contact-email">
                	<input id="contact_email" type="text" placeholder="Amount Required" value="" name="amount" />
                </p>
                <br/>
                
                
                
                <p class="contact-message">
                	<textarea id="contact_message" placeholder="Project Details" name="pdetails" rows="7" cols="25"></textarea>
                </p>
               
                
                 <p class="contact-submit">
                     Upload image<input type="file" name="img" >
                </p>
                 <p class="contact-submit">
                     <input type="submit" class="submit" value="Submit">
                </p>
                <br/>
                <div id="response">
                
                </div>
            </form>
         
        </div>
    </div>
    </div>     
    </div>
    <%@include file="footer.jsp" %>   
    </body>
</html>
