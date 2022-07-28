package com.homeworks.app;

public class Helmet extends Equipment{

    public Helmet(){
        super();
    }

    @Override
    public void putOnEquipment() {
        if(!isStateEquipment()){
            setStateEquipment(true);
            System.out.println("Helmet put on");
        } else {
            System.out.println("The helmet is already on!");
        }
    }

    public Helmet(double weight, double cost) {
        super("Helmet", weight, cost);
    }
}
