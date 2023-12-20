package pavan;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n and r values:");
        int n = input.nextInt();
        int r = input.nextInt();

        int ncr=1;
        int npr=1;
        for (int i=1;i<=r;i++){
            ncr=ncr*n/i;
            npr=npr*n;
            n--;
        }
        System.out.println("NCR =" +ncr);
        System.out.println("NPR =" +npr);
    }
}
