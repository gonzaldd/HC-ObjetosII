package negocio;

import java.util.GregorianCalendar;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import dao.LoginDao;
import dao.UsuarioDao;
import negocio.UsuarioABM;
import datos.Login;
import datos.Usuario;
import datos.ContactoProfesional;

public class LoginABM {

	LoginDao dao = new LoginDao();
	
	
	public Login usuarioValido (int usuario) throws Exception{
		
		Login logueo = dao.usuarioValido(usuario);
		return logueo;
		
	}
	
	public boolean passValida(String pass,Login usuario){
		boolean valido = false;
		if(usuario.getClaveLogin().equals(pass)){
				valido = true;
				}	
		return valido;
	}
	
	public Login cambiarClave(Login usuario, String passNueva){
		GregorianCalendar horarioCambioNuevo = new GregorianCalendar();
		usuario.setUltimoCambioClaveLogin(horarioCambioNuevo);
		usuario.setClaveLogin(passNueva);

		dao.modificarLogin(usuario);

		return usuario;
	}
	
	
	public Login traerLogin(int idLogin)throws Exception{
		
		Login c= dao.traerLogin(idLogin);
		
		if(c==null) throw new Exception("Login no existe.");
		
	return c;
	}
	
	
	public int agregarLogin( int usuarioLogin, String claveLogin,GregorianCalendar ultimoIngresoLogin,GregorianCalendar ultimoCambioClaveLogin,
			int tipoUsuario,boolean activoLogin) throws Exception{
		
		Login l = new Login(usuarioLogin, claveLogin, ultimoIngresoLogin, ultimoCambioClaveLogin,tipoUsuario, activoLogin);
		
		if(dao.traerLogin(usuarioLogin)!= null){
			
			throw new Exception("Logueo ya existe");
		}
		
	return dao.agregarLogin(l);
	}
	
	
	//modificar Login
	@SuppressWarnings("null")
	public void modificar(Login l) throws Exception{
		
		if (l!=null){
			dao.modificarLogin(l);
		}
			
		else{
			throw new Exception("Usuario: " +l.getUsuarioLogin()+ " no existe para modificar.");
		}
	}
	
	
	
	
	public String enviarMailCambioCorrecto(Login l){
        try
        {
          // se obtiene el objeto Session. La configuración es para
          // una cuenta de gmail.
        	
        	String mail = ContactoProfesional.getMailProfesional();
        	
        	
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "grupo8.hc@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props, null);
            // session.setDebug(true);

            // Se compone la parte del texto
            BodyPart texto = new MimeBodyPart();
            texto.setText("Estimado/a, le enviamos este mail para informarle que su contraseña ha sido cambiada.\nDe no haber sido usted, por favor, póngase en contacto con el administrador.\n\nDesde ya, muchas gracias.\nSaludos.");

            // Se compone el adjunto con el archivo (puede ser una imagen o cualquier otor archivo)
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
            		new DataHandler(new FileDataSource("C:/Users/Seba/Desktop/zxc/HC/WebContent/static/img/logo.jpg")));
            adjunto.setFileName("1.jpg");
            /*
            // Crear tantos MimeBodyPart como archivos adjuntos
            BodyPart adjunto2 = new MimeBodyPart();
            adjunto2.setDataHandler(
                    new DataHandler(new FileDataSource("D:/OO2/workspace/HC/WebContent/static/img/2.jpg")));
                adjunto2.setFileName("2.jpg");
                */

            // Una MultiParte para agrupar texto y archivo(s) adjunto(s)
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);
            //multiParte.addBodyPart(adjunto2);

            // Se compone el correo, dando to, from, subject y el
            // contenido.
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("grupo8.hc@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(mail));
            message.setSubject("Cambio de clave en su cuenta");
            message.setContent(multiParte);

            // Se envia el correo.
            Transport t = session.getTransport("smtp");
            t.connect("grupo8.hc@gmail.com", "BCDRg8.hc");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "Cambio de clave exitoso.";
    }
	
	
	public String enviarMailCambioIncorrecto(Login l){
        try
        {
          // se obtiene el objeto Session. La configuración es para
          // una cuenta de gmail.
        	
        	String mail = ContactoProfesional.getMailProfesional();
        	
        	
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "grupo8.hc@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props, null);
            // session.setDebug(true);

            // Se compone la parte del texto
            BodyPart texto = new MimeBodyPart();
            texto.setText("Estimado/a, le enviamos este mail para informarle que se ha intentado cambiar la contraseña, dicho proceso, finalizó de manera incorrecta (usuario o contraseña incorrecta). Por lo cual, para su mayor seguridad, decidimos informarle del incidente.\nDe no haber sido usted, por favor, póngase en contacto con el administrador.\n\nDesde ya, muchas gracias.\nSaludos.");

            // Se compone el adjunto con el archivo (puede ser una imagen o cualquier otor archivo)
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
            		new DataHandler(new FileDataSource("C:/Users/Seba/Desktop/zxc/HC/WebContent/static/img/logo.jpg")));
            adjunto.setFileName("1.jpg");
            /*
            // Crear tantos MimeBodyPart como archivos adjuntos
            BodyPart adjunto2 = new MimeBodyPart();
            adjunto2.setDataHandler(
                    new DataHandler(new FileDataSource("D:/OO2/workspace/HC/WebContent/static/img/2.jpg")));
                adjunto2.setFileName("2.jpg");
                */

            // Una MultiParte para agrupar texto y archivo(s) adjunto(s)
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);
            //multiParte.addBodyPart(adjunto2);

            // Se compone el correo, dando to, from, subject y el
            // contenido.
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("grupo8.hc@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(mail));
            message.setSubject("Cambio de clave en su cuenta");
            message.setContent(multiParte);

            // Se envia el correo.
            Transport t = session.getTransport("smtp");
            t.connect("grupo8.hc@gmail.com", "BCDRg8.hc");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "Cambio de clave exitoso.";
    }
	
	
}
