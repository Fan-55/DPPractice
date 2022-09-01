package com.company.strategy;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
