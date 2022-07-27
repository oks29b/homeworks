package com.homeworks.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EquipMotorsyclist {
    private List<Equipment> elementsOfEquipments = new ArrayList<Equipment>();

    public EquipMotorsyclist() {
    }

    public List<Equipment> getElementsOfEquipments() {
        return elementsOfEquipments;
    }

    public boolean addElementOfEquipment(Equipment equipment){
        return elementsOfEquipments.add(equipment);
    }

    public void showEquipmentWearing(){
        if(elementsOfEquipments.isEmpty()){
            System.out.println("You haven't added any elements yet=(");
            return;
        }

        System.out.println("You are wearing: ");
        for (Equipment e :elementsOfEquipments) {
            System.out.println(e.toString());
        }
        System.out.println("Total cost: " + countCost() + "rub");
    }

    public double countCost(){
        double cost = 0;
        for (Equipment e:elementsOfEquipments) {
            cost += e.getCost();
        }
        return cost;
    }

    public void sortElementsEquipmentByWeight(){
        Collections.sort(elementsOfEquipments, new WeightComparator());
    }

}
