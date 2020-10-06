package oop.encapsulation;

public class TestPizza {
    public static void main(String[] args) {
        Pizza myPizza=new Pizza();
        System.out.println(myPizza.pizzaName="Mexican Pizza");
       //first Setter method: to set value
        myPizza.setToppingName("Mushroom");
        //getter method:to get value
        System.out.println(myPizza.getToppingName());
        myPizza.setAvailable(true);
        System.out.println(myPizza.isAvailable());
        myPizza.setSize('L');
        System.out.println(myPizza.getSize());
        myPizza.setTypeOfPizza("Hand Tossed");
        System.out.println(myPizza.getTypeOfPizza());
        myPizza.setPrice(25);
        System.out.println("$"+myPizza.getPrice());
    }
}
