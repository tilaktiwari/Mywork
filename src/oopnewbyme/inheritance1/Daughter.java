package oopnewbyme.inheritance1;

    //extending Father class -Step- 5 and going back test class
public class Daughter extends Father {
    //creating variable
    public String favouriteDish="Pasta";
    public String favouriteSport="Tennis";
    public String ssn="213422334";
    //creating private variable for getter and setter
    private String daughterAccountNumber;
    // creating a constructor default and parameterized
    public Daughter(){

    }
    public Daughter(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("Daughter's favourite dis is "+favouriteDish);
    }
    public Daughter(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("Daughter's favourite dis is "+favouriteDish  + " "+ "Sports is "+favouriteSport);
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setSonAccountNumber(String daughterAccountNumber) {
        daughterAccountNumber = daughterAccountNumber;
    }

    // creating methods
    public void doctor(){
        System.out.println("Daughter is a doctor");
    }

    public void goodCook(){
        System.out.println("Daughter cooks delicious foods");
    }
    public void honest(){
        System.out.println("Daughter is very honest");
    }
    public void intelligent(){
        System.out.println("Daughter is very intelligent");
    }
}


