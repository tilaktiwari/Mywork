package datastructureandalgorithm1.queue;

import java.util.PriorityQueue;

public class LearningPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> name=new PriorityQueue<>();
        name.add("Jamie");
        name.add("Rohit");
        name.add("Harry");
        name.add("Julie");
        name.add("Susan");

        PriorityQueue <Integer> emId=new PriorityQueue<>();
        emId.add(21);
        emId.add(22);
        emId.add(23);
        emId.add(24);
        emId.add(25);

        System.out.println(emId.peek());// peek method retrieve but does not remove the peeked one
        for(Integer eid:emId){
            System.out.println(eid);
        }
        System.out.println("Using pool method");
        System.out.println(emId.poll());//poll method retrieve and removed the retrieved data
        System.out.println("***********************");
        for (Integer eid:emId){
            System.out.println(eid); //after using poll method used above it is giving result starting 22
        }
    }

}
