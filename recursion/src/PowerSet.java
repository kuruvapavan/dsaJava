import java.util.concurrent.atomic.AtomicReference;

public class PowerSet {
    public static void main(String[] args) {
        powerSet("","abc");

    }
    static void powerSet(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        powerSet(p+ch,up.substring(1));
        powerSet(p,up.substring(1));

    }



}
