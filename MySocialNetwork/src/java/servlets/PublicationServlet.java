
package servlets;

import classes.Base;
import classes.Publications;
import classes.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PublicationServlet", urlPatterns = {"/PublicationServlet"})
public class PublicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String post=request.getParameter("publication");
        HttpSession session = request.getSession();
        User persone=(User) session.getAttribute("current");
        
        Publications publ=new Publications(persone,post);
        Base.publications.add(publ);
        session.setAttribute("publications", Base.publications);
        response.sendRedirect("startPage.jsp");
        
    }


}
