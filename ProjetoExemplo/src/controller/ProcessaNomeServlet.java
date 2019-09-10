package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessaNomeServlet
 */
public class ProcessaNomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessaNomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		
		HttpSession session = request.getSession();
		session.setAttribute("nome", nome);
		
//		response.setContentType("text/plain");
//		response.getWriter().print("Executei a Servlet!!!");
//		response.getWriter().print("<h1>Ola "
//				+ nome 
//				+ "</h1>");
		response.sendRedirect("RespostaServlet");
	}

}




