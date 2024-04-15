public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binToDec("1011"));
    }
    static int binToDec(String binary){
        int decimal = 0;
        int length=binary.length();

        for (int i = 0; i < length; i++) {
            int digit = binary.charAt(i)-'0';
            decimal=decimal*2+digit;
        }
        return decimal;
    }
}
