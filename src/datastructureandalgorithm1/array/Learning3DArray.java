package datastructureandalgorithm1.array;

import javax.print.DocFlavor;

public class Learning3DArray {
    //3d array=1d arry+2d aray
    //Syntax:DataType[size][row][column]=new DataType[size][row][column]

    static String[][][] pizza=new String[1][6][5];

    public static void main(String[] args) {
        //adding values
        Learning3DArray.pizza[0][0][0]="SL";
        Learning3DArray.pizza[0][0][1]="Pizza type";
        Learning3DArray.pizza[0][0][2]="Price";
        Learning3DArray.pizza[0][0][3]="Qty";
        Learning3DArray.pizza[0][0][4]="TotalAmount";

        Learning3DArray.pizza[0][1][0]="101";
        Learning3DArray.pizza[0][1][1]="Veggi Pizza";
        Learning3DArray.pizza[0][1][2]="20";
        Learning3DArray.pizza[0][1][3]="4";
        Learning3DArray.pizza[0][1][4]="80";

        Learning3DArray.pizza[0][2][0]="102";
        Learning3DArray.pizza[0][2][1]="Bacon Pizza";
        Learning3DArray.pizza[0][2][2]="25";
        Learning3DArray.pizza[0][2][3]="4";
        Learning3DArray.pizza[0][2][4]="100";

        Learning3DArray.pizza[0][3][0]="103";
        Learning3DArray.pizza[0][3][1]="Deep dis pizza";
        Learning3DArray.pizza[0][3][2]="50";
        Learning3DArray.pizza[0][3][3]="2";
        Learning3DArray.pizza[0][3][4]="100";

        Learning3DArray.pizza[0][4][0]="104";
        Learning3DArray.pizza[0][4][1]="Chicken pizza";
        Learning3DArray.pizza[0][4][2]="45";
        Learning3DArray.pizza[0][4][3]="2";
        Learning3DArray.pizza[0][4][4]="90";

        Learning3DArray.pizza[0][5][0]="105";
        Learning3DArray.pizza[0][5][1]="American Pizza";
        Learning3DArray.pizza[0][5][2]="35";
        Learning3DArray.pizza[0][5][3]="3";
        Learning3DArray.pizza[0][5][4]="105";

        System.out.println(Learning3DArray.pizza.length);
        System.out.println(Learning3DArray.pizza[0][5][1]);// calling single variable value

        System.out.println("***** How to retrieve all the value from 3D Array? *****");
        // How to call all the value from 3D Array?

        for (String [][] pizz:Learning3DArray.pizza){
            //parent for each loop:converting 3d array to 2d array
            for (String[] piz:pizz){
                //child loop : converting 2d to 1d array
                for(String piz1:piz){
                    System.out.print(piz1+"       ");
                }
                System.out.println();

            }
        }
    }

}
