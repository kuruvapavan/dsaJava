import java.util.Arrays;
public class LetterTilePossibilities {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));

    }
    public static int numTilePossibilities(String tiles){

        char theArray[] = tiles.toCharArray();
        Arrays.sort(theArray);
        traverse(theArray,new boolean[theArray.length]);
        return count-1;
    }

   public static int count=0;
    public static void traverse(char[] theArray, boolean[] used) {
         count++;
        for(int i=0;i<theArray.length;i++) {
            if (used[i] || (i > 0 && theArray[i] == theArray[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            traverse(theArray, used);
            used[i] = false;
        }
    }



}
