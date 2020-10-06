package oopnewbyme.abstraction1;
//Creating interface (2)
public interface Car1 {
    //Guideline for future
    //Interface is always 100% abstract
    //variable creation (3)
    String brand="Mercedes";
    int carQuantity=200;
    String seat= "2";
    String headLight="4";
    boolean gasTank=true;
    //Method: only able to declare without method body (No {}) abstract method
    //creating method at bellow (4)
   public void startCar();
    public void stopCar();
    public void carWheel();
    public void carEngine();
    public void carBreak();
    public void steering();
    public void acceleration();
    //we can declare the method body when we declare it is static(This is optional)
    //creating method with body for try (5)(next step creating an abstract class named ModernCar1)
    public static int carDoor(int doorNumber){
        int totalDoor = 1*doorNumber;
        return totalDoor;
    }











































































}
