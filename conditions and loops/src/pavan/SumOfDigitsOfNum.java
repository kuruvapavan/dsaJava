package pavan;

import java.util.Scanner;

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        int num;
        int a;
        int sum=0;

        System.out.println("Enter the Number:");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        while (num>0){
            a=num%10;
            sum=sum+a;
            num=num/10;

        }
        System.out.println(sum);
    }
}
