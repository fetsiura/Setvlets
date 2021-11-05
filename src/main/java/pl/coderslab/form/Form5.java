package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form5")
public class Form5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html; charset=UTF-8");


        String degrees = request.getParameter("degrees");
        String method = request.getParameter("convertionType");


        if(!degrees.isEmpty() && !method.isEmpty()){

            try {
                double tem = Double.parseDouble(degrees);
                if(method.equals("celcToFahr")) {
                    writer.append(( 9/5.0 *tem) +32 +" ");
                }  else {
                    writer.append(( tem -32)/1.8 +" ");

                }
            }catch (NumberFormatException e){
                e.printStackTrace();
            }


        } else {
            writer.append("puste");
        }




    }

}
