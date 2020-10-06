package oopnewbyme.inheritance1;
//extending Father class in Son class step-4
public class Son extends Father {
    //creating variable
    public String favouriteDish="Pizza";
    public String favouriteSport="Baseball";
    public String ssn="21342233";
    //creating private variable for getter and setter
    private String sonAccountNumber;
    // creating a constructor default and parameterized
    public Son(){

    }
    public Son(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("My father's favourite dis is "+favouriteDish);
    }
    public Son(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("My father's favourite dis is "+favouriteDish  + " "+ "Sports is "+favouriteSport);
    }

    public String getSonAccountNumberAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        sonAccountNumber = sonAccountNumber;
    }

    // creating methods
    public void student(){
        System.out.println("Son  is a collage student");
    }

    public void player(){
        System.out.println("Son is a famous player");
    }
    public void hairStyle(){
        System.out.println("Son has good hair style");
    }
    public void wearGlasses(){
        System.out.println("Son uses glasses");
    }
}
