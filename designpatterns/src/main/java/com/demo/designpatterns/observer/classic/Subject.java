package com.demo.designpatterns.observer.classic;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(Message message);
}
