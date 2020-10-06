package oop.abstraction;

public class GeneralMotor extends ModernCar implements Car{
    // it is concrete class because it is implemented interface class
    //year2022
    //implemented methods we can modify in our own way
    // we can create return/nonReturn method in concrete class  because we can modify our own class

    String carModel="M22"; //creating our own variables
    String modelYear="2022";
    static double price=70000;

    //creating our own methods with non return type
    public static void carInfo(){
        System.out.println("This is GeneralMotor car information");
    }
    //creating our own methods with return type
    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }


    public void startCar() {
        System.out.println("GeneralMotor car has start feature");

    }


    public void stopCar() {
        System.out.println("GeneralMotor car has start feature");
    }


    public void carWheel() {
        System.out.println("GeneralMotor car has wheel");
    }


    public void carEngine() {
        System.out.println("GeneralMotor car has engine");
    }


    public void carBreak() {

        System.out.println("GeneralMotor car has break");
    }


    public void steering() {

        System.out.println("GeneralMotor car has steering");
    }


    public void acceleration() {
        System.out.println("GeneralMotor car has acceleration feature");
    }

    public void navigation() {
        System.out.println("GeneralMotor car has navigation feature");
    }

    public void autoLaneControl() {
        System.out.println("GeneralMotor car has autoLaneControl feature");
    }

    public void display() {
        System.out.println("GeneralMotor car has display feature");
    }

    public void cameras() {
        System.out.println("GeneralMotor car has cameras feature");
    }

    public void selfDriven() {
        System.out.println("GeneralMotor car has selfDriven feature");
    }

    public void emergencyBreak() {
        System.out.println("GeneralMotor car has emergency feature");
    }

    public void autoGear() {
        System.out.println("GeneralMotor car auto gear feature");
    }
}
