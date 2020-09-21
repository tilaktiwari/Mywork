public class Practice {

public void cond() {
    for (int num = 12; num < 20; num++) {
        System.out.println("Hi how are you?" +num);
        for (int i=14; i<16; i++){
            System.out.println("are you doing good"+i);
        }

    }
}
    public static void main (String[]args){


        Practice obj = new Practice();
        obj.cond();
    }
}