package com.example.project_ck_behavior.Iterator;

import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> collection;

    public ConcreteAggregate(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(collection);
    }
}