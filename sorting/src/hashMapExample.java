import java.util.HashMap;

public class hashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("apple", 10);
        fruitPrices.put("banana",20);
        fruitPrices.put("orange",30);
        System.out.println(fruitPrices);
        //update
        fruitPrices.put("apple",25);
        System.out.println(fruitPrices);
        //
        fruitPrices.remove("banana");
        System.out.println(fruitPrices);
        //check
        if (fruitPrices.containsKey("peach")){
            System.out.println("present");
        }else {
            System.out.println("not present");
        }
    }
}
