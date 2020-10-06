package oopnewbyme.inheritance1;
// after creating different classes creating test class (Step1)
//for step 2 going back to father class to extends Grandfather class in it
public class Test {
    //we can have access only public properties only
    // means we can't access private properties
    public static void main(String[] args) {
        //calling father class by creating object (step 3)
        // In this stage we called it single level inheritance
        Father myFather=new Father();
        myFather.beard();//belongs to father class
        myFather.write();//belongs to father class

        myFather.sing();//belongs to grandfather class
        myFather.height();//belongs to grandfather class

    //now going back to Son class to extend Father class in it which is called multi level inheritance
        // because Son is extending Father class which has already Grandfather class extended

        // calling all three classes property from son class -Step -4
        Son tilak=new Son();
        tilak.student();//son's class property
        tilak.drive();// father's property
        tilak.playGame();//Grand father's property

        //next is hierarchical level inheritance which means Son and Daughter have same property from father class
        //son already extended Father class so next step got to Daughter Class and extent Father class

        //calling father properties from Daughter class after creating object -step-5
        Daughter Mina=new Daughter();
        Mina.doctor();//Daughter's class properties
        Mina.goodCook();//Daughter's class properties
        Mina.swim();//Father's class property
        Mina.weight();//Grandfather property

        // we can't extend multiple classes 
    }
}
