import java.util.Scanner;

public class Practice4 {
   static String movieName;
  static  int ticketNum;
  static  double ticketPrice;
   static double totalPrice;
   static double netPay;


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
    public static void doNetPay(){
        if(totalPrice<=100){
            netPay=totalPrice;
        }
        else if (totalPrice>100 && totalPrice<=500){
             netPay=totalPrice*.90; // Giving 10% discount
        }
        else if (totalPrice<500 && totalPrice<=1000){
            netPay=totalPrice*.80; // Giving 20% discount
        }
        else if (totalPrice<1000 && totalPrice<=5000){
            netPay=totalPrice*.75; // Giving 25% discount
        }
        else if (totalPrice<5000){
            netPay=totalPrice*.70; // Giving 30% discount
        }

    }

    public static void outPut(){
        System.out.println("********Welcome to Cinema********");
        System.out.println("Your today's movie is        : " + movieName);
        System.out.println("Your quantity of ticket is   : "  +ticketNum);
        System.out.println("Price of per ticket is       : $" +ticketPrice);
        System.out.println("The total price of ticket is : $" +totalPrice);
        System.out.println("The net price of ticket is   : $" +netPay);
        System.out.println("   ****** Enjoy the movie********");

    }

    public static void main(String[]args){
//        Practice3 obj=new Practice3();
//        obj.doInput();
//        obj.doProses();
//        obj.outPut();
        doInput();
        doProses();
        doNetPay();
        outPut();
    }
}

