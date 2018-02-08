<%-- 
    Document   : login
    Created on : Feb 6, 2018, 10:39:23 PM
    Author     : Korisnik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="styleIndex.css" rel="stylesheet"/>
        
        <title>Log in</title>
    </head>
    <body>
         <header>
            <h1>My Social Network</h1>
        </header>
        <div id="loginForm">
        <h1>Log in:</h1>
        <form action="LoginServlet" method="post">
            <table>
            <tr>
                <th>Username:</th>
                <td><input type="text" name="user"/></td>
                    
            </tr>
            <tr>
                <th>Password:</th>
                <td><input type="password" name="pass"/></td>
            </tr>
            </table>
            <input type="submit" value="Log in"/>
            
        </form>
        </div>
    </body>
</html>
