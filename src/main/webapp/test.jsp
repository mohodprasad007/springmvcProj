<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="resources/css_js/style.css" />
<head>
<meta charset="ISO-8859-1">
<title>test jsp return view</title>
</head>
<body>
<h>this is test one</h>
 <div class="form">

    <form class="login-form" action="LoginServlet" method="post">
      <input type="email" id="username"  name="username" placeholder="username" required/>
      <input type="password" id="password"  name="password" placeholder="password" required/>

      <button  type="submit" id="login" class="button">login</button>
  
                <div class="alert alert-danger" role="alert">
        <h2> ${msg}</h2>
                </div>
    
      <p class="message">Not registered? <a href="addUser.html">Create an account</a></p>
       <p class="message"> <a href="index.html">HOME</a></p>
    </form>
  </div>
</body>
</html>