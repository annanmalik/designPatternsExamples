package com.demo.designpatterns.other.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Beer implements DrunkChain {

    private DrunkChain chain;

    @Override
    public void setNextChain(DrunkChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void spendMoney(Savings savings) {
        if (savings.amount() >= 10) {

            int remainder = buyBeer(savings.amount());

            if (remainder != 0) {
                this.chain.spendMoney(new Savings(remainder));
            }

        } else {
            sendToNextProcessor(savings);
        }
    }

    private int buyBeer(int amount) {
        int number = amount / 10;
        log.info("Bought {} bottles of beer", number);

        return amount % 10;
    }

    private void sendToNextProcessor(Savings savings) {
        this.chain.spendMoney(savings);
    }
}