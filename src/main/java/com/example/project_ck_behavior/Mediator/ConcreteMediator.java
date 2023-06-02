package com.example.project_ck_behavior.Mediator;

public class ConcreteMediator implements Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.receiveMessage(message);
        } else if (colleague == colleagueB) {
            colleagueA.receiveMessage(message);
        }
    }
}