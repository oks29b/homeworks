package com.homeworks.app.homework1.moto;


/**
 * This class realizes the main logic of the program, provides methods to
 * equip motorcyclist.
 * @author Oksana Borisenko
 */

public class Motorcyclist{
    private String name; //motorcyclist's name

    private MotorcyclistService motorcyclistService;

    /**
     * Default constructor.
     */

    public Motorcyclist() {
        name = "Maks";
    }

    /**
     * Constructor with parameter - name.
     */

    public Motorcyclist (String name) {
        this.name = name;
    }

    /**
     * Constructor with all parameter.
     */

    public Motorcyclist(String name, MotorcyclistService motorcyclistService) {
        this.name = name;
        this.motorcyclistService = motorcyclistService;
    }

    /**
     * Created getters and setters.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MotorcyclistService getMotorcyclistService (){
        return motorcyclistService;
    }

    public void setMotorcyclistService(MotorcyclistService motorcyclistService) {
        this.motorcyclistService = motorcyclistService;
    }

//    /**
//     * Shows all the available equipment for user.
//     */
//    public MotorcyclistService putOnSelectedElementsEquipment(){
//        motorcyclistService = new MotorcyclistService();
//        Scanner sc = new Scanner(System.in);
//        int choice = -1;
//
//        System.out.println("What do you want to wear?");
//
//        while(choice != 0){
//            System.out.println("\nChoose one of the equipment:");
//            System.out.println("1. Ellow pads");
//            System.out.println("2. Helmet");
//            System.out.println("3. Knee pads");
//            System.out.println("4. Motorcyclist boots");
//            System.out.println("5. MotoGloves");
//            System.out.println("6. MotoJacket");
//            System.out.println("7. Ellow pads");
//            System.out.println("8. Ellow pads");
//            System.out.println("0. Exit");
//
//            try {
//                choice = sc.nextInt();
//            }
//            catch (InputMismatchException e) {
//                System.out.println("Wrong option!");
//                sc.next();
//                choice = -1;
//            }
//
//            switch (choice){
//                case 1:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new EllowPads(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 2:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new Helmet(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 3:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new KneePads(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 4:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new MotoBoots(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 5:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new MotoGloves(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 6:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new MotoJacket(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 7:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new MotoPants(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 8:
//                    System.out.println("Enter weight and cost equipment");
//                    motorcyclistService.addElementOfEquipment(new Shells(sc.nextDouble(), sc.nextDouble()));
//                    break;
//                case 0:
////                    sc.close();
//                    break;
//                default:
//                    System.out.println("Try again");
//                    break;
//            }
//        }
//        return motorcyclistService;
//    }

//    /**
//     * Shows all the available options for user.
//     */

//    public void showOptions() {
//        Scanner sc = new Scanner(System.in);
//        System.gc();
//        int choice = -1;
//
//        System.out.println("Hello! My name is " + name + ".");
//        System.out.println("What do you want to do?");
//
//        while (choice != 0) {
//            System.out.println("\nChoose one of the options:");
//            System.out.println("1. See what kind of equipment you are wearing.");
//            System.out.println("2. Equip a motorcyclist. ");
//            System.out.println("3. Calculate the cost of wearing");
//            System.out.println("4. Sort ammunition based on weight.");
//            System.out.println("5. Find items of ammunition corresponding to a given range of price parameters.");
//            System.out.println("0. Exit");
//
//            try {
//                choice = sc.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Wrong option!");
//                sc.next();
//                choice = -1;
//            }
//
//            switch (choice) {
//                case 1:
//                    try {
//                        motorcyclistService.showEquipmentWearing();
//                    }catch (NullPointerException e){
//                        System.out.println("First put on a motorcyclist");
//                    }
//                    break;
//                case 2:
////                    putOnSelectedElementsEquipment();
//                    break;
//                case 3:
//                    try {
//                        System.out.println("Total cost is " + motorcyclistService.countCost());
//                    }catch (NullPointerException e){
//                        System.out.println("First put on a motorcyclist");
//                    }
//                    break;
//                case 4:
//                    try {
//                        motorcyclistService.sortElementsEquipmentByWeight();
//                    }catch (NullPointerException e){
//                        System.out.println("First put on a motorcyclist");
//                    }
//                    break;
//                case 5:
//                    try {
//                        motorcyclistService.findEquipByPriceRange();
//                    }catch (NullPointerException e){
//                        System.out.println("First put on a motorcyclist");
//                    }
//                    break;
//                case 0:
//                    sc.close();
//                    break;
//                default:
//                    System.out.println("Try again");
//                    break;
//            }
//        }
//    }

    /**
     * Output to the console.
     */

    @Override
    public String toString() {
        return "Motorcyclist name is " + name +".";
    }
}
