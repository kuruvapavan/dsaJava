package pavan;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit=0;
        int amount=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the units :");
        unit=input.nextInt();
        if (unit<=100)
        {
            amount=unit*5;
            System.out.println("Cost of electricty:"+amount);
        } else if (unit>=101 && unit<=200)
        {
            amount=(100*5)+(unit-100)*7;
            System.out.println("Cost of electricty:"+amount);
        } else if (unit>=201 && unit<=300)
        {
            amount=(100*5)+(100*7)+(unit-200)*10;
            System.out.println("Cost of electricty:"+amount);
        }else
        {
            amount=100*5+100*7+100*10+(unit-300)*15;
            System.out.println("Cost of electricty:"+amount);
        }
    }
}
