package com.lecture.four.dependency;

import java.time.LocalDateTime;

public class Logger {
    public static void log(String message) {
        System.out.println("[LOG] " + LocalDateTime.now() + ": " + message);
    }
}

