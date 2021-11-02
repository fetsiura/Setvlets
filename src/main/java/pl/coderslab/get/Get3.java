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

@WebServlet("/get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        int width = 5;
        int height = 10;

        String width2 = request.getParameter("width");
        String height2 = request.getParameter("height");

        try{
            if (!Strings.isBlank(width2) && !Strings.isBlank(height2)){
                width = Integer.parseInt(width2);
                height = Integer.parseInt(height2);
            }


                for(int i = 1;i<width;i++ ){
                    for (int j=1;j<height;j++){
                        response.getWriter().append(i+"*"+j+"="+i*j).append("<br>");
                    }
                }

            }catch (NumberFormatException e){
                e.printStackTrace();
            }
    }
}
