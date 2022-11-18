package com.demo.designpatterns.observer.javaObserver;

public class Demo {

    public static void main(String... args) {
        HungryCatOne observerOne = new HungryCatOne();
        HungryCatTwo observerTwo = new HungryCatTwo();

        Fridge publisher = new Fridge();

        publisher.addObserver(observerOne);
        publisher.addObserver(observerTwo);

        publisher.notify(new Message("More food for two cats!"));

        publisher.deleteObserver(observerOne);

        publisher.notify(new Message("More food for one cat!"));
    }
}
