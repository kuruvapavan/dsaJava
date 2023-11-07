package pavan;

import java.util.Scanner;

public class DistanceBetTwoPoints {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        double dis=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x1 :");
        x1=input.nextDouble();
        System.out.println("Enter the value of x2 :");
        x2=input.nextDouble();
        System.out.println("Enter the value of y1 :");
        y1=input.nextDouble();
        System.out.println("Enter the value of y2 :");
        y2=input.nextDouble();

//        dis = ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))*0.5;
        dis = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println(dis);
    }
}
