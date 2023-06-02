package com.example.project_ck_behavior.Chain_of_Responsibility;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLogHandler implements LogHandler {
    @Override
    public void handleLog(String logMessage) {
        // Xử lý log bằng cách ghi ra console
        System.out.println("Console Log: " + logMessage);
    }
}