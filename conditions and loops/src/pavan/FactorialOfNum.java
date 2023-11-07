package pavan;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
//        int prod=1;
//        System.out.println("Enter the Number :");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i =1; i<=n;i++){
//            prod = prod*i;
//
//        }
//        System.out.println(prod);
        int fact=1;
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        for (int i =1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
