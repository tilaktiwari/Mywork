import java.util.Scanner;

public class FindLargestNumber {
        int num1;
        int num2;
        int num3;
        public void  findLargestNum(){
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter your num");
            num1=input.nextInt();
            System.out.println("Please enter your  second num");
            num2=input.nextInt();
            System.out.println("Please enter your  third num");
            num3=input.nextInt();
           if (num1>num2 && num1>num3){
                System.out.println("your largest number is " +num1);
            }
            if (num2>num1 && num2>num3){
                System.out.println("your largest number is " +num2);
            }
            if (num3>num1 && num3>num2){
                System.out.println("your largest number is " +num3);
                input.close();
            }
        }
        public static void main(String[]args){
            FindLargestnum obj =new FindLargestnum();
            obj.findLargestNum();
        }
}
