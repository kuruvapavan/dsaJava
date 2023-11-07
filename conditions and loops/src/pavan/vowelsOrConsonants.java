package pavan;

import java.util.Scanner;

public class vowelsOrConsonants {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character:");
        Scanner input = new Scanner(System.in);
        ch=input.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Its an vowel");
        }
        else
        {
            System.out.println("Its a consonant");
        }
    }
}
