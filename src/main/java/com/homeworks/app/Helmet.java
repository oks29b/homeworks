package com.homeworks.app;

public class Helmet extends UpperBodyProtection{

    public Helmet(){
        super("Helmet", 1000);
    }

    public Helmet(double cost) {
        super("Helmet", 1000, cost);
    }
}
