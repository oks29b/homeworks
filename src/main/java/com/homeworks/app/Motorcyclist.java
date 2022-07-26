package com.homeworks.app;

public class Motorcyclist {
    private String name; //motorcyclist's name
    private EquipMotorcyclst equipMotorcyclst; //equipment that he puts on

    /**
     * Default constructor.
     */

    public Motorcyclist() {
        name = "Maks";
        equipMotorcyclst = new EquipMotorcyclst();
    }

    /**
     * Constructor with parameter - name.
     */

    public Motorcyclist(String name) {
        this.name = name;
        equipMotorcyclst = new EquipMotorcyclst();
    }

    /**
     * Constructor with all parameter.
     */

    public Motorcyclist(String name, EquipMotorcyclst equipMotorcyclst) {
        this.name = name;
        this.equipMotorcyclst = equipMotorcyclst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipMotorcyclst getEquipMotorcyclst() {
        return equipMotorcyclst;
    }

    public void setEquipMotorcyclst(EquipMotorcyclst equipMotorcyclst) {
        this.equipMotorcyclst = equipMotorcyclst;
    }
}
