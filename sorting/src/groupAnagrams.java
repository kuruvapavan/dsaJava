import java.util.*;

class groupAnagrams {
    public static void main(String[] args) {
        String[] st = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(st);
        System.out.println(ans);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            System.out.println(chars);
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}