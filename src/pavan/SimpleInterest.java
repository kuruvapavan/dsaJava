package pavan;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
//        float si=0;
//        int amount;
//        float time;
//        float rate;
//        System.out.println("amount:");
//        Scanner input = new Scanner(System.in);
//        amount = input.nextInt();
//        System.out.println("time taken:");
//        time = input.nextFloat();
//        System.out.println("rate of interest");
//        rate = input.nextFloat();
//        if (amount>0){
//            si = amount*time*rate/100;
//        }
//        System.out.println(si);
        float si=0;
        int amount;
        float time;
        float rate;
        Scanner in = new Scanner(System.in);
        System.out.println("principle: ");
        amount=in.nextInt();
        System.out.println("time: ");
        time=in.nextFloat();
        System.out.println("rate: ");
        rate=in.nextFloat();
        if (amount>0){
            si=amount*time*rate/100;
        }
        System.out.println(si);
    }
}
