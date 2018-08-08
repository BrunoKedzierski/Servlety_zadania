package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get11", urlPatterns = "/get1")
public class Get11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String par1 = request.getParameter("start");
        String par2 = request.getParameter("end");
        if(par1 == null || par2 == null){
            response.getWriter().append("Brak parametrów");
            return;

        }
        StringBuilder builder = new StringBuilder();
        try{for (int i = Integer.parseInt(par1); i < Integer.parseInt(par2); i++) {
            builder.append(i + ", ");
        }}catch (NumberFormatException e){
            response.getWriter().append("blad");
            return;

        }
        response.getWriter().append("<p style= 'color: green'>" +builder +"</p>");


    }

}


