package pavan;

import java.util.Scanner;

public class SumOfAllNum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner input = new Scanner(System.in);
//        int sum = 0;
//        while (true){
//            int n = input.nextInt();
//            if (n == 0){
//                break;
//            }else {
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
        int sum=0;
        while (true){
            int n =input.nextInt();
            if (n==0){
                break;
            }else {
                sum=sum+n;
            }
        }
        System.out.println(sum);
    }
}
