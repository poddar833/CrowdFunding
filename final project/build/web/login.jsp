    <%-- 
    Document   : login
    Created on : Jul 12, 2016, 12:16:16 AM
    Author     : Abhishek Poddar 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Style.CSS --> <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
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
            
<!-- Container -->
	<div class="container">

		<div class="tabs">

			<div class="sap_tabs">

				<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">

					<ul class="resp-tabs-list">
						<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>LOGIN</span></li>
						<li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>SIGNUP</span></li>
						<li class="resp-tab-item" aria-controls="tab_item-3" role="tab"><span>RESET </span></li>
						<li class="resp-tab-item" aria-controls="tab_item-4" role="tab"><span>LOGIN OPTIONS</span></li>
						<div class="clear"> </div>
					</ul>

					<div class="resp-tabs-container">
						
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
							<!-- Form -->
							<form action="Login" method="post">
								<input type="text" Name="Username" placeholder="Username" required="">
								<input type="password" Name="Password" placeholder="Password" required="">
								<ul>
									<li>
										<input type="checkbox" id="brand1" value="">
										<label for="brand1"><span></span>Remember Me</label>
									</li>
								</ul>
								<input type="submit" value="LOGIN">
							</form>
							<!-- //Form -->
						</div>

						<div class="tab-2 resp-tab-content" aria-labelledby="tab_item-2">
							<div class="register">
								<form action="Registeration" method="post">
									<input type="text" Name="UserName" placeholder="Choose a UNIQUE USERNAME" required="">
									<input type="text" Name="Email" placeholder="Email" required="">
									<input type="password" Name="Password" placeholder="Password" required="">
									<input type="password" Name="Password" class="lessgap" placeholder="Confirm Password" required="">
									<input type="text" Name="Phone" placeholder="Phone Number" required="">
									<div class="send-button">
									<input type="submit" value="REGISTER">
									</div>
								</form>
							</div>
						</div>

						<div class="tab-3 resp-tab-content" aria-labelledby="tab_item-3">
							<div class="reset">
								<form action="#" method="post">
									<input type="text" Name="Email" placeholder="Email" required="">
									<p>(Or)</p>
									<input type="text" Name="Phone Number" placeholder="Phone Number" required="">
									<input type="submit" value="RESET MY PASSWORD">
								</form>
							</div>
						</div>

						<div class="tab-4 resp-tab-content" aria-labelledby="tab_item-4">

							<div class="main">
								<ul class="cbp-ig-grid">
									<li>
										<a href="#">
											<img src="images/facebook.png" class="cbp-ig-icon cbp-ig-icon-facebook" alt="Fashion">
											<h3 class="cbp-ig-title">Facebook</h3>
										</a>
									</li>
									<li>
										<a href="#">
											<img src="images/twitter.png" class="cbp-ig-icon cbp-ig-icon-twitter" alt="Fashion">
											<h3 class="cbp-ig-title">Twitter</h3>
										</a>
									</li>
									<li>
										<a href="#">
											<img src="images/gplus.png" class="cbp-ig-icon cbp-ig-icon-gplus" alt="Fashion">
											<h3 class="cbp-ig-title">Google +</h3>
										</a>
									</li>
									<li>
										<a href="#">
											<img src="images/pinterest.png" class="cbp-ig-icon cbp-ig-icon-pinterest" alt="Fashion">
											<h3 class="cbp-ig-title">Pinterest</h3>
										</a>
									</li>
									<li>
										<a href="#">
											<img src="images/tumblr.png" class="cbp-ig-icon cbp-ig-icon-tumblr" alt="Fashion">
											<h3 class="cbp-ig-title">Tumblr</h3>
										</a>
									</li>
									<li>
										<a href="#">
											<img src="images/linkedin.png" class="cbp-ig-icon cbp-ig-icon-linkedin" alt="Fashion">
											<h3 class="cbp-ig-title">Linkedin</h3>
										</a>
									</li>
								</ul>
							</div>

						</div>

					</div>

				</div>

			</div>

		</div>

	</div>
<!-- Container -->
        
        <%@include file="footer.jsp" %>
    </body>
</html>
