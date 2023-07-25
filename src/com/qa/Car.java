package com.qa;

public class Car {
    private String make;
    private String model;
    private int yearofManufacture;
    private int currentSpeed;

    public Car(String make, String model, int yearofManufacture){
        this.make = make;
        this.model = model;
        this.yearofManufacture = yearofManufacture;
        this.currentSpeed = 0;

    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearofManufacture() {
        return yearofManufacture;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearofManufacture(int yearofManufacture) {
        this.yearofManufacture = yearofManufacture;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate(int speedIncrease){
        currentSpeed += speedIncrease;
    }

    public void brake(int speedDecrease){
        if(currentSpeed - speedDecrease >= 0){
            currentSpeed -=speedDecrease;
        }else{
            currentSpeed = 0;
        }
    }

    @Override
    public String toString(){
        return "Car{" +
                "make="+make+
                ", model=" +model+
                ", yearOfManufacture="+ yearofManufacture+
                ", currentSpeed="+currentSpeed+"}";
    }
}
