<%-- 
    Document   : myProfile
    Created on : Feb 7, 2018, 11:17:31 AM
    Author     : Korisnik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="style.css" rel="stylesheet"/>
        <title>My Profile</title>
    </head>
    <body>
         <header>
            <h1>My Social Network</h1>
        </header>
        <nav>
            <ul>
                <li><a href="startPage.jsp">START PAGE</a></li>
                <li><a href="myProfile.jsp">MY PROFILE</a></li>
              
                <li><a href="people.jsp">ALL PEOPLE</a></li>
                <li><a href="myFriends.jsp">MY FRIENDS</a></li>
                <li><a href="friendsOfFriends.jsp">FRIENDS OF FRIENDS</a></li>
                <li><a href="recommendendFriends.jsp">RECOMMENDEND FRIENDS</a></li>
                <li><a href="login.jsp">LOG OUT</a></li>
                
            </ul>
        </nav>
        <div class="container">
            <div id="myProfile">
                <h2>Welcome ${current.firstName} ${current.surname}!</h2>
                <br/>
                <table>
                <tr>
                    <th>First name:</th>
                    <td>${current.firstName}</td>
                </tr>
                <tr>
                    <th>Surname:</th>
                    <td>${current.surname}</td>
                </tr>
                <tr>
                    <th>Age:</th>
                    <td>${current.age}</td>
                </tr>
                <tr>
                    <th>Gender:</th>
                    <td>${current.gender}</td>
                    
                </tr>
                
                </table>
            </div>
            
        </div>
    </body>
</html>
