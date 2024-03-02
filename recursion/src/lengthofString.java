public class lengthofString {
    public static void main(String[] args) {
//        String myString = "Hello, World!";
//        System.out.println(myString.length());
        String s = "abcd";
        System.out.println(recLen(s));
    }
    static int recLen(String s){
        if (s.isEmpty()){
            return 0;
        }
        return recLen(s.substring(1))+1;
    }
}
