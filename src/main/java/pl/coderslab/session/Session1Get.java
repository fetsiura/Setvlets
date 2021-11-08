package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session1Get")
public class Session1Get extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if( session.getAttribute("counter") != null){
            int counter = (int)session.getAttribute("counter");
            response.getWriter().append("counter is "+counter);
            session.setAttribute("counter", ++counter);
        } else {
            response.getWriter().append("EMPTY");
        }
    }
}
