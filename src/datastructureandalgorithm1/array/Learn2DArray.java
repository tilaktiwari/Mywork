package datastructureandalgorithm1.array;

public class Learn2DArray {

    // Two D Array/ 2D Array/ Multi Dimension Array

    // DataType [] [] arrayName=new DataType[row][column];
    public static void main(String[] args) {


        //syntax: DataType [][] arrayName=new DataType[][];

        String[][] stInfo = new String[5][4];

        stInfo[0][0] = "SL";
        stInfo[0][1] = "First Name";
        stInfo[0][2] = "Last Name";
        stInfo[0][3] = "Address";

        stInfo[1][0] = "101";
        stInfo[1][1] = "Ram";
        stInfo[1][2] = "Tiwari";
        stInfo[1][3] = "Centerville";

        stInfo[2][0] = "102";
        stInfo[2][1] = "Gita";
        stInfo[2][2] = "Tiwari";
        stInfo[2][3] = "Geetanagar";

        stInfo[3][0] = "103";
        stInfo[3][1] = "Hari";
        stInfo[3][2] = "Nepal";
        stInfo[3][3] = "Butwal";

        stInfo[4][0] = "104";
        stInfo[4][1] = "Jiban";
        stInfo[4][2] = "Nepali";
        stInfo[4][3] = "Kathmandu";

        //to print single value
        System.out.println(stInfo[4][1]);
        System.out.println(stInfo.length);

        //for printing all using Nested For Each Loop for 2D Array: Convert 2D to 1D Array then printout

        for (String[] stIn : stInfo) {
            for (String st : stIn) {
                System.out.print(st+" ");
            }
            System.out.println();
        }

    }
}