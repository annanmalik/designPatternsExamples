package com.demo.designpatterns.mediator;

public class Demo {

    public static void main(String ...args) {
        Mediator mediator = new GroupChat();

        User helga = new ConcreteUser(mediator, "Helga");
        User helmut = new ConcreteUser(mediator, "Helmut");

        mediator.addUser(helga);
        mediator.addUser(helmut);

        helga.send("Deutschland, Deutschland über alles");
    }

}
