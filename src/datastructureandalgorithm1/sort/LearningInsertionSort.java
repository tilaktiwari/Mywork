package datastructureandalgorithm1.sort;
//for adding or inserting value in between a data,
public class LearningInsertionSort {
    //Sort:Filtering
    //Types:Insertion Sort
    //Bubble sort
    //Heap sort
    //Quick
    //Merge
    //Selection
    // Bucket
    public static void main(String[] args) {
        // doing insertion sort
        int [] num={34,56,66,4,2,102,55};
        //output supposed to like;2,4,34,55,56,66,102
        for(int i=0; i<num.length;i++){
            int j=i-1;
            int point=num[i];
            while(j>=0 && num[j]>point){
                num[j+1]=num[j];
                j=j-1;
            }
            num[j+1]=point;
        }
        for(int n=0; n<num.length;n++){
            System.out.print(num[n]+" ");
        }
    }


}
