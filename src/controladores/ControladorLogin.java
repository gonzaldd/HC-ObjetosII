package controladores;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.Funciones;
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
		String ip = InetAddress.getLocalHost().getHostAddress();
		String ipInet = "192.168.79.133";

		String resultado = "";
		LoginABM login = new LoginABM();
		
		try{
			if(sesion.getAttribute("usuario") == null){
				Login l = login.usuarioValido(usuario);
				if(l != null){
					/*
					InetAddress address = InetAddress.getLocalHost();
					String addressCadena = address.getHostAddress();
					*/
					if(login.passValida(pass, l) && Funciones.comparadorIps(ip,ipInet)==0){
						//if(addressCadena=="169.254.196.78"){
							sesion.setAttribute("usuario", usuario);
							
							
							
							request.getRequestDispatcher("/logueoExitoso.jsp").forward(request ,response);
							
							
							
							
						//}
					}else if(login.passValida(pass, l) && Funciones.comparadorIps(ip,ipInet)!=0){
						resultado = "No puede iniciar sesión. Computadora no autorizada. ip del request: "+ip;
						request.setAttribute("resultado", resultado);
						request.getRequestDispatcher("/resultadoLogin.jsp").forward(request ,response);
						
						
					}else{
						resultado = "Contraseña incorrecta.";
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
