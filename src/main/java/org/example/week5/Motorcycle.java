package org.example.week5;

public class Motorcycle extends Vehicle {
    public Motorcycle(String modelName) {
        super(modelName);
    }
    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Servicing motorcycle: " + getModelName() + ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 50000;
    }
    public void race(int raceMiles) {
        this.setMileage(this.getMileage() + raceMiles);
        if(this.getHealth()<40){
            this.setMileage(this.getMileage()+5000);
        }
    }
}
