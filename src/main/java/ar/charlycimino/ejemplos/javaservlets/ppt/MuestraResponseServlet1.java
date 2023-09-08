
package ar.charlycimino.ejemplos.javaservlets.ppt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
@WebServlet(urlPatterns = {"/muestra-response-servlet1"})
public class MuestraResponseServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Status actual: " + resp.getStatus());
        System.out.println("Content Type actual: " + resp.getContentType());
        System.out.println("Codificación actual: " + resp.getCharacterEncoding());
        
        Collection<String> nombresHeaders = resp.getHeaderNames();
        System.out.println("Headers actuales");
        for (String nombreHeader : nombresHeaders) {
            System.out.println("\t" + nombreHeader + ": " + resp.getHeader(nombreHeader));
        }
        
        System.out.println("¿Contiene header 'Date'? " + resp.containsHeader("Date"));
        System.out.println("¿Contiene header 'Server'? " + resp.containsHeader("Server"));
        
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.addHeader("Estado", "Probando...");
        resp.addIntHeader("UnEntero", 93);
        resp.addDateHeader("Date", System.currentTimeMillis());
        
        resp.setStatus(204); // Status OK
    }
    
}
