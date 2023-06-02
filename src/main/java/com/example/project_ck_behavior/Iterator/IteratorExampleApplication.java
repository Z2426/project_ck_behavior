package com.example.project_ck_behavior.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class IteratorExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(IteratorExampleApplication.class, args);
    }
}

@RestController
class IteratorController {
    @GetMapping("/items")
    public List<String> getItems() {
        List<String> items = Arrays.asList("iphone X", "Samsum galaxy s8", "Redmi note 9");
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>(items);
        Iterator<String> iterator = aggregate.createIterator();

        List<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            String item = iterator.next();
            result.add(item);
        }

        return result;
    }
}
