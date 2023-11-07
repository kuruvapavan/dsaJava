package pavan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
//        int a;
//        int b;
//        int g=0;
//        int lcm;
//        System.out.println("Enter two numbers:");
//        Scanner input = new Scanner(System.in);
//        a = input.nextInt();
//        b = input.nextInt();
//        for(int i=1;i<=a;i++){
//            if (a%i==0 && b%i==0){
//                g=i;
//            }
//        }
//        System.out.println(g);
//        lcm = (a*b)/g;
//        System.out.println(lcm);

        int num1;
        int num2;
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        int g=0;
        for (int i=1;i<=num1;i++){
            if (num1%i==0 && num2%i==0){
                g=i;
            }
        }
        int lcm=0;
        lcm=num1*num2/g;
        System.out.println("LCM of two numbers is :"+lcm);
        System.out.println("GCM of two numbers is :"+g);
    }
}
