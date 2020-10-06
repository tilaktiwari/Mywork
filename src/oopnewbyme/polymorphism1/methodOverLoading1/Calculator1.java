package oopnewbyme.polymorphism1.methodOverLoading1;

public class Calculator1 {

    //method overloading
    // creating one method first -step-1
    public void doSummation(int num1, int num2){
    int total=num1+num2;
        System.out.println("the total is "+total);
    }
    // creating another method with same name but adding more signature(parameter)Step-2
    // This is called method overloading
    public void doSummation(int num1, int num2,int num3){
        int total=num1+num2+num3;
        System.out.println("the total is "+total);
    }
    //adding one more method with same method name but adding extra parameter
    public void doSummation(int num1, int num2,int num3,int num4){
        int total=num1+num2+num3+num4;
        System.out.println("the total is "+total);
    }
    //adding another method which including string type of data
    public void doSummation(int num1, int num2,int num3,int num4,String price){
        int total=num1+num2+num3+num4;
        System.out.println("the total is "+total + " and price is " +price);
    }
//creating main method to call methods-step-3
    public static void main(String[] args) {
    Calculator1 obj=new Calculator1();
    obj.doSummation(20,40); // calling first one with two parameter one -step-4
    obj.doSummation(20,40,30); //calling second method
    obj.doSummation(20,40,30,10);   //calling third method
    obj.doSummation(10,20,25,35,"in dolor");
    }
}
