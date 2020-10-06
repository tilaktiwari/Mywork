package oopnewbyme.polymorphism1.methodOverriding1;
// creating new test class to run method
public class Test {
    public static void main(String[] args) {
        BMW1 obj=new BMW1();
        obj.camera360();// getting camera360 method because this method is in modernCar1 which is extended by BMW1

        obj.doDivision(50,25);
    }
}
