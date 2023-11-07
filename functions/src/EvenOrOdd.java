import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int value =evenOrOdd(num);
        System.out.println(value);
    }
    public static int evenOrOdd(int num){
        if (num%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");;
        }

        return num;
    }

}
