package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/get2")
public class Get2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");


        Map<String, String[]> parameterMap = request.getParameterMap();
        if(parameterMap.isEmpty()){
            response.getWriter().append("puste");
        } else {


            for(Map.Entry<String,String[]> entry:parameterMap.entrySet()){

                response.getWriter().append(entry.getKey()+" "+ Arrays.toString(entry.getValue())+"<br>");
            }
        }

    }
}
