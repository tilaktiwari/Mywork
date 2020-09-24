import java.util.Scanner;

public class CheckEligibilityForVote {
    int age;
    public void  doEligibility(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        age=input.nextInt();
        if(age>18) {
            System.out.println("you are old enough to vote");
        }
            else{System.out.println("you are not old enough to vote");

        }
    }
    public static void main(String[]args){
        CheckEligibilityForVote obj =new CheckEligibilityForVote();
        obj.doEligibility();

    }
}

