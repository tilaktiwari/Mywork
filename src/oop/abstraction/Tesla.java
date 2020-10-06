package oop.abstraction;

public class Tesla implements Car, BoostEngine {
    // a class can implements multiple interface at a time. here we are adding AutoPilot interface by using "," and calling it
    public void teslaCarInfo(){
        System.out.println("Tesla car information ");
    }
    public void startCar() {
        System.out.println("Tesla car has start feature");
    }

    public void stopCar() {
        System.out.println("Tesla car has stop feature");
    }

    public void carWheel() {
        System.out.println("Tesla car has wheels");
    }

    public void carEngine() {
        System.out.println("Tesla car has start engine");
    }

    public void carBreak() {
        System.out.println("Tesla car has break");
    }

    public void steering() {
        System.out.println("Tesla car has steering");
    }

    public void acceleration() {
        System.out.println("Tesla car has acceleration feature");
    }

    public void LargeDisplay() {
        System.out.println("Tesla car has large display");

    }

    public void autoPilot() {
        System.out.println("Tesla car has auto pilot feature");

    }

    public void boostEngine() {
        System.out.println("Tesla car has boostEngine feature");;
    } 
}
