import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
      int num=isPalindrome(n);
        System.out.println(num);

    }
    public static int isPalindrome(int n){
        int t=n;
        int r, sum=0;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (sum==t){
            System.out.println("its a palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        return sum;
    }

}
