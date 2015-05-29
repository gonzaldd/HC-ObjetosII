package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.Login;
import negocio.LoginABM;

public class ControladorLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logout(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}
	
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		HttpSession sesion = request.getSession();
		int usuario = Integer.parseInt(request.getParameter("user"));
		String pass = request.getParameter("pass");
		String resultado = "";
		LoginABM login = new LoginABM();
		
		try{
			if(sesion.getAttribute("usuario") == null){
				Login l = login.usuarioValido(usuario);
				if(l != null){
					if(login.passValida(pass, l)){
						sesion.setAttribute("usuario", usuario);
						resultado = "Logueo con exito!";
						request.setAttribute("resultado", resultado);
						request.getRequestDispatcher("/resultadoLogin.jsp").forward(request ,response);
					}else{
						resultado = "Contrase�a incorrecta.";
						request.setAttribute("resultado", resultado);
						request.getRequestDispatcher("/resultadoLogin.jsp").forward(request ,response);
					}
				}else{
					resultado = "El usuario no existe";
					request.setAttribute("resultado", resultado);
					request.getRequestDispatcher("/resultadoLogin.jsp").forward(request ,response);
				}
				
			}else{
				resultado = "Usted ya esta logueado";
				request.setAttribute("resultado", resultado);
				request.getRequestDispatcher("/resultadoLogin.jsp").forward(request ,response);
			}
				
		
		}catch (Exception e){
			response.sendError(500, "Error en el servidor.");
		}			
		
	}
	
	protected void logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        HttpSession sesion = request.getSession();
        sesion.invalidate();
        response.sendRedirect("/HC/index.html");
        
    }

}
