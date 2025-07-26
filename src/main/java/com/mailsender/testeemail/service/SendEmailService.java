package com.mailsender.testeemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("suriyakumaran82@gmail.com"); // Change this
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
    }
}
