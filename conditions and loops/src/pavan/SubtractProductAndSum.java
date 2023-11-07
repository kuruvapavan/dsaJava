package pavan;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
//        System.out.println("Enter the Number:");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int sum=0;
//        int product=1;
//        int total=0;
//        while (n>0){
//            int rem=n%10;
//            sum = sum + rem;
//            product = product*rem;
//            n = n/10;
//            total = product-sum;
//
//        }System.out.println(total);

        int sum=0;
        int prod=1;
        int total=0;
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
            total=prod-sum;
        }
        System.out.println(total);
    }
}
