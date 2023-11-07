import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum=0;
        System.out.println("enter number two numbers");
        try (Scanner in = new Scanner(System.in)) {
            num1 = in.nextInt();
            num2 = in.nextInt();
        }
        sum=num1+num2;
        System.out.println("sum of two numbers is :"+sum);
    }
}
