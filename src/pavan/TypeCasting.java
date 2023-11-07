package pavan;

public class TypeCasting {
    public static void main(String[] args) {
        byte b =42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.13464;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b) +" " +(i/c) +" " + (d-s));
        System.out.println(result);
    }
}
