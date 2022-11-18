package com.demo.designpatterns.observer.classic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HungryCatOne implements Observer {

    @Override
    public void update(Message message) {
        log.info("First kitty received message: " + message);
    }
}
