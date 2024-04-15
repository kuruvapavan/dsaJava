import java.util.ArrayList;
import java.util.List;

public class SubsetDivisibleByN {

    public static void findSubset(int[] elements, int N) {
        List<Integer> result = new ArrayList<>();
        boolean found = findSubsetUtil(elements, N, 0, 0, new ArrayList<>(), result);

        if (found) {
            System.out.println(result.size());
            for (int index : result) {
                System.out.print((index + 1) + " "); // +1 for 1-based indexing
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }

    private static boolean findSubsetUtil(int[] elements, int N, int currentIndex, int currentSum, List<Integer> currentIndices, List<Integer> result) {
        if (currentIndex == elements.length) {
            if (currentSum % N == 0 && !currentIndices.isEmpty()) {
                result.addAll(currentIndices);
                return true;
            }
            return false;
        }

        // Option 1: Exclude the current element
        if (findSubsetUtil(elements, N, currentIndex + 1, currentSum, currentIndices, result)) {
            return true;
        }

        // Option 2: Include the current element
        currentIndices.add(currentIndex);
        if (findSubsetUtil(elements, N, currentIndex + 1, currentSum + elements[currentIndex], currentIndices, result)) {
            return true;
        }
        // Remove the current index as it's not part of the solution
        currentIndices.remove(currentIndices.size() - 1);

        return false;
    }

    public static void main(String[] args) {
        int[] elements = {1, 3, 2, 6, 4}; // Example input
        int N = 5;
        findSubset(elements, N);
    }
}
