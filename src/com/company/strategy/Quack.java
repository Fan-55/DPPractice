package com.company.strategy;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
