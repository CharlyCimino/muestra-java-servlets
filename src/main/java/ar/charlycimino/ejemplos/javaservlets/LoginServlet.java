package ar.charlycimino.ejemplos.javaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private static final String USER_ESPERADO = "prueba";
    private static final String PASS_ESPERADA = "123456";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        boolean todoOK = user.equals(USER_ESPERADO) && pass.equals(PASS_ESPERADA);

        if (!todoOK) {
            response.sendError(response.SC_UNAUTHORIZED, "Usuario o clave incorrectas");
        } else {
            final String emoji = "\uD83D\uDE0F";
            response.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = response.getWriter()) {                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Autorizad@</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Bienvenid@ a la sección Premium "+ emoji +"</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        throw new RuntimeException("¡No deberías enviar datos sensibles vía GET!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
