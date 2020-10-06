package datastructureandalgorithm1.linklist1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList1 {
    public static void main(String[] args) {
        List<String> stateName = new LinkedList();
        stateName.add("VA");
        stateName.add("MA");
        stateName.add("PA");
        stateName.add("NY");
        stateName.add("CA");
        stateName.add("TX");

//        for(String sn:stateName){
//            System.out.println(sn);
//        }
        // for same result of printing all value we are using the following while loop using iterator
        Iterator it = stateName.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------After remove------");
        stateName.remove(2);
        Iterator it1 = stateName.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
            //this removing PA from the list

        }
    }
}