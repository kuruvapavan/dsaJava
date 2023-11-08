package pavan;

import java.util.Scanner;

public class BattingAvg {


    public static void main(String[] args) {
        double innings;
        double runs=0;
        double average=0;
        System.out.println("Enter the no of runs scored :");
        Scanner input =  new Scanner(System.in);
        runs=input.nextDouble();
        System.out.println("Enter number innings not out:");
        innings=input.nextDouble();
        if (innings>0 && runs>0){
            average=runs/innings;
        }
        System.out.println("Battinf average :" +average);
    }
}
