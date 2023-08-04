package com.bttp.email;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailMessage {

    public void sendMessage(String email, String subject, String message) {
        Properties props = System.getProperties();// New property

        String from = "owakwandlovu@gmail.com";//we must use the tut address
        String to = email;
        String host = "smtp.gmail.com";//we have to accommodate other hosts like yahoo, webamail etc.
        String protocol = "smtp";
        String password = "Lungisani!1";//we shoudn't need the user's password inorder to be able to send the email
        String username = from;

        int port = 587;
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.username", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", port);//587  yahoo 587 mail
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new GMailAuthenticator(username, password));
        //, new GMailAuthenticator(username, password)
        try {
            // create a message
            Message msg = new MimeMessage(session);

            //Set message attributes
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(message);
            // Define message

            msg.setSentDate(new Date());
            msg.saveChanges();
            Transport transport = session.getTransport(protocol);
            transport.connect(host, port, username, password);
            // transport.connect(host, port, username, password);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
        } catch (MessagingException mex) {
            Exception ex = null;
            if ((ex = mex.getNextException()) != null) {
            }
        }
    }
}
