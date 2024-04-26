public class convertToTitle {
    public static void main(String[] args) {
        int n=28;
        System.out.println(convertToTitle(n));
    }
    public static String convertToTitle(int colNumber){
        StringBuilder sb = new StringBuilder();

        while (colNumber>0){
            colNumber--;

            sb.append((char) ((colNumber)%26+ 'A'));
            colNumber=(colNumber)/26;
        }
        return sb.reverse().toString();
    }
}
