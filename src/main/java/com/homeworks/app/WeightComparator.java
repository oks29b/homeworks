package com.homeworks.app;

import java.util.Comparator;

public class WeightComparator implements Comparator<Equipment> {

    @Override
    public int compare(Equipment e1, Equipment e2) {
        return (int) (e1.getWeight() - e2.getWeight());
    }
}


