package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form4")
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String aS = request.getParameter("a");
        String bS = request.getParameter("b");
        String cS = request.getParameter("c");
        if (aS.isEmpty() || bS.isEmpty() || cS.isEmpty()) {
            writer.append("data is empty");
        } else {
            try {
                double a = Double.parseDouble(aS);
                double b = Double.parseDouble(bS);
                double c = Double.parseDouble(cS);
                double delta = Math.pow(b,2)-4 * a *c;
                if (delta>0) {
                    double x1 = (-b - Math.sqrt(b))/ (2*a);
                    double x2 = (-b + Math.sqrt(b))/ (2*a);
                    writer.append("x1 = "+x1+ ", x2 = "+ x2);
                } else if (delta ==0) {
                    double x = -b/ (2*a);
                    writer.append("x = " + x);
                } else {
                    writer.append("there are no zeros");
                }
            }catch (NumberFormatException e) {
                writer.append("some its not a number");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
