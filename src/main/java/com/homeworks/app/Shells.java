package com.homeworks.app;

public class Shells extends Equipment{
    public Shells(){
        super();
    }

    @Override
    public void putOnEquipment() {

    }

    public Shells(double weight, double cost){
        super("Shell", weight, cost);
    }
}
