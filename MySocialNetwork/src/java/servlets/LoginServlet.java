
package servlets;

import classes.Base;
import classes.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Korisnik
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("user");
        String password=request.getParameter("pass");
        
        User current=Base.returnUser(username, password);
        
        HttpSession session=request.getSession();
        session.setAttribute("users", Base.users);
        session.setAttribute("myFriends", current.getFriends());
        session.setAttribute("friendsOfFriends", Base.friendsOfFriends(current));
        //session.setAttribute("recomendendFriends", Base.recomendendFriends(current));
        if(current!=null){
            session.setAttribute("current", current);
            response.sendRedirect("startPage.jsp");
            
        }else if(current==null){
            response.sendRedirect("login.jsp");
        }
    }
    }

   

