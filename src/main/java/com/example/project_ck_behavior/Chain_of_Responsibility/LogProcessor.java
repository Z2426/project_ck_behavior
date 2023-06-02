package com.example.project_ck_behavior.Chain_of_Responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LogProcessor {
    @Autowired
    private List<LogHandler> logHandlers;

    public void processLog(String logMessage) {
        for (LogHandler logHandler : logHandlers) {
            logHandler.handleLog(logMessage);
        }
    }
}
