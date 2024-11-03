package org.example.week5;

public class Truck extends Vehicle implements Repairable{
    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine overhauled and tires replaced for " + getModelName();
    }

    @Override
    public String service() {
        return "Servicing truck: " + getModelName() + ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 300000;
    }

    public void haul(int loadWeight) {
        if (loadWeight >5000) {
            this.setHealth(this.getHealth()-5);
        }
        if(this.needsMaintenance()) {
            this.setMileage(this.getMileage()+20000);
        }
    }
}
