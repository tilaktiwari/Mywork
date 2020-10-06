package datastructureandalgorithm1.randomnumber1;

import java.util.Random;

public class LearningRandomNumber {
    public static void main(String[] args) {
        double [] stId=new double[10];
        Random ran =new Random(1);
        for(int i=0; i<stId.length; i++){
            stId[i]=ran.nextInt(30);
            System.out.println(stId[i]);
        }
        System.out.println(Math.random());
        System.out.println("NY101"+Math.random());

    }
}
