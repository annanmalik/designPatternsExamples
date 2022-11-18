package com.demo.designpatterns.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteUser extends User {

    public ConcreteUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message){
        log.info("{} sent : {}", name, message);
        mediator.sendMessage(message, this);
    }
    @Override
    public void receive(String message) {
        log.info("{} received : {}", name, message);
    }
}