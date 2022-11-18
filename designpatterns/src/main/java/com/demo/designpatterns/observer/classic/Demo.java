package com.demo.designpatterns.observer.classic;

public class Demo {

    public static void main(String... args) {
        HungryCatOne observerOne = new HungryCatOne();
        HungryCatTwo observerTwo = new HungryCatTwo();

        Fridge publisher = new Fridge();

        publisher.attach(observerOne);
        publisher.attach(observerTwo);

        publisher.notify(new Message("More food for two cats!"));

        publisher.detach(observerOne);

        publisher.notify(new Message("More food for one cat!"));
    }
}
