package pavan;

import java.util.Scanner;

public class MutliplicationOfNumber {
    public static void main(String[] args) {
//        int n;
//        System.out.println("Enter the number for  table:");
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        for(int i = 1; i<=10; i++){
//            System.out.println(n + "*" + i + "=" + n * i);
//        }

        int num;
        System.out.println("Enter number for mutliplication table: ");
        Scanner in = new Scanner(System.in);
        num=in.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
