<%-- 
    Document   : startPage
    Created on : Feb 7, 2018, 11:09:03 AM
    Author     : Korisnik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link type="text/css" href="style.css" rel="stylesheet"/>
        <title>Start Page</title>
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
             
            <div id="posts">
            <form action="PublicationServlet" method="post">
               
                
                    <h3>${current.firstName} ${current.surname} </h3>
                    <input type="text" name="publication"  value="What's on yor mind..."/>
                    <button type="submit">Share</button> 
            </form>
                   
            </div>
                    <ul>
                     <c:forEach items="${publications}" var="p">
                         <li class="publications"><h3>${p.persone.firstName} ${p.persone.surname}</h3> 
                             <p>${p.message}</p></li>
                    </c:forEach>
                    </ul>
                    
        </div>
    </body>
</html>
