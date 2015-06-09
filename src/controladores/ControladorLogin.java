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
		String ipInet1 = "169.254.196.78"; // Barros
		String ipInet2 = "192.168.24.100"; // Cascardo
		String ipInet3 = "192.168.79.133"; // Rodriguez

		String resultado = "";
		LoginABM login = new LoginABM();
		
		try{												//1
			if(sesion.getAttribute("usuario") == null){		//2
				Login l = login.usuarioValido(usuario);
				if(l != null){  							//3
					
					
					if(login.passValida(pass, l)) {			//4
						if(Funciones.comparadorIps(ip,ipInet1)==0 || (Funciones.comparadorIps(ip,ipInet2)==0)
							|| (Funciones.comparadorIps(ip,ipInet3)==0)){		//5
							sesion.setAttribute("usuario", usuario);
							request.getRequestDispatcher("/logueoExitoso.jsp").forward(request ,response);
							
							
			/*5*/		}	
						else if(Funciones.comparadorIps(ip,ipInet1)!=0 && (Funciones.comparadorIps(ip,ipInet2)!=0)
								&& (Funciones.comparadorIps(ip,ipInet3)!=0)){  //6
							
							sesion.setAttribute("usuario", usuario);
							request.getRequestDispatcher("/logueoExterno.jsp").forward(request ,response);
			/*6*/			} 

						
						
	/*4*/					}else{
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
