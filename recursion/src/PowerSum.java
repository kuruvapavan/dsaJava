public class PowerSum {
    public static void main(String[] args) {
        int x=10;
        int N=2;
        int Num=1;
        int result = powersum(x,N,Num);
        System.out.println(result);
    }
    static int powersum(int x, int power, int num){
        int ans =(int) Math.pow(num,power);
        if (ans<x){
            return powersum(x,power,num+1)+powersum(x-ans,power,num+1);
        }
        if (x==ans){
            return 1;
        }else {
            return 0;
        }
    }
}
