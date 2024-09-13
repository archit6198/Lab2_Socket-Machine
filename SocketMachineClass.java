package Application;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SocketMachineClass
 */
@WebServlet("/SocketMachineClass")
public class SocketMachineClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SocketMachineClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	     // Process the request parameters
        String socketType = request.getParameter("socketType");
        String quantity = request.getParameter("quantity");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        // Example: Print the values to console (can be removed in production)
        System.out.println("Socket Type: " + socketType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        // Set response content type
        response.setContentType("text/html");

        // Write success message to response
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Request submitted successfully!</h2>");
        response.getWriter().println("<p>Thank you, " + name + "! We will send a quote to " + email + " shortly.</p>");
        response.getWriter().println("</body></html>");
		
		
		
	}

}
