package com.demo.designpatterns.observer.javaObserver;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class HungryCatTwo implements Observer {

    private Fridge observable;

    @Override
    public void update(Observable o, Object arg) {
        this.observable = (Fridge) o;
        log.info("Second kitty received message: " + this.observable.getMessage());
    }
}
