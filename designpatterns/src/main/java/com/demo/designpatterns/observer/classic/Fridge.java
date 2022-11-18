package com.demo.designpatterns.observer.classic;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Fridge implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        log.info("One kitty is going sleep");
        this.observers.remove(observer);
    }

    @Override
    public void notify(Message message) {
        observers.forEach(observer -> observer.update(message));
    }
}
