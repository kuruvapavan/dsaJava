public class pow {
    public static void main(String[] args) {
        int base =3;
        int po=6;
        int ans=1;

        while (po>0){
            if ((po & 1)==1){
                ans*=base;
            }
            base*=base;
            po=po>>1;
        }
        System.out.println(ans
        );
    }
}
