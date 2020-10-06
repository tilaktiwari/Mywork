package SelfPractice2;

import java.util.Scanner;

public class Quiz3IncreasingNum {
    int num1;
    int num2;
    int num3;
    public void  findOrderOfNum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your num");
        num1=input.nextInt();
        System.out.println("Please enter your  second num");
        num2=input.nextInt();
        System.out.println("Please enter your  third num");
        num3=input.nextInt();
        if (num1<num2 && num2<num3){
            System.out.println(" Your Number is in increasing order " );
        }
        else if (num1>num2 && num2>num3){
            System.out.println("Your number is in decreasing order");
        }
        else
            System.out.println("Neither increasing or decreasing order");
            input.close();
        }

    public static void main(String[]args){
        Quiz3IncreasingNum obj=new Quiz3IncreasingNum();
                obj.findOrderOfNum();
    }
}

