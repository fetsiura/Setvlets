package pl.coderslab.get;

import org.apache.logging.log4j.util.Strings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/get4")
public class Get4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        Map<String, String[]> parameterMap = request.getParameterMap();

        if( parameterMap.isEmpty()){
            response.getWriter().append("puste");
        } else {

            for (Map.Entry<String,String[]> entry: parameterMap.entrySet()){

                response.getWriter().append(entry.getKey()+": <br>");
                for (String val : entry.getValue()){
                    response.getWriter().append("- ").append(val).append("<br>");
                }

            }
        }



    }
}
