package oopnewbyme.abstraction1;

//Creating class generalMotor1 (10)


//implementing interface class Car1 in GeneralMotor1 by putting implements key word and name of interface class
// +Car1 (11)
// inorder to implement all method just right click on implement, select implements methods and
// unchecked "insert@Override and click ok (12)
//adding all methods from ModernCar1 abstract class in here by putting "extends" keyword
// and class name ModernCar1 after GeneralMotor1 (step:21) Then going to next step in Test1 class
public class GeneralMotor1 extends ModernCar1 implements Car1 {

    // it is concrete class because it is implemented interface class Car1
    //year2022 estimated date just for example
    //implemented methods we can modify in our own way
    // we can create return/nonReturn method in concrete class  because we can modify our own class
    //modifying our own way by just putting one line for example in each method(13) (next 14th step creating
    //test1 class )(13)

    //creating own variable (17)
    String carModel="M23";
    String modelYear="2020";
    static double price=70000;

    //creating own non return type method(18)
    public static void  carInfo(){
        System.out.println("This is General Motor car information");
    }

    //creating return type method(19)
    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }
    // Next step 20 to go to test1 class to call these both method there
    public void startCar() {
        System.out.println("GeneralMotor has start feature");
    }

    public void stopCar() {
        System.out.println("GeneralMotor has stop car feature");
    }

    public void carWheel() {
        System.out.println("GeneralMotor has wheels");
    }

    public void carEngine() {
        System.out.println("GeneralMotor has car engine");
    }

    public void carBreak() {
        System.out.println("GeneralMotor has breaks");
    }

    public void steering() {
        System.out.println("GeneralMotor has steering");
    }

    public void acceleration() {
        System.out.println("GeneralMotor has acceleration feature");
    }

    public void navigation() {

    }

    public void autoLaneControl() {

    }

    public void display() {

    }

    public void cameras() {

    }

    public void selfDriven() {

    }

    public void emergencyBreak() {

    }

    public void autoGear() {

    }
}
