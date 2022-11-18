package com.demo.reactive.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.SubmissionPublisher;

@Slf4j
public class Demo {

    public static void main(String... args) throws Exception {

        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        publisher.subscribe(new Observer());

        log.info("Sending items");

        for (int i = 0; i <= 10; i++) {
            publisher.submit(i);
            Thread.sleep(500);
        }

        Thread.sleep(1000);
        publisher.close();

    }

}
