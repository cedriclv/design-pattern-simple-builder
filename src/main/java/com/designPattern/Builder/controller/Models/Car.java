package com.designPattern.Builder.controller.Models;


public class Car {

    private int seatNumber;
    private int wheelsNumber;
    private int hoursWorked;

    public Car (int seatNumber, int wheelsNumber, int hoursWorked){
        this.seatNumber = seatNumber;
        this.wheelsNumber = wheelsNumber;
        this.hoursWorked = hoursWorked;
    }

    public void describe(){
        System.out.println("You have " + this.seatNumber + " seats and " + this.wheelsNumber + "wheels");
    }


}
