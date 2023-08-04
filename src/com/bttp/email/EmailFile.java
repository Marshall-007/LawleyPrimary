package com.bttp.email;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailFile {

    public void emailProof(String email, String subject, String filename) {
        Properties props = System.getProperties();// New property

        String from = "owakwandlovu@gmail.com";
        String to = email;
        String host = "smtp.gmail.com";
        String password = "Lungisani!1";
        String username = "owakwandlovu@gmail.com";

        int port = 587;
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", port);//587  yahoo 587 mail
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new GMailAuthenticator(username, password));

        try {
            String fileAttachment = "./" + filename;

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            // create the message part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            //fill message
            messageBodyPart.setText(subject);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(fileAttachment);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("./" + filename);
            multipart.addBodyPart(messageBodyPart);
            // Put parts in message
            message.setContent(multipart);
            // Send the message
            Transport.send(message);
        } catch (MessagingException ex) {
        }
    }
}
