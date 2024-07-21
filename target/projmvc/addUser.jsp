
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Signup Please </title>
  <style>
body {
  font-family: Arial, sans-serif;
  margin: 20;
  padding: 20; /* Remove default padding */
  display: flex; /* Use flexbox for centering */
  justify-content: center; /* Align content horizontally in center */
  align-items: center; /* Align content vertically in center */
  min-height: 60vh; /* Set minimum height for the viewport */
}

.container{
	 position: relative;
    display: flex;
    flex-direction: column;
    width: 30vw;
    height: 53vw;
  
 
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
 input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 6px;
  box-sizing: border-box;
  font-size: 12px;
}
h1, p{
    text-align: center;
    font-size: 2dvw;
     color: #ff3366;
}


     label {
     display: block;
  margin-bottom: 2px;
  margin-left: 4px;
  font-weight: bold;

    }
    input{ margin-left: 4px;
     margin-right: 4px;
		     display: block;
  margin-bottom: 1px;
  font-weight: bold;
    background-color: paleturquoisee0;
	}
 textarea {margin-left: 3px;
     margin-right: 1px;
  width: 97%;
  padding: 5px;
  border: 1px solid #ccc;
  border-radius: 2px;
  resize: vertical; /* Allow users to resize the textarea */
}
 <!--  form{
	   width: 25vw;
    display: flex;
    flex-direction: column;
    align-items: center;

  
}-->
 form {
  position: relative;
  z-index: 1;
  background: turquoise;
  max-width: 300px;
  max-height: 760px;
  margin: 0 auto 100px;

  padding: 30px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
   
    button {
  background-color: #4CAF50; /* Green */
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 3px;
  cursor: pointer;
  margin-top: 10px;margin-left: 4px;
     margin-right: 4px;
}

    </style>
</head>
<body> 
   

  <form action="addUser" method="post">
	   <div class="container">
		     <h1>Signup Please</h1>
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" name="firstName" required><br>

    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" name="lastName" required><br>
<% String emaill=(String) session.getAttribute("Username"); %>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"  value=<%=emaill%>  required>  <br>

    <label for="contactNo">Contact Number:</label>
    <input type="tel" id="contactNo" name="contactNo" required><br>

    <label>Gender:</label>
    <input type="radio" id="male" name="gender" value="male">
    <label or="male">Male</label>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label>
    <br>

    <label for="address">Address:</label>
    <textarea id="address" name="address" rows="4" required></textarea><br>

    <label for="city">City:</label>
    <input type="text" id="city" name="city" required><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br>

    <button type="submit">Register</button></div>
      <p class="message">Already registered? back to <a href="login.jsp">Sign In</a> <a href="index.jsp"> HOME</a></p>
  </form>
</body>
</html>
