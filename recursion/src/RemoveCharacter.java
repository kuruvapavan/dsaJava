public class RemoveCharacter {
    public static void main(String[] args) {
        String og="aaaaabbbbbb";
        String resultString = og.replace("a","");

        System.out.println(resultString);
           //String resultString = string(og,0);
      System.out.println(resultString);
        skip("","bacassaasdddaa");
        System.out.println(skip2(og));
        System.out.println(skipWord("applebanana"));
        System.out.println(skipWord2("bananaappleappbana"));

        System.out.println(removeLetter(og));

    }
//    static String string(String s, int i){
//        if (i==s.length()){
//            return "";
//        }
//        char currentIndex=s.charAt(i);
//        if (currentIndex=='a'){
//            return string(s,i+1);
//        }else {
//            return currentIndex+string(s,i+1);
//        }
//
//    }

    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }
   static String skip2(String s){
        if (s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if (ch=='b'){
            return skip2(s.substring(1));
        }
        else {
            return ch+skip2(s.substring(1));
        }
   }

   static String skipWord(String s){
        if (s.isEmpty()){
            return " ";
        }
        if (s.startsWith("apple")){
           return skipWord(s.substring(5));
        }else {
            return s.charAt(0)+skipWord(s.substring(1));
        }
   }
    static String skipWord2(String s){
        if (s.isEmpty()){
            return " ";
        }
        if (s.startsWith("app") && !s.startsWith("apple")){
            return skipWord2(s.substring(3));
        }else {
            return s.charAt(0)+skipWord2(s.substring(1));
        }
    }

    static String removeLetter(String s){
        if (s.length()<=1){
            return s;
        }
        if (s.charAt(0)==s.charAt(1)){
            return removeLetter(s.substring(1));
        }
        else {
            return s.charAt(0) + removeLetter(s.substring(1));
        }
    }
}
