package pavan;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
    public static void main(String[] args) {
//        int num;
//        System.out.println("Enter a number");
//        Scanner input = new Scanner(System.in);
//        num = input.nextInt();
////        while (num<0){
////            System.out.println("Enter positive value");
////        }
//        if(num<0){
//            System.out.println("Enter positive number");
//        }if (num%2 == 0){System.out.println("its a even number");
//        }else System.out.println("its a odd number");
        int num;
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        num=in.nextInt();
        if (num<0){
            System.out.println("enter postive number");
        }
        if (num%2==0){
            System.out.println("Even number");
        }
        else System.out.println("odd number");
    }
}
