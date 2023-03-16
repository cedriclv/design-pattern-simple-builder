package com.designPattern.Builder.controller.Models;

public class CarBuilder implements Builder {

    private int seatNumber;
    private int wheelsNumber;
    private int hoursWorked;

    @Override
    public CarBuilder setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
        return this;
    }
    @Override
    public CarBuilder setWheelsNumber(int wheelsNumber){
        this.wheelsNumber = wheelsNumber;
        return this;
    }
    public CarBuilder setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
        return this;
    }

    public Car build(){
        return new Car(this.seatNumber, this.wheelsNumber, this.hoursWorked);
    }
}
