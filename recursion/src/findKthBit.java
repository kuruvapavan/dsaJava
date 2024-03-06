public class findKthBit {
    public static void main(String[] args) {
        int n =3;
        int k =1;
        System.out.println("The " + k + "th bit in the " + n + "th binary string is: " + findKthBit(n, k));

    }
//    public static char findKthBit(int n, int k){
//        String nthBinaryString = generateNthBinaryString(n);
//        return nthBinaryString.charAt(k-1);
//    }
//
//    private static String generateNthBinaryString(int n){
//        if (n==1){
//            return "0";
//        }
//        String prev = generateNthBinaryString(n-1);
//        String invert = invert(prev);
//        return prev + "1" + invert;
//
//    }
//
//    private static String invert(String prev) {
//        StringBuilder inverted = new StringBuilder();
//        char[] charArray = prev.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            char ch = charArray[i];
//            if (ch=='0'){
//                inverted.append('1');
//            }else
//                inverted.append('0');
//        }
//        return inverted.toString();
//    }

    public static char findKthBit(int n, int k){
        String nthBinaryString = generateNthBinary(n);
        return nthBinaryString.charAt(k-1);

    }

    private static String generateNthBinary(int n) {
        if (n==1){
            return "0";
        }
        String prev = generateNthBinary(n-1);
        String invert = invert(prev);
        return prev + "1" + invert;
    }

    private static String invert(String prev) {
        StringBuilder inverted = new StringBuilder();
        char[] charArray = prev.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {
            char ch = charArray[i];
            if (ch=='0'){
                inverted.append('1');
            }else {
                inverted.append('0');
            }
        }
        return inverted.toString();
    }

}
