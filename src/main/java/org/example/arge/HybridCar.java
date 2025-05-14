package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre ;
    private int batterySize ;
    private int cylinders ;

    public HybridCar(String name, String description,int batterySize,int cylinders,double avgKmPerLitre){
        super(name, description);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public static HybridCar createHybridCar(String test, String test1, int i, int i1, int i2) {
        return null;
    }


    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " (Hybrid) is starting in electric mode...");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " (Hybrid) is switching between electric and gas...");
        runEngine();
    }
}
