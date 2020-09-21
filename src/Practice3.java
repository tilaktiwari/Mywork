import java.util.Scanner;

public class Practice3 {
    String movieName;
    int ticketNum;
    double ticketPrice;
    double totalPrice;
//    double discPrice;

    public void doInput(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the movie name");
        movieName=input.nextLine();
        boolean qutyOk=false;
    do {

        try {
            System.out.println("Please enter the quantity of ticket");
            ticketNum = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please put the right number of ticket");
            continue;
        }
        if (ticketNum > 0 && ticketNum < 50) {
            qutyOk = true;
        } else {
            System.out.println("Please put the correct number of ticket");
        }
    }
    while (qutyOk == false);

    boolean tPriceOk=false;
    do{
        try {
            System.out.println("Please enter the price of ticket");
            ticketPrice = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Please enter the right price");
            continue;
        }
            if (ticketPrice>=50 && ticketPrice<=200 ){
                tPriceOk=true;
            }else {
                System.out.println("Please input the right price");
            }
        }
        while (tPriceOk == false);
    }



    public void doProses(){
    totalPrice=ticketPrice*ticketNum;
    }

    public void outPut(){
        System.out.println("********Welcome to Cinema********");
        System.out.println("Your today's movie is        : " + movieName);
        System.out.println("Price of per ticket is       : $" +ticketPrice);
        System.out.println("The total price of ticket is : $" +ticketPrice);
        System.out.println("   ****** Enjoy the movie********");

    }

     public static void main(String[]args){
        Practice3 obj=new Practice3();
        obj.doInput();
        obj.doProses();
        obj.outPut();

     }
    }

