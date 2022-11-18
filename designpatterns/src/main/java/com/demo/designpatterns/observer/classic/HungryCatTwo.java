package com.demo.designpatterns.observer.classic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HungryCatTwo implements Observer {

    @Override
    public void update(Message message) {
        log.info("Second kitty received message: " + message);
    }
}
