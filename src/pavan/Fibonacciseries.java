package pavan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacciseries {
//    0 1 1 2 3 5 8 13 21 34 55 89......
public static void main(String[] args) {
//    int a=0;
//    int b=1;
//    int k;
//    int value;
//    System.out.println("enter the number to print fibonacci Series:");
//    Scanner input = new Scanner(System.in);
//    value = input.nextInt();
//    for (int i=0;i<value;i++){
//        k=a+b;
//        System.out.println(k);
//        a=b;
//        b=k;
//    }

   int a=0;
   int b=1;
   int k;
   int value;
    System.out.println("Enter the number");
    Scanner in =new Scanner(System.in);
    value=in.nextInt();
    for (int i=0;i<=value;i++){
        k=a+b;
        System.out.println(k);
        a=b;
        b=k;
    }

}
}
