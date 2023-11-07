package pavan;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        float b;
        float h;
        double area;
        System.out.println("Enter base of the rectangle: ");
        Scanner input = new Scanner(System.in);
        b = input.nextFloat();
        System.out.println("Enter height of the rectangle");
        h = input.nextFloat();
        if (b>0 && h>0){
            area = b*h;
            System.out.println("Area of the rectangle :" + area);
        }else {
            System.out.println("Enter positive values");
        }
    }
}
