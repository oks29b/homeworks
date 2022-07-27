package com.homeworks.app;

public class Helmet extends Equipment{

    public Helmet(){
        super("Helmet", 1000, 4465);
    }

    @Override
    public void putOnEquipment() {
        System.out.println(" helmet on" );
    }

    public Helmet(double cost) {
        super("Helmet", 1000, cost);
    }
}
