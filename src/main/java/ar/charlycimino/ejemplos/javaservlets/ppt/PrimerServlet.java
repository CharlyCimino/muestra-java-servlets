package ar.charlycimino.ejemplos.javaservlets.ppt;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class PrimerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        /*
            Lógica a desarrollar cuando se recibe una petición GET
         */
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        /*
            Lógica a desarrollar cuando se recibe una petición POST
         */
    }
    /*
        Disponibles también los métodos doHead, doOptions, doPut, doTrace y doDelete,
        correspondientes a los otros verbos HTTP.
     */
}
