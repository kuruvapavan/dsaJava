package pavan;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int sum=0;
        int temp=0;
        int a=0;
        int num=0;
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        temp=num;
        while (num>0){
            a=num%10;
            sum=sum+(a*a*a);
            num=num/10;
        }
        if (temp==sum){
            System.out.println("its an armstrong");
        }
        else {
            System.out.println("not");
        }
    }
}
