class small746 {
    public static void main(String[] args) {
        small746 instance = new small746();  // Use the instance you created
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        System.out.println("Next greatest letter for '" + target + "': " + instance.nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
