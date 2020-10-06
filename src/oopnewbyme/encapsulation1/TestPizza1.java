package oopnewbyme.encapsulation1;
// creating test pizza1 class and creating obj my pizza1 (step2)
// back to pizza1 class for next stepv
public class TestPizza1 {
    public static void main(String[] args) {
        Pizza1 myPizza1=new Pizza1();
        System.out.println(myPizza1.pizzaName="Mexican Pizza");

        //setter method:to set value(step4)
        myPizza1.setToppingName("Mushroom");

        //getter method:to get value(step5)
        System.out.println(myPizza1.getToppingName());
// in order to call private variable in different class we need to set value then get value

        myPizza1.setAvailable(true);
        System.out.println(myPizza1.isAvailable());
        myPizza1.setTypeOfPizza("Grandmas");
        System.out.println(myPizza1.getTypeOfPizza());
        myPizza1.setSize('M');
        System.out.println(myPizza1.getSize());
        myPizza1.setPrice(30);
        System.out.println("$"+myPizza1.getPrice());

    }
}
