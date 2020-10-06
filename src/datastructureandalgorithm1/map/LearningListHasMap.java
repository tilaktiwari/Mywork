package datastructureandalgorithm1.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearningListHasMap {

    public static void main(String[] args) {
        List<String> stateNameOfUSA=new ArrayList<>();
        stateNameOfUSA.add("VA");
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("PA");
        stateNameOfUSA.add("CA");
        stateNameOfUSA.add("NC");

        List<String> stateNameOfCanada=new ArrayList<>();
        stateNameOfCanada.add("Montreal");
        stateNameOfCanada.add("Ontario");
        stateNameOfCanada.add("Toronto");
        stateNameOfCanada.add("Calgery");
        stateNameOfCanada.add("Vancouber");

        List<String> stateNameOfNepal=new ArrayList<>();
        stateNameOfNepal.add("Chitwan");
        stateNameOfNepal.add("Kathmandu");
        stateNameOfNepal.add("Pokhara");
        stateNameOfNepal.add("Butwal");
        stateNameOfNepal.add("Birgunj");

        Map<String,List<String >> stMap=new HashMap<>();
        stMap.put("USA",stateNameOfUSA);
        stMap.put("Canada",stateNameOfCanada);
        stMap.put("Nepal",stateNameOfNepal);

        for (Map.Entry<String,List<String>> entry:stMap.entrySet())
             {
                 System.out.println(entry.getKey() +":"+entry.getValue());

        }



    }
}
