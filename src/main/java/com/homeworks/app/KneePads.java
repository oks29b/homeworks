package com.homeworks.app;

public class KneePads extends Equipment{
    public KneePads(){
        super();
    }

    @Override
    public void putOnEquipment() {
    }

    public KneePads(double weight, double cost){
        super("Knee Pads", weight, cost);
    }

}
