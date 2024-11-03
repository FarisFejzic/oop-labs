package org.example.week5;

public abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;
    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }
    public Vehicle(String modelName){
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }
    public String getModelName() {
        return modelName;
    }
    public int getMileage() {
        return mileage;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public abstract String service();

    public abstract int expectedLifespan();

    public boolean needsMaintenance() {
        return health < 70;
    }
    public int calculateRemainingLifespan() {
        int expectedLifespan = expectedLifespan();
        if (health < 50) {
            expectedLifespan = (int)(expectedLifespan * (health / 100.0));
        }
        return Math.max(0, expectedLifespan - mileage);
    }
    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) {
            health -= 5;
        }
    }

    public void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println(car.repair());
            car.drive(100);
        }
        else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println(truck.repair());
            truck.haul(6000);
        }
        else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.race(50);
        }
    }

}
