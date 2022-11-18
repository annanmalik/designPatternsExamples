package com.demo.designpatterns.other.chainOfResponsibility;

public class Demo {

    public static void main(String ...args) {
        DrunkChain chain1 = new Vodka();
        DrunkChain chain2 = new Beer();

        chain1.setNextChain(chain2);

        int savings = 140;

        chain1.spendMoney(new Savings(savings));
    }
}
