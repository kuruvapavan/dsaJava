package pavan;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float b;
        float h;
        double area;
        System.out.println("Enter the base of the Triangle: ");
        Scanner input = new Scanner(System.in);
        b = input.nextFloat();
        System.out.println("Enter the height of the Triangle: ");
        h = input.nextFloat();
        if (b>0 && h>0){
            area = 0.5*b*h;
            System.out.println("Area of the triangle : "+area);
        }
        else {
            System.out.println("Enter positive values");
        }

    }
}
