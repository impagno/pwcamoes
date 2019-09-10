package servlets;

import java.io.IOException;
import java.text.NumberFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OperacaoServlet
 */
@WebServlet("/operacao")
public class OperacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperacaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double num1 = Double
				.parseDouble(request.getParameter("num1"));
		double num2 = Double
				.parseDouble(request.getParameter("num2"));
		String oper = request.getParameter("operacao");
		String operacao = "";
		double soma = 0.0;
			
		switch(oper) {
			case "soma":
				soma = num1 + num2;
				operacao = "soma";
			break;
			case "sub":
				soma = num1 - num2;
				operacao = "subtração";
			break;
			case "multi":
				soma = num1 * num2;
				operacao = "multiplicação";
			break;
			case "div":
				soma = num1 / num2;
				operacao = "divisão";
			break;
		}

		response.getWriter().print("<h1>O resultado da operação de " 
				+ operacao + " é "
				+ NumberFormat.getInstance().format(soma)
				+ "</h1>");
	}

}
