package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String end = request.getParameter("end");
        String start = request.getParameter("start");

        if(start == null || end == null){
            response.getWriter().append("Puste dane");
        } else {
            try {
                for (int i =Integer.parseInt(start); i<=Integer.parseInt(end);i++){
                    response.getWriter().append(""+i+"<br>");
                }

            }catch (NumberFormatException e){
                response.getWriter().append("niepoprawna liczba");
            }
        }
    }
}
