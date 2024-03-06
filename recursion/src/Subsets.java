import java.util.ArrayList;
import java.util.List;

public class Subsets {
        public static void main(String[] args) {
            int[] input = {1, 2, 3};
            List<List<Integer>> subsets = new ArrayList<>();
            generatePowerSet(subsets, new ArrayList<>(), input, 0);
            for (List<Integer> subset : subsets) {
                System.out.println(subset);
            }
        }

        static void generatePowerSet(List<List<Integer>> subsets, List<Integer> current, int[] input, int index) {
            if (index == input.length) {
                subsets.add(new ArrayList<>(current));
                return;
            }
            // Include the current element
            current.add(input[index]);
            generatePowerSet(subsets, current, input, index + 1);

            // Exclude the current element
            current.remove(current.size() - 1); // Undo the addition
            generatePowerSet(subsets, current, input, index + 1);
        }

}
