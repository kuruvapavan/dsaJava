package pavan;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double amount;
       double principal;
       double rate;
       double time;
        System.out.println("Enter principal Amount:");
        principal=input.nextDouble();

        System.out.println("Enter rate:");
        rate=input.nextDouble();

        System.out.println("Enter time:");
        time=input.nextDouble();

        amount = principal* Math.pow((1 + rate/100), time);
        System.out.println(amount);
    }
}
