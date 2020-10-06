

public class quize3  {

    static String dayname=null;
    public static void main(String[]args){
        int dayNum=5;
        String dayName = null;


        switch(dayNum){
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
            case 7:
                dayName = "Saturday";
                break;
            default:
                System.out.println("your input is wrong please try again");

        }

        System.out.println("Selected day is : " +dayName);

    }
}
