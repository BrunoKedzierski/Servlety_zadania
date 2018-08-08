package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Get5", urlPatterns = "/get5")
public class Get5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
            Enumeration<String> en = request.getParameterNames();
           StringBuilder builder = new StringBuilder();
           builder.append("<dl style='list-style-type:circle'>");
           while (en.hasMoreElements()){
               String check = en.nextElement();
               builder.append("<dt>" + check + "</dt>");
               String [] par = request.getParameterValues(check);
               for (String el : par){
                   builder.append("<dd>" + el + "</dd>");
               }
               }
        builder.append("</dl>");
           response.getWriter().append(builder);
    }
}
