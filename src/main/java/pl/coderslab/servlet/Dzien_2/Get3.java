package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get3", urlPatterns = "/get3")
public class Get3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        StringBuilder builder = new StringBuilder();
        int height = 0;
        int width = 0;
        try{ width = Integer.parseInt(request.getParameter("width"));
             height = Integer.parseInt(request.getParameter("height"));}
            catch (NumberFormatException e ){
             width = 5;
             height = 10;
            }
            builder.append("<table border ='1'>");
        for (int i = 1; i <= height ; i++) {
            builder.append("<tr>");
            for (int j = 1; j <= width ; j++) {
                builder.append("<td>" + i * j +"</td>");


            }
            builder.append("</tr>");

        }
        builder.append("</table>");
        response.getWriter().append(builder);



    }
}
