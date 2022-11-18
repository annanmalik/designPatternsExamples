package com.demo.designpatterns.other.chainOfResponsibility;

public interface DrunkChain {

    void setNextChain(DrunkChain nextChain);

    void spendMoney(Savings savings);
}
