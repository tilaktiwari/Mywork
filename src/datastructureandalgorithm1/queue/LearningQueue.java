package datastructureandalgorithm1.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearningQueue {

    //FIFO order (first in first out)
    public static void main(String[] args) {
        Queue<String> name=new LinkedList<>();
        name.add("David");
        name.add("James");
        name.add("Marco");
        name.add("Jamie");
        name.add("Jessica");
        for(String nm:name){
            System.out.println("Employee Name :"+nm);
        }
        System.out.println("******Removing one name*****");
        name.remove("Marco");
        for (String nm:name
             ) {
            System.out.println("Employee name :"+nm);

            System.out.println("****************************");

        }
        System.out.println("-------------------------------------");
        System.out.println(name.element());// Getting the first name because of Queue works like get method
        System.out.println(name.element());
        System.out.println("----------------------------------");
        System.out.println(name.poll());
        System.out.println(name.poll());//getting second name because the first name is already taken by first poll
        System.out.println("-----------------------------------");
        System.out.println(name.peek());
        System.out.println("--------------------------------------");
        System.out.println(name.remove());//only remove value from the list
        System.out.println("**************************");
        System.out.println(name.poll());//getting value Jessica because Jamie is removed by remove
    }
}
