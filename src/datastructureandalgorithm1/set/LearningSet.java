package datastructureandalgorithm1.set;

import java.util.HashSet;
import java.util.Set;

public class LearningSet {
    public static void main(String[] args) {


        Set<String> mobileBrand = new HashSet<>();
        mobileBrand.add("LG");
        mobileBrand.add("Sony");
        mobileBrand.add("Nokia");
        mobileBrand.add("Apple");
        mobileBrand.add("Samsung");
        System.out.println(mobileBrand);
        mobileBrand.remove("Sony");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("LG"));//Searching if LG is there or not
    }
}