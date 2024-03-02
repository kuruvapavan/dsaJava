import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }
    static void reverseString(char[] s){
        helper(s,0,s.length-1);
}

    private static void helper(char[] s, int start, int end) {
        if (start>=end){
            return;
        }
        char temp = s[start];
        s[start]=s[end];
        s[end]=temp;
        helper(s,start+1,end-1);
    }
    }
