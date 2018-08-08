package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie4del", urlPatterns = "/cookie4del")
public class Cookie4del extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String param = request.getParameter("name");
        Cookie [] cookies = request.getCookies();
        for(Cookie cookie: cookies){
            if(param.equals(cookie.getName())){
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                writer.append("Usunieto ciasteczko");
                return;
            }

        }
        writer.append("Nie zaleziono ciasteczka");
    }
}
