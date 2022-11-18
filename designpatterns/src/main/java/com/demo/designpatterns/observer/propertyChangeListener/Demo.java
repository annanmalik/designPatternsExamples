package com.demo.designpatterns.observer.propertyChangeListener;

public class Demo {

    public static void main(String... args) {
        HungryCatOne observerOne = new HungryCatOne();
        HungryCatTwo observerTwo = new HungryCatTwo();

        Fridge publisher = new Fridge();

        publisher.addPropertyChangeListener(observerOne);
        publisher.addPropertyChangeListener(observerTwo);

        publisher.setMessage(new Message("More food for two cats!"));

        publisher.removePropertyChangeListener(observerOne);

        publisher.setMessage(new Message("More food for one cat!"));
    }
}
