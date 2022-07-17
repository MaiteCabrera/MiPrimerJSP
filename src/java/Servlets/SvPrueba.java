/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Covid
 */
@WebServlet(name = "SvPrueba", urlPatterns = {"/SvPrueba"})
public class SvPrueba extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        Esto lo podría borrar porque no lo vamos a usar. 
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvPrueba</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvPrueba at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    */
    }
//Métodos doGet y doPost
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //    processRequest(request, response);
    //simulamos una lista de clientes 
    //esto ya podría venir desde una base de datos 
    
    List<Cliente>listaClientes = new ArrayList<> ();
    listaClientes.add(new Cliente(1, "Luisina", "de Paula", "444222357"));
    listaClientes.add(new Cliente(2, "Ana", "Chavez", "589647123"));
    listaClientes.add(new Cliente(3, "Maite", "Cabrera", "336987451"));
    
    
    //seteamos la lista de cliente como un parámetro
    //para poder utilizar en cualquier JSP 
    //para ello traemos la sesión de la request 
    
    HttpSession misession = request.getSession();
    misession.setAttribute("listaClientes", listaClientes);
    
    //redireccionamos a otro JSP 
    response.sendRedirect("MostrarJSP.jsp");
    
    //configuración doGet + redirección a otro JSP 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //doPost
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //    processRequest(request, response);
    // traemos los datos enviados en la request 
    //los guardamos en variables auxiliares 
    //el nombre en getParameter debe ser el mismo que en el input del form
    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String teléfono = request.getParameter("teléfono");
    /*
    Ahora cuando recibamos los datos, podemos pasarlos a la lógica de negocio para 
    realizar operaciones, o guardalos en una base de datos, o cualquier función que 
    querramos darles. 
    */
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
        } 
}
