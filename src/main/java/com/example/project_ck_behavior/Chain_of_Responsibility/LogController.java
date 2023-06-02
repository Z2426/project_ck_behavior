package com.example.project_ck_behavior.Chain_of_Responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @Autowired
    private LogProcessor logProcessor;

    @PostMapping("/api/log")
    public ResponseEntity<String> logMessage(@RequestBody String message) {
        logProcessor.processLog(message);
        return ResponseEntity.ok("Log processed successfully");
    }
}