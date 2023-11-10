import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(11);
        list.add(12);
        list.set(0,1);
        list.remove(2);
        System.out.println(list.contains(10));
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        System.out.println(list);

    }
}
