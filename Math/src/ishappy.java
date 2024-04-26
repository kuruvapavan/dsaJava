import java.util.Map;

class ishappy {
    public static boolean isHappy(int n) {
        if (n==1){
            return true;
        }
        int slow = n;
        int fast =n;
        while (true){
            slow=sumofsquares(slow);
            fast=sumofsquares(sumofsquares(fast));
            if (slow==fast)
                break;
        }
        return slow==1;

    }

    private  static int sumofsquares(int n) {
        double sum=0;
        while (n>0){
            double lastdigit=n%10;
            sum=sum + Math.pow(lastdigit,2);
            n=n/10;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        int n =19;
        System.out.println(isHappy(n));
    }
}