package com.demo.designpatterns.observer.javaObserver;

import java.util.Observable;

public class Fridge extends Observable {

    private Message message;

    public void notify(Message message) {
        this.message = message;
        setChanged();
        notifyObservers();
    }

    public Message getMessage() {
        return this.message;
    }
}
