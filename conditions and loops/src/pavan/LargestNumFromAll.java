package pavan;

import java.util.Scanner;

public class LargestNumFromAll {
    public static void main(String[] args) {
//        System.out.println("Enter the numbers:");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int largest = Integer.MIN_VALUE;
//        while (true) {
//            n=input.nextInt();
//            if (n == 0) {
//                break;
//            }
//            largest = Math.max(largest, n);
//
//        }
//        System.out.println(largest);

        System.out.println("Enter the numsL ");
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        int largest=Integer.MIN_VALUE;
        while (true){
            n=in.nextInt();
            if (n==0){
                break;
            }
            else {
                largest=Math.max(largest,n);
            }
        }
        System.out.println(largest);
    }
}
