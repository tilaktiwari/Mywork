package datastructureandalgorithm1.array;
//Array is a variable which contains multiple values (same types of data only)
public class Array {

    // Single Dimension Array: String []
    // Array: which can hold multiple value of same data type at a time
    // DataType [] variableName ={};
    // Dimension []
    //syntax of Array: DataType [] variableName = new DataType[numberOfVariables];
    //here we are declaring the size of index is 5
    static String[] stName= new String[5]; // Global type of Array which is outside any method and after class

    //declaring and initializing value in array
    int  [] stId={101,102,103,104,105,106,107,108,109,110};

    public static void main(String[] args) {
        //creating local variable inside the method
        String[] stAddress = new String[5];
        stAddress[0] = "Annandale";
        stAddress[1] = "Reston";
        stAddress[2] = "Centerville";
        stAddress[3] = "Tyson";
        stAddress[4] = "Herndon";
        System.out.println(stAddress[3]);
        //if we put more than index number eg.6 inside the array value it will show the out of bound exception

        //calling static  global variable and initializing value in it
        Array.stName[0] = "Tilak";
        Array.stName[1] = "Ram";
        Array.stName[2] = "Gita";
        Array.stName[3] = "Ram";
        Array.stName[4] = "Gita";
        System.out.println(Array.stName[0]);

        //calling non static global variable by creating obj
        Array obj = new Array();
        System.out.println(obj.stId[2]);
        System.out.println("Student number " + obj.stId[0] + " is " + Array.stName[0] + " who lives in " + stAddress[1]);

        System.out.println("How to print all array values?*******");
        //how to print all array values? we are using For loop
        //printing stid
        for (int i = 0; i < obj.stId.length; i++) {
            System.out.println("Student ID:" + obj.stId[i]);

        }
        System.out.println("_________________________________");
        //printing stname
        for (int i = 0; i < Array.stName.length; i++) {
            System.out.println("Student Name: " + Array.stName[i]);
        }

        System.out.println("How to print all values from array using for each loop");
        //how to print all the values from array using for each loop
        //syntax: for(){}
        //for (datatype variableName:arrayName){}
        for (String st:Array.stName){
            System.out.println(st);
        }

        System.out.println("How to print all values from array from local variable using for each loop");
        for(String address:stAddress){
            System.out.println(address);
        }
        System.out.println("the length of Array is:"+stAddress.length);
        }




}
