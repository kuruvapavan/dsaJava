import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
       int total= SumofNum(num1,num2);
        System.out.println(total);
    }
    public static int SumofNum(int a, int b){
        int sum = a+b;
        return sum;
    }

}
