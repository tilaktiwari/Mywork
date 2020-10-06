package datastructureandalgorithm1.map;

import java.util.HashMap;
import java.util.Map;

public class HasMapTravers1 {


    public static void main(String[] args) {
        int[] number = {23, 45, 56, 23, 56, 33, 89, 65, 45};
        printingFrequency(number);
    }

    public static void printingFrequency(int[]arr){
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length; i++){
            Integer c=hmap.get(arr[i]);
            if(hmap.get(arr[i])==null) {
                hmap.put(arr[i], 1);
            }else {
                hmap.put(arr[i],++c);
            }
        }
        for (Map.Entry mp:hmap.entrySet()){
            System.out.println("Frequency of "+mp.getKey()+ ":"+ mp.getValue());
        }
    }

}
