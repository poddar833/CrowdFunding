<%-- 
    Document   : index
    Created on : Jul 10, 2016, 8:29:21 PM
    Author     : Abhishek Poddar e
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DatabaseConnectivity.DataFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
<!-- Meta Tags -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Brushed | Responsive One Page Template</title>   

<meta name="description" content="Insert Your Site Description" /> 

<!-- Mobile Specifics -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="HandheldFriendly" content="true"/>
<meta name="MobileOptimized" content="320"/>   

<!-- Mobile Internet Explorer ClearType Technology -->
<!--[if IEMobile]>  <meta http-equiv="cleartype" content="on">  <![endif]-->

<!-- Bootstrap -->
<link href="_include/css/bootstrap.min.css" rel="stylesheet">

<!-- Main Style -->
<link href="_include/css/main.css" rel="stylesheet">

<!-- Supersized -->
<link href="_include/css/supersized.css" rel="stylesheet">
<link href="_include/css/supersized.shutter.css" rel="stylesheet">

<!-- FancyBox -->
<link href="_include/css/fancybox/jquery.fancybox.css" rel="stylesheet">

<!-- Font Icons -->
<link href="_include/css/fonts.css" rel="stylesheet">

<!-- Shortcodes -->
<link href="_include/css/shortcodes.css" rel="stylesheet">

<!-- Responsive -->
<link href="_include/css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="_include/css/responsive.css" rel="stylesheet">

<!-- Supersized -->
<link href="_include/css/supersized.css" rel="stylesheet">
<link href="_include/css/supersized.shutter.css" rel="stylesheet">

<!-- Google Font -->
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>

<!-- Fav Icon -->
<link rel="shortcut icon" href="#">

<link rel="apple-touch-icon" href="#">
<link rel="apple-touch-icon" sizes="114x114" href="#">
<link rel="apple-touch-icon" sizes="72x72" href="#">
<link rel="apple-touch-icon" sizes="144x144" href="#">

<!-- Modernizr -->
<script src="_include/js/modernizr.js"></script>

<!-- Analytics -->
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'Insert Your Code']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
<!-- End Analytics -->

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
                
                
        
        
<!-- Our Work Section -->
<div id="work" class="page">
	<div class="container">
    	<!-- Title Page -->
        <div class="row">
            <div class="span12">
                <div class="title-page">
                    <h2 class="title">Our Work</h2>
                    </div>
            </div>
        </div>
        <!-- End Title Page -->
        
        <!-- Portfolio Projects -->
        <div class="row">
        	<div class="span3">
            	<!-- Filter -->
                <nav id="options" class="work-nav">
                    <ul id="filters" >
                    	<li class="type-work">Type of Work</li>
                        <li><a href="http://localhost:8084/final_project/project.jsp" data-option-value="*" class="selected">All Projects</a></li>
                        <li><a  href="http://localhost:8084/final_project/project.jsp?link=Startup" >Startups</a></li>
                        <li><a href="http://localhost:8084/final_project/project.jsp?link=Educational" >Educational</a></li>
                        <li><a href="http://localhost:8084/final_project/project.jsp?link=Medical" data-option-value=".video">Medical</a></li>
                        <li><a href="http://localhost:8084/final_project/project.jsp?link=Housing" data-option-value=".video">Housing</a></li>
                        <li><a href="http://localhost:8084/final_project/project.jsp?link=Donation" data-option-value=".video">Donation</a></li>
                    </ul>
                </nav>
                <!-- End Filter -->
            </div>
            
            <div class="span9">
            	<div class="row">
                	<section id="projects">
                    	<ul id="thumbs">
                        
				<%
                                   
                               

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
                                %>	
                        	<li class="item-thumbs span3 design">
                            	
                                    <a class="hover-wrap fancybox" data-fancybox-group="gallery" title="The City" href="http://localhost:8084/final_project/show.jsp?uname=<%=name %>"  >
                                	<span class="overlay-img"><%=p%></span>
                                </a>
                                
                                <img src="<%=u%>"  alt="img">
                                
                                </li>
                                 
                        	
                                <%
                                }
                                %>
                        </ul>
                    </section>
                    
            	</div>
            </div>
        </div>
        <!-- End Portfolio Projects -->
    </div>
</div>
<!-- End Our Work Section -->

<%@include file="footer.jsp" %>
    </body>
</html>
