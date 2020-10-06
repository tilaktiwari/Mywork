package oopnewbyme.inheritance1;
// extending Grandfather class in Father class (step2) going back to test class for next step
public class Father extends GrandFather {
    //creating variable
    public String favouriteDish="RiceMeat";
    public String favouriteSport="Cricket";
    public String ssn="2134234";
    //creating private variable for getter and setter
    private String FatherAccountNumber;
    // creating a constructor default and parameterized
    public Father(){

    }
    public Father(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("My father's favourite dis is "+favouriteDish);
    }
    public Father(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("My father's favourite dis is "+favouriteDish  + " "+ "Sports is "+favouriteSport);
    }

    public String getFatherAccountNumber() {
        return FatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        FatherAccountNumber = fatherAccountNumber;
    }

    // creating methods
    public void swim(){
        System.out.println("My father can swim");
    }

    public void beard(){
        System.out.println(" My father has beard");
    }
    public void write(){
        System.out.println("My father writes stories");
    }
    public void drive(){
        System.out.println("my father can drive ");
    }
}
