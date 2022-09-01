package com.company.strategy;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flaying!!");
    }
}
