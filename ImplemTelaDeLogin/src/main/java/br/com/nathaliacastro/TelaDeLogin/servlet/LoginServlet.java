package br.com.nathaliacastro.TelaDeLogin.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String form = "	<form method=\"post\"> \n" + 
				"		Usuario <input type=\"text\" name=\"usuario\" /> <br> <br> \n" + 
				"		Senha <input\n" +
				"			type=\"password\" name=\"senha\" /> <br> <br> \n" + 
				"		<button type=\"submit\" name=\"submit\"> Entrar </button> \n" + 
				"		<button type=\"reset\"> Limpar Campos </button> \n" + 
				"		</form>";
		response.getWriter().append("<h1> Tela de Login </h1>").append(form);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String senha = request.getParameter("senha");
		String usuario = request.getParameter("usuario");
		
		String senhaEsperada = "admin";
		String usuarioEsperado = "admin";
		
		if(senhaEsperada.equals(senha) && usuarioEsperado.equals(usuario)) {
			response.getWriter().append("<h3> Bem vindo senhor(a), " + usuario + "</h3>").append("Login realizado com sucesso!");
			
		} else {
			response.getWriter().append("<span style=\"color: red;\"> Os dados digitados são inválidos. Por favor, tente novamente. </span>");
			doGet(request, response);
		}
	}
}
