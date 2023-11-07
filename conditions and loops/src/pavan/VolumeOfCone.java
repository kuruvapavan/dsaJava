package pavan;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        System.out.println("Enter the Radius of the cone");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cone");
        double height = input.nextDouble();
        if (radius>0 && height>0){
            double volume = Math.PI*radius*radius*height/3;
            System.out.println("Volume of the cone:" + volume);
        }

    }
}
