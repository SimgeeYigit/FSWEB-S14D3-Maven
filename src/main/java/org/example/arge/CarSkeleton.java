package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {}

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + " engine is starting";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        if (carSkeleton instanceof ElectricCar) {
            double getAvgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize =((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric. Per charge: " + getAvgKmPerCharge + " Battery size: " + batterySize);

        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLitre() + " Battery size: " + hybridCar.getBatterySize() + " Cylinder: " + hybridCar.getCylinders());

        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.printf("The car engine is starting with gas. Per liter: " + gasPoweredCar.getAvgKmPerLitre() + " Cylinder: " + gasPoweredCar.getCylinders());

        } else {
            System.out.println("Invalid car type!");
        }
    }

}
