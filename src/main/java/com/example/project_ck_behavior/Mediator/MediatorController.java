package com.example.project_ck_behavior.Mediator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// MediatorController.java
@RestController
public class MediatorController {
    private Mediator mediator;
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public MediatorController() {
        mediator = new ConcreteMediator();
        colleagueA = new ColleagueA(mediator);
        colleagueB = new ColleagueB(mediator);

        ((ConcreteMediator) mediator).setColleagueA(colleagueA);
        ((ConcreteMediator) mediator).setColleagueB(colleagueB);
    }

    @PostMapping("/send-message")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        colleagueA.send(message);
        return ResponseEntity.ok("Message sent");
    }
}
