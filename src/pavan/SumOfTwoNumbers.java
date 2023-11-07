package pavan;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of two numbers :" + sum);
    }
}
