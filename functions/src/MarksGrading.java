import java.util.Scanner;

public class MarksGrading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the Marks out of 100:");
        int marks = in.nextInt();
        String grade=marksGrade(marks);
        System.out.println("Your grade is :"+grade);
    }
    public static String marksGrade(int marks){
        if (marks>=91 && marks<=100){
            return "AA";
        } else if (marks>=81 && marks<=91) {
            return "AB";
        } else if (marks>=71 && marks<=80) {
            return "BB";
        } else if (marks>=61 && marks<=70) {
            return "BC";
        } else if (marks>=51 && marks<=60) {
            return "CD";
        } else if (marks>=41 && marks<=50) {
            return "DD";
        }else
            return "Fail";
    }
}
