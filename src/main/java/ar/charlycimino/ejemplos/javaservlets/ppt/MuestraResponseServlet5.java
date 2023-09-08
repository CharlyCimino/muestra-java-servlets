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
@WebServlet(urlPatterns = {"/muestra-response-servlet5"})
public class MuestraResponseServlet5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><meta charset='UTF-8'>");
        out.println("<title>Respuesta de muestra</title>");
        out.println("</head><body>");
        out.println("<h1>Respuesta desde el servidor</h1>");
        out.println("<p>Generada dinámicamente por un servlet</p>");
        out.println("</body></html>");
    }
}
