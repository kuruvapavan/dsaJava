package pavan;

import java.util.Scanner;

public class DiscountOfProdcut {
    public static void main(String[] args) {
       double mrp,dis,payAmount,result;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the Market Price :");
       mrp=input.nextDouble();
        System.out.println("Enter the percentage of discount:");
        dis=input.nextDouble();
        payAmount=100-dis;
        result=(payAmount*mrp)/100;
        System.out.println(result);
    }
}
