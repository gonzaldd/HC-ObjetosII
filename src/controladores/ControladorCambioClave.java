package controladores;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.Login;
import negocio.LoginABM;

public class ControladorCambioClave extends HttpServlet {
	
	
	
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
		String passActual = request.getParameter("passActual");
		String passNueva = request.getParameter("passNueva");
		String resultado = "";
		LoginABM login = new LoginABM();
		
		try{
			
				Login l = login.usuarioValido(usuario);
				
			
					if(login.passValida(passActual, l)  )   {
						
						
						login.cambiarClave(l, passNueva);
						//login.enviarMail(l);
					
						resultado = "Cambio de clave exitoso.";
						request.setAttribute("resultado", resultado);
						request.getRequestDispatcher("/cambioClaveExitoso.jsp").forward(request ,response);
					
					
					
					} else 
					{
						resultado ="Usuario o contraseña incorrecta.";
						request.setAttribute("resultado", resultado);
						request.getRequestDispatcher("/resultadoLogin.jsp").forward (request, response);
					}
					
					
				
					
						
						
				}catch (Exception e){
					response.sendError(500, "Error en el servidor.");
				}			
				
			}
					/*}else{
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
		
	} */
	
	protected void logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        HttpSession sesion = request.getSession();
        sesion.invalidate();
        response.sendRedirect("/HC/index.html");
        
    }

}
