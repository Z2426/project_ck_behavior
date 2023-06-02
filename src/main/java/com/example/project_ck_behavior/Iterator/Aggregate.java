package com.example.project_ck_behavior.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}