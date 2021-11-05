package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String val = request.getParameter("value");
        String key = request.getParameter("key");
        String time = request.getParameter("time");

        if(!val.isEmpty() || !key.isEmpty()){

            try{

                Cookie cookie = new Cookie(key,val);
                cookie.setMaxAge(3600*Integer.parseInt(time));
                response.addCookie(cookie);
                response.getWriter().append("cookie created");

            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        } else {
            response.getWriter().append("empty");
        }


    }

}
