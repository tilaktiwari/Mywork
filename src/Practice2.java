import java.sql.SQLOutput;

public class Practice2 {
    String name;
    int age;
    String state;
    String country;

    public Practice2(){
        System.out.println("This is my time, who cares.");
    }
    public   Practice2(String myName, int myAge, String myState, String myCountry){
    this.name=myName;
    this.age=myAge;
    this.state=myState;
    this.country=myCountry;

        System.out.println(" My name is " +myName +". " + " I am " +myAge + " years old." + " I live in "+ myState + " , "+myCountry );
    }
    public  static void main(String[]args){

        Practice2 obj=new Practice2();
        Practice2 me= new Practice2("Tialk Tiwari",40, "Virginia","America");



    }

}
