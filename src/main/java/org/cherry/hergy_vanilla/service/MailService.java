package org.cherry.hergy_vanilla.service;
import org.cherry.hergy_vanilla.dto.MailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public MailRequest sendMail(MailRequest mailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("contact@hergyvanilla.mg");
        message.setSubject("Nouveau message de " + mailRequest.getName());
        message.setText(
                "Nom: " + mailRequest.getName() + "\n" +
                        "Email: " + mailRequest.getEmail() + "\n" +
                        "Téléphone: " + mailRequest.getPhoneNumber() + "\n" +
                        "Pays: " + mailRequest.getCountryName() + "\n" +
                        "Entreprise: " + mailRequest.getCompanyName() + "\n" +
                        "Message:\n" + mailRequest.getMessage()
        );
        message.setReplyTo(mailRequest.getEmail());
        mailSender.send(message);
        return mailRequest;
    }
}
