package oopnewbyme.abstraction1;
//if we add abstract before class it will be abstract class
// creating abstract class (6)
public abstract class ModernCar1 {
    //this is abstract class because we put abstract before class

    //declaring variable(7)
    String modernCarBrand="Tesla";
    double modernCarSuggestedPrice=65000;

    //creating method (8)
    public abstract void navigation();
    public abstract void autoLaneControl();
    public abstract void display();
    public abstract void cameras();
    public abstract void selfDriven();
    public abstract void emergencyBreak();
    public abstract void autoGear();

    //This is abstract class because it has no method body{} and after public it has the word abstract
    // static and non static methods are allowed here
    //creating method with body (9)(next 10th step create a class named GeneralMotor)
    public void dualClimateControl(){
        System.out.println("Modern car has dual Climate Control Feature");
    }

}
