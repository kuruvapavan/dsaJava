//package pavan;
//
//import java.util.Scanner;
//
//public class CommissionPercentage {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String name;
//        int s;
//        float com = 0;
//        int d;
//
//        do {
//            System.out.println("Enter the name of the Salesman:");
//            name = input.next();
//
//            if (s < 5000) {
//                com = (float) 0.05 * s;
//            } else if (s >= 5000 && s <= 10000) {
//                com = (float) 0.08 * s;
//            } else {
//                com = (float) 0.1 * s;
//                System.out.println("Salesman name " + name + "sales made is " + s + "And commission earned is " +
//                        com);
//                System.out.println("press 1 if more commission to be continued :");
//                d = input.nextInt();
//            }
//            while (d == 1) ;
//
//        }}
//    {}
//    }