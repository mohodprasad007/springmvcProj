<!DOCTYPE html>
<!-- Coding By CodingNepal - www.codingnepalweb.com -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>More About Pushpendra Singh</title>
    <link rel="stylesheet" href="resources/css_js/style.css" />
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
  </head>
  <body>
    <header class="header">
      <nav class="navbar">
        <h2 class="logo"><a href="#">Pushpendra Singh</a></h2>
        <input type="checkbox" id="menu-toggle" />
        <label for="menu-toggle" id="hamburger-btn">
          <svg xmlns="http://www.w3.org/2000/svg" height="24" viewBox="0 0 24 24" width="24">
            <path d="M3 12h18M3 6h18M3 18h18" stroke="currentColor" stroke-width="2" stroke-linecap="round"/>
          </svg>
        </label>
        <ul class="links">
          <li><a href="#">Home</a></li>
          <li><a href="AboutUs.jsp">About Us</a></li>
          <li><a href="ShowUsers.jsp">Latest</a></li>
          <li><a href="test.jsp">Offers</a></li>
          <li><a href="#">Products</a></li>
            <li><a href="https://www.flipkart.com/"> <i class='fas fa-cart-arrow-down' style='font-size:30px;color:#FFDEAD'></i></a></li>   
        </ul>
               
               
        
        <%   String  username=(String)request.getAttribute("username");  %>
              <% if (request !=null  && request.getAttribute("username")!= null) { 
            	  %>
              <i class="fas fa-user"> <p color: #FFDEAD; > Welcome : <%=username%></p></i>
           
                
             
            <% } %>
            
            <% if (username ==null   ) { %>
                <div class="buttons" >
          <a href="login.jsp" class="signin">Sign In</a>
          <a href="addUser.jsp" class="signup">Sign Up</a>
      
        </div>
              <% } %>
       
      </nav>
    </header>
    <section class="hero-section">
      <div class="hero">
        <h2>We are happy to see you</h2>
        <p>
       I am  Java Web Developers having 3.5 years of experience in web development using Java and Spring    
         Framework ,application support. Adept analyzing information system need working with client,business managers
          and technical team for, evaluating end user requirements custom design solution.
        </p>
        <div class="buttons">
          <a href="#" class="join">Join Now</a>
          <a href="https://media.licdn.com/dms/image/D4D03AQH_duJ2mL7MSw/profile-displayphoto-shrink_800_800/0/1702548705271?e=1724284800&v=beta&t=K8FCj6_n5RZsv2MvJtcnsMqnkrs2kvpPqIPinc3vL4c" class="learn">Learn More</a>
        </div>
      </div>
      <div class="img">
        <img src="resources/Images/laptopig.jpg" alt="hero image" width="300" height="300" />
      </div>
    </section>
  </body>
</html>