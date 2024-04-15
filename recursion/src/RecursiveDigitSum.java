public class RecursiveDigitSum {
    public static void main(String[] args) {
        System.out.println(superDigit("9875",4));
    }
    static int superDigit(String n, int k){
        if (n.length()==1)
            return Integer.valueOf(n);
        long sum=0;

        for (int i = 0; i <n.length() ; i++) {
            int val=n.charAt(i)-'0';
            sum+=val;
        }
        sum=sum*k;
        return superDigit(String.valueOf(sum),1);

    }
}