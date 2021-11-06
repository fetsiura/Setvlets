package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet( "/cookie52")
public class Cookie52 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean flag =true;

        Cookie[] cookies = request.getCookies();

        if(cookies!=null){

            for(Cookie c : cookies){
                if(c.getName().equals("cookie51")){

                    c.setMaxAge(0);
                    response.addCookie(c);
                    response.getWriter().append("Witamy na stronie Cookie");
                    flag=false;
                }
            }
        }
        String message = "Nie odwiedziles jeszcze tej strony";

        if(flag){
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        }
    }
}
