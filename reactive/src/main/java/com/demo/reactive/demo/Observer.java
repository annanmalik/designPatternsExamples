package com.demo.reactive.demo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Flow;

@Slf4j
public class Observer implements Flow.Subscriber<Integer> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @SneakyThrows
    @Override
    public void onNext(Integer item) {
        log.info("Received item: " + item);

        if (item == 5)
            throw new Exception("Go to onError");

        subscription.request(1);
    }

    @Override
    public void onError(Throwable error) {
        log.info("Error occurred: " + error.getMessage());
    }

    @Override
    public void onComplete() {
        log.info("Task completed");
    }
}
