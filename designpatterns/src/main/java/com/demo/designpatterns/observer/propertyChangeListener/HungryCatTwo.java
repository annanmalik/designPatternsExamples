package com.demo.designpatterns.observer.propertyChangeListener;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@Slf4j
public class HungryCatTwo implements PropertyChangeListener {

    private Message message;

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.message = (Message) propertyChangeEvent.getNewValue();
        log.info("Second kitty received message: " + this.message.message());
    }
}
