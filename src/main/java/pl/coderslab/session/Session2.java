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
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer= response.getWriter();
        List<Integer> marks = new ArrayList<>();
        HttpSession session = request.getSession();
        writer.append("<form method=\"post\" action=\"/session2\">\n" +
                "    Podaj ocenę: <br>\n" +
                "    <input type=\"number\" name=\"mark\">\n" +
                "\n" +
                "    <button type=\"submit\">GO</button>\n" +
                "</form>");
        writer.append("<br>");

        if(session.getAttribute("marks") != null){
            marks = (List<Integer>) session.getAttribute("marks");
        }

        String markStr = request.getParameter("mark");

        if(!markStr.isEmpty() && marks!=null){

            try{

                int mark = Integer.parseInt(markStr);
                marks.add(mark);
                session.setAttribute("marks",marks);
            }catch (NumberFormatException e){
                writer.append("error format");
            }
        }

        if(marks.size()!=0){
            int res = 0;
            writer.append("Marks: <br>");
            for(int a : marks){
                writer.append(a+", ");
                res+=a;
            }
            writer.append("<br> AVG = "+(res /(double)marks.size()));
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        doPost(request,response);
    }
}
