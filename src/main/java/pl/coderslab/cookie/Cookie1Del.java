package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie [] cookies = request.getCookies();
        boolean flag = true;

        if(cookies!=null){

        for (Cookie c : cookies){
            if(c.getName().equals("User")){
                c.setMaxAge(0);
                response.addCookie(c);
                response.getWriter().append("cookie deleted");
                flag = false;
            }
        }
        }

        if(flag){
            response.getWriter().append("not found");
        }
    }
}
