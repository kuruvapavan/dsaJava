import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number for factorial :");
        int num = in.nextInt();
        int fact = Factorial(num);
        System.out.println("Factorial of given number :"+fact);
    }
    public static int Factorial(int num){
        int prod=1;
        for (int i=1;i<=num;i++){
            prod=prod*i;
        }
        return prod;
    }
}
