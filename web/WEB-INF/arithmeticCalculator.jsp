<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 25, 2020, 6:30:02 PM
    Author     : dorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label> First:</label>
            <input type="text" name="first" value="${First}">
            <br>
            <label> Second:</label>
            <input type="text" name="second" value="${Second}">
            <br>
          <input type="submit" name = "action" value="+">
           <input type="submit" name = "action" value="-">
            <input type="submit" name = "action" value="*">
             <input type="submit" name = "action" value="%">
  <p>${r} </P>
             <p>${message} </P>
       <p>${result}</p>
      
   
   
    
        </form>
            <a href="age">Age Calculator</a>
    </body>
</html>
