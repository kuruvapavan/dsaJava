public class StringToIntConverter {
    public static int convertStringToInt(String str){
        int res=0;
        int length=str.length();
        for (int i = 0; i <length ; i++) {
            char c = str.charAt(i);

            if (c<'0' || c>'9'){
                throw new IllegalArgumentException("invalid");
            }
            res=res*10+(c-'0');
        }
        return res;

    }public static void main(String[] args) {
        String numberStr = "12345";
        try {
            int number = convertStringToInt(numberStr);
            System.out.println("The integer value is: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
