package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie1get", urlPatterns = "/showcookie1")
public class Cookie1get extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String value = "";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("User".equals(cookie.getName())) {
                    value = cookie.getValue();
                }

            }
        }
        if (value.isEmpty()) {
            response.getWriter().append("Nie ma takiego ciasteczka");
        } else {
            response.getWriter().append("Wartosc ciasteczka to: " + value);
        }
    }


}

