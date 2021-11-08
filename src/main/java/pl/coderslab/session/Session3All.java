package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/showAllSessions")
public class Session3All extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().append("<br> <a href=http://localhost:8080/addToSession> GO TO ADD</a><br>");


        HttpSession session = request.getSession();

        if(session.getAttribute("map")!=null){
            Map<String, String> map = (Map<String, String>) session.getAttribute("map");
            for(Map.Entry<String,String> entry : map.entrySet()){
                response.getWriter().append("Key - "+entry.getKey()+", Value - "+entry.getValue()+"<br>");
            }
        } else {
            response.getWriter().append("<br> EMPTY");
        }

    }
}