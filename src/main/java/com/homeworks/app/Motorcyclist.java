package com.homeworks.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Motorcyclist {
    private String name; //motorcyclist's name

    private EquipMotorcyclist equipMotorcyclist;

    /**
     * Default constructor.
     */

    public Motorcyclist() {
        name = "Maks";
    }

    /**
     * Constructor with parameter - name.
     */

    public Motorcyclist(String name) {
        this.name = name;
    }

    /**
     * Constructor with all parameter.
     */

    public Motorcyclist(String name, EquipMotorcyclist equipMotorcyclist) {
        this.name = name;
        this.equipMotorcyclist = equipMotorcyclist;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipMotorcyclist getEquipMotorcyclist (){
        return equipMotorcyclist;
    }

    public void setEquipMotorcyclist(EquipMotorcyclist equipMotorcyclist) {
        this.equipMotorcyclist = equipMotorcyclist;
    }

    public EquipMotorcyclist showListEquipmentWhatYouCanWear(){
        equipMotorcyclist = new EquipMotorcyclist();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        System.out.println("Hello! My name is " + name + ".");
        System.out.println("What do you want to wear?");

        while(choice != 0){
            System.out.println("\nChoose one of the equipment:");
            System.out.println("1. Ellow pads");
            System.out.println("2. Helmet");
            System.out.println("3. Knee pads");
            System.out.println("4. Motorcyclist boots");
            System.out.println("5. Ellow pads");
            System.out.println("6. Ellow pads");
            System.out.println("7. Ellow pads");
            System.out.println("8. Ellow pads");
            System.out.println("9. Exit");

            try {
                choice = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                sc.next();
                choice = -1;
            }

            switch (choice){
                case 1:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new EllowPads(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new Helmet(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 3:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new KneePads(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new MotoBoots(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 5:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new MotoGloves(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 6:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new MotoJacket(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 7:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new MotoPants(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 8:
                    System.out.println("Enter weight and cost equipment");
                    equipMotorcyclist.addElementOfEquipment(new Shells(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 0:
                    sc.close();
                    break;
            }
        }
        System.out.println("Enter weight and cost equipment");


        return equipMotorcyclist;
    }

    @Override
    public String toString() {
        return "Motorcyclist " +
                "name is " + name + equipMotorcyclist;
    }
}
