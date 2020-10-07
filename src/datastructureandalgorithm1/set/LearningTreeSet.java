package datastructureandalgorithm1.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearningTreeSet {

    public static void main(String[] args) {


        TreeSet<String> mobileBrand = new TreeSet<>();
        mobileBrand.add("LG");
        mobileBrand.add("Sony");
        mobileBrand.add("Nokia");
        mobileBrand.add("Apple");
        mobileBrand.add("Samsung");
        System.out.println(mobileBrand);
        mobileBrand.remove("Nokia");
        mobileBrand.pollFirst();
        mobileBrand.pollLast();
        System.out.println(mobileBrand);
    }
}