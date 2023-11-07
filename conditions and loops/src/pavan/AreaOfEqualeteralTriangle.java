package pavan;

import java.util.Scanner;

public class AreaOfEqualeteralTriangle {
    public static void main(String[] args) {
        float side;

        double area;
        System.out.println("Enter the side of the Triangle: ");
        Scanner input = new Scanner(System.in);
        side = input.nextFloat();
        if (side>0){
            area = 1.73*side*side/4;
            System.out.println("Area of the equalateral triangle:" + area);
        }
        else System.out.println("Enter positive values");
    }
}
