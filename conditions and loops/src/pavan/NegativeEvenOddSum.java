package pavan;

import java.util.Scanner;

public class NegativeEvenOddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeSum=0, evenSum=0,oddSum=0;

        while (true){
            System.out.println("Enter a number (enter 0 to exit):");
            int num =input.nextInt();

            if (num == 0){
                break;
            } else if (num<0) {
                negativeSum += num;
            } else if (num % 2==0) {
                evenSum += num;
            }else {
                oddSum += num;
            }
        }
        System.out.println("sum of negative numbers:"+ negativeSum);
        System.out.println("sum of positive numbers:"+evenSum);
        System.out.println("sum of odd numbers:"+oddSum);
    }
}
