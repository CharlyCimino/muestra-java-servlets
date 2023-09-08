package ar.charlycimino.ejemplos.javaservlets.ppt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
@WebServlet(urlPatterns = {"/muestra-request-servlet2"})
public class MuestraRequestServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><head><meta charset='UTF-8'>");
        out.print("<title>Viendo una petición HTTP</title>");
        out.print("</head><body>");
        
        Enumeration<String> nombresHeaders = req.getHeaderNames();
        out.print("<h1>Headers recibidos</h1>");
        while (nombresHeaders.hasMoreElements()) {
            String nH = nombresHeaders.nextElement();
            out.println("<p><strong>" + nH + "</strong>: " + req.getHeader(nH) + "</p>");
        }
        
        Enumeration<String> nombresParams = req.getParameterNames();
        out.print("<h1>Parámetros recibidos</h1>");
        while (nombresParams.hasMoreElements()) {
            String nP = nombresParams.nextElement();
            out.println("<p><strong>" + nP + "</strong>: " + req.getParameter(nP) + "</p>");
        }
        
//        Cookie[] cookies = req.getCookies();
//        out.print("<h1>Cookies recibidas</h1>");
//        for (int i = 0; i < cookies.length; i++) {
//            out.println("<p>"+ cookies[i] + "</p>");
//        }
        
        out.print("</body></html>");

    }

}
