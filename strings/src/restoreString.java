class restoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] ind={4,5,6,7,0,1,2,3};
        System.out.println(restoreString(s,ind));
    }
    public static String restoreString(String s, int[] indices){
        char[] str = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            str[indices[i]]=s.charAt(i);
        }
        return String.valueOf(str);
    }
}