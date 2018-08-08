package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Post5", urlPatterns = "/post5")
public class Post5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
                String que = request.getParameter("convertionType");
                if("celcToFahr".equals(que)){
                    double celc = Double.parseDouble(que);
                    double wynik = 2 * celc - 0.2*celc + 32;
                    writer.append(String.valueOf(wynik));
                }if("fahrToCelc".equals(que)){
                    double celc = Double.parseDouble(que);
                    double wynik =  (celc-32)*5/9.0;
            writer.append(String.valueOf(wynik));

                }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
