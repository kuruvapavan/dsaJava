package pavan;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        double perimeter=0;
        double radius;
        System.out.println("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        if (radius>0){
            perimeter = Math.PI*2*radius;
            System.out.println("Perimeter of the circle :" + perimeter);
        }else System.out.println("Enter positive value");
    }
}
