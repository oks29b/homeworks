package com.homeworks.app;

import java.util.ArrayList;
import java.util.List;

public abstract class Equipment {
    private String name;
    private String category;
    private double weight;
    private double cost;

    private boolean stateEquipment = false;

    public Equipment() {
    }

    public Equipment(String name) {
        this.name = name;
    }


    public Equipment(String name, double weight) {
        if (weight <0){
            throw new IllegalArgumentException("Cannot create equipment with " + weight);
        }
        this.name = name;
        this.weight = weight;
    }

    public Equipment(String name, double weight, double cost) {
        if (weight < 0){
            throw new IllegalArgumentException("Cannot create equipment with " + weight + "gram");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Cannot create equipment with " + cost + "rub");
        }
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isStateEquipment() {
        return stateEquipment;
    }

    public void setStateEquipment(boolean stateEquipment) {
        this.stateEquipment = stateEquipment;
    }

    public abstract void putOnEquipment();

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
