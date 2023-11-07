package pavan;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
//        System.out.println("Enter the Number:");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        for (int i=1; i<=num;i++){
//            if (num % i ==0 ){
//                System.out.println(i);
//            }
//        }
        System.out.println("Enter the  number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){

            if ((num%i)==0){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("total count of fac"+count);
    }
}
