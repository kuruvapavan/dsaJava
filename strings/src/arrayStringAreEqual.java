class arrayStringAreEqual {
    public static void main(String[] args) {
        String[] word1 ={"ab","c"};
        String[] word2= {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder word1Combined = new StringBuilder();
        for (String st:
             word1) {
            word1Combined.append(st);
        }
        StringBuilder word2Combined = new StringBuilder();
        for (String st:
             word2) {
            word2Combined.append(st);
        }
        String str1 = word1Combined.toString();
        System.out.println(str1);
        String str2 = word2Combined.toString();

        return str1.equals(str2);
    }
}