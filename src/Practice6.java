
import java.util.Scanner;

public class Practice6 {
    static String movieName;
    int selection;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter selection number");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
            movieName = "Spiderman";
            break;
            case 2:
            movieName = "Titanic";
            break;
            case 3:
            movieName = "Mai Hun Na";
            break;
            case 4:
            movieName = "The Batman";
            break;
            case 5:
            movieName = "Ironman";
            break;
            case 7:
            movieName = "Sajan";
            break;
            default:
                System.out.println("Please input the right selection");
                input.close(); //for closing scanner
        }
        System.out.println("Your choice of movie is " + movieName + ".");
        System.out.println("Please enjoy the movie.");
    }






    }




