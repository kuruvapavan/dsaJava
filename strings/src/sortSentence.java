class sortSentence {
    public static void main(String[] args) {
        String shuffledSentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(shuffledSentence));
    }
    public static String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] originalSentence = new String[words.length];

        for (String word:words ) {
            int positon = word.charAt(word.length()-1)-'0';
            System.out.println(positon);
            originalSentence[positon-1]=word.substring(0,word.length()-1);
            System.out.println(originalSentence);
        }
        return String.join(" ",originalSentence);
    }
}
