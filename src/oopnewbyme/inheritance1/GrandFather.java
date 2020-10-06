package oopnewbyme.inheritance1;

public class GrandFather {
    //creating variable
    public String favouriteDish="DalBhat";
    public String favouriteSport="Football";
    public String ssn="2134234";
    //creating private variable for getter and setter
    private String accountNumber;
    // creating a constructor default and parameterized
    public GrandFather(){

    }
    public GrandFather(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("My grandfather's favourite dis is "+favouriteDish);
    }
    public GrandFather(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("My grandfather's favourite dis is "+favouriteDish  + " "+ "Sports is "+favouriteSport);
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // creating methods
    public void height(){
        System.out.println("Grandfather height is 6 feet");
    }

    public void weight(){
        System.out.println("Grandfather weight is 65 kg");
    }
    public void sing(){
        System.out.println("Grandfather sings songs");
    }
    public void playGame(){
        System.out.println("Grandfather plays football ");
    }
}
// going to father class for next step