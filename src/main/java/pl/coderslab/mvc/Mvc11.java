package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String role = request.getParameter("role");
        if(!role.isEmpty()){

            role="ROLE_"+role.toUpperCase();
            request.setAttribute("role",role);
            getServletContext().getRequestDispatcher("/WEB-INF/jsp1.jsp")
                    .forward(request,response);
        }
    }
}
