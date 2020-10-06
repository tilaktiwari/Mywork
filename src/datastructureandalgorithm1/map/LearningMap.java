package datastructureandalgorithm1.map;

import java.util.HashMap;
import java.util.Map;

public class LearningMap {

    //Map: work on bases<Key,Value> in other way <k,v>
    //Map:<String,String>


    public static void main(String[] args) {
        Map<String,String> stateMap=new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("Nepal","Kathmandu");
        stateMap.put("India","Delhi");
        stateMap.put("Canada","Ontario");
        stateMap.put("Japan","Tokyo");
        stateMap.put("Italy","Rome");

        System.out.println(stateMap.get("Nepal"));
        for (Map.Entry<String,String> entry:stateMap.entrySet()){
            System.out.println(entry.getKey()+":" +entry.getValue());
        }
        System.out.println("----------Another way to print out same result----------");
        //another way  to do the same job
        for(String sm:stateMap.keySet()){
            System.out.println(sm+ ":"+stateMap.get(sm));
        }
    }
}
