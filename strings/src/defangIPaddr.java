class defangIPaddr {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));

    }
    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <address.length(); i++) {
            char ch = address.charAt(i);

            if (ch=='.'){
                result.append("[.]");
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }

}