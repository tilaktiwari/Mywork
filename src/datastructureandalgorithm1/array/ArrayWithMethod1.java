package datastructureandalgorithm1.array;

public class ArrayWithMethod1 {

    public static void main(String[] args) {
        // calling the method maximum and minimum and passing the Array variable values
        // from non static method myNum (this is dynamic way
        ArrayWithMethod1.maximum(myNum());
        ArrayWithMethod1.minimum(myNum());

        //creating array variable number and passing numbers for value and
        // using it in minimum/maximum method by passing there (this is regular way
        int [] number={24,56,45,33,2,76};
        minimum(number);
        maximum(number);

    }
    static void minimum(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
            min=arr[i];
            }
        }
        System.out.println("The minimum number  is :"+min);
    }
    static void maximum(int[]arr1){
        int max=arr1[0];
        for(int i=0; i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        System.out.println("The maximum number is :"+max);
    }

    static int [] myNum(){
        return new int[]{45,78,88,99,122,45,23};
    }
}
