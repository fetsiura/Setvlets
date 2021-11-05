package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        Cookie [] cookies = request.getCookies();
        boolean flag = true;
        String ref ="<a href=http://localhost:8080/removeCookie?name=";
        if(cookies!=null){
            flag=false;
            for (Cookie c : cookies){
                response.getWriter().append("Cookie name - "+c.getName()+", value - "+c.getValue()+"<br>");
                response.getWriter().append(ref+c.getName()).append(">delete cookie</a> "+" "+c.getName()+"<br>");
            }

        }

        if(flag){
            response.getWriter().append("not found");
        }
    }
}
