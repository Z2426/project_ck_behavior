package com.example.project_ck_behavior.command;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public ResponseEntity<String> placeOrder() {
        Command placeOrderCommand = new PlaceOrderCommand(orderService);
        CommandInvoker commandInvoker = new CommandInvoker(placeOrderCommand);
        commandInvoker.executeCommand();
        return ResponseEntity.ok("Order placed successfully");
    }
}

