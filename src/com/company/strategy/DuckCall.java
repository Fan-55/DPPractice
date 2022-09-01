package com.company.strategy;

public class DuckCall {
    IQuackBehavior quackBehavior;

    public DuckCall(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
