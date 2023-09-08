package ar.charlycimino.ejemplos.javaservlets.ppt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
@WebServlet(urlPatterns = {"/muestra-request-servlet4"})
public class MuestraRequestServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><head><meta charset='UTF-8'>");
        out.print("<title>Viendo una petición HTTP</title>");
        out.print("</head><body>");
        out.println("<p><strong>pais</strong>: " + req.getAttribute("pais") + "</p>");
        out.println("<p><strong>codigo</strong>: " + req.getAttribute("codigo") + "</p>");
        out.println("<p><strong>el10</strong>: " + req.getAttribute("el10") + "</p>");
        out.println("<p><strong>hoy</strong>: " + req.getAttribute("hoy") + "</p>");
        out.print("</body></html>");
    }

}
