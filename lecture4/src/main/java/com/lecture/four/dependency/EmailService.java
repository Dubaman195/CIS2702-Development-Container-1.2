package com.lecture.four.dependency;

// EmailService depends on Message and Logger

import java.util.List;

public class EmailService {
    private String serverAddress;
    private int port;
    
    public EmailService(String serverAddress, int port) {
        this.serverAddress = serverAddress;
        this.port = port;
    }
    
    // Dependency 1: Message as parameter - temporary use
    public boolean sendEmail(Message message) {
        // Message is used but NOT stored
        Logger.log("Attempting to send email to: " + message.getRecipient());
        
        System.out.println("Connecting to " + serverAddress + ":" + port);
        System.out.println("Sending email:");
        System.out.println(message.format());
        
        // Dependency 2: Logger used via static method
        Logger.log("Email sent successfully to: " + message.getRecipient());
        
        // Message reference is lost after method ends
        return true;
    }
    
    // Multiple messages used temporarily
    public void sendBulkEmails(List<Message> messages) {
        Logger.log("Starting bulk email send: " + messages.size() + " emails");
        
        for (Message msg : messages) {
            sendEmail(msg);  // Each message used temporarily
        }
        
        Logger.log("Bulk email send completed");
    }
    
    // Dependency 3: Creates and uses object within method
    public boolean sendNotification(String recipient, String content) {
        // Message created locally - dependency
        Message notification = new Message(recipient, "Notification", content);
        return sendEmail(notification);
        // notification goes out of scope here
    }
}
