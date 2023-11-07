package pavan;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
//        int a;
//        int b;
//        System.out.println("Enter two numbers:");
//        Scanner input = new Scanner(System.in);
//        a = input.nextInt();
//        b = input.nextInt();
//        int g=0;
//        for (int i=1;i<=a;i++){
//            if (a%i==0 && b%i==0){
//                g=i;
//
//            }
//        }System.out.println(g);

        int num1;
        int num2;
        System.out.println("enter two numbers :");
        Scanner in = new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        int g=0;
        for (int i=1;i<=num1;i++){
            if (num1%i==0 && num2%i==0){
                g=i;
            }

        }
        System.out.println(g);

    }
}
