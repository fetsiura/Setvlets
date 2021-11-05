package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeCookie")
public class Cookie4Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");

        if(!name.isEmpty()){

        Cookie [] cookies = request.getCookies();
        boolean flag = true;
        if(cookies!=null){
            flag=false;
            for (Cookie c : cookies){
                if(c.getName().equals(name)){

                c.setMaxAge(0);
                response.addCookie(c);

                response.getWriter().append("cookie deleted");
                }

            }

        }
        response.getWriter().append("<a href=http://localhost:8080/showAllCookies> SHOW ALL</a>");
        if(flag){
            response.getWriter().append("not found");
        }
        }

    }
}
