package mypractice;

import java.util.Scanner;

public class Tilakgithub {
    static int choice;
    static String destination;
    static double price;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your Selection");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                destination = "America";
                price = 10000;
                break;
            case 2:
                destination = "japan";
                price = 15000;

                break;
            case 4:
                destination = "Switzerland";
                price = 20000;
                break;
            default:
                System.out.println("Your selection is wrong");
                input.close();
        }
        System.out.println("Your Selection is " + destination);
        System.out.println("Your package price is " + price);
    }
}
