package pavan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        int year;
//        System.out.println("Enter the Year:");
//        Scanner input = new Scanner(System.in);
//        year = input.nextInt();
//        if (year % 4 == 0 && year % 100 != 0){
//            System.out.println("It is a leap Year");
//        } else if (year%400==0) {
//            System.out.println("leap year");
//        } else {
//            System.out.println("Not a leap Year");
//        }
        int yr;
        System.out.println("enter the year: ");
        Scanner in = new Scanner(System.in);
        yr=in.nextInt();
        if (yr%4==0 && yr% 100 !=0){
            System.out.println("Its a leap year");
        } else if (yr%400==0) {
            System.out.println("Its a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}

