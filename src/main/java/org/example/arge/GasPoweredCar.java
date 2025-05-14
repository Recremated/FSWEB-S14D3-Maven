package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description,double avgKmPerLitre,int cylinders){
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
    public void startEngine() {
        System.out.println(getName() + " (Gas) is roaring to life with " + cylinders + " cylinders!");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " (Gas) is driving at " + avgKmPerLitre + " km/l.");
        super.runEngine();
    }

}
