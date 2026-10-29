package com.lecture.four.dependency;

// Dependency example - EmailService uses Message temporarily

import java.time.LocalDateTime;

public class Message {
    private String recipient;
    private String subject;
    private String body;
    private LocalDateTime timestamp;
    
    public Message(String recipient, String subject, String body) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.timestamp = LocalDateTime.now();
    }
    
    public String format() {
        return "To: " + recipient + "\n" +
               "Subject: " + subject + "\n" +
               "Body: " + body + "\n" +
               "Time: " + timestamp;
    }
    
    public String getRecipient() { return recipient; }
    public String getSubject() { return subject; }
}

