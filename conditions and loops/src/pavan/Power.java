package pavan;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int base=1;
        int exponent=1;
        double num;
        System.out.println("enter the base :" +base);
        Scanner input = new Scanner(System.in);
        base=input.nextInt();
        System.out.println("Enter the exponent:"+exponent);
        exponent=input.nextInt();

        num=Math.pow(base,exponent);
        System.out.println(num);
    }
}
