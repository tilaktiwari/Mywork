package oop.abstraction;

public abstract class ModernCar {
    //this is abstract class because we put abstract before class

    //declaring variable
    String modernCarBrand="Tesla";
    double modernCarSuggestedPrice=65000;

    //creating method
    public abstract void navigation();
    public abstract void autoLaneControl();
    public abstract void display();
    public abstract void cameras();
    public abstract void selfDriven();
    public abstract void emergencyBreak();
    public abstract void autoGear();

    //This is abstract class because it has no method body{} and after public it has the word abstract

    // static and non static methods are allowed here
    public void duelClimateControl(){
        System.out.println("Modern car has duel climate control feature");
    }
}
