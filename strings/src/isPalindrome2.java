class isPalindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
      int left=0;
      int right =s.length()-1;

      while (left<right){
          if (s.charAt(left)==s.charAt(right)){
              left++;
              right--;
          }else {
              return  isPalidrome(s,left,right-1) || isPalidrome(s,left+1,right);
          }
      }
      return true;
    }

    private static boolean isPalidrome(String s, int left, int right) {
        while (left<right){
            if (s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
