package oopnewbyme.abstraction1;
//creating an class named Tesla1 (step 24)
// tesla will implement car1 interface, autopilot1 by using key words " implements" adding
// interfaces by using "," (Step 25)
// adding BoostEngine interface in here (step28)
// next step going back to BoostEngine interface to extend AutoPilot
// deleting Autopilot1 and
//deleting AutoPiolet because BoostEngine1 extended AutoPilot1 so all method already there in boostEngine (Step30)
// For next step go to Test1 class

public class Tesla1 implements Car1,BoostEngine1{
    public void teslaCarInfo(){
        System.out.println();
    }
    // A class can implements multiple interfaces at a time
    // we got all methods from AutoPilot1 and Car1 interface
    //next step 26 is create an interface BoostEngine1
    public void startCar() {
        System.out.println("Tesla car has start feature");
    }

    public void stopCar() {
        System.out.println("Tesla car has stop feature");
    }

    public void carWheel() {
        System.out.println("Tesla car has wheels ");
    }

    public void carEngine() {
        System.out.println("Tesla car has car engine");
    }

    public void carBreak() {
        System.out.println("Tesla car has breaks");
    }

    public void steering() {
        System.out.println("Tesla car has steering");
    }

    public void acceleration() {
        System.out.println("Tesla car has acceleration feature");
    }

    public void boostEngine() {
        System.out.println("Tesla car has boost engine feature");
    }

    public void largeDisplay() {
        System.out.println("Tesla car has large display ");
    }

    public void autoPilot() {
        System.out.println("Tesla car has auto pilot feature");
    }
}
