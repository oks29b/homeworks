package com.homeworks.app;

import java.util.*;

public class EquipMotorcyclist {
    private List<Equipment> elementsOfEquipments = new ArrayList<>();

    public EquipMotorcyclist() {
    }

    public List<?> getElementsOfEquipmentsOfPriceParametrs() {
        return elementsOfEquipments;
    }

    public boolean addElementOfEquipment(Equipment equipment){
        equipment.setStateEquipment(true);
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
        System.out.println(elementsOfEquipments.toString());
    }

    public void showEquipmentsByCost(){
        Scanner sc = new Scanner(System.in);
        double lowerCost, upperCost;
        double cost;
        System.out.println("Enter the lower limit:");
        try {
            lowerCost = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Wrong input..");
            sc.next();
            return;
        }

        System.out.println("Enter the upper limit:");
        try {
            upperCost = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Wrong input..");
            sc.next();
            return;
        }
        System.out.println("The costs of equipments ranges from " + lowerCost + " to " + upperCost + ": ");
        for(Equipment e: elementsOfEquipments){
            cost = e.getCost();
            if(cost >= lowerCost && cost <= upperCost){
                System.out.println(e.getName() + " cost " + e.getCost() + "rub");
            }
        }
    }

    @Override
    public String toString() {
        return "\nelement of equipment = " + "\n" + elementsOfEquipments + "\n";
    }
}
