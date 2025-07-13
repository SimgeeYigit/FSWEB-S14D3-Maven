package org.example.company;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return getName() + " engine is starting";
    }

    public String accelerate() {
        return getName() + " is accelerating";
    }

    public String brake() {
        return getName() + " is braking";
    }
}
