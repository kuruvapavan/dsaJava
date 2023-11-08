package pavan;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the initial asset value: ");
        double initialValue=in.nextFloat();
        System.out.println("enter the annual depreciation rate ");
        double annualDepreciationValue=in.nextFloat();
        System.out.println("Enter the no of years: ");
        int numOfyears=in.nextInt();
        System.out.println("Year asset value: ");
        for (int year=1;year<=numOfyears;year++){
            double assetValue = initialValue*Math.pow(1-annualDepreciationValue,year);
            System.out.println(year + assetValue);
        }

    }
}
