package pavan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LcmAndGcm {
    public static void main(String[] args) {
        int a;
        int b;
        int g=0;
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        for(int i=1; i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        System.out.println("GCD of "+ a+ " " + b+ " "+ g);
        int lcm = a*b/g;
        System.out.println(lcm);
    }

}
