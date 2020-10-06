public class FindLargestnum {
        int num1=35;
        int num2=78;
        int num3=87;
        public void  findLargestNum(){

            if (num1>num2 && num1>num3){
                System.out.println("your largest number is " +num1);
            }
            if (num2>num1 && num2>num3){
                System.out.println("your largest number is " +num2);
            }
            if (num3>num1 && num3>num2){
                System.out.println("your largest number is " +num3);
            }
        }
        public static void main(String[]args){
            FindLargestnum obj =new FindLargestnum();
            obj.findLargestNum();
        }

    }
