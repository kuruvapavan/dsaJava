public class firstUpperCase {
    public static void main(String[] args) {
        String s = "geeksforgeeKs";
        System.out.println(first(s,0));
    }
//    static char first(String  s){
//        for (int i = 0; i <=s.length() ; i++) {
//            if (Character.isUpperCase(s.charAt(i))){
//                return s.charAt(i);
//            }
//        }
//        return 0;
//    }
    static char first(String s, int i){
        if (s.charAt(i)=='\0'){
            return 0;
        }
        if (Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        else {
            return first(s,i+1);
        }
    }
}
