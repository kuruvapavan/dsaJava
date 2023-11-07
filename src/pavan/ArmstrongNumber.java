package pavan;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        int sum=0;
//        int temp=0;
//        int number=0;
//        int a=0;
//        System.out.println("Enter the Number:");
//        Scanner input = new Scanner(System.in);
//        number=input.nextInt();
//        temp=number;
//        while (number>0){
//        a=number%10;
//        sum=sum + (a*a*a);
//        number=number/10;
//        }
//        if (temp==sum){
//            System.out.println("Its an armstrong");
//        }
//        else {
//            System.out.println("Not an armstromg");
//        }

        int sum=0;
        int number=0;
        int temp=0;
        int a=0;
        System.out.println("Enter the Number" );
        Scanner in = new Scanner(System.in);
        number=in.nextInt();
        temp=number;
        while (number>0){
            a=number%10;
            sum=sum+(a*a*a);
            number=number/10;
        }
        if (temp==sum){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not a armstrong number");
        }
    }
}
