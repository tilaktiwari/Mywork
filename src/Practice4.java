import java.util.Scanner;

public class Practice4 {
   static String movieName;
  static  int ticketNum;
  static  double ticketPrice;
   static double totalPrice;


    public static void doInput(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the movie name");
        movieName=input.nextLine();
        boolean qutyOk=false;
        do {
            try {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter the quantity of ticket between 1 to 50");
                ticketNum =scanner1.nextInt();
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
        while (qutyOk==false);

        boolean tPriceOk=false;
        do{
            try {
                Scanner scanner2= new Scanner(System.in);
                System.out.println("Please enter the price of ticket between $50 to $200");
                ticketPrice = scanner2.nextDouble();
               scanner2.close();
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
        while (tPriceOk==false);
    }


    public static void doProses(){
        totalPrice=ticketPrice*ticketNum;
    }

    public static void outPut(){
        System.out.println("********Welcome to Cinema********");
        System.out.println("Your today's movie is        : " + movieName);
        System.out.println("Price of per ticket is       : $" +ticketPrice);
        System.out.println("The total price of ticket is : $" +ticketPrice);
        System.out.println("   ****** Enjoy the movie********");

    }

    public static void main(String[]args){
//        Practice3 obj=new Practice3();
//        obj.doInput();
//        obj.doProses();
//        obj.outPut();
        doInput();
        doProses();
        outPut();
    }
}

