package datos;

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

import datos.ContactoProfesional;

public class Mail {
	
    public static void main(String[] args)
    {
        
    	String mail = ContactoProfesional.getMailProfesional();
    	
    	try
        {
          // se obtiene el objeto Session. La configuración es para
          // una cuenta de gmail.
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
            texto.setText("Enviando múltiples adjuntos PRUEBA 4 - otros archivos");

            // Se compone el adjunto con el archivo (puede ser una imagen o cualquier otor archivo)
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
                new DataHandler(new FileDataSource("D:/OO2/workspace/HC/WebContent/static/img/1.jpg")));
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
            message.setSubject("Hola");
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
    }
}