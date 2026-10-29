package com.lecture.four.dependency;

import java.util.Arrays;
import java.util.List;

public class DependencyDemo {
    public static void main(String[] args) {
        EmailService emailer = new EmailService("smtp.example.com", 587);
        
        // Message exists independently
        Message msg1 = new Message("user@example.com",
         "Hello",
         "Welcome!");
        
         Message msg2 = new Message("admin@example.com",
         "Report", 
         "Daily report");
        
        // EmailService uses messages temporarily
        emailer.sendEmail(msg1);
        emailer.sendEmail(msg2);
        
        // Messages still exist after being used
        System.out.println("\nMessages still exist:");
        System.out.println(msg1.getRecipient() + " - " + msg1.getSubject());
        
        // Bulk send with temporary list
        List<Message> bulk = Arrays.asList(msg1, msg2);
        emailer.sendBulkEmails(bulk);

        System.out.println("");
    }
}
