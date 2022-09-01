package com.company.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        /// 1
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        /// 2
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
