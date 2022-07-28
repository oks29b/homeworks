package com.homeworks.app;

public class MotoPants extends Equipment {
    public MotoPants(){
        super();
    }

    @Override
    public void putOnEquipment() {

    }

    public MotoPants(double weight, double cost){
        super("MotoPants", weight, cost);
    }
}
