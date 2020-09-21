import java.util.Scanner;

public class PracticeSwitch {
//   static  int foodVarites;
    static String foodName=null;
    public static void main(String[]args){
//        int foodVarites=5;(without sacanner need to change number of of food varities}


        Scanner menuNum = new Scanner(System.in);
        System.out.println("Please enter the menu number:");
        int foodVarites=menuNum.nextInt();


    switch(foodVarites){
        case 1:
        foodName = "Chickenburger";
        break;
        case 2:
        foodName = "mutton";
        break;
        case 3:
        foodName = "Rice";
        break;
        case 4:
        foodName = "biryani";
        break;
        case 5:
        foodName = "veggiRice";
        break;
        default:
            System.out.println("your input is wrong please try again");
            menuNum.close();
    }

        System.out.println("Selected food is "+ foodName+".");
        System.out.println("Enjoy the "+foodName +".");
        }
}
