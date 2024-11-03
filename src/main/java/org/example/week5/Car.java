package org.example.week5;

public class Car extends Vehicle implements Repairable{
    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Servicing car: " + getModelName() + ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 150000;
    }

    @Override
    public String repair() {
        return "Engine tuned and oil changed for " + getModelName();
    }
    public void drive(int miles){
        setMileage(this.getMileage() + miles);
        if (this.getHealth()<30){
            setMileage(this.getMileage()+10000);
        }
    }

}
