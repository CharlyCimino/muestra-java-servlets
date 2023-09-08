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
@WebServlet(urlPatterns = {"/muestra-request-servlet1"})
public class MuestraRequestServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><head><meta charset='UTF-8'>");
        out.print("<title>Viendo una petición HTTP</title>");
        out.print("</head><body>");
        out.print("<p><strong>getProtocol</strong>: " + req.getProtocol() + "</p>");
        out.print("<p><strong>getMethod</strong>: " + req.getMethod() + "</p>");
        out.print("<p><strong>getScheme</strong>: " + req.getScheme() + "</p>");
        out.print("<hr>");
        out.print("<p><strong>getServerName</strong>: " + req.getServerName() + "</p>");
        out.print("<p><strong>getServerPort</strong>: " + req.getServerPort() + "</p>");
        out.print("<hr>");
        out.print("<p><strong>getRemoteAddr</strong>: " + req.getRemoteAddr() + "</p>");
        out.print("<p><strong>getRemoteHost</strong>: " + req.getRemoteHost() + "</p>");
        out.print("<p><strong>getRemotePort</strong>: " + req.getRemotePort() + "</p>");
        out.print("<hr>");
        out.print("<p><strong>getRequestURL</strong>: " + req.getRequestURL() + "</p>");
        out.print("<p><strong>getRequestURI</strong>: " + req.getRequestURI() + "</p>");
        out.print("<p><strong>getContextPath</strong>: " + req.getContextPath() + "</p>");
        out.print("<p><strong>getServletPath</strong>: " + req.getServletPath() + "</p>");
        out.print("<p><strong>getQueryString:</strong> " + req.getQueryString() + "</p>");
        out.print("</body></html>");
    }

}
