public class MiniBitsFlipToConvertNum {
    public static void main(String[] args) {
        int start =10;
        int goal = 7;
        System.out.println(flipConNum(start,goal));
    }
    static int flipConNum(int start, int goal){
        int xor = start^goal;

        int count=0;
        for (int i = 0; i < 32; i++) {
            count=count+(xor>>i)&1;
        }
        return count;
    }
}
