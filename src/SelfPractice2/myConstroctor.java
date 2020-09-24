package SelfPractice2;

public class myConstroctor {
    int age;
    String name;
    String country;
    public  myConstroctor(){
        System.out.println("This is me so what ");
    }
    public myConstroctor(int myAge, String myName, String myCountry){
        this.age=myAge;
        this.name=myName;
        this.country=myCountry;
        System.out.println("My name is "+ myName +"."+"My age is "+ myAge + " I live in "+myCountry);
    }

    public static void main(String[] args) {
        myConstroctor m1= new myConstroctor();
        myConstroctor m2= new myConstroctor(24,"ram","USA");
    }
}

