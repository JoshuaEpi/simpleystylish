package mail;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class SMTP {

    public static void main(String[] args) {
        // Configuración de las propiedades para la conexión SMTP
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587"); // Puerto TLS
        props.put("mail.smtp.auth", "true"); // Habilitar autenticación
        props.put("mail.smtp.starttls.enable", "true"); // Habilitar STARTTLS
        props.put("mail.smtp.ssl.protocols", "TLSv1.2"); // Forzar uso de TLSv1.2
        props.put("mail.debug", "true"); // Habilitar salida de depuración

        // Crear una sesión con autenticación
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("oliver4185@gmail.com", "ewlnwnntrwlxeajx");
            }
        });

        try {
            // Crear un mensaje de correo
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("oliver4185@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("fertello2561@gmail.com"));
            message.setSubject("Prueba con Imagen");

            // Parte del cuerpo del mensaje que contiene el texto
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText("Gracias por tu compra en Symple and Stylish");

            // Parte del cuerpo del mensaje que contiene la imagen
            MimeBodyPart imagePart = new MimeBodyPart();
            String imagePath = "C:/Users/OLIVER/Desktop/PRODUCTOS(PROYECTO)/gracias.jpg"; // Ruta a tu archivo de imagen
            DataSource fds = new FileDataSource(imagePath);
            imagePart.setDataHandler(new DataHandler(fds));
            imagePart.setHeader("Content-ID", "<imagen>");

            // Crear un mensaje multipart para combinar texto e imagen
            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart); // Agregar la parte de texto
            multipart.addBodyPart(imagePart); // Agregar la parte de la imagen

            // Establecer el contenido del mensaje como multipart
            message.setContent(multipart);

            System.out.println("Enviando...");
            Transport.send(message);
            System.out.println("Mensaje enviado exitosamente...");
        } catch (MessagingException me) {
            System.out.println("Exception: " + me);
        }
    }
}

