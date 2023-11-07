import java.util.Scanner;

public class eligibleOrNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of the voter:");
        int age = in.nextInt();

        int vote=voterAge(age);
        System.out.println(vote);
    }
    public static int voterAge(int num){
        if (num>0){
            if (num>=18){
                System.out.println("the voter is eligible to participate in voting process. Since" + " the "+num+ "is above or equal to 18");
            }else {
                System.out.println("the voter is not eligible to participate in voting process. Since the "+num+ "is below 18");
            }
        }
        return num;
    }
}
