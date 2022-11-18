package com.demo.designpatterns.other.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Vodka implements DrunkChain {

    private DrunkChain chain;

    @Override
    public void setNextChain(DrunkChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void spendMoney(Savings savings) {
        if (savings.amount() >= 50) {

            int remainder = buyVodka(savings.amount());

            if (remainder != 0) {
                this.chain.spendMoney(new Savings(remainder));
            }

        } else {
            sendToNextProcessor(savings);
        }
    }

    private int buyVodka(int amount) {
        int number = amount / 50;
        log.info("Bought {} bottles of vodka", number);

        return amount % 50;
    }

    private void sendToNextProcessor(Savings savings) {
        this.chain.spendMoney(savings);
    }
}