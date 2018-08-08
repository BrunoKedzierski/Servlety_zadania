package pl.coderslab.servlet.Dzien_2;

import sun.font.FontRunIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "Post4", urlPatterns = "/post4")
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       StringBuilder builder = new StringBuilder();
       try{String [] lista = request.getParameterValues("numbers");
       List <Integer> lisaa = new ArrayList<>();
       for(String str: lista){
           lisaa.add(Integer.parseInt(str));
       }
       Collections.sort(lisaa);
        for (int i = 0; i < lisaa.size(); i++) {
            builder.append(lisaa.get(i) + "\n");

        }
       }catch (NumberFormatException e){
           response.getWriter().append("BLAD!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       }
        response.getWriter().append(builder);






    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.append("<form action='' method='post'>");
        Random random = new Random();
        int ilosc = random.nextInt(11) +5;
        for (int i = 0; i <ilosc ; i++) {
            writer.append("<label>wpisz cyfre<input name='numbers'/></label><br/>");

        }
        writer.append("<input type='submit'/>" +
                "</form>");


    }
}
