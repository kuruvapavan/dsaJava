package pavan;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        double sum=0;
        double avg=0;
//        double limit=0;
        int count=0;
        int marks=0;
        int subjects;
        System.out.println("Enter no of subjects: ");
        Scanner input = new Scanner(System.in);
        subjects=input.nextInt();
        while (count<subjects){
            System.out.println("enter the marks" + count);
            marks=input.nextInt();
            sum = sum+marks;
            count++;

        }
        avg=sum/subjects;
        System.out.println("Average of all "+count + " "+ "Subjects is"+avg);
    }
}
