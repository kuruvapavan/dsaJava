package pavan;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original;
        String reverse="";
        System.out.println("enter the string:");
        Scanner input = new Scanner(System.in);
        original=input.nextLine();
//        System.out.println(original);
        char len[] = original.toCharArray();
//      System.out.println(len.length);
       for (int i=len.length-1;i>=0;i--){
           System.out.print(len[i]);
     }
       ;
    }
}
