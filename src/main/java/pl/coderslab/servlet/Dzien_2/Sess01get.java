package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Sess01get", urlPatterns = "/getsession01")
public class Sess01get extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter" );
        if(counter == null){
            writer.append("Sesja nie istnieje");
        }
        else {
            writer.append(counter.toString());
            counter++;
            session.setAttribute("counter",counter);
        }
    }
}
