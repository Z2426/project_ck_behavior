package com.example.project_ck_behavior.Chain_of_Responsibility;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class FileLogHandler implements LogHandler {
    @Override
    public void handleLog(String logMessage) {
        // Xử lý log bằng cách ghi vào file log
        // Ví dụ: sử dụng thư viện log4j để ghi log vào file
        Logger logger = Logger.getLogger("FileLogger");
        logger.info("File Log: " + logMessage);
    }
}