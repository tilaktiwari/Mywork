package datastructureandalgorithm1.arraylist1;

import java.util.ArrayList;

public class LearnArrayList1 {
    // ArrayList by using it to declare array size/dynamic array
    //Array list type array object


    //creating static and non static method outside main method
    public static ArrayList<Integer > stPhoneNumber= new ArrayList<Integer>();
    //non static
    public ArrayList<String> stAddress=new ArrayList<String>();


    public static void main(String[] args) {
        //calling the method inside main method and adding list
        LearnArrayList1.stPhoneNumber.add(2442425);
        LearnArrayList1.stPhoneNumber.add(43554455);
        LearnArrayList1.stPhoneNumber.add(75555555);

        //calling non static arraylist inside main method
        LearnArrayList1 obj=new LearnArrayList1();
        obj.stAddress.add("Centervill");
        obj.stAddress.add("Reston");

        //ArrayList can only take wrapper class stating with capital letter of data type
        // wrapper class:
        // Integer : int
        // Byte : byte
        // Short : short
        // Double : double
        // Boolean : boolean




        //the way to write dynamic way arraylist
//        ArrayList<String > studentList= new ArrayList<>();// this also works but better to put data type in<>
        ArrayList<String > studentList= new ArrayList<String>();
        studentList.add("Tilak");
        studentList.add("Ram");
        studentList.add("Hari");
        studentList.add("Geeta");
        System.out.println(studentList);//printing in a like as in array list
        //getting arraylist length here we use size instead of length
        System.out.println("Size of ArrayList is " +studentList.size());
        // to  only one value of for hari by using get
        System.out.println(studentList.get(2));

        // for printing all values by using for each loop
        for(String st: studentList){
            System.out.println("Student name :"+st);
        }

        System.out.println("--------------removing value by using remove key word------");
       //Removing Geeta
        studentList.remove(3);
        studentList.remove("Hari");
        //adding new Nabin
        studentList.add("Nabin");
        for(String st:studentList){
            System.out.println("Student name :"+st);
        }
    }
}
