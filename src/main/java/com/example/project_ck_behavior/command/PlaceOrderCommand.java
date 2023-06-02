package com.example.project_ck_behavior.command;

public class PlaceOrderCommand implements Command {
    private OrderService orderService;

    public PlaceOrderCommand(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void execute() {
        orderService.placeOrder();
    }
}