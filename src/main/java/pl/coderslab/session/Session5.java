package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/session5")
public class Session5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        HttpSession session = request.getSession();
        String sum = request.getParameter("sum");

        if(session.getAttribute("captcha")!=null){

            try{
                int sumI = Integer.parseInt(sum);

                if(session.getAttribute("captcha").equals(sumI)){
                    response.getWriter().append("ENTRY ALLOWED");
                } else {
                    response.getWriter().append("bad result <br> <a href=\"/session5\">Return to check</a>\n");

                }
            }catch (NumberFormatException e){
                response.getWriter().append("błędny format");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        Random random = new Random();

        int one = random.nextInt(101);
        int two = random.nextInt(101);
        HttpSession session = request.getSession();
        session.setAttribute("captcha",one+two);
        response.getWriter().append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/session5\" method=\"post\">\n" +
                "    <input type=\"text\" name=\"name\" placeholder=\"imię\">\n" +
                "    <input type=\"text\" name=\"surname\" placeholder=\"nazwisko\">\n" +
                "    <input type=\"text\" name=\"email\" placeholder=\"email\"> <br>\n" +
                "    Wpisz poniżej sumę "+one+" i "+two+" <br>\n" +
                "    <input type=\"number\" name=\"sum\" placeholder=\"suma\"><br>\n" +
                "    <button type=\"submit\"> Send </button>\n" +
                "\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }
}
