class strStr {
    public static void main(String[] args) {
        String haystack ="leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <haystack.length()-needle.length()+1 ; i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                if (haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}