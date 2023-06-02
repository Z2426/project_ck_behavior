package com.example.project_ck_behavior.Chain_of_Responsibility;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transaction;

@Component
public class DatabaseLogHandler implements LogHandler {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void handleLog(String logMessage) {
        LogEntry logEntry = new LogEntry(logMessage);
        saveLogEntry(logEntry);
    }

    @Transactional
    public void saveLogEntry(LogEntry logEntry) {
        entityManager.persist(logEntry);
    }
}