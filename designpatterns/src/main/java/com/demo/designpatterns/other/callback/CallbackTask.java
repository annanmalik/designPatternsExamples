package com.demo.designpatterns.other.callback;

import lombok.extern.slf4j.Slf4j;

interface Callback {
    void callMe();
}

@Slf4j
class CallbackImpl implements Callback {
    public void callMe() {
        log.info("I've been called");
    }
}

@Slf4j
class CallbackTask {

    public void register(Callback callback) {
        callback.callMe();
    }

    public static void main(String[] args) {
        CallbackTask caller = new CallbackTask();

        caller.register(new CallbackImpl());

        caller.register(() -> log.info("I've been called"));
    }
}