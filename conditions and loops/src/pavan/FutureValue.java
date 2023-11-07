package pavan;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        double presentValue;
        double interest;
        double years;
        double futureValue=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the present Value: ");
        presentValue=input.nextDouble();
        System.out.println("Enter the rate of interest");
        interest=input.nextDouble();
        System.out.println("Enter no of years: ");
        years=input.nextDouble();
        if (presentValue>0){
            futureValue=presentValue * Math.pow((1+interest/100),years);
        }
        System.out.println("The future value is "+futureValue);
    }
}
