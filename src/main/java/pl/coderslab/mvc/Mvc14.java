package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> list = Arrays.asList(
                new Book("Harry", "Potter", "123"),
                new Book("Football", "Pele", "222"),
                new Book("Space", "Nill Armstrong", "333")
        );

        request.setAttribute("books",list);
        getServletContext().getRequestDispatcher("/WEB-INF/resultList.jsp")
                .forward(request,response);
    }
}
