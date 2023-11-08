package pavan;

import java.util.Scanner;

public class BattingAvg {


    public static void main(String[] args) {
//        double innings;
//        double runs=0;
//        double average=0;
//        System.out.println("Enter the no of runs scored :");
//        Scanner input =  new Scanner(System.in);
//        runs=input.nextDouble();
//        System.out.println("Enter number innings not out:");
//        innings=input.nextDouble();
//        if (innings>0 && runs>0){
//            average=runs/innings;
//        }
//        System.out.println("Battinf average :" +average);
        double innings;
        double runs=0;
        double avg=0;
        System.out.println("Enter No of runs Scored: ");
        Scanner in =new Scanner(System.in);
        runs=in.nextDouble();
        System.out.println("Enter no of notout innings: ");
        innings=in.nextDouble();
        if (runs>0 && innings>0){
            avg=runs/innings;
        }
        System.out.println("average is " +avg);
    }
}
