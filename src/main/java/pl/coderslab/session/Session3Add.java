package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().append("<br> <a href=http://localhost:8080/showAllSessions> GO TO ALL</a>");

        response.getWriter().append("<form action=\"\" method=\"POST\">\n" +
                "    <label>\n" +
                "        Klucz:\n" +
                "        <input type=\"text\" name=\"key\">\n" +
                "    </label>\n" +
                "    <label>\n" +
                "        Wartość:\n" +
                "        <input type=\"text\" name=\"value\">\n" +
                "    </label>\n" +
                "    <input type=\"submit\">\n" +
                "</form>");

        HttpSession session = request.getSession();
        Map<String, String> map= new HashMap<>();

        if(session.getAttribute("map") !=null){
            map= (Map<String, String>) session.getAttribute("map");
        }
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        if(!key.isEmpty() && !value.isEmpty()){
            map.put(key,value);
            session.setAttribute("map",map);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}