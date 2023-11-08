package pavan;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int num;
        int sum=0;
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        for (int i=1;i<num;i++)
        {
            if (num%i==0)
            {
                sum=sum+i;
            }

        }if (sum==num){
            System.out.println("Perfect number");
        }else {
            System.out.println("not a perfect");
        }
    }
}
