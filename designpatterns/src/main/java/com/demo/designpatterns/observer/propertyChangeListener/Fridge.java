package com.demo.designpatterns.observer.propertyChangeListener;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

@Slf4j
public class Fridge {

    private final PropertyChangeSupport support;

    private Message message;


    public Fridge() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        log.info("One kitty is going sleep");
        support.removePropertyChangeListener(propertyChangeListener);
    }

    public void setMessage(Message message) {
        support.firePropertyChange("message", this.message, message);
        this.message = message;
    }}
