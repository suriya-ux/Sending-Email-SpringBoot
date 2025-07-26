package com.mailsender.testeemail.controller;

import com.mailsender.testeemail.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @PostMapping("/send")
    public String sendMail(
            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String body) {
        sendEmailService.sendEmail(to, subject, body);
        return "Email sent successfully!";
    }
}
