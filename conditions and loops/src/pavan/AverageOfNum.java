package pavan;

import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
//        int limit=0;
//        int count=0;
//        int sum=0;
//        int avg=0;
//        int number;
//        System.out.println("Enter the limit:");
//        Scanner input = new Scanner(System.in);
//        limit=input.nextInt();
//       while (count<limit){
//            System.out.println("Enter the number"+ (count+1));
//            number=input.nextInt();
//            sum=sum+number;
//            count++;
//        }
//        avg=sum/limit;
//        System.out.println(avg);

        int num;
        int sum=0;
        int avg=0;
        int count=0;
        int limit=0;
        System.out.println("Enter the limit: ");
        Scanner in = new Scanner(System.in);
        limit=in.nextInt();
        while (count<limit){
            System.out.println("enter the number "+(count+1));
            num=in.nextInt();
            sum=sum+num;
            count++;
        }
        avg=sum/limit;
        System.out.println("Average is :"+avg);
    }
    }

