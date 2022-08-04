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

    /**
     * Output to the console.
     */

    @Override
    public String toString() {
        return "Motorcyclist name is " + name +".";
    }
}
