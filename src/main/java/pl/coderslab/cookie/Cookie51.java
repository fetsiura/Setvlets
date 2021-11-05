package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet( "/cookie51")
public class Cookie51 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String message = "Nie odwiedziles jeszcze tej strony";
        PrintWriter writer = response.getWriter();

        Cookie[] cookies = new Cookie[0];

        if (request.getCookies() != null) {
            cookies = request.getCookies();
        } else {
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        }

        for (Cookie cookie : cookies) {
            if ("cookie51".equals(cookie.getName())) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                response.getWriter().append("Witamy na stronie Cookie52");
                break;
            }
        }
    }
}
