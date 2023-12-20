package pavan;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        String original;
//        String reverse="";
//        System.out.println("enter the string:");
//        Scanner input = new Scanner(System.in);
//        original=input.nextLine();
//
//        char len[] = original.toCharArray();
//       for (int i=len.length-1;i>=0;i--){
//           System.out.print(len[i]);
//     }

        String original;
        String rev="";
        System.out.println("enter the string: ");
        Scanner in = new Scanner(System.in);
        original=in.nextLine();

        char len[]=original.toCharArray();
        for (int i=len.length-1;i>=0;i--){
            System.out.print(len[i]);
        }
    }
}
