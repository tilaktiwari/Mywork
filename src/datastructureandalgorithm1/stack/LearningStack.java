package datastructureandalgorithm1.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearningStack {
    //stack:LIFO Last in First out
    //pushing elements on top of the stack:push()
    //Popping element from the top of the stack :pop()
    //Looks at hte object at the top of this stack without removing it from the stack:peek()
    public static void main(String[] args) {
        Stack<String > emAddress=new Stack<>();
        emAddress.push("Annandale");
        emAddress.push("Reston");
        emAddress.push("Centerville");
        emAddress.push("Falls church");
        emAddress.push("Alexendria");
        System.out.println(emAddress);
        System.out.println("--------------------");
        System.out.println(emAddress.get(2));
        System.out.println("---------------------");
        System.out.println(emAddress.pop());// getting the last index value Alexendria
        System.out.println("----------------------");
        System.out.println(emAddress);//pop method get the value Alexendria and remove it after getting it
        System.out.println("*************************************");

        Stack<String> ssn=new Stack<>();
        for(int i=0;i<9; i++){
            ssn.push("ssnNumber"+i);
            System.out.println(ssn);//if we put this sout in side for loop it will print 9times each time adding one
        }
        System.out.println("------------------------------------------------------");
        System.out.println(ssn);
        System.out.println("=====================================================================");
        //how to retrieve all the values
        Iterator it= ssn.iterator();
        while (it.hasNext()){
            System.out.println(ssn.pop());
        }
        for (String st:ssn) {
            System.out.println(st);

        }



    }
}
