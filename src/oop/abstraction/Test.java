package oop.abstraction;

public class Test {
    public static void main(String[] args) {
        GeneralMotor gm=new GeneralMotor();
        gm.startCar();
        gm.acceleration();
        gm.steering();
        gm.carEngine();
        gm.stopCar();
        Car.carDoor(4);//calling from Car interface because car door is in Car interface class
        gm.willBeAvailable(true);
        GeneralMotor.carInfo();
        System.out.println("**********************");
        Tesla runa= new Tesla();
        runa.startCar();
        runa.LargeDisplay();
        runa.boostEngine();
        runa.teslaCarInfo();

        System.out.println("****************************");

        //How to create an object
        //className objectName = new constructorOfClass
        Tesla tilak=new Tesla();

        Car rois=new Tesla();
         // rois.teslaCarInfo(); can't call like this
        // because Tesla class implemented Car interface so we are allowed
        // to call the only methods of Car interface
        rois.startCar();


        AutoPilot nahida= new Tesla();
            nahida.autoPilot();
            nahida.LargeDisplay();
            ModernCar ala=new GeneralMotor();
            //ala.willBeAvailabe(); not allowing because its belongs to GeneralMotor not ModernCan
            //ala.startCar(); also not allowing  because its belongs to Car interface method
        ala.emergencyBreak();//it is allowing that because it is abstract method of modernCar
        ala.duelClimateControl();//it is allowing that because this is method of modernCar

        //Alternative Approach:Method Casting
        ((GeneralMotor) ala).startCar();


    }
}
