public class DecodeString {

    public static String decodeString(String s) {
        return decode(s, new int[]{0});
    }

    private static String decode(String s, int[] index) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (index[0] < s.length()) {
            char c = s.charAt(index[0]);
            index[0]++; // Move to the next character

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // Forming the number
            } else if (c == '[') {
                String innerDecoded = decode(s, index); // Decode the substring inside the brackets
                for (int i = 0; i < num; i++) {
                    result.append(innerDecoded); // Append the decoded string num times
                }
                num = 0; // Reset num after using it
            } else if (c == ']') {
                return result.toString(); // Return the current accumulated result upon closing bracket
            } else {
                result.append(c); // Append the character to the result as it's not a digit or bracket
            }
        }

        return result.toString(); // Return the final result
    }

    public static void main(String[] args) {
        String encodedString = "3[a2[bc]]";
        System.out.println("Decoded string: " + decodeString(encodedString));
    }
}
