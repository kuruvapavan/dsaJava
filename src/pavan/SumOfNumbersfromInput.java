package pavan;

import java.util.Scanner;

public class SumOfNumbersfromInput {
    public static void main(String[] args) {
        int count;
        int number;
        int sum=0;
        System.out.println("enter count of numbers: ");
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        for (int i=1;i<=count;i++){
                number = input.nextInt();
                sum =  sum + number;
        }
        System.out.println(sum);
    }
}
