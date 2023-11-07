package pavan;

import java.util.Scanner;

public class PerimeterEquailateralTriangle {
    public static void main(String[] args) {
        float a;
        float result=0;
        System.out.println("Enter the side of the triangle:");
        Scanner input =  new Scanner(System.in);
        a = input.nextFloat();
        if (a>0){
            result = a*a*a;
            System.out.println("Area of equalateral triangle: " + result);
        }else{
            System.out.println("Enter positive value");
        }
    }
}
