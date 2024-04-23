package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ficha
 */
@WebServlet("/Ficha")
public class Ficha extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ficha() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // respuesta
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String lenguaje = request.getParameter("lenguaje");

		out.println("<html>"
		    + "<head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"  rel=\"stylesheet\"></head>"
		    + "<body>");
		out.println("<div class='container mt-5'> ");
		out.println("<h1>Bienvenido: " + nombre + " "+ apellido + "</h1>");
		out.println("Tu Lenguaje favorito es: " + lenguaje);
		out.println("</div>"
		    + "</body>"
		    + "</html>");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}