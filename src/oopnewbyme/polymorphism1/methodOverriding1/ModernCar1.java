package oopnewbyme.polymorphism1.methodOverriding1;
//creating moderncar1 as parent class -step1 then going to bmw1 class
public class ModernCar1 {
    public void camera360(){
        System.out.println("Modern car has camera 360");
    }
    public void doMultiply(int num1, int num2){
        double multiplyValue=num1*num2;
        System.out.println("Multiply value is "+multiplyValue);
    }
    public void doDivision(int num1, int num2){
        double divisionValue=num1/num2;
        System.out.println("Division value is "+divisionValue);
    }

}

