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

@WebServlet("/session4")
public class Session4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");
        String  quantity = request.getParameter("quantity");
        String price = request.getParameter("price");

        HttpSession session = request.getSession();
        List<CartItem> list = new ArrayList<>();
        if (session.getAttribute("list")!=null) {
            list= (List<CartItem>) session.getAttribute("list");
        }

        if (!name.isEmpty() &&  !quantity.isEmpty() && !price.isEmpty()){
            try {
                CartItem cartItem = new CartItem(name, Integer.parseInt(quantity), Double.parseDouble(price));
                list.add(cartItem);
                session.setAttribute("list", list);
            }catch (NumberFormatException e){
                response.getWriter().append("data are empty");
            }
        }
        PrintWriter writer = response.getWriter();
        double res = 0;
        for (CartItem cartItem : list){
            writer.append(cartItem.getName()+" - "+cartItem.getQuantity()+" x "
                    +cartItem.getPrice()+" = "+cartItem.getPrice()*cartItem.getQuantity()
                    +"<br>");
            res += cartItem.getPrice()*cartItem.getQuantity();
        }
        writer.append("SUMA: "+res+"zł");

        writer.append("<br><a href=\"session4.html\">GO TO ADD</a>");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
