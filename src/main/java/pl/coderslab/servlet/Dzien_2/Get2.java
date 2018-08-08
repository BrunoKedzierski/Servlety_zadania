package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Get2", urlPatterns = "/get2")
public class Get2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        StringBuilder builder = new StringBuilder();
        Enumeration<String> saq =request.getParameterNames();
        while (saq.hasMoreElements()){
            String check = saq.nextElement();
            builder.append(check);
            String [] par = request.getParameterValues(check);
            for (String el : par){
                builder.append(": " + el).append("<br>");
            }
        }
            response.getWriter().append(builder);
    }
}
