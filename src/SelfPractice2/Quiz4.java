package SelfPractice2;

import java.util.Scanner;

public class Quiz4 {
    static String word;


    public static boolean isPalindrome(String word) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        word = input.nextLine();
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) ;

            System.out.println("False");

            i++;
            j--;
        }
        return true;

    }


    public static void main(String[] args) {
        Quiz4.isPalindrome(word);

    }
}
