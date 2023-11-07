package pavan;

import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        float rupees=0;
        double dollars;
        System.out.println("Enter the value in Rupees :");
        Scanner input = new Scanner(System.in);
        rupees = input.nextFloat();
        dollars = rupees*0.012;
        System.out.println("Rupees in Dollars: " +dollars);
    }
}
