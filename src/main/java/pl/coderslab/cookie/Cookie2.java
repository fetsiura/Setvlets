package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addToCookies")
public class Cookie2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String val = request.getParameter("value");
        String key = request.getParameter("key");

        if(!val.isEmpty() || !key.isEmpty()){

            Cookie cookie = new Cookie(key,val);
            cookie.setMaxAge(3600*24);
            response.addCookie(cookie);
            response.getWriter().append("cookie created");

        } else {
            response.getWriter().append("empty");
        }


    }

}
