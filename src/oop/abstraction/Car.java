package oop.abstraction;

public interface Car {
    //Guideline for future
    //Interface is always 100% abstract
    //variable
    String brand="Mercedes";
    int carQuantity=200;
    String seat= "2";
    String headLight="4";
    boolean gasTank=true;
    //Method: only able to declare without method body (No {}) abstract method
    public void startCar();
    public void stopCar();
    public void carWheel();
    public void carEngine();
    public void carBreak();
    public void steering();
    public void acceleration();

    //we can declare the method body when we declare it is static
    public static int carDoor(int doorNumber){
        int totalDoor=1*doorNumber;
        return totalDoor;

    }

            }
