package servletHTML;

/**
 *
 * @author EMMANUEL
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletFormulario extends HttpServlet {

    String nombre;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        nombre = peticion.getParameter("NOMBRE");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title></head>");
        out.println("<body background='Imagenes/fondo.jpg'>");
        out.println("<p><h1 style='color:blue'><center>Su nombre es:<B>" + nombre + "</B> </center></p>");
        out.println("hoy es " + new Date());
        out.println("</h1></body></html>");
        out.close();
    }
}
