package com.homeworks.app.homework1.moto;

import com.homeworks.app.homework1.equipment.*;

import java.util.*;

/**
 * This class provides methods to put on, to sort, to find, to count cost, to show equipment.
 * @author Oksana Borisenko
 */

public class MotorcyclistService extends ReadingDataConsole{

    private List<Equipment> elementsOfEquipments;

    public List<Equipment> getElementsOfEquipments() {
        return elementsOfEquipments;
    }

    public void setElementsOfEquipments(List<Equipment> elementsOfEquipments) {
        this.elementsOfEquipments = elementsOfEquipments;
    }



    /**
     * Default constructor
     */
    public MotorcyclistService() {
    }

    /**
     * Shows all the available equipment for user.
     * @brief Put equip on
     */

    public List<Equipment> putOnSelectedElements(){
        elementsOfEquipments = new ArrayList<Equipment>();
        int choice = choosingEquipment();
        while ( choice != 0){
            switch (choice){
                case 1:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new EllowPads(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 2:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new Helmet(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 3:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new KneePads(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 4:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new MotoBoots(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 5:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new MotoGloves(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 6:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new MotoJacket(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 7:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new MotoPants(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 8:
                    System.out.println("Enter weight and cost equipment");
                    elementsOfEquipments.add(new Shells(sc.nextDouble(), sc.nextDouble()));
                    choice = -1;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Try again\n");
                    choice = choosingEquipment();
                    break;
            }
        }
        return elementsOfEquipments;
    }

    /** Show equipment wearing */
    public void showEquipmentWearing(){

        System.out.println("You are wearing: ");
        for (Equipment e :elementsOfEquipments) {
            System.out.println(e.toString());
        }
        System.out.println("Total cost: " + countCost() + "rub");
    }

    /**
     * @return Total equipment cost
     */
    public double countCost(){
        double cost = 0;
        for (Equipment e:elementsOfEquipments) {
            cost += e.getCost();
        }
        return cost;
    }

    /** Sort equipment by weight */
    public void sortElementsEquipmentByWeight(){
        Collections.sort(elementsOfEquipments, new Comparator<Equipment>() {
            @Override
            public int compare(Equipment e1, Equipment e2) {
                return (int) (e1.getWeight() - e2.getWeight());
            }
        });
        System.out.println(elementsOfEquipments.toString());
    }


    /**
     * @brief Find equipment according to the given price
     * by lower - upper range
     * @return List of found equipment.
     */

    public void findEquipByPriceRange(){
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
            if(cost >= lowerCost && cost <= upperCost) {
                System.out.println(e.getName() + " cost " + e.getCost() + "rub");
            }
        }
    }

    /**
     * Shows all the available options for user.
     */
    public void showOptions(){
    int choice = choosingOptions();
    while (choice != 0){
        switch (choice) {
            case 1:
                if(elementsOfEquipments.isEmpty()){
                    System.out.println("You haven't added any elements yet=(\n");
                    choice = -1;
                    break;
                }else {
                    showEquipmentWearing();
                }
                choice = choosingOptions();
                break;
            case 2:
                System.out.println(putOnSelectedElements() + "\n");
                choice = choosingOptions();
                break;
            case 3:
                System.out.println("Total cost is " + countCost() + "\n");
                choice = choosingOptions();
                break;
            case 4:
                if(elementsOfEquipments.isEmpty()){
                    System.out.println("There is no equipment on the motorcyclist\n");
                    choice = -1;
                    break;
                }else {
                    sortElementsEquipmentByWeight();
                }
                choice = choosingOptions();
                break;
            case 5:
                if(elementsOfEquipments.isEmpty()){
                    System.out.println("There is no equipment on the motorcyclist\n");
                    choice = -1;
                    break;
                }else {
                    findEquipByPriceRange();
                }
                choice = choosingOptions();
                break;
            case 0:
                sc.close();
                break;
            default:
                System.out.println("Try again\n");
                choice = choosingOptions();
                break;
            }
        }
    }


    /**
     * Output to the console.
     */
    @Override
    public String toString() {
        return "\nelement of equipments = " + "\n" + elementsOfEquipments + "\n";
    }
}
