package pavan;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//        float r;
//        double area;
//        System.out.println("Enter the radius of the cirlce: ");
//        Scanner input = new Scanner(System.in);
//        r = input.nextFloat();
//        if (r>0){
//            area = 3.14*r*r;
//            System.out.println("Area of the circle: " + area);
//        } else
//        {
//            System.out.println("enter positive value");
//
//        }
        float r;
        double area;
        System.out.println("Enter radius of the circle: ");
        Scanner in = new Scanner(System.in);
        r= in.nextFloat();
        if (r<0){
            System.out.println("enter positive radius");
        }
        else {
            area=Math.PI*r*r;
            System.out.println("area of the circle :"+area);
        }

    }
}
