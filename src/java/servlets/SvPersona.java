
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
       
        }
    

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String nombre = request.getParameter("nombre");
        String posicion = request.getParameter("posicion");
        String ubicacion = request.getParameter("ubicacion");
        String imagenUrl = request.getParameter("imagenUrl");
        
        System.out.println("nombre: " + nombre );
        System.out.println("posicion: " + posicion);
        System.out.println("ubicacion: " + ubicacion);
        System.out.println("imagenUrl: " + imagenUrl);
    }


    
    @Override
    public String getServletInfo() {
        return "Short description";
    

}
}
