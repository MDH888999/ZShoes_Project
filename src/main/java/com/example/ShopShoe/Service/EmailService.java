package com.example.ShopShoe.Service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    // private final JavaMailSender emailSender;

    // public EmailService(JavaMailSender emailSender) {
    // this.emailSender = emailSender;
    // }

    // Method to send password reset email
    public void sendPasswordResetEmail(String to, String token) {
        // Construct the password reset link
        String resetLink = "http://localhost:8080/reset-password?token=" + token;

        // SimpleMailMessage message = new SimpleMailMessage();
        // message.setTo(to);
        // message.setSubject("Password Reset Request");
        // message.setText("To reset your password, click the following link:\n" +
        // resetLink);

        // // Send the email
        // emailSender.send(message);
    }
}
