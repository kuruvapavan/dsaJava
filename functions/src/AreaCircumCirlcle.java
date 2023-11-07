import java.util.Scanner;

public class AreaCircumCirlcle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double radius = in.nextDouble();

        double value =Area(radius);
        System.out.println(value);
        double total=circum(radius);
        System.out.println(total);
    }
    public static double Area(double radius){
        if(radius>0){
           return 2*Math.PI*radius;
        }else {
            System.out.println("enter positive value");
        }
//        return radius;
        return radius;
    }
    public static double circum(double radius){
        if (radius>0){
            return Math.PI*radius*radius;
        }
        return radius;
    }

}
