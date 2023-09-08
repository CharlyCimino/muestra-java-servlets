/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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
@WebServlet(name = "saludarNombre", urlPatterns = "/saludar-nombre")
public class SaludarNombreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procesar(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procesar(request, response);
    }
    
    // Ambos métodos (doGet y doPost) tendrán la misma respuesta, para evitar repetir código, cada uno invoca al siguiente método auxiliar:
    private void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombrePersona, apellidoPersona;
        nombrePersona = request.getParameter("fname"); // El valor "fName" es el establecido en el atributo "name" del formulario, en el HTML
        apellidoPersona = request.getParameter("lname"); // El valor "lName" es el establecido en el atributo "name" del formulario, en el HTML
        PrintWriter out = response.getWriter();
        out.println("<html><head><meta charset='UTF-8'></head><body>");
        out.println("<h1>Hola, "+ nombrePersona + " " + apellidoPersona +"</h1>");
        out.println("</body></html>");
    }
}
