package oopnewbyme.polymorphism1.methodOverriding1;
 //creating bmw1 class and extending modernCar1 -step-2
public class BMW1 extends ModernCar1 {
     //child class is BMW1 is child class and extended ModernCar1 is parent class
     @Override
     public void camera360() {
         System.out.println("BMW1 has camera ");
         int num1 = 30;
         int num2 = 40;
         int salary = num1 * num2;
         System.out.println("your salary is  $" + salary);
     }
     //method overloaded because moderncar1 class has same method but here added one more parameter
         public void doMultiply(int num1, int num2, int num3){
             double multiplyValue=num1*num2*num3;
             System.out.println("Multiply value is "+multiplyValue);
         }
         @Override //overriding the moderncar1 method
     public void doMultiply(int num1, int num2){
         double multiplyValue=num1*num2;
         System.out.println("Multiply value is "+multiplyValue);
     }
     @Override//again overriding from the moderncar1 method
     public void doDivision(int num1, int num2){
         double divisionValue=num1/num2;
         System.out.println("Division value is "+divisionValue);
     }
     }


