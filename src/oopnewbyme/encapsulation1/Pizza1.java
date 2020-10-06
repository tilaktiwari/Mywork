package oopnewbyme.encapsulation1;
// encapsulation : Data hiding
public class Pizza1 {
    //creating variables private and public (step1)
    public String pizzaName;
    private String toppingName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    // next step 2 create a new class TestPizza1
    // to get hidden variable is by using getter and setter
    //creating getter and setter (step3)
    // in the class where data are private we create getter and then setter
    //right click , generate and get getter


    //getter method
    public String getToppingName() {
        return toppingName;
    }


    //setter method (step3) For next step we are going to test pizza1 to get the private variable of Pizza1
    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
