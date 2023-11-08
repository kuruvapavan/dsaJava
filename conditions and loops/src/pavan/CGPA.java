package pavan;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of subjects: ");
        int numOfSubs = in.nextInt();
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numOfSubs; i++) {
            System.out.println("Enter the credits for subject" + i + ": ");
            int credits = in.nextInt();
            System.out.println("Enter the grade for subject " + i + ": ");
            String grade = in.next();

            double gradePoint = caluclateGradePoints(grade);

            totalCredits += credits;
            totalGradePoints += (credits * gradePoint);
        }
        double cgpa = totalGradePoints / totalCredits;
        System.out.println("CGPA is: " + cgpa);

    }
    public static double caluclateGradePoints(String grade){
        switch (grade){
            case "A+":
                return 4.0;
            case  "A":
                return 3.8;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C":
                return 2.0;
            case "C-":
                return 1.7;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
}
