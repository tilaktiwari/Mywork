package datastructureandalgorithm1.linklist1;


import datastructureandalgorithm1.arraylist1.LearnArrayList1;

import java.util.LinkedList;

//manipulation with linklist is faster than array list
// because it use doubly link list so no bit shifting is required in memory
public class LearnLinkList1 {

    static LinkedList<String> fatherName=new LinkedList<String>();//static
    LinkedList<String > pizzaList=new LinkedList<String>();//non static

    public static void main(String[] args) {

        LearnLinkList1.fatherName.add("Kasi");
        LearnLinkList1.fatherName.add("Tulasi");
        LearnLinkList1.fatherName.add("Nandu");
        System.out.println(LearnLinkList1.fatherName.get(1));// for getting only 1 value of second index

      //getting all values from fatherName by using for each loop
       for (String fn:fatherName) {
           System.out.println("father name is :"+fn);

       }
        //creating object to call non static method
        LearnLinkList1 learn=new LearnLinkList1();
        learn.myPizzaList();
    }
    public void myPizzaList(){
        pizzaList.add("Chicken Pizza");
        pizzaList.add("Vegi Pizza");
        pizzaList.add("Taco Pizza");
        pizzaList.add("Peperoni Pizza");
        for(String pl:pizzaList){
            System.out.println("Names of pizza :"+pl);
        }
    LearnArrayList1.stPhoneNumber.add(4534636);
        System.out.println(LearnArrayList1.stPhoneNumber.get(0));
        LearnArrayList1 ob1=new LearnArrayList1();//creating an object to call non static variable from different class
        ob1.stAddress.add("Geetanagar");
        ob1.stAddress.add("adfa");
        ob1.stAddress.add("addddd");
        System.out.println(ob1.stAddress.get(0));
        for (String  st:ob1.stAddress)
             {
                 System.out.println(st);

        }
    }


}
