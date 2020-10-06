package oopnewbyme.abstraction1;

import oop.abstraction.GeneralMotor;
import oop.abstraction.Tesla;

//test class Test1 is created(14)
public class Test1 {
    //creating main method in first time here(15)
    public static void main(String[] args) {

        //creating an obj from GeneralMethod1 to get the all methods from there 916)
        GeneralMotor1 gm1=new GeneralMotor1();
        gm1.startCar();
        gm1.acceleration();
        gm1.carEngine();
        gm1.steering();
        gm1.stopCar();

        //calling from Car interface because car door is in Car interface class by giving variable value 4(16)
        Car1.carDoor(4);
        // going to next step (which is going to be 17) in GeneralMotor1 class and creating our own method


        // calling return and non return type of methods (created in GeneralMotor1) (step:20)
        gm1.willBeAvailable(true);
        GeneralMotor.carInfo();
        //next step to use methods of abstract class "ModernCar1" by going into GeneralMotor1 (going to be21 step)

        //calling other methods from GeneralMotor1 (step22)
        gm1.navigation();
        gm1.cameras();
        gm1.selfDriven();
        System.out.println("************************************************");

        //Next step (which is going to 23) creating new interface named AutoPilot1

        // creating object for tesla1 class step 31
        Tesla1 tilak=new Tesla1();
        tilak.startCar();
        tilak.largeDisplay();
        tilak.boostEngine();
        tilak.teslaCarInfo();

        System.out.println("*******************************");
        //creating object again (step32)
        //syntax // classname objectName= new constructorOfClass();
        Tesla1 souhila=new Tesla1();


        // we can create this way because Tesla1 class has Car1 interface (33)
        Car1 rois = new Tesla1();
        //we can only call methods from Car1 interface not all methods in Tesla1 class
        rois.startCar();

        AutoPilot1 nahida=new Tesla1();
        nahida.autoPilot();
        nahida.largeDisplay();

        ModernCar1 ala=new GeneralMotor1();
        //ala.startCar(); can not call
        ala.emergencyBreak();
        ala.dualClimateControl();

        //alternative approach by using method casting (34)
        //just putt+ing cursor and right click
        ((GeneralMotor1) ala).startCar();































































































    }

}
