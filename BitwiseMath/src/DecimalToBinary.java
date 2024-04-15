public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decToBi(2));

    }
    static String decToBi(int n){
        if (n==0){
            return "0";
        }
        StringBuilder str = new StringBuilder();
        while (n>0){
            str.append(n%2);
            n=n/2;
        }
        return str.reverse().toString();
    }

}
