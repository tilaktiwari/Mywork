package SelfPractice2;

import java.util.Scanner;

public class Switch2 {
    static String movieName;
    int movieChoice;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your choice");
        int movieChoice=input.nextInt();
        switch (movieChoice){
            case 1:
                movieName= "A";
            break;
            case 2:
                movieName="B";
                break;
            case 3:
                movieName= "c";
                break;
            default:
                System.out.println("wrong choice");
                input.close();
        }

        System.out.println("Your movie is " +movieName);
        System.out.println("Enjoy the movie");
    }


}
