package com.homeworks.app;

public class MotoJacket extends Equipment{
    public MotoJacket(){
        super();
    }

    @Override
    public void putOnEquipment() {

    }

    public MotoJacket(double weight, double cost){
        super("MotoJacket", weight, cost);
    }

}
