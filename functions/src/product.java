import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        int total= Product(num1,num2);
        System.out.println(total);
    }
    public static int Product(int a, int b){
        int mul = a * b;
        return mul;
    }
}
