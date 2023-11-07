package pavan;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
//        int num1;
//        int num2;
//        System.out.println("Enter the first Number: ");
//        Scanner input = new Scanner(System.in);
//        num1 = input.nextInt();
//        System.out.println("Enter the second Number: ");
//        num2 = input.nextInt();
//        if (num1>num2){
//            System.out.println("first number is greatest number");
//        }
//        else if (num2>num1){
//            System.out.println("Second number is greatest number");
//        }
//        else {
//            System.out.println("both numbers are equal");
//        }
        int num1;
        int num2;
        System.out.println("Enter the first Number: ");
        Scanner in = new Scanner(System.in);
        num1=in.nextInt();
        System.out.println("Enter the second Number: ");
        num2=in.nextInt();
        if (num1<num2){
            System.out.println("second number is largest number");
        }
        else System.out.println("First number is largest number");

    }
}
