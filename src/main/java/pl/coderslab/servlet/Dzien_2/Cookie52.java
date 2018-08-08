package pl.coderslab.servlet.Dzien_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie52", urlPatterns = "/cookie52")
public class Cookie52 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        Cookie [] cookies = request.getCookies();
        for(Cookie cookie: cookies){
            if("was".equals(cookie.getName())){
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                writer.append("Witamy na stronie !!!");
                return;

            }
        }
        writer.append("<a href='/cookie51'>Nie odwiedziles jescze tej strony !!!</a>");

    }
}
