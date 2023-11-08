import java.util.Scanner;

public class largestNumberOfAll {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the first Number:");
//        int num1=in.nextInt();
//        System.out.println("Enter the second Number:");
//        int num2=in.nextInt();
//        System.out.println("Enter the third Number:");
//        int num3=in.nextInt();
//
//        int largest=largest(num1,num2,num3);
//       int smallest= smallest(num1,num2,num3);
//        System.out.println(largest);
//        System.out.println(smallest);
//    }
//    public static int largest(int num1, int num2, int num3){
//        int max=num1;
//        if (num2>max){
//            max=num2;
//        }if (num3>max){
//            max=num3;
//        }
//        return max;
//    }
//    public static int smallest(int num1, int num2, int num3){
//        int min=num1;
//        if (num2<min){
//            min=num2;
//        }if (num3<min){
//            min=num3;
//        }
//        return min;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=in.nextInt();
        System.out.println("Enter second number: ");
        int num2=in.nextInt();
        System.out.println("Enter third number: ");
        int num3=in.nextInt();

        int largest=Math.max(num1,Math.max(num2,num3));
        int smallest=Math.min(num1,Math.min(num2,num3));
        System.out.println("Largest Number is :"+largest);
        System.out.println("Smallest Number is : "+smallest);
    }

}
