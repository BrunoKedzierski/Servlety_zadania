package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Post3", urlPatterns = "/post3")
public class Post3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        try {
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            int c = Integer.parseInt(request.getParameter("c"));
            double delta = (b * b - 4 * a * c);
            double pdelta = Math.sqrt(delta);
            double x1, x2, x0;
            if (delta > 0) {
                x1 = (-b - pdelta) / (2 * a);
                x2 = (-b + pdelta) / (2 * a);
                writer.append("Delta wynosi: " + delta + "\nX1 wynosi: " + x1 + "\nX2 wynosi: " + x2);
            } else if (delta == 0) {
                x0 = -b / (2 * a);
                writer.append("Delta wynosi:" + delta + "\nX0 wynosi: " + x0);
            } else {
                writer.append("Delta jest ujemna i wynosi: " + delta + ". Funkcja nie posiada miejsc zerowych");
            }

        }catch (NumberFormatException e){
            writer.append("blad!!!!");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
