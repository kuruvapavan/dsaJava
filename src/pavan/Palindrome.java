package pavan;

import java.awt.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        String name;
//        System.out.println("Enter the value:");
//        Scanner input = new Scanner(System.in);
//        name = input.next();
//        int len=name.length();
//        for (int i =0;i<len/2;i++){
//            if (name.charAt(i) != name.charAt(name.length()-1-i)){
//                System.out.println("not a palindrome");
//                return;
//            }
//        }
//        System.out.println("palindrome ");

        String name;
        System.out.println("Enter the value: ");
        Scanner in = new Scanner(System.in);
        name=in.next();
        int len = name.length();
        for (int i=0;i<=len/2;i++){
            if (name.charAt(i) != name.charAt(len-1-i)){
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");

    }
}
