<%-- 
    Document   : people
    Created on : Feb 7, 2018, 11:19:11 AM
    Author     : Korisnik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link type="text/css" href="style.css" rel="stylesheet"/>
        <title>All People</title>
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
            
            <div class="publications">
                
                <c:forEach items="${users}" var="u">
                    
                        <li><h3>${u.firstName} ${u.surname} ${u.age}</h3> </li>
                    
                </c:forEach>
                
                
            </div>
        </div>
    </body>
</html>
