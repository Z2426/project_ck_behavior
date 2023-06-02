package com.example.project_ck_behavior.Iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int position;

    public ConcreteIterator(List<T> collection) {
        this.collection = collection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = collection.get(position);
            position++;
            return item;
        }
        return null;
    }
}