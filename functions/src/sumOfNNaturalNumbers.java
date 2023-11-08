import java.util.Scanner;

public class sumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int total=findSum(n);
        System.out.println(total);

    }
    static int findSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;

        }
        return sum;
    }
}
