package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    @Override
    public String startEngine(){
        runEngine(this);
        return getName() + " car starting...";
    }

    @Override
    public String drive(){
        return " run from GasPowered car";
    }
}
