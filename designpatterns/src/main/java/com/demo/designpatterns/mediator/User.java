package com.demo.designpatterns.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class User {
    Mediator mediator;
    String name;

    abstract void send(String message);
    abstract void receive(String message);
}
