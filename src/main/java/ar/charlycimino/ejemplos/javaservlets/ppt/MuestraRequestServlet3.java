package ar.charlycimino.ejemplos.javaservlets.ppt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
@WebServlet(urlPatterns = {"/muestra-request-servlet3"})
public class MuestraRequestServlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.setAttribute("pais", "Argentina");
        req.setAttribute("codigo", 54);
        req.setAttribute("el10", new Persona("Leo","Messi"));
        req.setAttribute("hoy", LocalDate.now());
       
        req.getRequestDispatcher("/muestra-request-servlet4").forward(req, resp);

    }

}
