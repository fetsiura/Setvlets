package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form3")
public class Form3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String page = request.getParameter("page");

        if (page.isEmpty()) {
            response.getWriter().append("data is empty");
        } else {
            try {
                int number = Integer.parseInt(page);
                for (int i = number; i > 0; i--) {
                    if (number % i == 0) {
                        response.getWriter().append(i + "<br>");
                    }
                }
            } catch (NumberFormatException e) {
                response.getWriter().append("its not a number");
            }
        }
    }
}
