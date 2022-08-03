package com.homeworks.app.homework1.moto;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ReadingDataConsole {
    Scanner sc = new Scanner(System.in);

    public int choosingEquipment() {
        int choice = -1;

        System.out.println("What do you want to put on?");

            System.out.println("\nChoose one of the equipment:");
            System.out.println("1. Ellow pads");
            System.out.println("2. Helmet");
            System.out.println("3. Knee pads");
            System.out.println("4. Motorcyclist boots");
            System.out.println("5. MotoGloves");
            System.out.println("6. MotoJacket");
            System.out.println("7. MotoPants");
            System.out.println("8. Shells");
            System.out.println("0. Exit");

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                sc.next();
                choice = -1;
            }
        return choice;
    }

    public int choosingOptions(){
        int choice = -1;

        System.out.println("Hello! What do you want to do?");

            System.out.println("\nChoose one of the options:");
            System.out.println("1. See what kind of equipment you are wearing.");
            System.out.println("2. Equip a motorcyclist. ");
            System.out.println("3. Calculate the cost of wearing");
            System.out.println("4. Sort ammunition based on weight.");
            System.out.println("5. Find items of ammunition corresponding to a given range of price parameters.");
            System.out.println("0. Exit");

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                sc.next();
                choice = -1;
            }
        return choice;
    }
}
