package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String start = request.getParameter("start");
        String end = request.getParameter("end");

        if(!start.isEmpty() && !end.isEmpty()){

            try {
                request.setAttribute("start",Integer.parseInt(start)+10);
                request.setAttribute("end",Integer.parseInt(end)+10);
                getServletContext().getRequestDispatcher("/WEB-INF/jsp2.jsp")
                        .forward(request,response);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        } else {
            request.setAttribute("bad","bad data");
        }
    }
}
